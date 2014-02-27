<%@ tag body-content="empty" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="cms" uri="http://hybris.com/tld/cmstags" %>

<div id="nav_main" class="nav_main">
	<div class="left_corner" id="left_corner">&nbsp;</div>
	<cms:pageSlot position="NavigationBar" var="component" element="ul" class="clear_fix">
		<cms:component component="${component}"/>
	</cms:pageSlot>
	<div class="right-corner" id="right-corner">&nbsp;
	  <div class="right-ribin">&nbsp;</div>
	</div>
</div>