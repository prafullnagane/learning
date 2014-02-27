var updateIntervalId;

$(document).ready(function() {
	updateSessionInfo();
	setInterval("updateSessionInfo()", 2000)

	$('#closeSessions').click(function() {
		initiateClose();
	});

	$('#closeSessionsAndHttp').click(function() {
		initiateClose(true);
	});

});

function initiateClose(shutDownHttpSession) {
	shutDownHttpSession = shutDownHttpSession || false;

	var url = $('#sessionsContainter').attr('data-closeSessionsUrl');
	$.ajax({
		url : url,
		type : 'POST',
		data : 'shutDownHttpSession=' + shutDownHttpSession,
		headers : {
			'Accept' : 'application/json'
		},
		success : function(data) {
		debug.log(data);
		updateData(data);

		if (data['closedSessions']) {
			var msg = data.closedSessions + " sessions were closed.";

			if (shutDownHttpSession) {
				msg += " As you included http, you will be redirected to the login screen.";
				hac.global.notify(msg, 1000, function() {
					location.href = hac.contextPath;
				});
			} else {
				hac.global.notify(msg);
			}
		}

		},
		error : hac.global.err
	});
}

function updateData(data) {
	$('#sessionCheckInterval').html(data.sessionCheckInterval + ' sec');
	$('#sessionTimeout').html(data.sessionTimeout + ' sec');
	$('#sessionsInstantiated').html(data.sessionsInstantiated);
	$('#sessionsExpired').html(data.sessionsExpired);

}

function updateSessionInfo() {
	var url = $('#sessionsContainter').attr('data-updateSessionUrl');
	$.ajax({
		url : url,
		type : 'GET',
		headers : {
			'Accept' : 'application/json'
		},
		success : function(data) {
			debug.log(data);
			updateData(data);
		},
		error : hac.global.err
	});
}