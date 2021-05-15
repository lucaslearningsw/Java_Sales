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

@WebServlet("/ValidateUser")
public class ValidateUser extends HttpServlet {

	UserDAO dao = new UserDAO();
	User user = new User();

	
	private void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String action = request.getParameter("menu");
       
		if (action.equals("GetUser")) {
			String email = request.getParameter("email");
			user = dao.GetEmail(email);
			request.getRequestDispatcher("User.jsp").forward(request, response);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("menu");
		if (action.equals("Excluir")) {
			String user_email = request.getParameter("email");
			dao.delete(user_email);
			request.getSession().invalidate();
			response.sendRedirect("index.html");

		}

		if (action.equals("Sair")) {
			request.getSession().invalidate();
			response.sendRedirect("index.html");
		}

		if (action.equals("Registrar")) {
			String user_email = request.getParameter("email");
           
			if(dao.Email_Registered(user_email))
			{
				request.setAttribute("user_error", "já existe esse email cadastrado");
				request.getRequestDispatcher("Register.jsp").forward(request, response);
			}
			
			String pass = request.getParameter("pass");
			String name = request.getParameter("name");
			user.setEmail(user_email);
			user.setName(name);
			user.setPass(pass);
			dao.create(user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

		if (action.equals("Cancelar")) {

			request.getRequestDispatcher("index.html").forward(request, response);

		}

		if (action.equals("Login")) {
			String useremail = request.getParameter("email");
			String pass = request.getParameter("pass");
			user = dao.validate(useremail, pass);
			if (user.getEmail() != null) {
				HttpSession session = request.getSession();
				session.setAttribute("usuario", user);
				response.sendRedirect("mainapp.jsp");
			} else {
                
				request.setAttribute("user_error", "usuário ou senha incorretos");
				request.getRequestDispatcher("login.jsp").forward(request, response);

			}
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

}
