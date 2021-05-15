<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Java Sales</title>

<head lang="pt-br">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<body>



	<div class="container mt-4 col-lg-4 box-shadow ">
		<div class="card-sm-10">
			<div class="card-body">
				<form class="form-sign" action="ValidateUser" method="POST">
					<div class="form-group text-center">
						<h4 class="display-7 text-primary">BEM VINDO AO JAVA SALES</h4>
						<h3>Registrar</h3>
					</div>
					<div class="form-group">
						<label>Nome:</label> <input type="text" name="name"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Email:</label> <input type="email" name="email"
							class="form-control" required>
					</div>
					<div class="form-group">
						<label>Senha:</label> <input type="password" minlength="6"
							name="pass" id="myInput" class="form-control" required> <input
							class="pt-2" type="checkbox" onclick="myFunction()">Show
						Password
					</div>

					<div class="mt-3">
						<input type="submit" name="menu" value="Registrar"
							class="btn btn-primary"> 
							<a class= "btn btn-primary" href="index.html">Cancelar</a>
					</div>
					<div class="form-group">
						<p class="text-danger mt-4 text-center">${user_error}</p>
					</div>
				</form>

			</div>
		</div>
	</div>

	<script src="js/jsApp.js"></script>
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>

</body>
</html>