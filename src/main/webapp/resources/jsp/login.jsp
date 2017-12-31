<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%response.sendRedirect("spring_security_login"); %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>ATM</title>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script> -->
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/login.css" rel="stylesheet">
<script type="text/javascript" src="resources/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/login.js"></script>
</head>
<body>
	<div class="bankTitle">
		<h1>DNB ATM SYSTEM</h1>
		<div id="loginFail"></div>
	</div>
	<div class="box">
		<div class="form-horizontal">
			<div class="form-group txtUserName">
				<label class="col-xs-12 col-sm-2 col-sm-offset-3 control-label"
					for="txtReceiver">Account ID</label>
				<div class="col-xs-12 col-sm-3 col-md-2">
					<input class="form-control" type="text" name="username">
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-12 col-sm-2 col-sm-offset-3 control-label"
					for="txtAmonut">Password</label>
				<div class="col-xs-12 col-sm-3 col-md-2">
					<input class="form-control" type="password" name="password">
				</div>
			</div>
			<div class="listButton">
				<div class="row btn-group ">
					<a onclick="login();">
						<button class="btn btn-primary btnLogin" type="button">Login</button>
					</a>
				</div>
			</div>
		</div>
	</div>
	<div class="row"><jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>