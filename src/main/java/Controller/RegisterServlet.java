package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import Model.User;
import Model.UserDao;

public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String regResult = "Not Registered";
		String name = req.getParameter("name");
	    String email = req.getParameter("email");
	    String uName = req.getParameter("uname");
	    String pWord = req.getParameter("pass");
	    pWord  = HashPass.HashPassword(pWord);
	    
	    System.out.println(name);
		
	    User user = new User(name,email,uName,pWord);
	    UserDao userDbCon = new UserDao();
	    
	    try {
			regResult = userDbCon.registerUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if (regResult.equals("User is registered")) {
	        RequestDispatcher dispatcher = req.getRequestDispatcher("SignIn.html");
	        dispatcher.include(req, res);
	      } else {
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Register.html");
	        dispatcher.include(req, res);
	      }
	
	}

}
