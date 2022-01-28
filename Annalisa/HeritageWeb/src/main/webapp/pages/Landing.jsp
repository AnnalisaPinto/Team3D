<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="heritage.model.UserController"%>
<%@page import="heritage.model.Users"%>
<%
Users u = null;
boolean logged = false;

if ((Boolean) session.getAttribute("logged") != null && (Boolean) session.getAttribute("logged") == true) {
	if ((Users) session.getAttribute("utente") != null) {
		u = (Users) session.getAttribute("utente");
		logged = true;
	}
}

UserController utente = new UserController(u, logged);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv=\ "refresh\" content=\ "5;url=Login\ " />
<p id=\ "countdown\" style="" "color:white;\" target=\"_self\">
	Nome utente inserito non valido!<br>
	<p>
	Verrai reindirizzato tra 5 secondi, altrimenti <a href=\"Login\"><p>clicca qui!</p></a>
</p>\r\n
<title>Insert title here</title>
</head>
<body>

<%=utente.messaggioConferma()%>

</body>
</html>