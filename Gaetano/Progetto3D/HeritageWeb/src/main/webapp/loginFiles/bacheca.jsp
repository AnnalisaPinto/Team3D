<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@page import="heritage.model.UserController"%>
  <%@page import="heritage.model.Users"%>
  <%
  Users u = null;
  boolean logged = false;
  
  if( (Boolean) session.getAttribute("logged") != null && (Boolean) session.getAttribute("logged") == true){
	  u = (Users) session.getAttribute("utente");
	  logged = true;
  }
  
	UserController utente = new UserController(u, logged);
 
 %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%= utente.navigaUtente() %>

</body>
</html>