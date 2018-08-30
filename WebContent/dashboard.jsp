<!doctype html>
<html lang="en">
 <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
   if(session.getAttribute("userName")==null)
      response.sendRedirect("index.jsp");
   %>
<head>
	<title>Dashboard | CIII</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	<link rel="stylesheet" href="assets/vendor/chartist/css/chartist-custom.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
	<style>
		img {
			display: block;
			margin: 0 auto;
		}
	</style>
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="index.html">Hi, name</a>
			</div>
			<div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
				</div>
				<form class="navbar-form navbar-left">
					<div class="input-group" style="margin-left: 30%;">
						<input type="text" value="" class="form-control" placeholder="Search dashboard...">
						<span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
					</div>
				</form>
			</div>
		</nav>
		<!-- END NAVBAR -->
		<!-- LEFT SIDEBAR -->
		<div id="sidebar-nav" class="sidebar">
			<div class="sidebar-scroll">
				<nav>
					<ul class="nav">
						<li><a href="dashboard.jsp" class="active"><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
						<li><a href="trade.jsp" class=""><i class="lnr lnr-file-empty"></i> <span>Generate Trades</span></i></a></li>
						<li><a href="view-trades.jsp" class=""><i class="lnr lnr-dice"></i> <span>View Trades</span></a></li>
						<li><a href="index.jsp" class=""><i class="lnr lnr-cog"></i> <span>Logout</span></a></li>
					</ul>
				</nav>
			</div>
		</div>
		<!-- END LEFT SIDEBAR -->
		<!-- MAIN -->
		<div class="main">
			<!-- MAIN CONTENT -->
			<div class="main-content">
				<div class="container-fluid">
					<h3 class="page-title">Bonds per country</h3>
					<div class="row">
						<div class="col-md-12">
							<div class="panel">
								<!--div class="panel-heading">
									<h3 class="panel-title">Bonds per country</h3>
								</div-->
								<div class="panel-body">
									<div id="demo-bar-chart" class="ct-chart"></div>
								</div>
							</div>
						</div>
					</div>
					<h3 class="page-title">Get your daily dose of financial news here!</h3>
					<div class="row">
						<div class="col-md-4">
							<div class="panel">
								<!--div class="panel-heading">
									<h3>Bloomberg</h3>
								</div-->
								<div class="panel-body">
									<a href="https://www.bloomberg.com/">
									<img src="assets/img/bloomberg.jpg" height="180px" width="inherit">
									</a>
									</img>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="panel">
								<!--div class="panel-heading" style="text-align:center;">
									<h3>WallStreet Journal</h3>
								</div-->
								<div class="panel-body">
									<a href="https://www.wsj.com/asia">
									<img src="assets/img/wsj.png" height="180px" width="inherit"></img>
									</a>
								</div>
							</div>
						</div>
						<div class="col-md-4">
							<div class="panel">
								<!--div class="panel-heading">
									<h3>Financial Times</h3>
								</div-->
								<div class="panel-body">
									<a href="https://www.ft.com/">
									<img src="assets/img/ft.png" height="180px" width="inherit">
									</img></a>
								</div>
							</div>
						</div>
					
				</div>
			</div>
			<!-- END MAIN CONTENT -->
		</div>
		<!-- END MAIN -->
		<div class="clearfix"></div>
		<footer>
			<div class="container-fluid">
				<p class="copyright">&copy; 2017 <a href="https://www.themeineed.com" target="_blank">Theme I Need</a>. All Rights Reserved.</p>
			</div>
		</footer>
	</div>
	<!-- END WRAPPER -->
	<!-- Javascript -->
	<script src="assets/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
	<script src="assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
	<script src="assets/vendor/chartist/js/chartist.min.js"></script>
	<script src="assets/scripts/klorofil-common.js"></script>
	<script>
	$(function() {
		var options;
		var data = {
			//Put names of countries here
			labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
			//Put values here
			series: [
				[200, 380, 900, 320, 410, 450, 570, 400, 555, 620, 750, 900],
			]
		};
		options = {
			height: "400px",
			axisX: {
				showGrid: false
			},
		};

		new Chartist.Bar('#demo-bar-chart', data, options);
	});
	</script>
	
	
</body>

</html>
