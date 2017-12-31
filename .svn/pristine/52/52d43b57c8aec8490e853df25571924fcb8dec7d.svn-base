<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Welcome</title>
<script type="text/javascript" src="resources/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/welcome.js"></script>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/welcome.css" rel="stylesheet">

</head>

<body>
	<div class="contentWelcome">
		<div class="bankTitle"><h1>DNB ATM SYSTEM</h1></div>
		<h3 class="msgHello">Hello ${infCustomer.userName}</h3>
		<div class="optionButton ">
			<div class="row btn-group">
				<div class="btnAddMoney ">
					<a href="gotoAddMoney"><button class="btn btn-primary col-sm-2" type="button">Pay in</button></a>
				</div>
				<div class="btnGetMoney">
					<a href="withdrawCash"><button class="btn btn-primary col-sm-2" type="button">Withdraw Cash</button></a>
				</div>
			</div>
			<div class="row btn-group">
				<div class="btnSendMoney">
					<a href="transferMoney"><button class="btn btn-primary col-sm-2" type="button">Transfer</button></a>
				</div>
				<div class="btnCancel">
					<a href="cancelAction"><button class="btn btn-primary col-sm-2" type="button">Exit</button></a>
				</div>
			</div>
		</div>
		<jsp:include page="footer.jsp"></jsp:include>
	</div>
</body>
</html>