<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>BeanShell</title>
	
	<link rel="stylesheet" href="<c:url value="/static/css/console/groovy.css"/>" type="text/css" media="screen, projection" />
	<link rel="stylesheet" href="<c:url value="/static/css/iphone/iphonestyle.css"/>" type="text/css" media="screen, projection" />
	
	<script type="text/javascript" src="<c:url value="/static/js/history.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/codemirror/codemirror.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/console/scriptingLang.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/iphone/iphone-style-checkboxes.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/console/historyHandler.js"/>"></script>
	
</head>
	<body>	
		<div class="prepend-top span-17 colborder" id="content" encryptUrl="<c:url value="/console/encrypt" />" decryptUrl="<c:url value="/console/decrypt" />">
			<button id="toggleSidebarButton">&gt;</button>
			<div class="marginLeft">
				<h2>BeanShell Web Console (${beanshellVersion})</h2>
					
		        <div id="tabsNoSidebar" class="marginBottom">
			        	<ul>
					     	<li><a id="nav-tabs-edit" href="#tabs-edit">Edit Statement</a>
			           	<li><a id="nav-tabs-result" href="#tabs-result">Result</a></li>
			           	<li><a id="nav-tabs-output" href="#tabs-output">Output</a></li>
			           	<li><a id="nav-tabs-stacktrace" href="#tabs-stacktrace">Stack trace</a></li>
			           	<li><a id="nav-tabs-history" href="#tabs-history">History</a></li>
			        	</ul>
							
						<div id="tabs-edit">
							<br/>
							<div id="textarea-container" class="border">
								<div id="spinnerWrapper">
									<img id="spinner" src="<c:url value="/static/img/spinner.gif"/>" alt="spinner"/>
								</div>
								<textarea id="script" name="script" cols="140" rows="40" data-stylesheetUrl="<c:url value="/static/css/codemirror/groovycolors.css" />" data-pathUrl="<c:url value="/static/js/codemirror/" />">for (bean : ctx.getBeanDefinitionNames()) {
  									print(bean);
									}
									return "Better try Groovy :-)"
								</textarea>
							</div>
							<div id="buttons">
								<div style="float:left;margin-top:7px">
									<input type="checkbox" id="commitCheckbox" />
								</div>
								<button id="executeButton" data-executorUrl="<c:url value="/console/beanshell/execute" />">Execute</button>
							</div>
							<div style="clear:both"></div>
						</div>	
						
		            <div id="tabs-result">
		                <pre id="result" class="hidden scrollable"></pre>
		            </div>
		
	            	<div id="tabs-output">
	            	    <pre id="output" class="hidden scrollable"></pre>
	            	</div>
		
		            <div id="tabs-stacktrace">
	   	             <pre id="stacktrace" class="hidden scrollable"></pre>
	      	      </div>
	            
	         	   <div id="tabs-history" cookieName="BeanshellHistory" historyMax="${historyMax}">
	            		<legend style="padding-left:5px;padding-top:10px;padding-bottom:10px" id="historyLegend">
								<span>History</span>
								<a href="#" id="clearHistory" style="font-size:75%">(clear)</a><br/>
								<span id="historyMax" style="color:red;font-weight:bold;font-size:12px">Maximum number of entries achieved!</span>
							</legend>
	            		<ul id="historyList" style="margin:0"></ul>
	            	</div>
		   		</div>
				</div>
			</div>
			<div class="span-6 last" id="sidebar">
				<div class="prepend-top" id="recent-reviews">
					<h3 class="caps">
						Page description
					</h3>
					<div class="box">
						<div class="quiet">
						 This page provides the BeanShell console. It comes with implicit variables:<br><br>
							<ul>
								<li><strong>ctx</strong> - Spring ApplicationContext</li>
								<li><strong>out</strong> - Standard Output Stream</li>
							</ul>					
						 <hr/>
						<strong>Result</strong> tab: Displays results for the executed script. You can return a result using the <strong>return</strong> keyword. If the result is in a <strong>String</strong>, then you can read it directly. For all other objects the <strong>toString()</strong> method is called and the result is displayed.<br><br>
						<strong>Output</strong> tab: Displays a string if the script uses a method to display text. During script execution all output to <strong>System.out</strong> is redirected and shows up in this tab. The implicit variable <strong>out</strong> is available and is of <strong>PrintStream</strong> type.<br><br>
						<strong>Stacktrace</strong> tab: Displays the stack trace for the corrupted script.  <br><br>
						<strong>History</strong> tab: Displays the local script history and the timestamp of the last execution.  <br><br>
						</div>
					</div>
				</div>
			</div>		
	</body>
</html>

