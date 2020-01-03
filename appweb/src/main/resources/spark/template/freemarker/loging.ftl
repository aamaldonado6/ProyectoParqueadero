<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>Login</title>
</head>
<body>

	<div class="container col-md-4 bg-info text-white px-md-3">
		<h1 class="text-dark">Mecanismos de logeo</h1>
		<form method="get" action="/ingresar">
		<#--<label>Elija el tipo de cuenta:</label>
		<div class="form-check bg-secondary">
			<input class="form-check-input" type="radio" name="desc" id="desc1" value="nuevoUsuario">Nueva Cuenta <br>
			<input class="form-check-input" type="radio" name="desc" id="desc2" value="usuarioExistente">Cuenta Existente
		</div>-->
		<div class="form-group">
			<label for="log">Login:</label>
			<input class="form-control is-valid" type="text" name="log" id="log" placeholder="ingrese nombre">
		</div>
		<div class="form-group">
			<label for="pas">Password:</label>
			<input class="form-control is-valid" type="password" name="pas" id="pas" placeholder="ingrese password">
		</div>
		<div class="form-group ">
			<input class="btn btn-success " type="submit" name="enviar" id="enviar" value="Enviar">
		</div>

	</form>
	</div>
</body>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>