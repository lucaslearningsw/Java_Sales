package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.User;
import Model.UserDAO;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
   
	UserDAO dao=new UserDAO();
	User user=new User();
       
	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request, response);
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("menu");
		
		if(action.equals("Create")) {
			String user_email =request.getParameter("email");
	    	String pass=request.getParameter("pass");
	    	user.setEmail(user_email);
	    	user.setName(user_email);
	    	user.setPass(pass);
	    	dao.create(user);
	    	
		}
		
		
		if(action.equals("Login")) {
	    	  String useremail=request.getParameter("email");
	    	  String pass=request.getParameter("pass");
	    	  user=dao.validate(useremail, pass);
	    	  if(user.getEmail() != null) {
	    		  request.setAttribute("usuario", user);
	    		  request.getRequestDispatcher("mainapp.jsp").forward(request, response);
	    	  } 
	    	  else
	    	  {
	    		  request.getRequestDispatcher("login.jsp").forward(request, response);
	    		  
	    	  }
	      }
	      
	      else {
	    	  request.getRequestDispatcher("login.jsp").forward(request, response);
	    	
	      }
		
	}

}
