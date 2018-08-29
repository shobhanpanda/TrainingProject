<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" class="fullscreen-bg">

<head>
	<title>Register | CITI</title>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<!-- VENDOR CSS -->
	<link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/vendor/linearicons/style.css">
	<!-- MAIN CSS -->
	<link rel="stylesheet" href="assets/css/main.css">
	<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->
	<link rel="stylesheet" href="assets/css/demo.css">
	<!-- GOOGLE FONTS -->
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700" rel="stylesheet">
	<!-- ICONS -->
	<link rel="apple-touch-icon" sizes="76x76" href="assets/img/apple-icon.png">
	<link rel="icon" type="image/png" sizes="96x96" href="assets/img/favicon.png">
</head>

<body>
	<!-- WRAPPER -->
	<div id="wrapper">
		<div class="vertical-align-wrap">
			<div class="" style="margin-top: 50px;">
				<div class="auth-box lockscreen clearfix" style="padding-bottom: 35%;">
					<div class="content">
		
						<div class="logo text-center"><!--img src="assets/img/logo-dark.png" alt="Klorofil Logo"--><h2>Register</h2></div>
						<!--div class="user text-center">
							<img src="assets/img/user-medium.png" class="img-circle" alt="Avatar">
							<h2 class="name">Samuel Gold</h2>
						</div-->
						<form action="register" method="POST" autocomplete="off" id="registerform">
							<!-- <div class="input-group" > -->
								<!-- <input type="text" class="form-control" placeholder="Enter your name" style="margin-bottom: 5%;"> -->
								<input class="form-control" placeholder="Username" type="text" style="margin-bottom: 5%;" name="userName" required="true" minlength="3">
								<input class="form-control" placeholder="First name" type="text" style="margin-bottom: 5%;" name="firstName" required="true" minlength="3">
								<input class="form-control" placeholder="Last name" type="text" style="margin-bottom: 5%;" name="lastName" required="true" minlength="3">
								<input type="password" class="form-control" placeholder="Password" style="margin-bottom: 5%;" name="password" required="true" minlength="6" id="password">
								<input type="password" class="form-control" placeholder="Confirm password" style="margin-bottom: 5%;"  name="repassword" required="true"  minlength="6" onkeyup="compared(this.value)" id="retype">
								<button type="submit" class="btn btn-primary" style="margin-left: 43%; font-size: 102%;" ><i class="">SUBMIT</i></button>
								<!--span class="input-group-btn"><button type="submit" class="btn btn-primary"><i class="fa fa-arrow-right"></i></button></span-->
							<!-- </div> -->
						</form>
						
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END WRAPPER -->
</body>
<script src="https://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
flag=false;
function compared(retype){
	var password=document.getElementById("password").value;
	flag=false
	if(password===retype){
		flag=true;
	}
	console.log(flag);
}

$("#registerform").submit(function(event){
    event.preventDefault(); 
	console.log("Working");
	if(flag===true){
		this.submit();
	}
	else{
		alert("The password doesn't match");
		document.getElementById("password").value='';
		document.getElementById("retype").value='';
		
	}
});

</script>
</html>
