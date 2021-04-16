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
		
		switch (action) {
		case "Produto":
			  request.getRequestDispatcher("Produto.jsp").forward(request, response);
	    break;
	    
		case "Cliente":
			  request.getRequestDispatcher("Cliente.jsp").forward(request, response);
	    break;
		case "Usuario":
			  request.getRequestDispatcher("Usuario.jsp").forward(request, response);
	    break;
		case "Venda":
			  request.getRequestDispatcher("Venda.jsp").forward(request, response);
	    break;
	    
	    default:
	    	throw new AssertionError();
		
		}
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      processRequest(request, response);
		}

	
	


}
