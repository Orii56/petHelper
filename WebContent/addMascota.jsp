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


					<div class="menuButton selected row align-items-center" onclick="location.href='menuPrincipal.jsp'">

						<img class="buttonIcon" src="img/Otros.png">
						<div class="buttonText">
							<h4>Mascotas</h4>
						</div>


					</div>

					<div class="menuButton row align-items-center" onclick="location.href='menuPrincipal.jsp'">

						<img class="buttonIcon" src="img/location.png">
						<div class="buttonText">
							<h4>Lugares de Interes</h4>
						</div>


					</div>
					<div class="menuButton row align-items-center"  onclick="location.href='menuPrincipal.jsp'">

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
							<li class="breadcrumb-item" aria-current="page">Mascotas</li>
							<li class="breadcrumb-item active" aria-current="page">Nueva</li>
						</ol>
					</nav>

					<!-- Deberia separar el breadcrumb -->

					<form action="GestionMascota?option=addMascota" method="POST">

					<div class="col">
						<div class="row">
							<img class="animalIcon" id="a3" src="img/Pajaro.png" onclick="select(3)">
							<img class="animalIcon" id="a2" src="img/Gato.png" onclick="select(2)">
							<img class="animalIcon" id="a1" src="img/Perro.png" onclick="select(1)">
							<img class="animalIcon" id="a6" src="img/Huron.png" onclick="select(6)">

						</div>
						<div class="row">
							<img class="animalIcon" id="a4" src="img/Roedor.png" onclick="select(4)">
							<img class="animalIcon" id="a7" src="img/Otros.png" onclick="select(7)">
							<img class="animalIcon" id="a8" src="img/Conejo.png" onclick="select(8)">
							<img class="animalIcon" id="a5" src="img/Reptil.png" onclick="select(5)">
						</div>
					</div>
					<input type="hidden" name="jspVar" id="hiddenValue" value="7">





						<div class="form-group">
							<label for="formName">Nombre</label> <input type="text" name="name"
								class="form-control" id="formName" placeholder="Nombre">
						</div>
						<div class="form-group">
							<label for="formName">Sexo</label>
							<div class="form-check">
								<input class="form-check-input" type="radio"
									name="sexo" id="flexRadioDefault1"> <label
									class="form-check-label" for="flexRadioDefault1">
									Hembra </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio"
									name="sexo" id="flexRadioDefault2" checked>
								<label class="form-check-label" for="flexRadioDefault2">
									Macho </label>
							</div>
							
							<div class="form-group">
					<label for="formDate">Fecha de Nacimiento</label> <input
						type="date" class="form-control" id="date" name="date"
						placeholder="Fecha de Nacimiento">
				</div>

							<div class="form-group">
								<label for="formRaza">Raza</label> <input type="text" name="raza"
									class="form-control" id="formRaza" placeholder="Raza">
							</div>


							<div class="form-group">
								<label for="formChip">Número de Chip</label> <input type="text" name="chip"
									class="form-control" id="formChip" placeholder="Numero de Chip">
							</div>

						</div>
						<button type="submit" class="btn btn-success btn-block">Submit</button>

					</form>

				</div>
			</div>
		</div>
	</div>






</body>
<script src="js/menuMascota.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
</html>