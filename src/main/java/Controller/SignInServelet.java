package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.SignInUser;
import Model.UserDao;

public class SignInServelet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		boolean regUser = false;
		
	    String email = req.getParameter("email");
	    String pWord = req.getParameter("pass");
	    pWord  = HashPass.HashPassword(pWord);
	    
	    System.out.println(email);
		
	    SignInUser signInUser = new SignInUser(email,pWord);
	    UserDao userDbCon = new UserDao();
	    
	    try {
			regUser = userDbCon.signInUser(signInUser);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    if (regUser) {
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Home.html");
	        dispatcher.include(req, res);
	      } else {
	        RequestDispatcher dispatcher = req.getRequestDispatcher("Register.html");
	        dispatcher.include(req, res);
	      }
	      
	}
}
