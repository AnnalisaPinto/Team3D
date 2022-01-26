<%@page import="users.controllerData.InvioLogin"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
if ("POST".equalsIgnoreCase(request.getMethod())) {
	if (InvioLogin.recuperaUtente(request.getParameter("nickname"), request.getParameter("password")) == 1) {

		session.setAttribute("utente", request.getParameter("nickname"));
		session.setAttribute("logged", "true");
	}
}
%>

<%@ include file="gestioneLogout.html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<%
	if ("POST".equalsIgnoreCase(request.getMethod())) {
			if ((InvioLogin.recuperaUtente(request.getParameter("nickname"), request.getParameter("password")) != 1)) {
				
	%>

	<h3>L'utente non esiste, o la password non è corretta</h3>

	<%
	}
	}
	%>

	<!-- includo il link di login -->
	<%@ include file="logInOut.html"%>
	
	
	
	<form action="?" method="POST" id="form">
		<label for="nickname">Nickname</label>
		<input type="text"name="nickname" id="nickname"> 
		<p id="error-nickname"><p>
		<label for="password">Password</label>
		<input type="text" name="password" id="password"> 
		<input type="hidden" value="" name="provenienza">
		<button type="button" id="invia">Invia il form</button>
	</form>

	<script src="scriptLogin.js"></script>
</body>
</html>