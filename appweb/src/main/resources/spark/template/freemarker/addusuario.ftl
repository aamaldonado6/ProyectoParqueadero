<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style type="text/css">
		form{
			border: 3px solid olive;
			border-radius: 5px
			background: rgba(0,255,0,0.4);
			color: darkgreen;

		}
		.formcontrol{
			display: block;
      		margin-top:1em;
      		padding:0.5em;
			label{
				display: inline;
			};
			input{
				display: inline;
			};
		}
        input[type='submit']{
      			color:white;
      			background:olive;
      			padding:1em;
       }
	</style>
</head>
<body>
	<h1>Registro de cuenta de ususrio</h1>
	<form method="get" action="/registrar">
		<div class="formcontrol">
			<label for="log">Login:</label>
			<input type="text" name="log" id="log" placeholder="ingrese nombre">
		</div>
		<div class="formcontrol">
			<label for="pas">Password:</label>
			<input type="password" name="pas" id="pas" placeholder="ingrese password">
		</div>
		<div class="formcontrol">
			<input type="submit" name="enviar" id="enviar" value="Registrar">
		</div>



	</form>

</body>
</html>