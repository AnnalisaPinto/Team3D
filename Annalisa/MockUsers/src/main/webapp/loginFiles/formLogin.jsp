<%@page import="users.model.UsersRepository"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
if ("POST".equalsIgnoreCase(request.getMethod())) {
	if (UsersRepository.verificaLogin(request.getParameter("nickname"), request.getParameter("password")) == 1) {

		session.setAttribute("utente", request.getParameter("nickname"));
	}
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	if ("POST".equalsIgnoreCase(request.getMethod())) {
		if (UsersRepository.verificaLogin(request.getParameter("nickname"), request.getParameter("password")) != 1) {
	%>

	<h3>L'utente non esiste, o la password non è corretta</h3>

	<%
	}
	}
	%>


	<form action="?" method="POST" id="form">
		<label for="nickname">Nickname</label> <input type="text"
			name="nickname" id="nickname"> <label for="password">Password</label>
		<input type="text" name="password" id="password"> <input
			type="hidden" value="" name="provenienza">
		<button type="button" id="invia">Invia il form</button>
	</form>

	<script src="scriptLogin.js"></script>
</body>
</html>