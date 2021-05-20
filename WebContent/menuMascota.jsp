<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_menuMascotas.css">

<script src="https://use.fontawesome.com/da7b76c87f.js"></script>


<title>petHelper</title>
</head>
<body>
	<div class="container">
		<div class="formBox">

			<div class="row">

				<!-- Columna izquierda -->
				<div class="col-5">
<div>
					<c:forEach items="${requestScope.lista}" var="l" begin="0" end="4">
					<div class='subMenuButton row align-items-center' id="${l.idMascota}" onclick="location.href='GestionMascota?option=detallesMascota&id=${l.idMascota}';">
					<img class='buttonIcon' src='img/${l.tipoMascotaBean.tipo}.png'>
					<div class='buttonText'><h4> ${l.nombre}</h4></div></div>
					</c:forEach>	
				</div>
				</div>



			<!-- Columna derecha -->
			<div class="col-7">

				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="#">Home</a></li>
						<li class="breadcrumb-item" aria-current="page">Mascotas</li>
						<li class="breadcrumb-item active" aria-current="page">Maya</li>
					</ol>
				</nav>

				<div class="subMenuButton row align-items-center" onclick="location.href='GestionMascota?option=vacuna';">

					<div class="buttonText" href="menuVacuna.jsp">
						<h4>Vacunas</h4>
					</div>


				</div>
				<div class="subMenuButton row align-items-center" onclick="location.href='menuDesparasitacion.jsp';">

					<div class="buttonText">
						<h4>Desparasitacion</h4>
					</div>


					</div>

<div class="subMenuButton row align-items-center" onclick="location.href='menuHigiene.jsp';">

						<div class="buttonText">
							<h4>Higiene</h4>
						</div>

</div>
				</div>
			</div>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>