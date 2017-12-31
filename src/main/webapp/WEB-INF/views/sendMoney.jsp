<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<title>Send Money</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-2.2.3.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/css/sendMoney.css" rel="stylesheet">
<script type="text/javascript">
	var contextPath ="${pageContext.request.contextPath}";
</script>
<title>Send Money</title>
</head>
<body>
	<div class="contentSendMoney">
		<div class="bankTitle">
			<h1>TRANSFER MONEY</h1>
		</div>
		<div class="message" id="message">${transactionModel.messageTransaction}</div>
		<input type="hidden" id="currentID" value="${SESSION_ACID}">
		<div class="box">
			<div class="form-horizontal">
				<div class="form-group">
					<label class="col-xs-12 col-sm-2 col-sm-offset-3 control-label"
						for="txtReceiver">Receiver Account</label>
					<div class="col-xs-12 col-sm-2">
						<input class="form-control" id="txtReceiver" type="text">
					</div>
				</div>
				<div class="form-inline"></div>
					<div class="form-group">
						<label class="col-xs-12 col-sm-2 col-sm-offset-3 control-label"
							for="txtAmonut">Amount (VND)</label>
						<div class="col-xs-12 col-sm-2">
							<input class="form-control" id="txtAmount" type="text">
						</div>
					</div>
				</div>
				<div class="listButton">
					<div class="btn-group ">
						<div class="col-xs-12 col-sm-3"><a onclick='confirmSendMoney();'><button class="btn btn-primary" type="button">Send</button></a> </div>
						<div class="col-xs-12 col-sm-3"><a onclick='clearFunction();'><button class="btn btn-primary" type="button">Clear</button></a></div> 
						<div class="col-xs-12 col-sm-3"><a href="${pageContext.request.contextPath}/home"><button class="btn btn-primary" type="button">Home</button></a></div>
					</div>
				</div>
			</div>
		</div>
		<!-- test nghen -->
		<!-- Modal -->
		<div id="confirmSendMoneyModal" class="modal fade" role="dialog">
		  <div class="modal-dialog md-dl">
		
		    <!-- Modal content-->
		    <div class="modal-content">
		      <div class="modal-header">
		      	<lable class="lable" data-dismiss="modal">&#9432;</lable>
		        <h3 class="modal-title">Confirm</h3>
		      </div>
		      <div class="modal-body">
		        <h4><div id="toAccountID"></div></h4>
		        <h4><div id="toAccountName"></div></h4>
		        <h4><div id="amount"></div></h4>
		      </div>
		      
		      <div class="modal-footer">
		      	<button type="button" class="btn btn-default" data-dismiss="modal" onclick="sendFunction();">Agree</button>
		        <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
		      </div>
		    </div>
		
		  </div>
		</div>
		<!-- end test -->
		<div class="footer">
			<jsp:include page="footer.jsp"></jsp:include>
		</div>
</body>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/welcome.js"></script>
</html>