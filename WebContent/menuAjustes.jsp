<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_menuAjustes.css">

<script src="https://use.fontawesome.com/da7b76c87f.js"></script>
	

<title>petHelper</title>
</head>
<body>
	<div class="container">
		<div class="formBox">

			<div class="row">

				<!-- Columna izquierda -->
				<div class="col-5">


					<div class="menuButton row align-items-center">

						<img class="buttonIcon" src="img/otros.png">
						<div class="buttonText">
							<h4>Mascotas</h4>
						</div>


					</div>

					<div class="menuButton row align-items-center">

						<img class="buttonIcon" src="img/location.png">
						<div class="buttonText">
							<h4>Lugares de Interes</h4>
						</div>


					</div>
					<div class="menuButton selected row align-items-center">

						<img class="buttonIcon" src="img/user.png">
						<div class="buttonText">
							<h4>Ajustes</h4>
						</div>


					</div>



				</div>

				<!-- Columna derecha -->
				<div class="col-7">

					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="Login?option=home">Home</a></li>
							<li class="breadcrumb-item active" aria-current="page">Ajustes</li>
						</ol>
					</nav>
					
								<form>
			
			
			<div class="form-group">
					<label for="formPassword">Nueva Contraseña</label> <input
						type="password" class="form-control" id="formPassword"
						placeholder="Contraseña">
				</div>
				
				<div class="form-group">
					<label for="formPasswordR">Repetir Contraseña</label> <input
						type="password" class="form-control" id="formPasswordR"
						placeholder="Contraseña">
				</div>
			
			<div class="form-group">
					<label for="formEmail">Cambiar Correo electronico</label> <input
						type="email" class="form-control" id="formEmail"
						placeholder="email@email.com">

				</div>
			
			
			<div class="form-group">
					<label for="formAddress">Direccion</label> <input
						type="email" class="form-control" id="formAddress"
						placeholder="Nombre">
				</div>
				
				<div class="form-group">
					<label for="formPC">Codigo Postal</label> <input
						type="email" class="form-control" id="formPC"
						placeholder="CP">
				</div>
				
				
				<div class="form-group">
					<label for="formCity">Ciudad</label> <input
						type="email" class="form-control" id="formCity"
						placeholder="Ciudad">
				</div>
				
				<div class="form-group">
					<label for="formCountry">Pais</label> <input
						type="email" class="form-control" id="formCountry"
						placeholder="Pais">
				</div>
			
				
				
				
				
				
				
				<button type="submit" class="btn btn-success btn-block">Submit</button>
			</form>
					



				</div>
			</div>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>