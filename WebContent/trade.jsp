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

	<form action="trade" method="post" >
	Trade Date:<input type="date" name="tradedate" id="tradedate" onchange="TDate(this)" required><br>
	Trade Time:<input type="time" name="time" required ><br>
	Security ISIN:  <input type="text" name="isin" id="isin" onkeyup="search(this)" required><br>
	<div id="response"></div>
	<div>
	<input type="radio" name="buy" value="buy" checked> Buy
	<input type="radio" name="buy" value="sell" > Sell<br>
	</div>
	Traded-Price: <input type="text" name="price" required ><br>
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
		            	console.log(data);
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

</body>
</html>