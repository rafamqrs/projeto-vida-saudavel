<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Espaco vida saudavel</title>
<style type="text/css">
@import
	"//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css"
	;

@import "http://fonts.googleapis.com/css?family=Roboto:400,500";

.box>.icon {
	text-align: center;
	position: relative;
}

.box>.icon>.image {
	position: relative;
	z-index: 2;
	margin: auto;
	width: 88px;
	height: 88px;
	border: 8px solid white;
	line-height: 88px;
	border-radius: 50%;
	background: #63B76C;
	vertical-align: middle;
}

.box>.icon:hover>.image {
	background: #333;
}

.box>.icon>.image>i {
	font-size: 36px !important;
	color: #fff !important;
}

.box>.icon:hover>.image>i {
	color: white !important;
}

.box>.icon>.info {
	margin-top: -24px;
	background: rgba(0, 0, 0, 0.04);
	border: 1px solid #e0e0e0;
	padding: 15px 0 10px 0;
}

.box>.icon:hover>.info {
	background: rgba(0, 0, 0, 0.04);
	border-color: #e0e0e0;
	color: white;
}

.box>.icon>.info>h3.title {
	font-family: "Roboto", sans-serif !important;
	font-size: 16px;
	color: #222;
	font-weight: 500;
}

.box>.icon>.info>p {
	font-family: "Roboto", sans-serif !important;
	font-size: 13px;
	color: #666;
	line-height: 1.5em;
	margin: 20px;
}

.box>.icon:hover>.info>h3.title,.box>.icon:hover>.info>p,.box>.icon:hover>.info>.more>a
	{
	color: #222;
}

.box>.icon>.info>.more a {
	font-family: "Roboto", sans-serif !important;
	font-size: 12px;
	color: #222;
	line-height: 12px;
	text-transform: uppercase;
	text-decoration: none;
}

.box>.icon:hover>.info>.more>a {
	color: #fff;
	padding: 6px 8px;
	background-color: #63B76C;
}

.box .space {
	height: 30px;
}
</style>
<link href="/evs-pedro/resources/css/bootstrap.min.css" rel="stylesheet" />
<link href="/evs-pedro/resources/css/bootstrap-responsive.min.css"
	rel="stylesheet" />
<link href="/evs-pedro/resources/css/carousel.css" rel="stylesheet" />
<script src="/evs-pedro/resources/js/jquery-1.9.1.min.js"></script>
<script src="/evs-pedro/resources/js/angular.min.js"></script>
</head>
<!-- NAVBAR
================================================== -->
<body>
	<div class="navbar-wrapper">
		<div class="container">

			<div class="navbar navbar-default navbar-static-top"
				role="navigation">
				<div class="container">
					<div class="navbar-header">
						<button type="button" class="navbar-toggle" data-toggle="collapse"
							data-target=".navbar-collapse">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
						<a class="navbar-brand" href="#">EVS - PEDRO & LUCIA</a>
					</div>
					<div class="navbar-collapse collapse">
						<ul class="nav navbar-nav">
							<li class="active"><a href="#">Home</a></li>
							<li><a href="#about">Sobre</a></li>
							<li><a href="/contato.html">Contato</a></li>
							<li class="dropdown"><a href="#" class="dropdown-toggle"
								data-toggle="dropdown">Restrito<b class="caret"></b></a>
								<ul class="dropdown-menu">
									<li><a href="/evs-pedro-lucia/cliente/adicionar.html">Gerenciar
											Clientes</a></li>
									<li class="divider" />
									<li class="dropdown-header">Pedido</li>
									<li><a href="/evs-pedro-lucia/login/logar.html">Gerenciar
											Pedidos</a></li>
									<li class="divider" />
									<li class="dropdown-header">Controle Paginas</li>
									<li><a
										href="/evs-pedro-lucia/conteudo/conteudoPagina.html">
											Conteudo Página Principal</a></li>
								</ul></li>

							<!-- here comes the important part -->

							<li class="dropdown" id="menu1"><a class="dropdown-toggle"
								data-toggle="dropdown" href="#menu1"> Login <b class="caret"></b>
							</a>
								<div class="dropdown-menu">
									<form style="margin: 0px" accept-charset="UTF-8"
										action="/sessions" method="post">
										<fieldset class='textbox' style="padding: 10px">
											<input style="margin-top: 8px" type="text"
												placeholder="Username" /> <input style="margin-top: 8px"
												type="password" placeholder="Passsword" /> <input
												class="btn-primary" name="commit" type="submit"
												value="Log In" />
										</fieldset>
									</form>
								</div></li>
							<!-- LOGIN MENU -->
							<li class="dropdown" id="menuLogin"><a
								class="dropdown-toggle" href="#" data-toggle="dropdown"
								id="navLogin">Login</a>
								<div class="dropdown-menu" style="padding: 17px;">
									<form method="post" action="j_spring_security_check">
										<div>
											<input name="j_username" id="j_username" type="text"
												class="span12"
												placeholder="<spring:message code='sample.email' /> "><br />
											<input name="j_password" id="j_password" type="password"
												class="span12" placeholder="Password"><br />
											<button type="submit" name="submit"
												class="btn btn-inverse btn-block"></button>
										</div>
									</form>
								</div></li>

						</ul>
					</div>
				</div>
			</div>

		</div>
	</div>


	<!-- Carousel
    ================================================== -->
	<div id="myCarousel" class="carousel slide" data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active">
				<img src="/evs-pedro/resources/img/Espaco-Vida-Saudavel-shake.jpg"
					style="width: 640px; height: 500px">
				<div class="container">
					<div class="carousel-caption">
						<h1>Sobre a Herbalife:</h1>
						<p>Herbalife Ltd. é uma empresa global de nutrição que
							comercializa produtos de controle de peso, nutrição e cuidados
							pessoais para um estilo de vida saudável. Os produtos Herbalife
							são vendidos em mais de 80 países por meio de uma rede de mais
							de 2 milhões de distribuidores independentes.</p>
						<p>
							<a class="btn btn-lg btn-primary" href="#myModal"
								data-toggle="modal">Saiba mais</a>
						</p>
					</div>
				</div>
			</div>
			<div class="item">
				<img src="/evs-pedro/resources/img/shakes.jpg"
					style="width: 640px; height: 500px" alt="Segunda Imagem">
				<div class="container">
					<div class="carousel-caption">
						<button class="btn btn-primary" data-toggle="modal"
							data-target="#myModal">Informacoes</button>
					</div>
				</div>
			</div>
			<div class="item">
				<img src="/evs-pedro/resources/img/EVS.jpg"
					style="width: 640px; height: 500px" alt="Terceira Imagem">
				<div class="container">
					<div class="carousel-caption">
						<!-- Button trigger modal -->
						<button class="btn btn-primary" data-toggle="modal"
							data-target="#myModal">Informacoes</button>
					</div>
				</div>
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" data-slide="prev"><span
			class="glyphicon glyphicon-chevron-left"></span></a> <a
			class="right carousel-control" href="#myCarousel" data-slide="next"><span
			class="glyphicon glyphicon-chevron-right"></span></a>
	</div>
	<!-- /.carousel -->



	<div class="container">
		<div class="row">
			<!-- Boxes de Acoes -->
			<div class="col-xs-12 col-sm-6 col-lg-4">
				<div class="box">
					<div class="icon">
						<div class="image">
							<i class="fa fa-thumbs-o-up"></i>
						</div>
						<div class="info">
							<h3 class="title">Made with Bootstrap</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Sed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices
								gravida massa luctus ornare. Suspendisse blandit quam elit, eu
								imperdiet neque semper.</p>
							<div class="more">
								<a href="#" title="Title Link"> Read More <i
									class="fa fa-angle-double-right"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="space"></div>
				</div>
			</div>

			<div class="col-xs-12 col-sm-6 col-lg-4">
				<div class="box">
					<div class="icon">
						<div class="image">
							<i class="fa fa-flag"></i>
						</div>
						<div class="info">
							<h3 class="title">Icons by Font Awesome</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Sed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices
								gravida massa luctus ornare. Suspendisse blandit quam elit, eu
								imperdiet neque semper.</p>
							<div class="more">
								<a href="#" title="Title Link"> Read More <i
									class="fa fa-angle-double-right"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="space"></div>
				</div>
			</div>

			<div class="col-xs-12 col-sm-6 col-lg-4">
				<div class="box">
					<div class="icon">
						<div class="image">
							<i class="fa fa-desktop"></i>
						</div>
						<div class="info">
							<h3 class="title">Desktop Friendly</h3>
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Sed in lobortis nisl, vitae iaculis sapien. Phasellus ultrices
								gravida massa luctus ornare. Suspendisse blandit quam elit, eu
								imperdiet neque semper.</p>
							<div class="more">
								<a href="#" title="Title Link"> Read More <i
									class="fa fa-angle-double-right"></i>
								</a>
							</div>
						</div>
					</div>
					<div class="space"></div>
				</div>
			</div>
			<!-- /Boxes de Acoes -->
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">...</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save changes</button>
				</div>
			</div>
		</div>
	</div>
	<!-- Marketing messaging and featurettes
    ================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->
	<div class="container marketing"></div>
	<!-- /.container -->
	<script src="/evs-pedro/resources/js/bootstrap.min.js"></script>
	<script src="/evs-pedro/resources/js/jquery-1.10.2.min.js"></script>
	<script src="/evs-pedro/resources/js/docs.min.js"></script>
</html>
