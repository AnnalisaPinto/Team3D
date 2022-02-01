<%@ page import="java.util.List"%>
<%@ page import="heritage.model.Documento"%>
<%@ page import="heritage.model.Documenti"%>
<%@ page import="heritage.model.Sezione"%>
<%@ page import="heritage.model.Sezioni"%>
<%@ page import="heritage.model.Commento"%>
<%@ page import="heritage.model.Commenti"%>
<%@page import="heritage.model.UserController"%>
<%@page import="heritage.model.Users"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
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
	<% int id = Integer.parseInt(request.getParameter("id"));
     List<Sezione> sezioni = Sezioni.ReadAllByDocument(id);
     Documento documento = Documenti.ReadOne(id);
%>
	<div class="container">
			<h1><%=documento.getTitolo() %></h1>
			<div class="row">
	<%for (Sezione sezione : sezioni) { %>
		<br>
			<div class="col-md-7">
				<div class="sketchfab-embed-wrapper">
					<%=sezione.getIframe()%>
					<div class="separatore">
						<hr>
					</div>
				</div>
				    <div class="col-md-5">
					<div class="p-4 mb-4 bg-light rounded">
						<h4 class="fst-italic" style="color: black;">Descrizione</h4>
						<p class="mb-0"><%=sezione.getTesto() %></p>
					</div>
				</div>
				<%} %>
			</div>
			<br>

			<div class="row">
				
					<h4 style="font-size: 30px;">Commenti</h4>
					<div class="grid">
						<div class="row">
							<% List<Commento> commenti = Commenti.ReadAllByDocument(id);
							Users user = UserController.ReadOne();
							for(Commento commento: commenti){%>
							<div class="text-justify darker mt-4">
								<img src="https://i.imgur.com/CFpa3nK.jpg" alt=""
									class="rounded-circle" width="40" height="40">
								<h4>Ciccio ciccio</h4>
								<span>- <%=commento.getData()%></span> <br>
								<p><%=commento.getCommento() %></p>
							</div>
							<%} %>
							<div class="separatore">
								<hr>
							</div>
							<!-- Sezione commento per loggati -->

							<form id="algin-form">
								<div class="form-group">
									<!-- Qui ci va il saluto all'utente -->
									<h4>Lascia un commento</h4>
									<label for="message">Messaggio</label>
									<textarea name="msg" id="" msg cols="30" rows="5"
										class="form-control" style="background-color: white;"></textarea>
								</div>
								<div class="form-group">
									<button type="button" id="post" class="btn">Commenta</button>
								</div>
							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
		
</body>
</html>