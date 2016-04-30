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
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
	integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
	crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-2.2.1.min.js"
	integrity="sha256-gvQgAFzTH6trSrAWoH1iPo9Xc96QxSZ3feW6kem+O00="
	crossorigin="anonymous"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.0/js/bootstrap-datepicker.js"></script>
<script type="text/javascript">
            // When the document is ready
            $(document).ready(function () {
                
                $('#date').datepicker({
                    format: "dd/mm/yyyy"
                });  
            
            });
        </script>
</head>
<body
	style="background-size: cover; background-image: url('../resources/images/background2.png'); background-position: 100%;">
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



	<div id="body" style="padding-top: 15%">
		<div>

			<p class="title" align="center">Flight Schedule Prediction</p>
		</div>

		<div>
			<div class="input-group input-group-lg" align="center"
				style="padding-left: 25%; padding-right: 25%">
				<span class="input-group-addon" id="sizing-addon1"><i
					class="fa fa-plane"></i></span> <input type="text" align="middle"
					class="form-control" placeholder="Flight Number"
					aria-describedby="sizing-addon1"><input type="text"
					id="date" class="form-control" placeholder="Pick a date">
			</div>

		</div>
		<br>
		<div class="row" style="padding-left: 25%; padding-right: 25%">

			<div class="col-xs-6">
				<button class="btn btn-default buttonSearch" style="width: 50%;">Submit</button>
			</div>
			<div class="col-xs-6">
				<button class="btn btn-default buttonCancel" style="width: 50%;">Cancel</button>
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