<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="hac" uri="/WEB-INF/custom.tld" %> 
<html>
<head>
	<title>ImpEx Export</title>
	<link rel="stylesheet" href="<c:url value="/static/css/console/impexCommon.css"/>" type="text/css" media="screen, projection" />
	
	<script type="text/javascript" src="<c:url value="/static/js/history.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/console/impex.js"/>"></script>
	
</head>
<body>
	<div class="prepend-top span-17 colborder" id="content">
		<button id="toggleSidebarButton">&gt;</button>
		<div class="marginLeft">
			<h2>ImpEx Export</h2>
			
			<div id="tabsNoSidebar">
				<ul>
					<li><a href="#tabs-1">Export content</a>
					</li>
					<li><a href="#tabs-2">Export script</a>
					</li>
				</ul>
				<div id="tabs-1">
					<c:set var="contentExportUrl">
						<c:url value="/console/impex/export" />
					</c:set>	
					<c:set var="contentValidateUrl">
						<c:url value="/console/impex/export/validate" />
					</c:set>	
					
					<form:form id="contentForm" method="post" action="${contentExportUrl}" data-validateUrl="${contentValidateUrl}" commandName="impexExportContent">
						<fieldset>
							<legend>
								<spring:message code="console.impex.forms.legends.exportContent" />
							</legend>
							<p>
								<span><form:errors path="scriptContent" cssClass="error" /></span>
								<form:textarea path="scriptContent" />
								<button id="clearScriptContent">Clear content</button>
							</p>
							<p>
								<span><form:errors path="validationEnum" cssClass="error" /></span>
								<form:label path="validationEnum">
									<spring:message code="console.impex.forms.labels.validationEnum" />
								</form:label>
								<form:select path="validationEnum">
									<form:options items="${exportValidationModes}" itemLabel="code" />
								</form:select>
								<br /><span><form:errors path="encoding" cssClass="error" /></span><br />
								<form:label path="encoding" for="contentEncoding">
									<spring:message code="console.impex.forms.labels.encoding" />
								</form:label>
								<form:input path="encoding" size="4" id="contentEncoding"/>
							</p>
							<p>							
								<input type="submit" value="<spring:message code="console.impex.forms.buttons.exportContent" />" />
								<input id="validate" type="submit" value="<spring:message code="console.impex.forms.buttons.validateContent" />" />
							</p>
						</fieldset>
					</form:form>				
				</div>
				<div id="tabs-2">
					<c:set var="fileExportUrl">
						<c:url value="/console/impex/export/upload" />
					</c:set>	
					<form:form method="post" action="${fileExportUrl}" commandName="impexExportFile" enctype="multipart/form-data">
						<fieldset>
							<legend>
								<spring:message code="console.impex.forms.legends.exportScript" />
							</legend>
							<div>
								<span><form:errors path="file" cssClass="error" /></span>
								<spring:bind path="file">
									<hac:input-file name="file"/>
								</spring:bind>
								<form:label path="encoding">
									<spring:message code="console.impex.forms.labels.encoding" />
								</form:label>
								<span><form:errors path="encoding" cssClass="error" /></span>
								<form:input path="encoding" size="4" />						
								<input type="submit" value="<spring:message code="console.impex.forms.buttons.exportFile" />" />								
							</div>
						</fieldset>
					</form:form>					
				</div>			
			</div>
			
			<!-- result -->
			<c:choose>
				<c:when test="${not empty exportResult}">
					<c:choose>
						<c:when test="${ exportResult.success eq true }">
							<span id="impexResult" data-level="notice" data-result="<spring:message code="console.impex.result.export.successfull" />" >
							</span>
							<div id="downloadExportResultData" class="marginBottom box">
								<spring:message code="console.impex.result.export.download"></spring:message>: <a href="${exportResult.downloadUrl}">${exportResult.exportDataName}</a>
							</div>
						</c:when>
						<c:otherwise>
							<span id="impexResult" data-level="error" data-result="<spring:message code="console.impex.result.export.unsuccessfull" />" >
							</span>
						</c:otherwise>
					</c:choose>
				</c:when>
				<c:when test="${not empty validationResult}">
					<div id="validationResult" class="marginBottom">
						<c:choose>
							<c:when test="${validationResult.valid eq true}">
								<span id="validationResultMsg" data-level="notice" data-result="<spring:message code="console.impex.result.validation.export.valid" />" >
							</c:when>
							<c:otherwise>
								<span id="validationResultMsg" data-level="error" data-result="<spring:message code="console.impex.result.validation.export.invalid" />" >
							</c:otherwise>
						</c:choose>
					</div>
				</c:when>
			</c:choose>					
		</div>
	</div>
	<div class="span-6 last" id="sidebar">
		<div class="prepend-top" id="recent-reviews">
			<h3 class="caps">
				Page description
			</h3>
			<div class="box">
				<div class="quiet">
					This page provides ImpEx export functionality. You can export a script file or paste a script and validate it before the export.
				</div>
			</div>
			<h3 class="caps">
				See also in the hybris Wiki
			</h3>
			<div class="box">
				<div class="quiet">
					<ul>
			 	   	<li> <a href="https://wiki.hybris.com/display/release4/ImpEx" target="_blank" class="quiet">impex Extension - Technical Guide</a> </li>
					</ul>
				</div>
			</div>
		</div>
	</div>	
</body>
</html>