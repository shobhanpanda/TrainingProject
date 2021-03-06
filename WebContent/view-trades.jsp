<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="com.connection.*" %>
 <%
  response.setHeader("Cache-Control","no-cache");
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
   if(session.getAttribute("userName")==null)
      response.sendRedirect("index.jsp");
   %>
<!doctype html>
<html lang="en">
<head>
	<title>View Trades| CITI</title>
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
			<div class="brand" style="font-size: 25px; color: grey;">
				Fixed Income OTC Transactions Reference Database
			</div>
			<!--div class="container-fluid">
				<div class="navbar-btn">
					<button type="button" class="btn-toggle-fullwidth"><i class="lnr lnr-arrow-left-circle"></i></button>
				</div>
				<form class="navbar-form navbar-left">
					<div class="input-group" style="margin-left: 30%;">
						<input type="text" value="" class="form-control" placeholder="Search dashboard...">
						<span class="input-group-btn"><button type="button" class="btn btn-primary">Go</button></span>
					</div>
				</form>
			</div-->
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
					<div class="col-md-12">
						<!-- TABLE HOVER -->
						<div class="panel">
							<div class="panel-heading">
								<h3 class="panel-title">Trades</h3>
							</div>
							<div class="panel-body">
								<table class="table table-hover" id="trade-table">
									<thead>
										<tr>
											<th>Trade ID</th>
											<th>ISIN</th>
											<th>Type</th>
											<th>Date</th>
											<th>Price</th>
											<th>Yield</th>
											<th colspan="3">Accrued Interest</th>
											<th>Counter Party</th>
										</tr>
										<tr>
											<th></th>
											<th></th>
											<th></th>
											<th></th>
											<th></th>
											<th></th>
											<th>Day 1</th><th>Day 2</th><th>Day 3</th>
											<th></th>
										</tr>
									</thead>
									<tbody>
										
											<% Connection conn= MySQLConnection.getConnection();
											
											String name=(String)session.getAttribute("userName");
											String select="Select * from Trade where UserName='"+name+"';";
											Statement st=conn.createStatement();
											ResultSet rs=st.executeQuery(select); 
										while(rs.next()){
											%>
											<% out.print("<tr>"); %>
											<% out.print("<td>"+rs.getInt(1) +"</td>"); %>
											<% out.print("<td>"+rs.getString(3) +"</td>"); %>
											<% out.print("<td>"+rs.getString(4) +"</td>"); %>
											<% out.print("<td>"+rs.getString(5) +"</td>"); %>
											<% out.print("<td>"+rs.getFloat(10) +"</td>"); %>
											<% out.print("<td>"+rs.getFloat(7) +"</td>"); %>
											<% out.print("<td>"+rs.getFloat(9) +"</td>"); %>
											<% out.print("<td>"+(rs.getFloat(9)*2) +"</td>"); %>
											<% out.print("<td>"+(rs.getFloat(9)*3) +"</td>"); %>
											<% out.print("<td>"+rs.getString(8) +"</td>"); %>
											<% out.print("</tr>"); %>

										<%
										}
										%>
											<!-- <td>1</td>
											<td>12345678914</td>
											<td>Buy</td>
											<td>12/08/2013</td>
											<td>100</td>
											<td>3</td>
											<td>100</td>
											<td>100</td>
											<td>100</td>
											<td>XYZ</td>-->

									</tbody>
								</table>
							</div>
						</div>
						<!-- END TABLE HOVER -->
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
		$('#trade-table').on('click', 'tr', function() {
			var values = $(this).find('td').map(function() {
				return $(this).text();
			});

			//location = "BondDetails?isin="+values[1];
			location = "view-bond-details.jsp?isin="+values[1];
		});
	
		 /*$("tr").bind("click",function(){
		   var x = document.getElementsByTagName('td')[1].innerHTML;
		   alert(x);
		   //location = "BondDetails?isin="+x;
		 });
		 function viewBond(){
			window.location("http://google.com");
		 }*/
	</script>
	
</body>

</html>
