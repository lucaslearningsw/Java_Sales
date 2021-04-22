package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.User;
import Model.UserDAO;

@WebServlet("/Controller")
public class Controller extends HttpServlet {

	UserDAO dao=new UserDAO();
	User user=new User();
	
	
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String action=request.getParameter("action");
		String menu=request.getParameter("menu");
		String email = request.getParameter("email");
		
		if(menu.equals("Login")) {
			
			  request.getRequestDispatcher("mainapp.jsp").forward(request, response);
			
		}
		
		
		
		if(menu.equals("User")) {
			
			switch(action)
			{
			case "update":
			break;
			
			case "getUser":
               user=dao.GetEmail(email);
			   request.getRequestDispatcher("User.jsp").forward(request, response);
			break;

			}
			
		}
		
		
		
		if(menu.equals("Client")) {
			
			
			
			
			  request.getRequestDispatcher("Client.jsp").forward(request, response);
			
		}
		
		if(menu.equals("Product")) {
			
			  request.getRequestDispatcher("Product.jsp").forward(request, response);
			
		}
		if(menu.equals("Sale")) {
			
			  request.getRequestDispatcher("Sale.jsp").forward(request, response);
			
		}
		
		
	
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      processRequest(request, response);
		}
	

}
