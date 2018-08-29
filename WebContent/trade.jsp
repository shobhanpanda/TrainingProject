<!doctype html>
<html lang="en">
<head>
	<title>Trade| CITI</title>
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
	<style>

		.leftFormPanel p{
			margin: 8%;
		}

		.textElement{
			margin: 6%;
		}

		.isinElement ul {
		float:left;
		list-style:none;
		padding:0px;
		border:1px solid black;
		margin-top:0px; 
	}
	.isinElement input,.isinElement ul{
		width:300px;	
	}
	.isinElement li:hover{
		color:white;
		background: #0088cc;
	}

	</style>
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<!-- NAVBAR -->
		<nav class="navbar navbar-default navbar-fixed-top">
			<div class="brand">
				<a href="index.html"><!--img src="assets/img/logo-dark.png" alt="Klorofil Logo" class="img-responsive logo"-->Hi, name</a>
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
						<li><a href="trade.jsp" class="active"><i class="lnr lnr-file-empty"></i><span>Generate Trades</span></i></a></li>
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
					<!--div class="row">
						<div class="col-md-6">
							<h3 class="page-title">Elements</h3>
						</div>
						<div class="col-md-6">
							<h3 class="page-title">Elements</h3>
						</div>
					</div-->
					<div class="row">
						<div class="col-md-6">
							<!-- INPUTS -->
							<div class="panel">
								<div class="panel-heading">
									<h3>Enter trade details</h3>
								</div>
								<div class="panel-body">
									<form>
										<div class="row">
											<div class="leftFormPanel col-md-4">
												<p>Trade Date:</p>
												<br>
												<p>Trade time:</p>
												<br>
												<p>Security ISIN:</p>
												<br>
												<p>Trade type: </p>
												<br>
												<p>Traded price: </p>
												<br>
												<p>Yield: </p>
												<br>
												<p>Counter-party: </p>
												<br>
												<p>Settlement Date: </p>
												<br>
											</div>
											<div class="rightFormPanel col-md-2" style="width: 40%;">
												<p><input type="Date" name="tradedate" id="tradedate" class="textElement" onchange="TDate(this)" required></p>
												<p><input type="time" name="tradetime" class="textElement" required></p>
												<p><input type="text" name="isin" id="isin" class="isinText textElement" required onkeyup="search(this)"></p>
												<div id="response"></div>
												<br>
												<p>
													<div class="row textElement">
														<div class="col-md-6">
															<input name="tradetype" value="Buy" type="radio" checked>
															<span><i></i>Buy</span>
														</div>
														<div class="col-md-6" style="">
															<input name="tradetype" value="Sell" type="radio">
															<span><i></i>Sell</span>
														</div>
													</div>
												</p>
												<p><input type="text" name="price" id="price" class="textElement" onchange="getBond(this)" required></p>
												<p><input type="text" name="yield" id="yield" class="textElement" onchange="doCalcPrice()"  required></p>
												<p><input type="text" name="counterparty" class="textElement" required></p>
												<p><input type="Date" name="settlementdate" class="textElement" required></p>
											</div>
										</div>
										<input type="hidden" name="face_value" id="face_value" class="form-control" placeholder="Face Value">
										<br>
										<input type="hidden" name="coupon" id="coupon" class="form-control">
										<br>
										<input type="hidden" name="years" id="years" class="form-control">
										<br>
										<button class="btn btn-primary btn-lg" style="margin-left: 35%; margin-bottom: 10%;">Submit</button>
									</form>
								</div>
							</div>
							<!-- END INPUTS -->
						</div>
						<div class="col-md-6">
							<div class="panel">
								<div class="panel-body">
									<form action="generatetrades" method="post" autocomplete="off">
										<div style="margin:6%">
											<div class="leftFormPanel col-md-6">
												<p>Number of  trades:</p>
											</div>
											
											<div class="rightFormPanel col-md-6" style="width: 40%;">
												<input type="text" name="randomTrades" class="textElement" required="true">
											</div>
										</div>
										<br><br><br>
										<div style="margin:5%">
											<button type="submit" class="btn btn-primary btn-lg" style="width:100%">Generate Random Trades</button>
										</div>
									</form>
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
	var bond;
	function TDate(date) {
	    var UserDate = date.value;
	    var ToDate = new Date();
	    if (new Date(UserDate).getTime() >= ToDate.getTime()) {
	    		date.value=null;
	         	alert("The Date must be Bigger or Equal to today date");
	     	}
		}
	
	function search(obj){
		var myString=obj.value.toUpperCase();
		//console.log(myString);
		$.ajax(
	            {
	                url: 'securitysearch',
	                type: "POST",
	                data: {substr:myString},
					success:(function(data)
				            {
		            	//console.log(data);
		            	$("#response").html(data);
		            	}

		            )
	            })
	            .fail(function(jqXHR, ajaxOptions, thrownError)
	            {
	                  alert('server not responding...');
	            });
	}
	$(document).on('click','li',function(){
		$('#isin').val($(this).text());
		$("#response").html("");
	});
	$(document).on('click','',function(){
		$("#response").html("");
	});
	</script>
	
	<script>
	//Price Yield Calculation
	function getBond(price)
	{	
		var myIsin=document.getElementById("isin").value;
		console.log(myIsin);
		$.ajax(
	            {
	                url: 'yieldcalculator',
	                type: "POST",
	                data: {isin:myIsin},
					success:(function(data)
				            {
		            	bond=JSON.parse(data);
		            	console.log(bond);
		            	if(price.value%bond.tick!=0){
			            	alert("Wrong tick size. The tick size is"+bond.tick);
			            	price.value="";
							return;
			            	}
		            	doCalcYield(bond);
		            	}

		            )
	            })
	            .fail(function(jqXHR, ajaxOptions, thrownError)
	            {
	                  alert('server not responding...');
	            });
	}

	function doCalcYield(bond){
	
		var p = parseInt(document.getElementById("price").value,10);//Price
		console.log(typeof(p));
		var r = (bond.coupon)/100;//Coupon
		var b = bond.facevalue;//Face Value
		var y = bond.year;////Year

		//document.mainform.currentYield.value = numval(r*b*100/p,3);
		
		var ytm = bondYTM(p,r,b,y);
		console.log(ytm)
		if (ytm >= 0)
			document.getElementById("yield").value =ytm*100;
		else
			document.getElementById("yield").value = "error";
	}
	function fYTM(z,p,c,b,y)
	{
		return (c + b)*Math.pow(z,y+1) - b*Math.pow(z,y) - (c+p)*z + p;
	}

	function dfYTM(z,p,c,b,y)
	{
		return (y+1)*(c + b)*Math.pow(z,y) - y*b*Math.pow(z,y - 1) - (c+p);
	}

	function bondYTM(p,r,b,y)
	{
		var z = r;
		var c = r*b;
		var i;
		var E = .00001;

		if (r == 0)
		{
			return returnRate(p,b,y);
		}
			
		for (i = 0; i < 100; i++)
		{
			if (Math.abs(fYTM(z,p,c,b,y)) < E) break;
			
			while (Math.abs(dfYTM(z,p,c,b,y)) < E) z+= .1;
			z = z - (fYTM(z,p,c,b,y)/dfYTM(z,p,c,b,y));
		}
		if (Math.abs(fYTM(z,p,c,b,y)) >= E) return -1;  // error

		return (1/z) - 1;
	}	

	function doCalcPrice(){
			
			var myIsin=document.getElementById("isin").value;
			var obj = yield;
			console.log(sessionStorage.getItem("yield"));
			$.ajax(
		            {
		                url: 'pricecalculator',
		                type: "POST",
		                data: {isin:myIsin, yield:yield},
						success:(function(data)
					            {
			            	console.log(data);
			            	//console.log(bond);
			            	}

			            )
		            })
		            .fail(function(jqXHR, ajaxOptions, thrownError)
		            {
		                  alert('server not responding...');
		            });
		

		}
	</script>
</body>

</html>
