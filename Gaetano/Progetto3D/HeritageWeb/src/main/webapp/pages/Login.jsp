<%@page import="heritage.controllerData.InvioLogin"%>
<%@page import="heritage.model.Users"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="heritage.model.UserController"%>

<%
// Questa procedura verrà effettuata soltanto nella pagina di login, una volta schiacciato il pulsante submit
if ("POST".equalsIgnoreCase(request.getMethod())) {

	Users utente = InvioLogin.recuperaUtente(request.getParameter("nickname"), request.getParameter("password"));

	if (utente != null) {

		session.setAttribute("utente", utente);
		session.setAttribute("logged", true);
		String redirectURL = "Landing.jsp";
	    response.sendRedirect(redirectURL);
	}
}
%>

<%@ include file="../include/gestioneLogout.html"%>

<%
boolean logged = false;
Users u = new Users();

if ((Boolean) session.getAttribute("logged") != null && (Boolean) session.getAttribute("logged") == true) {
	if ((Users) session.getAttribute("utente") != null) {
		u = (Users) session.getAttribute("utente");
		logged = true;
	}
}
session.setAttribute("loginReferer", request.getHeader("referer"));
UserController utente = new UserController(u, logged);
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<form action="?" method="POST" id="form">
		<label for="nickname">Nickname</label> <input type="text"
			name="nickname" id="nickname">
		<p id="error-nickname">
		<p>
			<label for="password">Password</label> <input type="text"
				name="password" id="password"> <input type="hidden" value=""
				name="provenienza">
			<button type="button" id="invia">Invia il form</button>
	</form>

	<%
	if ("POST".equalsIgnoreCase(request.getMethod())) {
	%>
	<%=utente.messaggioConferma()%>
	<%
	}
	%>

	<script src="../js/scriptLogin.js"></script>

</body>
</html>