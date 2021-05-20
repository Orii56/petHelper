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

						<img class="buttonIcon" src="img/Otros.png">
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
				<nav aria-label='breadcrumb'><ol class='breadcrumb'><li class='breadcrumb-item'>
<a href="Login?option=home">Home</a></li><li class='breadcrumb-item active' aria-current='page'>Mascotas</li></ol></nav>
					<div>
					<c:forEach items="${requestScope.lista}" var="l" begin="0" end="4">
					<div class='subMenuButton row align-items-center' onclick="location.href='GestionMascota?option=mostrarMascotas';">
					<img class='buttonIcon' src='img/${l.tipoMascotaBean.tipo}.png'>
					<div class='buttonText'><h4> ${l.nombre}</h4></div></div>
					</c:forEach>	
					</div>
					<button type='button' onclick="location.href='addMascota.jsp'" class='btn pmd-btn-fab btn-success btn-floating'><i class='fa fa-plus fa-lg'></i></button>

				</div>
			</div>
		</div>
	</div>






</body>
<script src="js/menuPrincipal.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</html>