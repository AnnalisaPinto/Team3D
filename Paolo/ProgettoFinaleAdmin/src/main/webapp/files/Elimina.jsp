<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<title>Amministrazione - Elimina Documento</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
	font-family: "Lato", sans-serif
}

.w3-bar, h1, button {
	font-family: "Montserrat", sans-serif
}

.fa-anchor, .fa-coffee {
	font-size: 200px
}
</style>
<body>

	<!-- Navbar -->
	<div class="w3-top">
		<div class="w3-bar w3-blue w3-card w3-left-align w3-large">
			<a
				class="w3-bar-item w3-button w3-hide-medium w3-hide-large w3-right w3-padding-large w3-hover-white w3-large w3-blue"
				href="javascript:void(0);" onclick="myFunction()"
				title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a> <a
				href="logout.jsp"
				class="w3-bar-item w3-button w3-padding-large w3-hover-white">LogOut</a>
			<a href=Modifica.jsp
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Modifica</a>


		</div>

	</div>
	
	<!-- Header -->
	<header class="w3-container w3-blue w3-center"
		style="padding: 128px 16px">
		<h1>Amministratore</h1>

		<div class="container">

			<h4 style="text-align: center;">Crezione Nuovo Documento</h4>



			<form action="ConfirmCreate.jsp" style="text-align: center;">

				<input style="text-align: center;" placeholder="Titolo Storia"
					type="text" id="nome_codice" name="nome_codice"><br><br>
					<input type="submit" value="Submit"/> <br><br>
					
				<input style="text-align: center;" placeholder="Inserisci Documento"
					type="text" id="categoria_codice" name="categoria_codice"><br>
				<br><input type="submit" value="Submit"/><br>
				
				<br> <input style="text-align: center;"
					placeholder="Inserisci Codice" type="text" id="codice"
					name="codice"><br> <br> 
					<input type="submit" value="Submit"/>
			</form>
			
			
			</div>
			</header>