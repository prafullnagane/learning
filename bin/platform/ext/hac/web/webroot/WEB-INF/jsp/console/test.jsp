<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Tests</title>
	<link rel="stylesheet" href="<c:url value="/static/css/console/test.css"/>" type="text/css" media="screen, projection" />
	
	<script type="text/javascript" src="<c:url value="/static/js/history.js"/>"></script>
</head>
	<body>
			<div class="prepend-top span-17 colborder" id="content">
				<button id="toggleSidebarButton">&gt;</button>
				<div class="marginLeft marginBottom">
					<a href="<c:url value="/test"/>" target="_blank">
						<img class="floatedImg" src="<c:url value="/static/img/console/testrunner.png"/>" alt="testRunnerScreen"/>
					</a>
					<div id="infoText">
						<a href="<c:url value="/test"/>" target="_blank" style="text-shadow: 2px 2px 2px #FFFFFF;">
					 		Click here to open the hybris JUnitEE TestRunner in new tab
					 	</a>
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
						  This page enables you to access the hybris JUnitEE TestRunner to initialize JUnit slave tenant and run JUnit tests.
						</div>
					</div>
					<h3 class="caps">
						See also in the hybris Wiki
					</h3>
					<div class="box">
						<ul>
							<li> <a href="https://wiki.hybris.com/display/release4/Tests" target="_blank" class="quiet" >Testing with the ServiceLayer</a> </li>
						</ul>
					</div>
				</div>
			</div>		
				
	</body>
</html>

