function loadPageAgain(exp){
	if (exp == "/payinMoney") {
		window.location.href = contextPath+''+exp;
	} else if (exp == "sendMoneyPage") {
		window.location.href = contextPath+"/transferMoney";
	} else {
		window.location.href = contextPath+"/withdrawMoney";
	}
}

function backHome(){
	window.location.href = contextPath+"/home";
}