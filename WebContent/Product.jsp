
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<title>Insert title here</title>
</head>


<div class="d-flex">
	<div class="card col-sm-3">
		<div class="card-body">
			<form action="ProductServlet" method="GET">


				<div class="form-group">
					<label>Name</label> <input type="text" value="${product.getName()}"
						name="txtName" class="form-control">
				</div>
				<div class="form-group">
					<label>Price</label> <input type="text"
						value="${product.getPrice()}" name="txtPrice" class="form-control">
				</div>
				<div class="form-group">
					<label>Stock</label> <input type="text"
						value="${product.getStock()}" name="txtStock" class="form-control">
				</div>
				<div class="form-group">
					<label>State</label> <input type="text"
						value="${product.getState()}" name="txtState" class="form-control">
				</div>
				<input type="submit" name="action" value="Adicionar"
					class="btn btn-primary mt-4"> <input type="submit"
					name="action" value="Atualizar" class="btn btn-success mt-4">
			</form>
		</div>
	</div>
	<div class="col-sm-8 ms-1">
		<table class="table table-hover border">
			<thead>
				<tr>
					<th>PRODUCT_ID</th>
					<th>NAME</th>
					<th>PRICE</th>
					<th>STOCK</th>
					<th>STATE</th>
					<th>ACTION</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="p" items="${products}">
					<tr>
						<td>${p.getIdProduct()}</td>
						<td>${p.getName()}</td>
						<td>${p.getPrice()}</td>
						<td>${p.getStock()}</td>
						<td>${p.getState()}</td>
						<td><a class="btn btn-warning"
							href="ProductServlet?action=Edit&id=${p.getIdProduct()}">Editar</a>
							<a class="btn btn-danger"
							href="ProductServlet?action=Delete&id=${p.getIdProduct()}">Excluir</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>

</body>
</html>