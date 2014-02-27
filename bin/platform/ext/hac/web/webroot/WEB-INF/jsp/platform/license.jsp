<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="hac" uri="/WEB-INF/custom.tld" %> 
<html>
<head>
	<title>License</title>
	<link rel="stylesheet" href="<c:url value="/static/css/table.css"/>" type="text/css" media="screen, projection" />
	<link rel="stylesheet" href="<c:url value="/static/css/platform/license.css"/>" type="text/css" media="screen, projection" />
	
	<script type="text/javascript" src="<c:url value="/static/js/jquery.dataTables.min.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/history.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/platform/license.js"/>"></script>
</head>
	<body>
			<div class="prepend-top span-17 colborder" id="content">
				<button id="toggleSidebarButton">&gt;</button>
				<div class="marginLeft">
				<h2>
					License Information
				</h2>			 			
				<h3>License overview</h3>
				<dl>
				  <dt>ID</dt>
				    <dd>${license.id}</dd>
				  <dt>Name</dt>
				    <dd>${license.name}</dd>
				  <dt>Signature</dt>
				    <dd>${license.signature}</dd>				    
				</dl>
				
				<h3>License terms</h3>
				<table id="licenseInfos" >
					<thead>
						<tr>
							<th>Status</th>
							<th>Current value</th>
							<th>Allowed value</th>
							<th>Message</th>
						</tr>
					</thead>
					<tbody>
				      <c:forEach var="info" items="${licenseInfos}">
				        <tr>
				          <td>${info.status}</td>
				          <td>${info.currentValue}</td>
				          <td>${info.allowedValue}</td>
				          <td>${info.message}</td>
				        </tr>
				      </c:forEach>					
					</tbody>
				</table>
				<br/>				
				<h3>License properties</h3>
				<table id="licenseProperties" >
					<thead>
						<tr>
							<th>Key</th>
							<th>Value</th>
						</tr>
					</thead>
					<tbody>
				      <c:forEach var="entry" items="${licenseProperties}">
				        <tr>
				          <td>${entry.key}</td>
				          <td>${entry.value}</td>
				        </tr>
				      </c:forEach>					
					</tbody>
				</table>					
				</div>
				
			</div>
			<div class="span-6 last" id="sidebar">
				<div class="prepend-top" id="recent-reviews">
					<h3 class="caps">Page description</h3>
					<div class="box">
						<div class="quiet">
							This page provides details about the currently used license.
								<c:if test="${license.unrestricted}">
									<hr />
									<hac:note>
									<spring:message code="license.developlicenseinfo" />
									</hac:note>
								</c:if>
						</div>
					</div>
					<h3 class="caps">See also in the hybris Wiki</h3>
					<div class="box">
						<ul>
							<li> <a href="https://wiki.hybris.com/display/release4/License" target="_blank" class="quiet" >Installing Licenses</a> </li>
						</ul>
					</div>
				</div>
			</div>		
	</body>
</html>

