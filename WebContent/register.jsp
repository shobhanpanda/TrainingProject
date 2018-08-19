<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="register" method="post" id="registerform">
	User Name:<input type="text" name="name" required minlength="3" ></br>
	Password:<input type="password" name="password" required minlength="6" id="password"></br>
	Re-type Password: <input type="password" name="repassword" required minlength="6" onkeyup="compare(this.value)" id="retype"></br>
	<button onclick="submit()">Submit</button>
	</form>
	
</body>
<script type="text/javascript">
flag=false;
function compare(retype){
	var password=document.getElementById("password").value;
	flag=false
	if(password===retype){
		flag=true;
	}
}
function submit(){
	if(flag===true){
		document.getElementById("registerform").submit();
	}
	else{
		alert("The password doesn't match");
		document.getElementById("password").value='';
		document.getElementById("retype").value='';
		
	}
}
</script>
</html>