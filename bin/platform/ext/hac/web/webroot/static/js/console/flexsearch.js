/**
 * Script responsible for ajaxifing FlexibleSearch query form.
 */

var fsQueryEditor;
var sqlQueryEditor;
var cookieHistory = {};
var encryptionUrl;
var decryptionUrl;
var lastIndex = 0;
var cookieName = "FlexibleSearchHistory";
var historyMax;


$(function() {
	
	encryptionUrl =  $("#flexQueryForm").attr("action") + "encrypt";
	decryptionUrl =  $("#flexQueryForm").attr("action") + "decrypt";	
	
	historyMax = $("#tabs-5").attr("historyMax");
	
	fsQueryEditor = CodeMirror.fromTextArea('flexibleSearchQuery', {
		height : "250px",
		parserfile : [ "parsesql.js" ],
		basefiles : [ "basefiles.js" ],
		stylesheet : $('#flexibleSearchQueryWrapper')
				.attr('data-stylesheetUrl'),
		path : $('#flexibleSearchQueryWrapper').attr('data-pathUrl'),
		continuousScanning : 500,
		lineNumbers : true,
		textWrapping : true,
		tabMode : "spaces"
	});
	sqlQueryEditor = CodeMirror.fromTextArea('sqlQuery', {
		height : "250px",
		parserfile : [ "parsesql.js" ],
		basefiles : [ "basefiles.js" ],
		stylesheet : $('#sqlQueryWrapper').attr('data-stylesheetUrl'),
		path : $('#sqlQueryWrapper').attr('data-pathUrl'),
		continuousScanning : 500,
		lineNumbers : true,
		textWrapping : true,
		tabMode : "spaces"
	});
	
	var sampleQueryEventHandler = function() {
		// first clear the content of the textareas
		clearInputFields();
		// now copy the new query into the textArea and execute it
		var currentId = this.id;
		var isFs = Boolean.parse($("#" + currentId).attr("data-is-fsquery"));
		var query = $("#" + currentId).attr("data-sample-query");
		if (isFs) {
			$("#flexibleSearchQuery").val(query);
			fsQueryEditor.setCode(query);
			$("#tabsNoSidebar").tabs('select', 0);
		} else {
			$("#sqlQuery").val(query);
			sqlQueryEditor.setCode(query);
			$("#tabsNoSidebar").tabs('select', 1);
		}
	};

	$('.sample_query').click(sampleQueryEventHandler);
	$('.h_sample_query').live("click", sampleQueryEventHandler);
	
	//Changing the commit (On/Off) Checkbox to iphone-Style
	$('input[type=checkbox]').iphoneStyle({
		checkedLabel: 'Commit',
		uncheckedLabel: '<del>Commit<del/>'		
	});
	
	// Tabs
	$("#tabsNoSidebar").tabs();
	
	//Handles making the tab-text non-bold when clicked.
	$("#tabsNoSidebar").bind("tabsselect", function(event, ui){
		switch(lastIndex){
			case 0:
				$("#nav-tab-1").css("font-weight", "normal");
				break;
			;
			case 1:
				$("#nav-tab-2").css("font-weight", "normal");
				break;
			;
			case 2:
				$("#nav-tab-3").css("font-weight", "normal");
				break;
			;
			case 3:
				$("#nav-tab-4").css("font-weight", "normal");
				break;
			;
		}
		lastIndex = ui.index;
	});
	
	//Hide history-list initially.
	$("#historyLegend").hide();
	
	//Hide the error message initially
	$("#historyMax").hide();
	
	//Search for saved history in Cookie and load saved history queries.
	initHistory();
	
	//Adding console-Navigation to SQL-form
	$("#consoleNavigationWrapper").html($("#consoleNavigation").html());
	
	// We do not want to submit form using standard http
	$("#flexQueryForm").submit(function() {
		return false;
	});
	
	//Make sure that settings are applied in flexible and sql-view when changed.
	//=========================================
	$("#commitCheckbox1").change(function(){
		if($("#commitCheckbox1").is(":checked") != $("#commitCheckbox2").is(":checked")) { 
			$("#commitCheckbox2").click(); 
		}
	});
	$("#commitCheckbox2").change(function(){
		if($("#commitCheckbox1").is(":checked") != $("#commitCheckbox2").is(":checked")) { 
			$("#commitCheckbox1").click(); 
		}		
	});
	$("#locale1").change(function(){ 
		$("#locale2").val($("#locale1").val());	
	});
	$("#locale2").change(function(){ 
		$("#locale1").val($("#locale2").val());	
	});
	$("#user1").change(function(){
		$("#user2").val($("#user1").val());
	});
	$("#user2").change(function(){
		$("#user1").val($("#user2").val());
	});
	$("#maxCount1").change(function(){
		$("#maxCount2").val($("#maxCount1").val());
	});
	$("#maxCount2").change(function(){
		$("#maxCount1").val($("#maxCount2").val());
	});
	//========================================
	
	// Hide all the result divs initially
	$("#executionStats").hide();
	$("#queryResult").hide();
	$("#queryCommitMode").hide();
	$("#exception").hide();
	
	//Create or update Cookie.
	function createCookie(name, content){
		$.cookie(name, content, {	
			   expires : 365,
			   path : "/"
		});
	}
	
	//delete cookie
	function deleteCookie(name){
		$.cookie(name, "", {	
			   expires : -1,
			   path : "/"
			});
	}
	
	//Get all cookies starting with cookieName.
	function getAllCookies() {
		var cookies = { };
		if (document.cookie && document.cookie != '') {
			var split = document.cookie.split(';');
			for (var i = 0; i < split.length; i++) {
				var name_value = split[i].split("=");
				name_value[0] = name_value[0].replace(/^ /, '');
				if(decodeURIComponent(name_value[0]).match("^"+cookieName)){
					cookies[decodeURIComponent(name_value[0])] = decodeURIComponent(name_value[1]);
				}
			}
		}
		return cookies;
	}
	
	//Check the amount of queries and show/hide error message if necessary
	function showHistoryMax(){
		var nr = 0;
		$.each(cookieHistory, function(name,cookie){
			if(cookie.isAlive)
				nr++;
		});
		if(nr < historyMax)
			$("#historyMax").hide();
		else
			$("#historyMax").show();
	}
	
	//Clear History View and delete all cookies.
	$("#clearHistory").click(function(){
		$("#historyLegend").hide();
		$("#historyList").html("");
		$.each(cookieHistory, function(name,cookie){
			deleteCookie(name);
		});
		cookieHistory = {};
	});
	
	//Search for available cookies and get free name.
	function getNewCookieName(){
		for(var i = 0; i < historyMax; i++){
			var cookie = $.cookie(cookieName + i);
			if(!cookie){
				return cookieName+i;
			}
		}
		return -1;
	}
	
	//Encrypt the object and save it to cookie.
	function encryptWriteCookie(historyItem, name){
		var cookieObject = {query: historyItem.query, additionalDescription: historyItem.additionalDescription, isFs: historyItem.isFs};
		var cookie = JSON.stringify(cookieObject);
		
		$.ajax({
			url : encryptionUrl,
			type : 'POST',
			data : {
				cookie: cookie
			},
			headers : {
				'Accept' : 'application/json'
			},
			success : function(data) {
				if (data.exception) {
					deleteCookie(name);
				}
				else{
					createCookie(name,data.ciphertext);
				}
			},
			error : hac.global.err
		});
	}
	
	//Initially load cookies and show them in history tab.
	function initHistory(){
		var cookies = getAllCookies();
		$.each(cookies, function(name,cookie){
			$.ajax({
				url : decryptionUrl,
				type : 'POST',
				data : {
					cookie: cookie
				},
				headers : {
					'Accept' : 'application/json'
				},
				success : function(data) {
					if (data.exception) {
						deleteCookie(name);
					}
					else {
						var cookie = JSON.parse(data.plaintext);
						if(cookie.query == null || cookie.isFs == null || cookie.query === "" ||  cookie.isFs === ""){
							deleteCookie(name);
						}
						else{
							$("#historyLegend").show();
							var historyItem = new historyEntry(cookie.query, cookie.additionalDescription, cookie.isFs, name);
							$("#historyList").append(historyItem.html);
							cookieHistory[name] = historyItem;
							showHistoryMax();
						}
					}
				},
				error : hac.global.err
			});
		})
	}	
		
	//Build up attributes to create new history-item and store it in cookie.
	function addQueryToHistory(flexQuery, sqlQuery, additionalDescription){
		if(!$("#historyLegend").is(":visible")){
			$("#historyLegend").fadeIn();
		}
		
		var isFs = (flexQuery != "");
		var saveQuery = isFs ? flexQuery : sqlQuery;
		var name = null;
		
		$.each(cookieHistory, function(){
			if(this.query == saveQuery){
				this.html.hide();
				name = this.name;
			}
		});
		
		name = (name != null) ? name : getNewCookieName();
		
		if(name != -1){
			var historyItem = new historyEntry(saveQuery, additionalDescription, isFs, name);
			encryptWriteCookie(historyItem, name);
			cookieHistory[name] = historyItem;
			$("#historyList").append(historyItem.html);
		}
		showHistoryMax();
	}
	
	//History-Entry Object.
	function historyEntry(query, additionalDescription, isFs, name){
		//Attributes
		this.name = name;
		this.query = query;
		this.isAlive = true;
		this.additionalDescription = additionalDescription;
		this.isFs = isFs;
		this.isExpanded = false;
		this.linkExpand = $("<a href='#'></a>").text(sliceQuery(this.query));
		this.insertBtn = $("<button>Insert</button>");
		this.deleteBtn = $("<button class='deleteButton'>X</button>");
		this.leftExpandedPanel = $("<div style='float:left;width:90%'></div>").text(this.query).append("</br>").append(this.insertBtn);
		this.rightExpandedPanel = $("<div style='float:right'></div>").append(this.deleteBtn);
		this.expandedDiv = $("<div class='extendedHistoryItem'></div>").append(this.leftExpandedPanel).append(this.rightExpandedPanel).append($("<div style='clear:both' />")).hide();
		
		this.html = $("<li></li>").append(this.linkExpand).append("<br/><em class='small'>(" + additionalDescription + ")</em>").append(this.expandedDiv);
		
		//Methods
		//Add click-handler to Expand-link.
		this.linkExpand.click($.proxy(function(event){
			if(this.isExpanded){
				this.expandedDiv.fadeOut();
				this.isExpanded = false;
			}
			else{
				this.expandedDiv.fadeIn();
				this.isExpanded = true;
			}
		}, this));
		//Add click-handler to insert-Button.
		this.insertBtn.click($.proxy(function(event){
			clearInputFields();
			if(this.isFs){
				fsQueryEditor.setCode(this.query);
				$("#tabsNoSidebar").tabs('select', 0);
			}
			else{
				sqlQueryEditor.setCode(this.query);
				$("#tabsNoSidebar").tabs('select', 1);
			}
		}, this));
		//Add click-handler to delete-Button.
		this.deleteBtn.click($.proxy(function(event){
			this.html.fadeOut();
			deleteCookie(this.name);
			this.isAlive = false;
			showHistoryMax();
		}, this));
	};
	
	//Slice query to maximum length of 50 signs.
	function sliceQuery(query){
		var shortQuery = "";
		if(query.length > 47){
			shortQuery = query.slice(0,47);
			shortQuery += "...";
		}
		else{
			shortQuery = query;
		}
		return shortQuery;
	}
	
	//Remove text in input fields.
	function clearInputFields(){
		$("#sqlQuery").val("");
		$("#flexibleSearchQuery").val("");
		fsQueryEditor.setCode("");
		sqlQueryEditor.setCode("");
	}
	
	//Returns the current Date and time in format: DD/MM/YYYY HH:MM:SS as String.
	function getDateTimeFormatted(){
		var myDate = new Date();
		var day = "" + myDate.getDate();
		if(day.length < 2){ 
			day = "0"+day;
		}
		var month = myDate.getMonth();
		month = (month+1) + "";
		if(month.length < 2){
			month = "0"+month;
		}
		var year = myDate.getFullYear();
		var hours = "" + myDate.getHours();
		if(hours.length < 2){
			hours = "0"+hours;
		}
		var minutes = "" + myDate.getMinutes();
		if(minutes.length < 2){ 
			minutes = "0"+minutes;
		}
		var seconds = "" + myDate.getSeconds();
		if(seconds.length < 2){
			seconds = "0"+seconds;
		}
		return "" + day + "/" + month + "/" + year + " " + hours + ":" + minutes + ":" + seconds;
	}
	
	$(".buttonSubmit").click(function(event) {
		if(event.target.id == "buttonSubmit1"){
			if(fsQueryEditor.getCode().length > 1){
				$("#sqlQuery").val("");
				sqlQueryEditor.setCode("");
			}
			else{
				return true;
			}
		}
		else{
			if(sqlQueryEditor.getCode().length > 1){
				$("#flexibleSearchQuery").val("");
				fsQueryEditor.setCode("");
			}
			else{
				return true;
			}
		}
		
		//Add the Query to cookieHistory before executing.
		addQueryToHistory(fsQueryEditor.getCode(), sqlQueryEditor.getCode(), getDateTimeFormatted());
		
		$('#flexQueryForm').validate({
			rules: {
				maxCount: {
					required: true,
					number: true
				}
			},
			submitHandler: function(form) {
				// Show spinner
				$('#spinnerWrapper').show();						
			
				// Prepare data object
				var dataObject = {
					flexibleSearchQuery : fsQueryEditor.getCode(),
					sqlQuery : sqlQueryEditor.getCode(),
					maxCount : $("#maxCount1").attr("value"),
					user : $("#user1").attr("value"),
					locale : $("#locale1").attr("value"),
					commit: $("#commitCheckbox1").is(":checked")
				};
			
				var url = $("#flexQueryForm").attr("action") + "execute";
			
				$.ajax({
					url : url,
					type : 'POST',
					data : dataObject,
					headers : {
						'Accept' : 'application/json'
					},
					success : function(data) {
						if (typeof(data) === 'string' && data.indexOf("redirect_detection") != -1)  {
							// Redirect when response is login page where "redirect_detection" marker is placed
							// Login page could be as response in case of redirection from spring security (session is dead)
							top.location.href = "/";
							return true;
						}
						// Hide spinner
						$('#spinnerWrapper').hide();
						
						if (!data.exception) {
							// Hide possible exception pane
							$("#exception").hide();
			
							// Build up headers for result table
							var headers = [];
							for ( var i = 0; i < data.headers.length; i++) {
								headers.push({
									"sTitle" : data.headers[i]
								})
							}
			
							// Remove possibly existend old
							// result table and create new
							$("#queryResult").show();
							$("#queryCommitMode").show();
							$('#queryResultTable').remove();
							$("#queryResult").html('<table id="queryResultTable"></table>');
							var table = $('#queryResultTable').dataTable({
										"aoColumns" : headers,
										"bDestroy" : true,
										"aLengthMenu" : [[10,25,50,100,-1], [10,25,50,100,'all']]
									});
							table.fnClearTable();
							table.fnAddData(data.resultList);
							$("#nav-tab-3").css("font-weight", "bold");
			
							// Put translated FlexibleSearch
							// query into the form
							$("#sqlQuery").attr("value", data.query);
							sqlQueryEditor.setCode(data.query);
							
							var flexibleSearchQuery = fsQueryEditor.getCode(); 
							var sqlQuery = sqlQueryEditor.getCode();
							
							if(event.target.id == "buttonSubmit1")
								$("#nav-tab-2").css("font-weight", "bold");
							
							// Execution stats
							$("#nav-tab-4").css("font-weight", "bold");
							$("#executionStats").show();
							if($("#commitCheckbox1").is(":checked")){
								$(".commitMode").text("ON");
								$(".commitMode").css("color","#FF0000");
							}
							else{
								$(".commitMode").text("OFF");
								$(".commitMode").css("color","#04B431");
							}
							$("#executionTime").text(data.executionTime + " ms.");
							$("#catalogVersions").text(data.catalogVersionsAsString);
							$("#params").text(data.parametersAsString);
							
						} else {
							// Hide possible query result pane and execution stats
							$("#queryResult").hide();
							$("#queryCommitMode").hide();
							$("#executionStats").hide();
							
							$("nav-tab-3").css("font-weight","bold");
			
							$("#exception").show();
							$("#exceptionMessage").text(
									data.exception.message)
							$("#exceptionStackTrace").text(
									data.exceptionStackTrace);
						} 
					},
					error : hac.global.err
				});				
			}
		})
		// Change showing tab to result
		$("#tabsNoSidebar").tabs('select', 2);
	});
});