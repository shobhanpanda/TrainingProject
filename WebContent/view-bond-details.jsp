<!doctype html>
 <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
   if(session.getAttribute("userName")==null)
      response.sendRedirect("index.jsp");
   %>
<html lang="en">
<head>
	<title>Bond Details| CITI</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="assets/css/main.css">
	<link rel="stylesheet" href="assets/css/demo.css"-->
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
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
						<li><a href="dashboard.jsp" class=""><i class="lnr lnr-home"></i> <span>Dashboard</span></a></li>
						<li><a href="trade.jsp" class=""><i class="lnr lnr-file-empty"></i><span>Generate Trades</span></i></a></li>
						<li><a href="view-trades.jsp" class="active"><i class="lnr lnr-dice"></i> <span>View Trades</span></a></li>
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
					<div class="row">
						<div class="col-md-6">
							<!-- INPUTS -->
							<div class="panel">
								<div class="panel-heading">
									<h3>Trade details</h3>
								</div>
								<div class="panel-body">
									<table class="table table-hover" id="trade-table">
										<tbody>
											<tr>
												<td>Trade date:</td>
												<td> </td>
											</tr>
											<tr>
												<td>Trade time:</td>
												<td> </td>
											</tr>
											<tr>
												<td>Security ISIN:</td>
												<td></td>
											</tr>
											<tr>
												<td>Trade type:</td>
												<td></td>
											</tr>
											<tr>
												<td>Yield:</td>
												<td></td>
											</tr>
											<tr>
												<td>Counter-party:</td>
												<td></td>
											</tr>
											<tr>
												<td>Settlement date:</td>
												<td></td>
											</tr>
											<tr>
												<td>Accrued Interest (Day 1):</td>
												<td></td>
											</tr>
											<tr>
												<td>Accrued Interest (Day 2):</td>
												<td></td>
											</tr>
											<tr>
												<td>Accrued Interest (Day 3):</td>
												<td></td>
											</tr>
											<tr>
												<td>Clean price:</td>
												<td></td>
											</tr>
											<tr>
												<td>Dirty price:</td>
												<td></td>
											</tr>
										</tbody>
									</table>
								</div>
							</div>
							<!-- END INPUTS -->
						</div>
						<div class="col-md-6">
							<div class="panel">
								<div class="panel-heading">
									<h3>Bond details</h3>
								</div>
								<div class="panel-body">
									<table class="table table-hover" id="trade-table">
										<tbody>
											<tr>
												<td>ISIN:</td>
												<td> </td>
											</tr>
											<tr>
												<td>Coupon Rate:</td>
												<td> </td>
											</tr>
											<tr>
												<td>Issue date:</td>
												<td></td>
											</tr>
											<tr>
												<td>Maturity date:</td>
												<td></td>
											</tr>
											<tr>
												<td>Frequency:</td>
												<td></td>
											</tr>
											<tr>
												<td>Day-count convention:</td>
												<td></td>
											</tr>
											<tr>
												<td>Quote convention:</td>
												<td></td>
											</tr>
											<tr>
												<td>Issuer name:</td>
												<td></td>
											</tr>
											<tr>
												<td>Face value:</td>
												<td></td>
											</tr>
											<tr>
												<td>Last coupon payment date:</td>
												<td></td>
											</tr>
										</tbody>
									</table>
								</div>
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
	<script src="assets/scripts/klorofil-common.js"></script>
	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript">
		
	</script>
	
</body>

</html>