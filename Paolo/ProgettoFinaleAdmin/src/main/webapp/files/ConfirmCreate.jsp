<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="admin.model.*"%>

<!DOCTYPE html>
<html lang="en">
<title>Amministrazione - Codice creato</title>
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
				href="login.jsp"
				class="w3-bar-item w3-button w3-padding-large w3-hover-white">LogOut</a>
			<a href="CreateCode.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Creazione</a>
			<a href="Modifica.jsp"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">Modifica</a>
			<a href="ViewByCategory"
				class="w3-bar-item w3-button w3-hide-small w3-padding-large w3-hover-white">View
			</a>

		</div>

	</div>

	<!-- Header -->
	<header class="w3-container w3-blue w3-center"
		style="padding: 128px 16px">
		<h1>Amministratore</h1>


	</header>
<body>
	<%
	String nome_codice = request.getParameter("nome_codice");
	String categoria_codice = request.getParameter("categoria_codice");
	String codice = request.getParameter("codice");

	CodiceRepository.Create(nome_codice, categoria_codice, codice);
	%>
	<h1 style="text-align: center;">Codice Creato!</h1>
</body>


<!-- Footer -->
<footer class="w3-container w3-padding-64 w3-center w3-opacity">
	<p>Creato da Paolo Krogh</p>
</footer>

</body>
</html>
