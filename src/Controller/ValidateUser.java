package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Employee;
import Model.EmployeeDAO;

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {
   
	EmployeeDAO dao=new EmployeeDAO();
	Employee em=new Employee();
       
	private void processRequest(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      processRequest(request, response);
	}

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		if(action.equals("login")) {
	    	  String user=request.getParameter("email");
	    	  String pass=request.getParameter("pass");
	    	  em=dao.validate(user, pass);
	    	  if(em.getEmail() != null) {
	    		  request.setAttribute("usuario", em);
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
