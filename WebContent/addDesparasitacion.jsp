<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
<link rel="stylesheet" href="style/style_addVacuna.css">

<script src="https://use.fontawesome.com/da7b76c87f.js"></script>


<title>petHelper</title>
</head>
<body>
	<div class="container">
		<div class="formBox">

			<div class="row">

				<!-- Columna izquierda -->
				<div class="col-5">


					<div class="menuButton row align-items-center" onclick="location.href='menuVacuna.jsp';">

						<div class="buttonText">
							<h4>Vacunas</h4>
						</div>
					</div>

					<div class="menuButton selected row align-items-center" onclick="location.href='menuDesparasitacion.jsp';">

						<div class="buttonText">
							<h4>Desparasitacion</h4>
						</div>
					</div>

					<div class="menuButton row align-items-center" onclick="location.href='menuHigiene.jsp';">

						<div class="buttonText">
							<h4>Higiene</h4>
						</div>
					</div>


				</div>



				<!-- Columna derecha -->
				<div class="col-7">

					<nav aria-label="breadcrumb">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="Login?option=home">Home</a></li>
							<li class="breadcrumb-item" aria-current="page">Mascotas</li>
							<li class="breadcrumb-item" aria-current="page">${requestScope.nombreBread}</li>
							<li class="breadcrumb-item" aria-current="page">Desparasitacion</li>
							<li class="breadcrumb-item active" aria-current="page">Nueva</li>
						</ol>
					</nav>

					<!-- Deberia separar el breadcrumb -->

<form action="GestionSanitaria?option=addDesparasitacion" method="POST">
			
			<div class="form-group">
					<label for="formName">Nombre Desparasitante</label> <input
						type="text" class="form-control" id="name" name="name"
						placeholder="Nombre Desparasitante">
				</div>
				<div class="form-group">
					<label for="formDate">Fecha</label> <input
						type="date" class="form-control" id="date" name="date"
						placeholder="Fecha Desparasitación">
				</div>
				
				<div class="form-group">
					<label for="formLastDate">Validez hasta</label> <input
						type="date" class="form-control" id="formLastDate" name="dateR"
						placeholder="Fecha Vacuna">
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