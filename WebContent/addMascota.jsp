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


					<div class="menuButton selected row align-items-center">

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
							<li class="breadcrumb-item" aria-current="page">Mascotas</li>
							<li class="breadcrumb-item active" aria-current="page">Nueva</li>
						</ol>
					</nav>

					<!-- Deberia separar el breadcrumb -->


					<div class="col">
						<div class="row">
							<img class="animalIcon" src="img/bird.png">
							<img class="animalIcon selectedAnimal" src="img/cat.png">
							<img class="animalIcon" src="img/dog.png">
							<img class="animalIcon" src="img/ferret.png">

						</div>
						<div class="row">
							<img class="animalIcon" src="img/guineapig.png">
							<img class="animalIcon" src="img/otros.png">
							<img class="animalIcon" src="img/rabbit.png">
							<img class="animalIcon" src="img/snake.png">
						</div>
					</div>




					<form>

						<div class="form-group">
							<label for="formName">Nombre</label> <input type="email"
								class="form-control" id="formName" placeholder="Nombre">
						</div>
						<div class="form-group">
							<label for="formName">Sexo</label>
							<div class="form-check">
								<input class="form-check-input" type="radio"
									name="flexRadioDefault" id="flexRadioDefault1"> <label
									class="form-check-label" for="flexRadioDefault1">
									Hembra </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio"
									name="flexRadioDefault" id="flexRadioDefault2" checked>
								<label class="form-check-label" for="flexRadioDefault2">
									Macho </label>
							</div>

							<div class="form-group">
								<label for="formRaza">Raza</label> <input type="email"
									class="form-control" id="formRaza" placeholder="Raza">
							</div>


							<div class="form-group">
								<label for="formChip">Número de Chip</label> <input type="email"
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
<script src="bootstrap/bootstrap.min.js"></script>
</html>