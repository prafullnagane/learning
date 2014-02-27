$(function() {
	var changed = {};
	var table, blockUser;
	table = $('#props').dataTable({
		"bStateSave" : true,
		"aaSorting" : [ [ 0, "asc" ] ],
		"aoColumnDefs": [ { "bSortable": false, "aTargets": [ 1 ] } ],
		"aLengthMenu" : [[10,25,50,100,-1], [10,25,50,100,'all']],
		"bSortCellsTop": true
	});
	
	init();
	
	$(".configValue").blur(function(e){
		var configKey = $(e.target).attr("name");
		var configValue = $(e.target).attr("value");
		changed[configKey] = configValue;
	});
	
	$("#applyAllBtn").click(function(){
		var i = 0;
		$.each(changed, function(key,value){
			configUpdate(key,value, false);
			i++;
		});
		hac.global.notify("Value of " + i + " keys changed.");
		changed = {};
	});
	
	$("#resetAllBtn").click(function(){
		location.reload();
	});
	
	$("img.applyIcon").live('click', function(e) {
		var entry = $(e.target).parent().parent().find("input").first();
		var valueTD = $(e.target).parent().parent().parent().parent().find("td").first();
		
		valueTD.css("font-weight","bold");
		
		var configKey = entry.attr('name');
		var configValue = entry.attr('value');
		
		configUpdate(configKey, configValue, true);		
	});

	
	function configUpdate(configKey,configValue,showMessage){
		var url = $('#props').attr('data-configUpdUrl');
		$.ajax({
			url : url,
			type : 'POST',
			data : {
				'key' : configKey,
				'val' : configValue
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) { 
				debug.log(data);
				if(showMessage){
					hac.global.notify("Value of Key " + configKey + " changed.");
				}
			},
			error : hac.global.err
		});
	}
	
	$("img.removeIcon").live('click', function(e) {
		if (blockUser)
			return;
	
		blockUser = true;
	
		var configKey = $(e.target).parent().prev('input').attr('name');
		
		var url = $('#props').attr('data-configDelUrl');
		debug.log(url);
		
		// tr node
		var node = this.parentNode.parentNode.parentNode.parentNode;
	
		$.ajax({
			url : url,
			type : 'POST',
			data : {
				'key' : configKey
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) {
	
				$(node).fadeOut('fast', function() {
					table.fnDeleteRow(node);
					blockUser = false;
				});
				hac.global.notify("Key " + configKey + " was deleted.");
			},
			error : hac.global.err
		});
	});
	
	$("#addButton").live('click', function(e) {
		$(this).attr('disabled', true);
	
		var configKey = $("#configKey").attr('value');
		var configValue = $("#configValue").attr('value');
	
		if (configKey.match(/^\s*$/)) // if field only contains whitespace
		{
			hac.global.error("Please enter a key!");
			$(this).removeAttr('disabled');
			return;
		}
	
		var url = $('#addButton').attr('data-url');
	
		$.ajax({
			url : url,
			type : 'POST',
			data : {
				'key' : configKey,
				'val' : configValue
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) {
	
				if (!data.error) {
					$("#configKey").val("");
					$("#configValue").val("");
					table.fnAddData([configKey,
							getTDContentValue(configKey, configValue) ]);
					
					hac.global.notify("Key '" + configKey + "' was added.");
				} else {
					hac.global.error(data.error);
				}
	
				$('#addButton').removeAttr('disabled');
			},
			error : hac.global.err
		});
	});
	
	function getTDContentValue(configKey, configValue) {
		var td = "<div>";
		td += "<input type='text' class='configValue' name='"
				+ configKey + "' value='" + configValue + "'/>";
		td += "<div style='float:right'>";
		td += hac.global.removeImg();
		td += hac.global.applyImg();
		td += "</div>";
		td += "</div>";
		return td;
	}
	
	function init(){
		var url = $("#content").attr("edited-url");
		
		$.ajax({
			url : url,
			type : 'POST',
			data : {
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) {
				if(data.edited != null){
					$.each(table.fnGetNodes(),function(key,value){
						if($.inArray(value.id,data.edited) > -1){							
							$(value).find("td").first().css("font-weight", "bold");
						}
					});
				}
			},
			error : hac.global.err
		});
	}
});
