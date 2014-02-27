/**
 * Script responsible for getting export result message and passing it to hac.global notification 
 * and changing content form action value when "validate" is clicked.
 */
$(function() {
	hac.global.messageFromTag($("#impexResult"));
	hac.global.messageFromTag($('#validationResultMsg'));
	
	$('#validate').click(function() {
		$('#contentForm').attr('action', $('#contentForm').attr('data-validateUrl'));
		$('#contentForm').submit();		
	});
	
	$('#clearScriptContent').click(function() {
		$('#scriptContent').val('');
		return false;
	});
	$("#tabsNoSidebar").tabs({ cookie: { expires: 30 } });
});