<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">



<title>Java Sales</title>
</head>
<body>
<h1>Informações do Usuario</h1>
<div class="d-flex">
<div class="card col-sm-8 justify-center">
	<div class="card-body">
	  <form  action="ValidateUser?menu=Excluir&email=${usuario.getEmail()}" method="POST" target="_parent">
	   <div class="form-group">
	    <label>Email</label>
	    <input type="text" name="email" class="form-control" value="${usuario.getEmail()}"  disabled>
	   </div>
	    <div class="form-group">
	    <label>Nome</label>
	    <input type="text" name="nome" class="form-control" value="${usuario.getName()}"  disabled>
	     <input type="submit" name="menu" value="Excluir" class="btn btn-danger mt-3">
	     
	  </form>
	</div>
</div>
</div>


<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>
</body>
</html>

