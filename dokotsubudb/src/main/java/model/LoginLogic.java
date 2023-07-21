package model;

import javax.servlet.http.HttpServlet;

public class LoginLogic extends HttpServlet {
	public boolean execute(User user) {
		if (user.getPass().equals("1234")) {return true;}
		return false;
	}

}
