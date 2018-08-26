<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	ul {
		float:left;
		list-style:none;
		padding:0px;
		border:1px solid black;
		margin-top:0px; 
	}
	input,ul{
		width:300px;	
	}
	li:hover{
		color:white;
		background: #0088cc;
	}
</style>
</head>
<body>
<h2>Trade Details Form</h2>

	<form action="trade" method="post"  autocomplete="off" >
	Trade Date:<input type="date" name="tradedate" id="tradedate" onchange="TDate(this)" required><br>
	Trade Time:<input type="time" name="time" required ><br>
	Security ISIN:  <input type="text" name="isin" id="isin" onkeyup="search(this)" required><br>
	<div id="response"></div>
	<div>
	<input type="radio" name="buy" value="buy" checked> Buy
	<input type="radio" name="buy" value="sell" > Sell<br>
	</div>
	Traded-Price: <input type="text" name="price" id="price" onchange="getBond()" required ><br>
	Yield:<input type="text" name="yield" id="yield" onchange="doCalcPrice(this.value)"  required ><br>
	Counter-Party: <input type="text" name="counterparty" required><br>
	Settlement Date:<input type="date" name="settlementdate" onchange="TDate(this)" required><br>
	<button>Submit</button>
	</form>

	<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script type="text/javascript">
	function TDate(date) {
	    var UserDate = date.value;
	    var ToDate = new Date();
	    if (new Date(UserDate).getTime() <= ToDate.getTime()) {
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
	</script>
	
	<script>
	//Price Yield Calculation
	function getBond()
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
		            	//console.log(bond);
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
	
	</script>
	
	<script type="text/javascript">
	function doCalcPrice(str){
		//console.log(bond);
		
		var byield=parseFloat(str,10);
		console.log(byield);
		var r=1/byield;
		var a=((bond.coupon*bond.facevalue)*r);
		var b=((Math.pow(r,Math.floor(bond.year))-1)/(r-1));
		var c=(bond.facevalue*(Math.pow(r,bond.year)));
		var price=(a*b)+c;
		document.getElementById("price").value=price;
	
	}
	
	</script>

</body>
</html>