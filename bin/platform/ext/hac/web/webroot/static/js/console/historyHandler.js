/** Handler for local History, saved in permanent Cookies.
 *  This Handler is used for: Beanshell, Groovyshell.
 *  @author manuel.feyrer
 */

var cookieName;
var cookieHistory = { };
var encryptionUrl;
var decryptionUrl;
var historyMax;

$(function(){
	encryptionUrl = $('#content').attr("encryptUrl");
	decryptionUrl = $('#content').attr("decryptUrl");
	
	cookieName = $("#tabs-history").attr("cookieName");
	historyMax = $("#tabs-history").attr("historyMax");
	
	$("#executeButton").click(function(){
		$("#historyLegend").show();
		
		var name = null;
		var historyItem = null;
		var statement = editor.getCode();
		
		//Remove history statement if already available.
		$.each(cookieHistory, function(cookieName,cookie){
			if(statement == cookie.statement){
				cookie.html.hide();
				name = cookieName;
			}
		});
		
		name = (name == null) ? getNewCookieName() : name;
		
		if(name != -1){
			historyItem = new historyEntry(statement, getDateTimeFormatted(), name);
			$("#historyList").append(historyItem.html);
			cookieHistory[name] = historyItem;
			encryptWriteCookie(historyItem, name);
		}
		showHistoryMax();
	});
	
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
	
	//Encrypt the object and save it to cookie.
	function encryptWriteCookie(historyItem, name){
		var cookieObject = {statement: historyItem.statement, additionalDescription: historyItem.additionalDescription};
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
					else{
						$("#historyLegend").show();
						var cookie = JSON.parse(data.plaintext);
						var historyItem = new historyEntry(cookie.statement, cookie.additionalDescription, name);
						$("#historyList").append(historyItem.html);
						cookieHistory[name] = historyItem;
						showHistoryMax();
					}
				},
				error : hac.global.err
			});
		})
	}
	
	//Constructor-Method for HistoryEntry Object which contains all information for showing Statement in History.
	function historyEntry(statement, additionalDescription, name){
		//Attributes
		this.statement = statement;
		this.additionalDescription = additionalDescription;
		this.name = name;
		this.isExpanded = false;
		this.isAlive = true;
		this.linkExpand = $("<a href='#'>" + sliceStatement(this.statement) + "<a/>");
		this.insertBtn = $("<button>Insert</button>");
		this.deleteBtn = $("<button class='deleteButton'>X</button>");
		this.leftExpandedPanel = $("<div style='float:left;width:90%'></div>").text(this.statement).append("</br>").append(this.insertBtn);
		this.rightExpandedPanel = $("<div style='float:right'></div>").append(this.deleteBtn);
		this.expandedDiv = $("<div class='extendedHistoryItem'></div>").append(this.leftExpandedPanel).append(this.rightExpandedPanel).append($("<div style='clear:both' />")).hide();
		
		this.html = $("<li></li>").append(this.linkExpand).append("<br/><em class='small'>(" + additionalDescription + ")</em>").append(this.expandedDiv);
		
		//Methods:
		//Add click-handler to Expand-link. With proxy make this context in method historyEntry-Object.
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
			editor.setCode(this.statement);
			$("#nav-tabs-edit").click();
		}, this));
		//Add click-handler to delete-Button.
		this.deleteBtn.click($.proxy(function(event){
			this.html.fadeOut();
			deleteCookie(this.name);
			this.isAlive = false;
			showHistoryMax();
		}, this));
	}

	//Slices Statement to maximum length of 50 characters if needed.
	function sliceStatement(statement){
		var shortStatement = "";
		if(statement.length > 47){
			shortStatement = statement.slice(0,47);
			shortStatement += "...";
		}
		else{
			shortStatement = statement;
		}
		return shortStatement;
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

	//Do actions when loading page.
	
	//initially hide historyLegend
	$("#historyLegend").hide();
	//Initially fill history-list, if cookie containing history is available.
	initHistory();
});