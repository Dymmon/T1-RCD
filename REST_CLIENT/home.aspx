<%@Page %>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<link href="public/head.css" rel="stylesheet" />
<link href="public/login-page.css" rel="stylesheet" />
<script src="public/login-page.js"></script>
<!Doctype html>

<html lang="es">
<head>
	<link rel="shortcut icon" type="image/ico" href="/public/images/favicon.ico">
     <meta charset="UTF-8">
     <title>Validador</title>
		 <meta name="viewport" content="width=device-width, initial-scale=1">
		
</head>
<body runat="server">
	<div class="topnav">
		<a class="active" href="home.aspx">INICIO</a>
	  </div>
 <div class="container">
 <!---heading---->
     <header class="heading"> Validador</header>
	<!---Form starting----> 
	<div class="row ">
	 <!--- For Name---->
         <div class="col-sm-12">
             <div class="row">
			     <div class="col-xs-4">
          	         <label class="firstname">Nombre :</label> </div>
		         <div class="col-xs-8">
		             <input type="text" name="fname" id="fname" placeholder="Ingrese su nombre" class="form-control ">
             </div>
		      </div>
		 </div>
		 
		 
         <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
                     <label class="lastname">Apellido Paterno:</label></div>
				<div class ="col-xs-8">	 
		             <input type="text" name="lname" id="lname" placeholder="Ingrese su appelido paterno" class="form-control last">
                </div>
		     </div>
		 </div>


		 <div class="col-sm-12">
		     <div class="row">
			     <div class="col-xs-4">
		             <label class="lastnamem" >Apellido Materno :</label></div>
			     <div class="col-xs-8"	>	 
			          <input type="text" name="lnamem"  id="lnamem" placeholder="Ingrese su appelido materno" class="form-control" >
		         </div>
		     </div>
		 </div>
	 <!-----For dni---->
          <div class="col-sm-12">
		         <div class="row">
				     <div class="col-xs-4">
		 	              <label class="RUT">RUN :</label></div>
				  <div class="col-xs-8">
			             <input type="number" name="rut" id="rut" PlaceHolder="Ingrese su RUN sin puntos ni guion" class="form-control" min="1000000" max="30000000">
				 </div>
          </div>
		  </div>
		  
     <!-----------For Gender-------->
         <div class="col-sm-12">
		     <div class ="row">
                 <div class="col-xs-4 ">
			       <label class="gender">Genero:</label>
				 </div>
			 
			     <div class="col-xs-4 male">	 
				     <input type="radio" name="gender"  id="genderm" value="Masculino">Masculino</>
				 </div>
				 
				 <div class="col-xs-4 female">
				     <input type="radio"  name="gender" id="genderf" value="Femenino" >Femenino</>
				 </div>
				 
		  	 </div>
		     <div class="col-sm-12">
		         <div>
					<input class="btn btn-primary" type="button" id="button" value="Enviar" >
				 </div>
		   </div>
		 </div>
	 </div>	 
		 		 
		 
</div>
	<div><footer>TRDC</footer></div>
</body>	

</html>