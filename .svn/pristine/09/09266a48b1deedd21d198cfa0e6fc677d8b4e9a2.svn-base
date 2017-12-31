$(document).ready(function() {
	$('input[name=password]').keypress(function (e) {
	    if (e.which == 13) {
	        login();
	    }
	});
});
function login(){
	$('#loginFail').text('').show();
	var userName =  $('input[name=username]').val().trim();
	var pass =  $('input[name=password]').val();
	if (!userName) {
		if(!pass){
			$('#loginFail').text('Please enter your Account ID and Password').show();
		} else {
			$('#loginFail').text('Please enter your Account ID').show();
		}
		return;
	}
	if (!pass) {
		$('#loginFail').text('Please enter your Password').show();
		return;
	}
	$.ajax({
		type : 'POST',
		url : contextPath+'/login',
		data:{username : userName,pass : pass},
		//dataType : "json"
	}).success(function(data) {
		if(data.trim() == "welcome"){
			window.location.href = contextPath+"/home";
		}else{
			var result = JSON.parse(data);
			var message = result.infCustomer.message;
			$("#loginFail").html(message);
		}
    });
}

$(document).ready(function(){
	sessionStorage.setItem("LoginPageVisited", "True");
	if (sessionStorage.getItem("OtherPageVisited")) {
        sessionStorage.removeItem("OtherPageVisited");
        //window.location.reload(true); // force refresh page1
        window.location.href = contextPath+"/";
	}
});

