<%@ page import="java.util.List"%>
<%@ page import="progetto3D.model.Documento"%>
<%@ page import="progetto3D.model.Documenti"%>
<%@ page import="progetto3D.model.Sezione"%>
<%@ page import="progetto3D.model.Sezioni"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../files/headerPart1.html"%>
</head>
<body>
	<%@ include file="../files/navbar.html"%>
	<div class="container">
		<%
		List<Documento> documenti = Documenti.ReadAll();
		for (Documento documento : documenti) {
			List<Sezione> sezioni = Sezioni.ReadAllByDocument(documento.getId());
		%>
		<%
		if (sezioni.size() > 0) {
		%>
		<h2><%=documento.getTitolo()%></h2>
		<%
		for (Sezione sezione : sezioni) {
		%>
		<div class="d-flex justify-content-center">
			<div class="card2">
				<div class="row no-gutters">
					<div class="col-auto">
						<div class="sketchfab-embed-wrapper"><%=sezione.getIframe()%>
						</div>
						<div class="col">
							<div class="card-block px-2">
								<p class="card-text"><%=sezione.getTesto()%></p>
								<a href="VisualizzaStoria.jsp" class="btn btn-primary">Continua
									a leggere</a>
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
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

</body>
</html>