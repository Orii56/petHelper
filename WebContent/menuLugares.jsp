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

					<div class="menuButton selected row align-items-center">

						<img class="buttonIcon" src="img/location.png">
						<div class="buttonText">
							<h4>Lugares de Interes</h4>
						</div>


					</div>
					<div class="menuButton row align-items-center">

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
							<li class="breadcrumb-item"><a href="#">Home</a></li>
							<li class="breadcrumb-item active" aria-current="page">Lugares de Interes</li>
						</ol>
					</nav>
					

					<iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d48599.583888185!2d-3.722380445144422!3d40.42050210149158!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0x7ad28996a635b60d!2sEl%20Perro%20y%20La%20Galleta%20Retiro!5e0!3m2!1ses-419!2ses!4v1619712787230!5m2!1ses-419!2ses" width="450" height="320" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
					<br><h4 class="text-center">CP 28009</h4>



				</div>
			</div>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>