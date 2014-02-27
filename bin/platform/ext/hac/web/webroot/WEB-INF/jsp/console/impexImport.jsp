<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="hac" uri="/WEB-INF/custom.tld" %> 
<html>
<head>
	<title>ImpEx Import</title>
	<link rel="stylesheet" href="<c:url value="/static/css/console/impexCommon.css"/>" type="text/css" media="screen, projection" />
		
	<script type="text/javascript" src="<c:url value="/static/js/history.js"/>"></script>
	<script type="text/javascript" src="<c:url value="/static/js/console/impex.js"/>"></script>
</head>
<body>
	<div class="prepend-top span-17 colborder" id="content">
		<button id="toggleSidebarButton">&gt;</button>
		<div class="marginLeft">
			<h2>ImpEx Import</h2>
			
			<div id="tabsNoSidebar">
				<ul>
					<li><a href="#tabs-1">Import content</a>
					</li>
					<li><a href="#tabs-2">Import script</a>
					</li>
				</ul>
				<div id="tabs-1">
					<c:set var="contentImportUrl">
						<c:url value="/console/impex/import" />
					</c:set>					
					<c:set var="contentValidateUrl">
						<c:url value="/console/impex/import/validate" />
					</c:set>				
					<form:form method="post" id="contentForm" action="${contentImportUrl}" data-validateUrl="${contentValidateUrl}" commandName="impexImportContent">
						<fieldset>
							<legend>
								<spring:message code="console.impex.forms.legends.importContent" />
							</legend>
							<p>
								<span><form:errors path="scriptContent" cssClass="error" /></span>
								<form:textarea path="scriptContent" />
								<button id="clearScriptContent">Clear content</button>
							</p>
							<p>
								<span><form:errors path="encoding" cssClass="error" /></span><br />
								<form:label path="encoding">
									<spring:message code="console.impex.forms.labels.encoding" />
								</form:label>
								<form:input path="encoding" size="4" />
								
								<form:label path="maxThreads">
									<spring:message code="console.impex.forms.labels.maxThread" />
								</form:label>
								<spring:bind path="maxThreads">
									<input type="number" min="1" id="maxThreads" name="maxThreads" value="${impexImportContent.maxThreads}"/>
								</spring:bind>	
							</p>
							<p>
								<form:label path="legacyMode" for="legacyMode1">Legacy mode</form:label>
								<form:checkbox path="legacyMode"/>					
								
								<span><form:errors path="validationEnum" cssClass="error" /></span>
								<form:label path="validationEnum">
									<spring:message code="console.impex.forms.labels.validationEnum" />
								</form:label>
								<form:select path="validationEnum">
									<form:options items="${importValidationModes}" itemLabel="code" />
								</form:select><br/>
																			
								<form:label path="enableCodeExecution" for="enableCodeExecution1">Enable code execution</form:label>
								<form:checkbox path="enableCodeExecution"/>
							</p>
							<span>
								<form:errors path="maxThreads" cssClass="error" />
							</span>
							<br />
							<p>
								<input type="submit" value="<spring:message code="console.impex.forms.buttons.importContent" />" />
								<input id="validate" type="submit" value="<spring:message code="console.impex.forms.buttons.validateContent" />" />
							</p>
						</fieldset>
					</form:form>					
				</div>
				<div id="tabs-2">
					<c:set var="fileImportUrl">
					<c:url value="/console/impex/import/upload" />
					</c:set>	
					<form:form  method="post" action="${fileImportUrl}" commandName="impexImportFile" enctype="multipart/form-data">
					<fieldset>
						<legend>
							<spring:message code="console.impex.forms.legends.importScript" />
						</legend>
						<div>
							<span><form:errors path="file" cssClass="error" /></span><br />
							<spring:bind path="file">
								<hac:input-file name="file"/>				
							</spring:bind>
						</div>
						<p>
							<span><form:errors path="encoding" cssClass="error" /></span><br />
							<form:label path="encoding" for="fileEncoding">
								<spring:message code="console.impex.forms.labels.encoding" />
							</form:label>
							<form:input path="encoding" size="4" id="fileEncoding" />
							
							<form:label path="maxThreads" for="fileMaxThreads">
								<spring:message code="console.impex.forms.labels.maxThread" />
							</form:label>
							<spring:bind path="maxThreads">
								<input type="number" min="1" id="fileMaxThreads" name="maxThreads" value="${impexImportFile.maxThreads}"/>
							</spring:bind>
						</p>
						<p>
							<form:label path="legacyMode" for="legacyMode2">Legacy mode</form:label>
							<form:checkbox path="legacyMode"/>	
													
							<span><form:errors path="validationEnum" cssClass="error" />
							</span>
							<form:label path="validationEnum" for="fileValidationEnum">
								<spring:message code="console.impex.forms.labels.validationEnum" />
							</form:label>
							<form:select path="validationEnum" id="fileValidationEnum">
								<form:options items="${importValidationModes}" itemLabel="code"/>
							</form:select><br/>
							
							<form:label path="enableCodeExecution" for="enableCodeExecution2">Enable code execution</form:label>
							<form:checkbox path="enableCodeExecution"/>			
						</p>
						<p>
							<input type="submit" value="<spring:message code="console.impex.forms.buttons.importFile" />" />								
						</p>
						<p>
							<span><form:errors path="maxThreads" cssClass="error" />
							</span><br />					
						</p>
					</fieldset>
					</form:form>				
				</div>
			</div>					
			<!-- result -->
	
			<c:choose>
				<c:when test="${not empty importResult}">
					<c:choose>
						<c:when test="${ importResult.successs eq true }">
							<span id="impexResult" data-level="notice" data-result="<spring:message code="console.impex.result.import.successfull" />" >
							</span>
							<c:if test="${! empty importResult.logText }">
								<div class="box impexResult quiet">
									<pre>
										<c:out value="${importResult.logText}" />
									</pre>										
								</div>
							</c:if>
						</c:when>
						<c:otherwise>
							<span id="impexResult" data-level="error" data-result="<spring:message code="console.impex.result.import.unsuccessfull" />" >
							</span>
							<div class="box impexResult quiet">
								<pre>
									<c:out value="${importResult.unresolvedData}" />
								</pre>
							</div>
						</c:otherwise>
					</c:choose>
				</c:when>
				<c:when test="${not empty validationResult}">
					<div id="validationResult" class="marginBottom">
						<c:choose>
							<c:when test="${validationResult.valid eq true}">
								<span id="validationResultMsg" data-level="notice" data-result="<spring:message code="console.impex.result.validation.import.valid" />" >
							</c:when>
							<c:otherwise>
								<span id="validationResultMsg" data-level="error" data-result="<spring:message code="console.impex.result.validation.import.invalid" />" >
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
					This page provides ImpEx import functionality. You can import a script file or paste a script and validate it before the import.
					<hr />
					<hac:note>
						<strong>Legacy mode</strong><br>
							Impex import works on Service Layer. If you select this option, then Jalo Layer is used.
					</hac:note>
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

