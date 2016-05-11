<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Welcome to flight scheduling</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"
	rel="stylesheet"
	integrity="sha384-XdYbMnZ/QjLh6iI4ogqCTaIjrFk87ip+ekIjefZch0Y+PvJ8CDYtEs1ipDmPorQ+"
	crossorigin="anonymous">
<link href='http://fonts.googleapis.com/css?family=Poiret+One'
	rel='stylesheet' type='text/css'>
<link href='../resources/css/poiret.css' rel="stylesheet">
<link href='../resources/css/schedule-index.css' rel="stylesheet">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.0/css/bootstrap-datepicker.css"
	rel="stylesheet">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-2.2.1.min.js"
	integrity="sha256-gvQgAFzTH6trSrAWoH1iPo9Xc96QxSZ3feW6kem+O00="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.0/js/bootstrap-datepicker.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
<script type="text/javascript" src="../resources/js/controllers.js"></script>



</head>
<body
	style="background-size: cover; background-image: url('../resources/images/background.jpeg'); background-position: 100%;">

	<div id="header">

		<nav
			class="navbar navbar-default navbar-fixed-top poiret schedule-nav"
			style="position: center" role="navigation">

			<ul id="menu"
				class="nav navbar-nav navbar-collapse center-block collapse pull-right">

				<li><a href="#" class="navbar-link">FLIGHT SCHEDULES</a></li>
				<li><a href="#" class="navbar-link">WEATHER FORECAST</a></li>

			</ul>

		</nav>

	</div>


	<div id="body" class="w3-container" style="padding-top: 5%">
		<div>
			<form class="navbar-form navbar-left" role="search">
				<div class="form-group">
					<input type="text" class="form-control input-group input-group-lg"
						name="flightNumber" placeholder="Flight Number">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>

			</form>
		</div>
		<div style="padding-top: 6%">
			<div align="center">

				<c:if test="${status != 404}">
					<h1>
						${flightNumber} <small>${departureFrom} to ${arrival}</small>
					</h1>
					<br />
					<p>The prediction for the next five days are as follows:
					<ul class="w3-ul w3-card-4">
						<c:forEach var="predict" items="${predictions}">
							<li class="w3-padding-hor-16"><span
								onclick="this.parentElement.style.display='none'"
								class="w3-closebtn w3-padding w3-margin-right w3-medium">x</span>
								<c:if test="${predict.getPid() == 0}">
									<p>
										<img src="../resources/images/green.png"
											class="w3-left w3-circle w3-margin-right" style="width: 60px">
								</c:if> <c:if test="${predict.getPid() == 1}">
									<p>
										<img src="../resources/images/red.png"
											class="w3-left w3-circle w3-margin-right" style="width: 60px">
								</c:if> <c:if test="${predict.getPid() == 2}">
									<p>
										<img src="../resources/images/orange.png"
											class="w3-left w3-circle w3-margin-right" style="width: 60px">
								</c:if> <span class="w3-xlarge">${predict.getPrediction()}</span></li>
						</c:forEach>
					</ul>
				</c:if>
				<c:if test="${status == 404}">
					<div class="alert alert-danger" role="alert">
						Please enter a valid flight number!<br>example: search for
						flight <b>AI102</b>
					</div>
				</c:if>
			</div>

		</div>
	</div>


	<div id="footer" class=" schedule-footer poiret">
		<footer>
			<p align="center">copyright &copy 2016</p>
		</footer>
	</div>
</body>
</html>