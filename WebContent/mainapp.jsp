<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang="pt-br">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
</head>
<body>
	<nav
		class="navbar py-3 navbar-expand-md fixed-top navbar-light bg-light box-shadow">
		<div class="container">
			<a href="index.html" class="navbar-brand" alt="JAVA SALES">JAVA
				SALES</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
				aria-controls="navbarSupportedContent" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav md-auto">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#funcionalidades">Produto</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#contact">Clientes</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#perguntasFrequentes">Empregado</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#perguntasFrequentes">Venda</a></li>


				</ul>
				<div class="dropdown ms-auto text-center">
					<button class="btn btn-primary dropdown-toggle" type="button"
						id="dropdownMenuButton2" data-bs-toggle="dropdown"
						aria-expanded="false">${usuario.getName()}
						</button>
					<ul class="dropdown-menu dropdown-menu-dark"
						aria-labelledby="dropdownMenuButton2">
						<li><a class="dropdown-item active" href="#">Usuario</a></li>
						<li><a class="dropdown-item" href="#">usuario@gmail.com</a></li>
						<li><hr class="dropdown-divider"></li>
						<form action="ValidateUser" method="POST">
						 <button name="action" value="sair" class="dropdown-item">Sair</button> 
						</form>
				</div>
			</div>
	</nav>








	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
		crossorigin="anonymous"></script>

</body>
</html>