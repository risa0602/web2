package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Move;
import model.PostMoveLogic;
import model.User;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String comment = request.getParameter("comment");

		if (title != null && title.length() != 0) {
			ServletContext application = this.getServletContext();
			List<Move> moveList = (List<Move>) application.getAttribute("moveList");
			HttpSession session = request.getSession();
			User loginUser = (User) session.getAttribute("loginUser");

			Move move = new Move(loginUser.getName(), title, comment);
			PostMoveLogic postMoveLogic = new PostMoveLogic();
			postMoveLogic.execute(move, moveList);

			application.setAttribute("moveList", moveList);
		} else {
			request.setAttribute("errorMsg", "タイトルが入力されてません");

		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
		dispatcher.forward(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext application = this.getServletContext();
		List<Move> moveList = (List<Move>) application.getAttribute("moveList");
		if (moveList == null) {
			moveList = new ArrayList<>();
			application.setAttribute("moveList", moveList);
		}
		HttpSession session = request.getSession();
		User loginUser = (User) session.getAttribute("loginUser");

		if (loginUser == null) {
			response.sendRedirect("index.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
			dispatcher.forward(request, response);
		}

	}

}
