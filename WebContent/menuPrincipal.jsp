<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_menuPrincipal.css">

<script src="https://use.fontawesome.com/da7b76c87f.js"></script>

	

<title>petHelper</title>
</head>
<body>
	<div class="container">
		<div class="formBox">

			<div class="row">

				<!-- Columna izquierda -->
				<div class="col-5" id="lCol">


					<div class="menuButton row align-items-center" id="buttonMascota" onclick="select('mascota')">

						<img class="buttonIcon" src="img/otros.png">
						<div class="buttonText">
							<h4>Mascotas</h4>
						</div>

					</div>

					<div class="menuButton row align-items-center" id="buttonLugares" onclick="select('lugares')">

						<img class="buttonIcon" src="img/location.png">
						<div class="buttonText">
							<h4>Lugares de Interes</h4>
						</div>


					</div>
					<div class="menuButton row align-items-center" id="buttonAjustes" onclick="select('ajustes')">

						<img class="buttonIcon" src="img/user.png">
						<div class="buttonText">
							<h4>Ajustes</h4>
						</div>


					</div>



				</div>

				<!-- Columna derecha -->
				<div class="col-7" id="rCol">
					<a href="GestionMascota?=mostrarMascotas">click here</a>
					<div>
						<c:forEach items="${requestScope.lista}" var="l" begin="0" end="4">
						<p> ${l.nombre}</p>
						</c:forEach>	
					</div>

				</div>
			</div>
		</div>
	</div>






</body>
<script src="js/menuPrincipal.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</html>