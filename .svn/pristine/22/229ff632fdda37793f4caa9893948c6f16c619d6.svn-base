function isNumberic(amount) {
	var count = amount.length;
	if(count>0){
		for ( var i = 0; i < amount.length; i++ )
		{
			var e = amount.charAt(i);
			if ((parseInt(e) >= 0) && (parseInt(e) <= 9)) {
				count--;
			}
		}
		return (count==0 ? true : false);
	}else{
		return false;
	}		
}

function isValidAccount(account,amount){
	var isValid = false;
	var message = "Please enter your Receiver Account and Amount";
	if(account || amount){
		if(amount){
			if(account){
				if(isNumberic(account)){
					if(account.length == 10){
						isValid = true;
					}
					else{
						message = "Receiver Account must 10 letter";
					}
				}else{
					message = "Only allow numeric input in Receiver Account";
				}
			} else {
				message = "Please enter your Receiver Account";
			}
		} else {
			message = "Please enter your Amount";
		}
		
	}	
	return [isValid, message];
}

function isMultiple1000(amount){
	return((amount%1000) == 0);
}

function isValidAmount(amount) {
	var isValid = false;
	var message = "Please enter Amount";
	if(amount){
		if (isNumberic(amount)) {
			if(parseInt(amount) < 50000){
				message = "Amount at least 50,000 VND";
			}else{
				if (parseInt(amount) > 100000000) {
					message = "Amount is too large, please contact with teller at the bank";
				}else{
					if(isMultiple1000(amount)){
						isValid = true;
					}
					else{
						message = "Amount must be multiple of 1000";
					}
				}
			}							
		} else {
			message = "Only allow numeric input in Amount";
		}
	}	
	return [ isValid, message ];
}

function confirmSendMoney(){
	var receiverID = $('#txtReceiver').val().trim();
	var amount = $('#txtAmount').val().replace(/,/g, '').trim();
	var resultAccount = isValidAccount(receiverID,amount);
	if(resultAccount[0]){
		if($('#currentID').val().trim()===$('#txtReceiver').val().trim()){
			$('#message').text("Can not send for yourself").show();
			return false;
		}
		var resultAmount = isValidAmount(amount);
		if(resultAmount[0]){			
			$.ajax({
				type : 'POST',
				url : contextPath+'/confirmSendMoney',
				data : {
					receiverId : receiverID
				},
			}).success(function(data) {
				if (data.trim() == "login") {
					window.location.href = "cancelAction";
				} else if(JSON.parse(data).receiverName == "Receiver does not exist"){
					var result = JSON.parse(data);
					$('#message').text(result.receiverName).show();
					return false;
				} else{
					var result = JSON.parse(data);
					var toAccountID = "Transfer to accountID: "+receiverID;
					var toAccountName ="Transfer to receiver name: "+ result.receiverName;
					var _amount = "Amount: ";
					if(amount.charAt(0)=='0'){
						_amount += amount.replace(/0+/, '').replace(/\D/g, "")
				    .replace(/\B(?=(\d{3})+(?!\d))/g, ",")+" VND";
					}else{
						_amount += amount.replace(/\D/g, "")
					    .replace(/\B(?=(\d{3})+(?!\d))/g, ",")+" VND";
					}
					$("#confirmSendMoneyModal").modal('show');
					$("#toAccountID").text(toAccountID).show();
					$("#toAccountName").text(toAccountName).show();
					$("#amount").text(_amount).show();
				}
			});
		}else{
			$('#message').text(resultAmount[1]).show();
			return false;
		}
	}else{
		$('#message').text(resultAccount[1]).show();
		return false;
	}		
}

function sendFunction() {
	var receiverID = $('#txtReceiver').val().trim();
	var amount = $('#txtAmount').val().replace(/,/g, '').trim();			
	$.ajax({
		type : 'POST',
		url : contextPath+'/sendMoney',
		data : {
			receiverId : receiverID,
			amount : amount
		},
	}).success(function(data) {
		if (data.trim() == "success") {
			window.location.href = contextPath+"/transactionSuccess";
		} else {
			var result = JSON.parse(data);
			var message = result.transactionModel.messageTransaction;
			$("#message").html(message);
		}
	});
}

function clearFunction() {
	$('#txtAmount').val('');
	$('#txtReceiver').val('');
}

function addFunction() {
	var receiverID = $('#txtReceiver').val().trim();
	var amount = $('#txtAmount').val().replace(/,/g, '').trim();
	var resultAccount = isValidAccount(receiverID,amount);
	if(resultAccount[0]){
		var result = isValidAmount(amount);
		if(result[0]){
			$.ajax({
				url : contextPath+'/addMoney',
				type : 'POST',
				data : {
					accountId : receiverID,
					amount : amount
				}
			}).success(function(data) {
				$('body').empty();
				$('body').html(data);
			});
		}else{
			$('#message').text(result[1]).show();
			return false;
		}
	}else{
		$('#message').text(resultAccount[1]).show();
		return false;
	}	
}

function isMultiple1000(amount){
	return((amount%1000) == 0);
}

function withDrawn() {
	var amount = $('input[name=amount]').val().replace(/,/g, '');
	var result = isValidAmount(amount);
	if(result[0]){
		$.ajax({
			type : 'POST',
			url : contextPath+'/getMoney',
			data : {
				amount : amount
			},
		}).success(function(data) {
			$('body').html(data);
		});
	}else{
		$("#message").text(result[1]).show();
		return false;
	}
}

$(document).ready(function() {
	$("#txtReceiver").keypress(function(e) {
		$("#message").text("");
	});
	
	$("#txtAmount").keypress(function(e) {
		$("#message").text("");
	});
	
	$("#txtAmount").keyup(function(e) {
		if((e.keyCode >= 35 && e.keyCode <= 40) || e.keyCode==8) {
			return;
		}
		$(this).val(function(index, value) {
			var ctl = document.getElementById('txtAmount');
		    startPos = ctl.selectionStart;
		    if(startPos%4 == 0){
		    	startPos++;
		    }
		    return value.replace(/\D/g, "")
		    .replace(/\B(?=(\d{3})+(?!\d))/g, ",")
		    ;
		});
		setCaretToPos(this, startPos);
	});
	sessionStorage.setItem("OtherPageVisited", "True");
	if (sessionStorage.getItem("LoginPageVisited")) {
        sessionStorage.removeItem("LoginPageVisited");
        window.location.reload(true); // force refresh page1
	}
});
function setSelectionRange(input, selectionStart, selectionEnd) {
	  if (input.setSelectionRange) {
	    input.focus();
	    input.setSelectionRange(selectionStart, selectionEnd);
	  }
	  else if (input.createTextRange) {
	    var range = input.createTextRange();
	    range.collapse(true);
	    range.moveEnd('character', selectionEnd);
	    range.moveStart('character', selectionStart);
	    range.select();
	  }
}

function setCaretToPos (input, pos) {
	setSelectionRange(input, pos, pos);
}