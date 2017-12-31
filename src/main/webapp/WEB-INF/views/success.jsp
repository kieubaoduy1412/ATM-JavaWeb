<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Success Page</title>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/success.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/success.js"></script>
<script type="text/javascript">
	var contextPath ="${pageContext.request.contextPath}";
</script>
<title>Success</title>
</head>
<body>
	<div class="col-sm-12" style="color:green">
		<h1>Success</h1>
	</div>
	<div class="col-sm-12">
		<p class="successMessage">${transactionModel.messageTransaction}</p>
		<p class="successMessage">${transactionModel.descriptionTransaction}</p>
		<p class="Id_successMessage"></p>
	</div>
	<div class="row">
		<div class="col-xs-6 col-sm-6">
			<input type="button" id="backWelcome" value="Back"
				onclick="backHome();" class="btn btn-primary button">
		</div>
		<div class="col-xs-6 col-sm-6">
			<input type="button" id="continue" value="Continue"
				onclick="loadPageAgain('${transactionModel.currentPage}')"
				class="btn btn-primary">
		</div>	
	</div>
	<jsp:include page="footer.jsp" flush="false"></jsp:include>
</body>
</html>
