<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_registro.css">

<title>Registro</title>
</head>
<body>

	<div class="container">
		<div class="formBox">


			<img class="logo" src="img/PetHelper.png" >
			<form action="Login?option=registrar" method="POST">
			
			<div class="form-group">
					<label for="text">Nombre</label> <input	type="text" class="form-control" name="name"
						placeholder="Nombre">
				</div>			
				<div class="form-group">
					<label for="email">Email</label> <input
						type="email" class="form-control" name="email"
						placeholder="email@email.com"> <small
						id="emailHelp" class="form-text text-muted">No te enviaremos correos innecesarios.</small>
				</div>
				
				<div class="form-group">
					<label for="text">Codigo Postal</label> <input
						type="text" class="form-control" name="cp"
						placeholder="CP">
				</div>
				
				<div class="form-group">
					<label for="password">Contraseña</label> <input
						type="password" class="form-control" name="password"
						placeholder="Contraseña">
				</div>
				
				<div class="form-group">
					<label for="passwordR">Repetir Contraseña</label> <input
						type="password" class="form-control" name="passwordR"
						placeholder="Contraseña">
				</div>
				
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Acepto los terminos y condiciones</label>
				</div>
				<button type="submit" class="btn btn-success btn-block">Submit</button>
				<a href="Login.jsp" class="alert-link" >Si ya estas registrado, haz click aquí.</a>
			</form>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>