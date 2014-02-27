var editor;
var lastIndex = 0;

$(document).ready(function() {
	editor = CodeMirror.fromTextArea('script', {
		height : "250px",
		parserfile : [ "parsegroovy.js", "tokenizegroovy.js" ],
		basefiles : [ "basefiles.js" ],
		stylesheet : $('#script').attr('data-stylesheetUrl'),
		path : $('#script').attr('data-pathUrl'),
		continuousScanning : 500,
		lineNumbers : true,
		textWrapping : false,
		tabMode : "spaces",
		submitFunction : function() {
			jQuery("#executeButton").click();
		}
	});
	
	//Make select-inputs look iphone-style.
	$('input[type=checkbox]').iphoneStyle({
		checkedLabel: 'Commit',
		uncheckedLabel: '<del>Commit<del/>'
	});
	
	var tabs = $("#tabsNoSidebar").tabs();
	
	$("#tabsNoSidebar").bind("tabsselect", function(event, ui){
		switch(lastIndex){
			case 0:
				$("#nav-tabs-edit").css("font-weight", "normal");
				break;
			;
			case 1:
				$("#nav-tabs-result").css("font-weight", "normal");
				break;
			;
			case 2:
				$("#nav-tabs-output").css("font-weight", "normal");
				break;
			;
			case 3:
				$("#nav-tabs-stacktrace").css("font-weight", "normal");
				break;
			;
		}
		lastIndex = ui.index;
	});
	
	$("#textarea-container").resizable({
		handles : 's',
		alsoResize : 'iframe'
	});


	$("#executeButton").click(function(event) {
		$('#spinnerWrapper').show();
		$.ajax({
			type : "POST",
			url : $('#executeButton').attr('data-executorUrl'),
			data : {
				script : editor.getCode(),
				commit: $("#commitCheckbox").is(':checked')
			},
			dataType : 'json',
			success : function(data) {
				debug.log(data);

				$('#spinnerWrapper').hide();

				$('#output').text("");
				$('#result').text("");
				$('#stacktrace').text("");


				if (data.executionResult.length > 0) {
					if (data.executionResult != "null") {
						$("#tabsNoSidebar").tabs('select', 0);
					}
					$('#result').text(data.executionResult);
					$('#result').fadeIn();
					$("#nav-tabs-result").css("font-weight", "bold");
					
				} else {
					$('#result').fadeOut();
				}
				
				if (data.outputText.length > 0) {
					$("#tabsNoSidebar").tabs('select', 1);
					$('#output').text(data.outputText);
					$('#output').fadeIn();
					$("#nav-tabs-output").css("font-weight", "bold");
				} else {
					$('#output').fadeOut();
				}				

				if (data.stacktraceText.length > 0) {
					$('#stacktrace').fadeIn();
					$('#stacktrace').text(data.stacktraceText);
					$("#tabsNoSidebar").tabs('select', 3);
					$("#nav-tabs-stacktrace").css("font-weight", "bold");
				} else {
					$('#stacktrace').fadeOut();
				}
			},

			error : hac.global.err

		});
	});

	$('#spinnerWrapper').hide().ajaxStart(function() {
		$(this).show();
	}).ajaxStop(function() {
		$(this).hide();
	});

});