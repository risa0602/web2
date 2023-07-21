package model;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;

public class RegisterProducuctLogic extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Date today = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	String dateTime = sdf.format(today);
	p.setDateTime(dateTime);
	list.add(0,p);
	 
}
