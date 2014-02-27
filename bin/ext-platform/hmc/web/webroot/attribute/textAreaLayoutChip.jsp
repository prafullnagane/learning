<%@include file="../head.inc"%>
<%
	TextAreaLayoutChip theChip = (TextAreaLayoutChip) request.getAttribute(AbstractChip.CHIP_KEY);

	String onKeyPressString = "";
	if( theChip.getParent() instanceof FlexibleConditionChip )
	{
		onKeyPressString = "onkeypress=\"return checkForEnter(event);\"";
	}
	else
	{
		onKeyPressString = "onkeypress=\"return true;\"";
	}
	int maxLength = theChip.getMaxLength();

	int width = theChip.getWidth() - 15;
	
	%>

<script language="JavaScript1.2">
	// following handles the 'maxlength' functionality
	
	var maxLength = <%= maxLength %>;

	function doKeypress(element)
	{
		// prevent entering more than maxLength characters
		if( maxLength && element.value.length > maxLength-1 )
		{
			event.returnValue = false;
			maxLength = parseInt(maxLength);
		}
	}
</script>

<table class="textAreaLayoutChip" cellspacing="0" cellpadding="0">
	<tr>
		<td>
<%
			if( theChip.isMultiLine() || theChip.isExpanded() )
			{
%>
				<textarea
					class="<%= theChip.isEditable() ? "enabled" : "disabled" %>"
					<%= theChip.getCols() == null ? "style=\"width:" + width + "px;\"" : "" %>
					name="<%= theChip.getEventID(TextAreaLayoutChip.SET_VALUE) %>"
					<%= theChip.getCols() != null ? "cols=\"" + theChip.getCols() + "\"" : "" %>
					rows="<%= (theChip.getRows()!=null?theChip.getRows().toString():"9") %>"
					wrap="<%= (theChip.isWrapping()?"virtual":"off") %>"
					onkeypress="doKeypress(this)"
					id="<%= theChip.getUniqueName() %>_textarea"
					<%= theChip.isEditable() ? "" : "readonly=\"readonly\"" %>><%= theChip.getQuotedStringValue() %></textarea>
<%
			}
			else
			{
%>
			  <input
					type="text"
					class="<%= theChip.isEditable() ? "enabled" : "disabled" %>"
					name="<%= theChip.getEventID(TextAreaLayoutChip.SET_VALUE) %>"
					value="<%= theChip.getQuotedStringValue() %>"
					style="width: <%= width %>px;"
					<%= maxLength != 0 ? "maxlength=\"" + maxLength + "\"" : "" %>
					<%= onKeyPressString %>
					id="<%= theChip.getUniqueName() %>_input"
					<%= theChip.isEditable() ? "" : "readonly=\"readonly\"" %>/>
<%
			}
%>
		</td>
		<td class="multiline">
<%
			if( theChip.isMultiLine() )
			{
				// allow no collapsing/expanding
%>
				<img src="images/icons/e_collapse.gif"/>
<%
			}
			else
			{		
				final boolean isExpanded = theChip.isExpanded();
%>
				<div class="arrow-button chip-event" title="<%= isExpanded ? localized("collapse") : localized("expand") %>">
					<a href="#" class="<%= isExpanded ? "collapse" : "expand" %>" hidefocus="true" id="<%= theChip.getUniqueName() %>_togglearrow"
						name="<%= theChip.getCommandID(TextAreaLayoutChip.SET_TEXTAREA) %>" hidefocus="true"></a>
				</div>
<%
			}
%>
		</td>
	</tr>
</table>
