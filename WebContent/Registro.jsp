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
			<form>
			
			<div class="form-group">
					<label for="formName">Nombre</label> <input
						type="email" class="form-control" id="formName"
						placeholder="Nombre">
				</div>
				<div class="form-group">
					<label for="formLastName">Apellidos</label> <input
						type="email" class="form-control" id="formLastName"
						placeholder="Apellidos">
				</div>
			
				<div class="form-group">
					<label for="formEmail">Email</label> <input
						type="email" class="form-control" id="formEmail"
						placeholder="email@email.com"> <small
						id="emailHelp" class="form-text text-muted">No te enviaremos correos innecesarios.</small>
				</div>
				
				<div class="form-group">
					<label for="formPC">Codigo Postal</label> <input
						type="email" class="form-control" id="formPC"
						placeholder="CP">
				</div>
				
				<div class="form-group">
					<label for="formPassword">Contraseña</label> <input
						type="password" class="form-control" id="formPassword"
						placeholder="Contraseña">
				</div>
				
				<div class="form-group">
					<label for="formPasswordR">Repetir Contraseña</label> <input
						type="password" class="form-control" id="formPasswordR"
						placeholder="Contraseña">
				</div>
				
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="exampleCheck1">
					<label class="form-check-label" for="exampleCheck1">Acepto los terminos y condiciones</label>
				</div>
				<button type="submit" class="btn btn-success btn-block">Submit</button>
				<a href="#" class="alert-link" >Si ya estas registrado, haz click aquí.</a>
			</form>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>