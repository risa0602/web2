package model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		User user = new User(name,pass);
		
		LoginLogic loginLogic = new LoginLogic();
		boolean isLogin = loginLogic.execute(user);
		if(isLogin) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser",user);
			
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/LoginResult.jsp");
		dispatcher.forward(request,response);
		
	}

}
