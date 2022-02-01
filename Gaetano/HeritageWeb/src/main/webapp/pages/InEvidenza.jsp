<%@ page import="java.util.List" %>
<%@ page import="heritage.model.Documento" %>
<%@ page import="heritage.model.Documenti" %>
<%@ page import="heritage.model.Sezione" %>
<%@ page import="heritage.model.Sezioni" %>
<%@page import="heritage.model.UserController"%>
<%@page import="heritage.model.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ include file="../include/gestioneLogout.html"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="../include/headerPart1.html"%>
<link rel="stylesheet" href="../css/styleStory.css">
</head>
<body>
<%@ include file="../include/navbar.html"%>

<div class="container">
<%
			List<Documento> documenti = Documenti.ReadAllByAdmin();
			for (Documento documento : documenti) {
				List<Sezione> sezioni = Sezioni.ReadAllByDocument(documento.getId());
				if (sezioni.size() > 0) {
			%>
			<div class="d-flex justify-content-center">
				<h2><%=documento.getTitolo()%></h2>
			</div>
			<%
			for (Sezione sezione : sezioni) {
			%>
			<div class="d-flex justify-content-center">
				<div class="card2">
					<div class="row no-gutters">
						<div class="col-auto">
						<%=sezione.getIframe()%>
							</div>
							<div class="col">
								<div class="card-block px-2">
									<p class="card-text bg-light rounded fst-italic"><%=sezione.resizeTesto(sezione.getTesto())%></p>
									<a href="VisualizzaStoria.jsp?id=<%=+documento.getId()%>" class="btn btn-primary">Continua a leggere</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<br>
			<%
			}
			}
			}
			%>
</div>

</body>
</html>