<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Java Sales</title>
</head>
<body>
	<div class="container mt-4 col-lg-4 box-shadow ">
		<div class="card-sm-10">
			<div class="card-body">
				<form class="form-sign" action="ValidateUser" method="POST">
				 	<div class="form-group text-center">
				 	<h4 class="display-7 text-primary">BEM VINDO AO JAVA SALES</h4>
				 	<h3>LOGIN</h3>
				 	</div>
				 	<div class="form-group">
				 	<label>Email:</label>
				 	<input type="text" name="email" class="form-control" >
				 	</div>
				 	<div class="form-group">
				 	<label>Senha:</label>
				 	<input type="password" name="pass" class="form-control" >
				 	</div> 	
				 	<div class="form-group">
						<p class="text-danger mt-4 text-center">${user_error}</p>
					</div>
				 	
				 	
				    
			 	 <input type="submit" name="menu" value="Login" class="btn btn-primary">
			 	 <input type="submit" name="menu" value="Cancelar" class="btn btn-primary">

			
				</form>
				
			</div>
		</div>
	</div>
	
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>