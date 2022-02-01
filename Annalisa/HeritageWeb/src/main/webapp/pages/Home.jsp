<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="heritage.model.UserController"%>
<%@page import="heritage.model.User"%>
<%@include file="../include/gestioneLogout.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
<%@ include file="../include/headerPart1.html"%>
</head>
<body>
	<%@ include file="../include/navbar.html"%>
	<div class="cont">
		<div class="slider"></div>
		<ul class="jumbo"></ul>
	</div>

	<div class="page">
		<section id="one">
			<h1>
				<strong>Scopri le meraviglie della Campania in 3D</strong>
			</h1>
			<br> <br> <br>
			<div class="sketchfab-embed-wrapper">
				<iframe title="Life on the Vesuvio side, Italy"
					style="width: 50%; height: 400px; float: right" frameborder="0"
					allowfullscreen mozallowfullscreen="true"
					webkitallowfullscreen="true"
					allow="autoplay; fullscreen; xr-spatial-tracking"
					xr-spatial-tracking execution-while-out-of-viewport
					execution-while-not-rendered web-share
					src="https://sketchfab.com/models/6c245d856aef452e83ee132f4d3ddc93/embed">
				</iframe>
			</div>
			<h2>Vesuvio</h2>
			<br> <br>
			<p style="text-align: justify; width: 40%; color: white;">Il
				Vesuvio rappresenta il simbolo di Napoli, ne domina il golfo ed è
				uno dei 2 vulcani attivi dell’Europa continentale. Il Somma-Vesuvio,
				propriamente detto, è oggetto di ricerca e monitoraggio continui al
				fine di scongiurare catastrofi come quelle occorse alle città di
				Pompei ed Ercolano nel 79 d.C. in seguito ad una delle storiche
				eruzioni.</p>
			<br> <br> <a href="" style="color: white;">Continua a
				leggere..</a>

		</section>
	</div>

	<section id="contact">
		<footer class="site-footer">
			<div class="container">
				<div class="row">
					<div class="col-sm-12 col-md-6">
						<h6>Chi siamo</h6>
						<p class="text-justify">Il Portale Campania Heritage:
							permetterà all’amministrazione di costruire documenti che
							sfruttano l’ausilio della Realtà Virtuale, e si concentrerà sulla
							valorizzazione della storia, della cultura, dell’arte e
							dell’architettura.</p>
					</div>

					<div class="col-xs-6 col-md-3">
						<h6>Contatti</h6>
						<ul class="footer-links">
							<li>E-mail: sitobellissimo@gmail.com</li>
							<li>Indirizzo: Via Brombeis</li>
							<li>Telefono: 13344445</li>
						</ul>
					</div>
				</div>
				<br>
				<hr>
				<br>
			</div>
			<div class="container">
				<div class="col-md-4 col-sm-6 col-xs-12" style="float: right;">
					<ul class="social-icons">
						<li><a class="facebook" href="#"><i
								class="fa fa-facebook"></i></a></li>
						<li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
						<li><a class="instagram" href="#"><i
								class="fa fa-instagram"></i></a></li>
						<li><a class="youtube" href="#"><i class="fa fa-youtube"></i></a></li>
					</ul>
				</div>
			</div>
		</footer>
	</section>

</body>
<script
	src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.min.js'></script>
<script src="../js/scriptJumbo.js"></script>
</html>
