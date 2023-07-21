package contrller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Jyan;
import model.JyanLogic;

/**
 * Servlet implementation class main
 */
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher rd =
				request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String hand =
		request.getParameter("hand");
		HttpSession session =
				request.getSession();
		Jyan jyan =
				(Jyan)session.getAttribute("jyan");
		if(jyan == null) {
			jyan = new Jyan();
		}
		jyan.setUserHand(hand);
		JyanLogic logic = new JyanLogic();
		logic.execute(jyan);
		
		session.setAttribute("jyan",jyan);
		doGet(request,response);
	}

}
