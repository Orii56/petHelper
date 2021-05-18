<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_login.css">

<title>Login</title>
</head>
<body>

	<div class="container">
		<div class="formBox">


			<img class="logo" src="img/PetHelper.png" >
			<form action="Login?option=logear" method="POST">
				<div class="form-group">
					<label for="formEmail">Email</label> <input
						type="email" class="form-control" name="formEmail"
						placeholder="email@email.com"> <small
						id="emailHelp" class="form-text text-muted">No te enviaremos correos innecesarios.</small>
				</div>
				<div class="form-group">
					<label for="formPassword">Contraseña</label> <input
						type="password" class="form-control" name="formPassword"
						placeholder="Contraseña">
				</div>
				<a class="btn btn-success btn-block" href="Login?option=logear">Submit</a>
				<a class="alert-link" >Si aún no estas registrado, haz click aquí.</a>
			</form>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>