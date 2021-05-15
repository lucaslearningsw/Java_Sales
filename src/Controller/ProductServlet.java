package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Product;
import Model.ProductDAO;

@WebServlet("/ProductServlet")

public class ProductServlet extends HttpServlet {

	Product p = new Product();
	ProductDAO pdao = new ProductDAO();
	int id;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		if (action.equals("ListAllProduct")) {
			List list = pdao.SelectAllProduct();
			request.setAttribute("products", list);
			request.getRequestDispatcher("Product.jsp").forward(request, response);
		}

		if (action.equals("Edit")) {
			id = Integer.parseInt(request.getParameter("id"));
			Product p = pdao.GetId(id);
			request.setAttribute("product", p);
			request.getRequestDispatcher("ProductServlet?action=ListAllProduct").forward(request, response);

		}
		if (action.equals("Atualizar")) {
			String name = request.getParameter("txtName");
			String price = request.getParameter("txtPrice");
			String stock = request.getParameter("txtStock");
			String state = request.getParameter("txtState");
			p.setName(name);
			p.setPrice(Float.parseFloat(price));
			p.setStock(Integer.parseInt(stock));
			p.setState(Integer.parseInt(state));
			p.setIdProduct(id);
			pdao.Update(p);
			response.sendRedirect("ProductServlet?action=ListAllProduct");
		}

		if (action.equals("Delete")) {
			id = Integer.parseInt(request.getParameter("id"));
			pdao.Delete(id);
			response.sendRedirect("ProductServlet?action=ListAllProduct");
		}

		if (action.equals("Adicionar")) {

			try {
				String name = request.getParameter("txtName");
				String price = request.getParameter("txtPrice");
				String stock = request.getParameter("txtStock");
				String state = request.getParameter("txtState");
				p.setName(name);
				p.setPrice(Float.parseFloat(price));
				p.setStock(Integer.parseInt(stock));
				p.setState(Integer.parseInt(state));
				pdao.Create(p);
				response.sendRedirect("ProductServlet?action=ListAllProduct");

			} catch (Exception e) {
				request.setAttribute("product_error", "NÃO FOI POSSÍVEL ADICIONAR O PRODUTO, CASO O ERRO PERSISTA , CONTATE O ADMINISTRADOR DO SISTEMA");
				request.getRequestDispatcher("Product.jsp").forward(request, response);
				response.sendRedirect("ProductServlet?action=ListAllProduct");
		    }

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}
