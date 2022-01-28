<%@ page import="java.util.List" %>
<%@ page import="heritage.model.Documento" %>
<%@ page import="heritage.model.Documenti" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../files/headerPart1.html"%>
</head>
<body>
<%@ include file="../files/navbar.html"%>

<div class="container">
<% List<Documento> documenti = Documenti.ReadAllByAdmin();
for(Documento documento: documenti){
%>
<br>
	    <div class="card2">
        <div class="row no-gutters">
            <div class="col-auto">
            <%=documento.getIframe()%>
               </div>
            <div class="col">
                <div class="card-block px-2">
                    <h4 class="card-title"><%=documento.getTitolo()%></h4>
                    <p class="card-text"><%=documento.getDescrizione()%></p>
                    <a href="VisualizzaStoria.jsp" class="btn btn-primary">Continua a leggere</a>
                </div>
            </div>
        </div>
    </div>
    <br>
<%}%>
</div>

</body>
</html>