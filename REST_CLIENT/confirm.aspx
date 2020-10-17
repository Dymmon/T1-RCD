<%@Page %>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<link href="public/login-page.css" rel="stylesheet" />
<link href="public/head.css" rel="stylesheet" />
<link href="public/confirm.css" rel="stylesheet" />
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="public/confirm.js"></script>
<!Doctype html>
<html lang="es">
<head>
	<link rel="shortcut icon" type="image/ico" href="/public/images/favicon.ico">
     <meta charset="UTF-8">
     <title>Validador</title>
		 <meta name="viewport" content="width=device-width, initial-scale=1"></head>
<body runat="server">
	<div class="topnav">
		<a class="active" href="home.aspx">INICIO</a>
	  </div>
 <div class="container">
	<div class ="row">
		<p class="mensaje" id="saludo"></p>
		<p class="mensaje" id="rutv"></p>
	</div>
	<div class ="row">
		<input class="btn btn-primary" type="button" id="button2" value="Salir">
	 </div>
</div>	
<div><footer>TRDC</footer>	</div>
</body>
		
</html>   