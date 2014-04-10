<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
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

<div class="navbar-wrapper">
	<div class="container">

		<div class="navbar navbar-default navbar-static-top" role="navigation">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="/evs-pedro/login">EVS - PEDRO & LUCIA</a>
				</div>
				<div class="navbar-collapse collapse">
					<ul class="nav navbar-nav">
						<li class="active"><a href="#">Home</a></li>
						<li><a href="/evs-pedro/login/sobre.html">Sobre</a></li>
						<li><a href="/evs-pedro/login/contato.html">Contato</a></li>
						<!-- here comes the important part -->

						<li class="dropdown" id="menu1"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#menu1"> Login <b class="caret"></b>
						</a>
							<div class="dropdown-menu">
								<form method="post" action="j_spring_security_check" style="margin: 0px" >
									<fieldset class='textbox' style="padding: 10px">
											<input name="j_username" id="j_username" type="text"
											style="margin-top: 8px"
											placeholder="<spring:message code='sample.email' /> "><br />
											<input name="j_password" id="j_password" type="password"
											style="margin-top: 8px"
											placeholder="Password">
											<input
											class="btn-primary" name="submit" type="submit"
											value="Log In" />
									</fieldset>
								</form>
							</div></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</div>
<tiles:insertAttribute name="body" />
<script src="/evs-pedro/resources/js/bootstrap.min.js"></script>
<script src="/evs-pedro/resources/js/jquery-1.10.2.min.js"></script>
<script src="/evs-pedro/resources/js/docs.min.js"></script>
</html>