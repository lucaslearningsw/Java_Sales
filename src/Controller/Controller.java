package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {


	private void processRequest(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		String action=request.getParameter("action");
		String menu=request.getParameter("menu");
		
		if(menu.equals("Login")) {
			
			  request.getRequestDispatcher("mainapp.jsp").forward(request, response);
			
		}
		if(menu.equals("User")) {
			
			  request.getRequestDispatcher("User.jsp").forward(request, response);
			
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
