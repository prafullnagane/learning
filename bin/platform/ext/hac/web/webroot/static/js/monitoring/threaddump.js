$(function() {
	var tabs;
		
	tabs = $("#tabs").tabs();
	
	$("#startForm").submit(function() {
		var interval = $("#interval").val();
		
		$.ajax({
			url : $("#startForm").attr("startUrl"),
			type : 'GET',
			data: {
				interval: interval
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) {
				hac.global.notify(data.status);
			},
			error : hac.global.err
		});
		
		return false;
	});
	
	$("#stopForm").submit(function(){
		hac.global.notify("Collecting stopped. Downloading...");
	});
});