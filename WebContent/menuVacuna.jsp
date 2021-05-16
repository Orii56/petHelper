<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_menuVacuna.css">

<script src="https://use.fontawesome.com/da7b76c87f.js"></script>


<title>petHelper</title>
</head>
<body>
	<div class="container">
		<div class="formBox">

			<div class="row">

				<!-- Columna izquierda -->
				<div class="col-5">


					<div class="menuButton selected row align-items-center">

						<div class="buttonText">
							<h4>Vacunas</h4>
						</div>
					</div>

					<div class="menuButton row align-items-center">

						<div class="buttonText">
							<h4>Desparasitacion</h4>
						</div>
					</div>

					<div class="menuButton row align-items-center">

						<div class="buttonText">
							<h4>Higiene</h4>
						</div>
					</div>


				</div>



				<!-- Columna derecha -->
				<div class="col-7">

					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="#">Home</a></li>
							<li class="breadcrumb-item" aria-current="page">Mascotas</li>
							<li class="breadcrumb-item" aria-current="page">Maya</li>
							<li class="breadcrumb-item active" aria-current="page">Vacunas</li>
						</ol>
					</nav>

					<!-- Deberia separar el breadcrumb -->
					<div class="subMenuButton row align-items-center">

						<div class="buttonText">
							<h4>25/04/2021 - Heptavalente</h4>
						</div>


					</div>

					<div class="subMenuButton row align-items-center">

						<div class="buttonText">
							<h4>25/02/2021 - Rabia</h4>
						</div>

					</div>


					<div class="subMenuButton row align-items-center">

						<div class="buttonText">
							<h4>25/04/2020 - Heptavalente</h4>
						</div>

					</div>


					<div class="subMenuButton row align-items-center">

						<div class="buttonText">
							<h4>25/04/2019 - Heptavalente</h4>
						</div>

					</div>


					<div class="subMenuButton row align-items-center">

						<div class="buttonText">
							<h4>25/04/2018 - Heptavalente</h4>
						</div>

					</div>



					<button type="button"
						class="btn pmd-btn-fab btn-success btn-floating">
						<i class="fa fa-plus fa-lg"></i>
					</button>




				</div>
			</div>
		</div>
	</div>






</body>
<script src="bootstrap/bootstrap.min.js"></script>
</html>