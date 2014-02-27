package org.apache.jsp.security;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import de.hybris.platform.hmc.jalo.AccessManager;
import de.hybris.platform.core.*;
import de.hybris.platform.jalo.security.*;
import de.hybris.platform.jalo.*;
import de.hybris.platform.jalo.c2l.*;
import de.hybris.platform.jalo.flexiblesearch.*;
import de.hybris.platform.jalo.media.*;
import de.hybris.platform.jalo.user.*;
import de.hybris.platform.jalo.type.AttributeDescriptor;
import de.hybris.platform.jalo.type.*;
import de.hybris.platform.persistence.*;
import de.hybris.platform.util.*;
import de.hybris.platform.hmc.jalo.*;
import de.hybris.platform.hmc.webchips.*;
import de.hybris.platform.hmc.webchips.event.*;
import de.hybris.platform.hmc.webchips.tree.*;
import de.hybris.platform.hmc.*;
import de.hybris.platform.hmc.administration.*;
import de.hybris.platform.hmc.attribute.*;
import de.hybris.platform.hmc.enumeration.*;
import de.hybris.platform.hmc.generic.*;
import de.hybris.platform.hmc.generic.nodes.*;
import de.hybris.platform.hmc.generic.organizer.*;
import de.hybris.platform.hmc.media.*;
import de.hybris.platform.hmc.security.*;
import de.hybris.platform.hmc.util.*;
import de.hybris.platform.hmc.util.action.*;
import de.hybris.platform.hmc.ajax.*;
import java.io.*;
import org.apache.log4j.*;
import de.hybris.platform.licence.Licence;
import de.hybris.platform.hmc.jalo.AccessManager;

public final class principalAccessRightsEditorChip_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


	Logger log = Logger.getLogger( this.getClass().getName());
	static final String SERVLETPATH = "";

	final boolean DEBUG_COMMENTS = ConfigConstants.getInstance().DEBUG_SHOWJSPCOMMENTS;

	private String getRequestURL()
	{
		return SERVLETPATH+"?"+MasterServlet.WINDOW_ID+"="+Frame.getCurrent().getID();
	}

	private String getRequestURL(String frameName)
	{
		return SERVLETPATH+"?"+MasterServlet.WINDOW_ID+"=frame"+DisplayState.DELIMITER+frameName;
	}

	private String getWindowRequestURL(String windowName)
	{
		return SERVLETPATH+"?"+MasterServlet.WINDOW_ID+"="+windowName;
	}

	private String localized(String strKey)
	{
		return DisplayState.getCurrent().getLocalizedString(strKey);
	}

	/**
	 * If the appropriate config property is true (hmc.escape.html), all html content in the given string will
	 * be escaped.
	 */
	private String escapeHTML(String text)
	{
		if( ConfigConstants.getInstance().HTML_ESCAPE )
		{
			return Utilities.escapeHTML(text);
		}
		else
		{
			return text;
		}
	}

	private String getExternalLink( final String url, final String label, final String css )
	{
		StringBuffer link = new StringBuffer();
		link.append( "<a href=\"" + url + "\" " );
		if( css != null )
		{
			link.append( "class=\"" + css + "\" " );
		}
		link.append( ">" );
		link.append( label );
		link.append( "</a>" );
		return link.toString();
	}

	private String getExternalLink( final String url, final String label )
	{
		return getExternalLink( url, label, null );
	}

	private String getLink(final String event, final String label, final String css, String defaultValue, String selectedValue, String tooltip)
	{
		String status = Utilities.escapeHTML(Utilities.filterOutHTMLTags(tooltip));

		StringBuffer link = new StringBuffer();
		defaultValue = defaultValue == null ? AbstractChip.FALSE : defaultValue;
		selectedValue = selectedValue == null ? AbstractChip.TRUE : selectedValue;
		link.append( "<input type=\"hidden\" name=\"" + event + "\" value=\"" + defaultValue + "\" />" );
		link.append( "<a href=\"#\" onMouseover=\"window.status='" + status + "'; return true;\" onMouseout=\"window.status=''; return true;\" " );
		if( css != null )
		{
			link.append( "class=\"" + css + "\" " );
		}
		link.append("hidefocus=\"true\" ");
		link.append( "onclick=\"document.editorForm.elements['" + event + "'].value='" + selectedValue + "';setScrollAndSubmit();return false;\">" );
		link.append( label );
		link.append( "</a>" );
		return link.toString();
	}

	private String getLink( final String event, final String label, final String css, String defaultValue, String selectedValue )
	{
		return getLink(event, label, css, defaultValue, selectedValue, label);
	}
	
	private String getLink( final String url, final String label, final String  css )
	{
		return getLink( url, label, css, null, null );
	}

	private String getLink( final String url, final String label )
	{
		return getLink( url, label, null );
	}

	private String getMainToolbarButton(final String event, 
													final String label, 
													final String image, 
													String javascript, 
													final boolean showLabel, 
													final boolean isDropDown,
													final boolean isEnabled)
	{
		return getMainToolbarButton(event, label, label, image, javascript, showLabel, isDropDown, isEnabled);
	}

	private String getMainToolbarButton(final String event, 
													final String label, 
													final String tooltip,
													final String image, 
													String javascript, 
													final boolean showLabel, 
													final boolean isDropDown,
													final boolean isEnabled)
	{
		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";
		final String color = isEnabled ? "#333333" : "#999999";

		StringBuffer link = new StringBuffer();

		if( isEnabled )
		{
			link.append("<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />");
			link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"" + tooltip + "\" ");
			link.append("onMouseover=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_main_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_main_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_main_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onMouseout=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_main_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_main_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_main_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onFocus=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_main_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_main_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_main_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onBlur=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_main_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_main_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_main_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onclick=\"document.editorForm.elements['" + event + "'].value = " + javascript + "; setScrollAndSubmit(); return false;\">" );
		}
		
		link.append("<table title=\"" + tooltip + "\" style=\"vertical-align:middle; width:100%; height:23px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
		link.append("<tr>");
		link.append("<td id=\"" + imageID + "_bg_left\" style=\"width:3px;\" background=\"images/icons/header_background_main_l.gif\">&nbsp;</td>");
		link.append("<td id=\"" + imageID + "_bg_middle\" style=\"white-space:nowrap;vertical-align:middle;text-align:center;\" background=\"images/icons/header_background_main_m.gif\">");
		link.append("<img id=\"" + imageID + "\" style=\"vertical-align:middle;\" src=\"" + image + "\">");
		if( showLabel )
		{
			link.append("<span style=\"padding-left:5px; " + (!isDropDown ? "padding-right:5px; " : "") + "color:" + color + "\">" + label + "</span>");
		}
		
		if( isDropDown )
		{
			link.append("<span style=\"padding-left:3px; padding-right:5px;\"><img style=\"vertical-align:middle;\" src=\"images/icons/header_downarrow_main" + (isEnabled ? "" : "_inactive") + ".gif\"></span>");
		}
		link.append("</td>");		
		link.append("<td id=\"" + imageID + "_bg_right\" style=\"width:3px;\" background=\"images/icons/header_background_main_r.gif\">&nbsp;</td>");
		link.append("</tr>");
		link.append("</table>");
		
		if( isEnabled )
		{
			link.append("</a>");
		}

		return link.toString();
	}

	private String getBlueToolbarButton(	final String event, 
														final String label, 
														final String image, 
														String javascript, 
														boolean showLabel, 
														boolean isEnabled)
	{
		return getBlueToolbarButton(event, label, label, image, javascript, showLabel, isEnabled);
	}

	private String getBlueToolbarButton(	final String event, 
														final String label, 
														final String tooltip,
														final String image, 
														String javascript, 
														boolean showLabel, 
														boolean isEnabled)
	{
		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";

		StringBuffer link = new StringBuffer();
		final String color = isEnabled ? "#ffffff" : "#aaaaff";

		if( isEnabled )
		{
			link.append("<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />");
			link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"" + tooltip + "\" ");
			link.append("onMouseover=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_blue_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_blue_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_blue_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onMouseout=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_blue_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_blue_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_blue_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onFocus=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_blue_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_blue_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_blue_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onBlur=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_blue_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_blue_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_blue_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onclick=\"document.editorForm.elements['" + event + "'].value = " + javascript + "; setScrollAndSubmit(); return false;\">" );
		}
		
		link.append("<table title=\"" + tooltip + "\" style=\"vertical-align:middle; width:100%; height:23px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
		link.append("<tr>");
		link.append("<td id=\"" + imageID + "_bg_left\" style=\"width:3px;\" background=\"images/icons/header_background_blue_l.gif\">&nbsp;</td>");
		link.append("<td id=\"" + imageID + "_bg_middle\" style=\"white-space:nowrap;vertical-align:middle;text-align:center;\" background=\"images/icons/header_background_blue_m.gif\">");

		link.append("<img id=\"" + imageID + "\" style=\"vertical-align:middle\" src=\"" + image + "\">");
		if( showLabel )
		{
			link.append("<span style=\"padding-left:5px; padding-right:5px; color:" + color + "\">" + label + "</span>");
		}
				
		link.append("</td>");
		link.append("<td id=\"" + imageID + "_bg_right\" style=\"width:3px;\" background=\"images/icons/header_background_blue_r.gif\">&nbsp;</td>");
		link.append("</tr>");
		link.append("</table>");
		
		if( isEnabled )
		{
			link.append("</a>");
		}

		return link.toString();
	}

	private String getGreyToolbarButton(final String event, 
													final String label, 
													final String image, 
													String javascript, 
													boolean showLabel, 
													boolean isEnabled)
	{
		return getGreyToolbarButton(event, label, label, image, javascript, showLabel, isEnabled);
	}

	private String getGreyToolbarButton(final String event, 
													final String label, 
													final String tooltip,
													final String image, 
													String javascript, 
													boolean showLabel, 
													boolean isEnabled)
	{
		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";

		StringBuffer link = new StringBuffer();
		final String color = isEnabled ? "#ffffff" : "#D8DCE3";

		if( isEnabled )
		{
			link.append("<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />");
			link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"" + tooltip + "\" ");
			link.append("onMouseover=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_grey_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_grey_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_grey_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onMouseout=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_grey_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_grey_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_grey_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onFocus=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_hover_grey_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_hover_grey_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_hover_grey_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onBlur=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/header_background_grey_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/header_background_grey_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/header_background_grey_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onclick=\"document.editorForm.elements['" + event + "'].value = " + javascript + "; setScrollAndSubmit(); return false;\">" );
		}
		
		link.append("<table title=\"" + tooltip + "\" style=\"vertical-align:middle; width:100%; height:23px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
		link.append("<tr>");
		link.append("<td id=\"" + imageID + "_bg_left\" style=\"width:3px;\" background=\"images/icons/header_background_grey_l.gif\">&nbsp;</td>");
		link.append("<td id=\"" + imageID + "_bg_middle\" style=\"white-space:nowrap;vertical-align:middle;text-align:center;\" background=\"images/icons/header_background_grey_m.gif\">");

		link.append("<img id=\"" + imageID + "\" style=\"vertical-align:middle\" src=\"" + image + "\">");
		if( showLabel )
		{
			link.append("<span style=\"padding-left:5px; color:" + color + "\">" + label + "</span>");
		}
		
		link.append("</td>");
		link.append("<td id=\"" + imageID + "_bg_right\" style=\"width:3px;\" background=\"images/icons/header_background_grey_r.gif\">&nbsp;</td>");
		link.append("</tr>");
		link.append("</table>");
		
		if( isEnabled )
		{
			link.append("</a>");
		}

		return link.toString();
	}

	private String getIconButton(final String event, 
											final String label, 
											final String image, 
											String javascript, 
											boolean showLabel, 
											boolean isEnabled)
	{
		String status = Utilities.escapeHTML(Utilities.filterOutHTMLTags(label));

		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";

		StringBuffer link = new StringBuffer();
		final String color = isEnabled ? "#ffffff" : "#D8DCE3";

		if( isEnabled )
		{
			link.append("<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />");
			link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"" + status + "\" ");
			link.append("onMouseover=\"window.status='" + status + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/icon_button_background_hover_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/icon_button_background_hover_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/icon_button_background_hover_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onMouseout=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/icon_button_background_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/icon_button_background_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/icon_button_background_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onFocus=\"window.status='" + status + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/icon_button_background_hover_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/icon_button_background_hover__m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/icon_button_background_hover__r.gif)'; "
				   		+ " return true;\" ");
			link.append("onBlur=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/icon_button_background_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/icon_button_background_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/icon_button_background_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onclick=\"document.editorForm.elements['" + event + "'].value = " + javascript + "; setScrollAndSubmit(); return false;\">" );
		}
		
		link.append("<table title=\"" + status + "\" style=\"vertical-align:middle; width:100%; height:23px; padding:0px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
		link.append("<tr>");
		link.append("<td id=\"" + imageID + "_bg_left\" style=\"width:3px;font-size:1pt;padding:0px;\" background=\"images/icons/icon_button_background_l.gif\"><div style=\"width:3px;\"></div></td>");
		link.append("<td id=\"" + imageID + "_bg_middle\" style=\"white-space:nowrap;vertical-align:middle;text-align:center;padding:0px;\" background=\"images/icons/icon_button_background_m.gif\">");

		link.append("<img id=\"" + imageID + "\" style=\"vertical-align:middle\" src=\"" + image + "\">");
		if( showLabel )
		{
			link.append("<span style=\"padding-left:5px; color:" + color + "\">" + label + "</span>");
		}
		
		link.append("</td>");
		link.append("<td id=\"" + imageID + "_bg_right\" style=\"width:3px;font-size:1pt;padding:0px;\" background=\"images/icons/icon_button_background_r.gif\"><div style=\"width:3px;\"></div></td>");
		link.append("</tr>");
		link.append("</table>");
		
		if( isEnabled )
		{
			link.append("</a>");
		}

		return link.toString();
	}

	private String getFooterButton(	final String event, 
												final String label, 
												final String image, 
												String javascript, 
												boolean showLabel, 
												boolean isEnabled)
	{
		return getFooterButton(event, label, label, image, javascript, showLabel, isEnabled);
	}
		
	private String getFooterButton(	final String event, 
												final String label, 
												final String tooltip,
												final String image, 
												String javascript, 
												boolean showLabel, 
												boolean isEnabled)
	{
		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";

		StringBuffer link = new StringBuffer();
		final String color = isEnabled ? "#333333" : "#999999";

		if( isEnabled )
		{
			link.append("<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />");
			link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"" + tooltip + "\" ");
			link.append("onMouseover=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/footer_background_hover_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/footer_background_hover_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/footer_background_hover_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onMouseout=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/footer_background_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/footer_background_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/footer_background_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onFocus=\"window.status='" + tooltip + "'; "
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/footer_background_hover_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/footer_background_hover_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/footer_background_hover_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onBlur=\"window.status='';"
						   + " document.getElementById('" + imageID + "_bg_left').style.backgroundImage = 'url(images/icons/footer_background_l.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_middle').style.backgroundImage = 'url(images/icons/footer_background_m.gif)'; "
						   + " document.getElementById('" + imageID + "_bg_right').style.backgroundImage = 'url(images/icons/footer_background_r.gif)'; "
				   		+ " return true;\" ");
			link.append("onclick=\"document.editorForm.elements['" + event + "'].value = " + javascript + "; setScrollAndSubmit(); return false;\">" );
		}
		
		link.append("<table title=\"" + tooltip + "\" style=\"vertical-align:middle; width:100%; height:23px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">");
		link.append("<tr>");
		link.append("<td id=\"" + imageID + "_bg_left\" style=\"width:3px;\" background=\"images/icons/footer_background_l.gif\">&nbsp;</td>");
		link.append("<td id=\"" + imageID + "_bg_middle\" style=\"white-space:nowrap;vertical-align:middle;text-align:center;\" background=\"images/icons/footer_background_m.gif\">");

		link.append("<img id=\"" + imageID + "\" style=\"vertical-align:middle\" src=\"" + image + "\">");
		if( showLabel )
		{
			link.append("<span style=\"padding-left:5px; color:" + color + "\">" + label + "</span>");
		}
		
		link.append("</td>");
		link.append("<td id=\"" + imageID + "_bg_right\" style=\"width:3px;\" background=\"images/icons/footer_background_r.gif\">&nbsp;</td>");
		link.append("</tr>");
		link.append("</table>");
		
		if( isEnabled )
		{
			link.append("</a>");
		}

		return link.toString();
	}

	private String getSimpleImageConfirmLink( final String event, final String label, final String image, String imageOver, String javascript )
	{
		String status = Utilities.escapeHTML(Utilities.filterOutHTMLTags(label));

		if( (imageOver == null) || imageOver.equals("") )
		{
			imageOver = image;
		}

		if( (javascript	== null) || javascript.equals("") )
		{
			javascript = "true";
		}

		final String imageID = event + "_img";

		StringBuffer link = new StringBuffer();

		link.append("<input type=\"hidden\" name=\"").append(event).append("\" value=\"").append(AbstractChip.FALSE).append("\" />");
		link.append("<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none; \" alt=\"").append(status).append("\" title=\"").append(status).append("\"");
		link.append("onMouseover=\"window.status='").append(status).append("'; swapImage('").append(imageID).append("', '").append(imageOver).append("'); return true;\" ");
		link.append("onMouseout=\"window.status=''; swapImage('").append(imageID).append("', '").append(image).append("'); return true;\" ");
		link.append("onFocus=\"swapImage('").append(imageID).append("', '").append(imageOver).append("'); return true;\" ");
		link.append("onBlur=\"swapImage('").append(imageID).append("', '").append(image).append("'); return true;\" ");
		link.append("onclick=\"document.editorForm.elements['").append(event).append("'].value = ").append(javascript).append("; setScrollAndSubmit(); return false;\">" );
		link.append("<img id=\"").append(imageID).append("\" src=\"").append(image).append("\" alt=\"").append(status).append("\">");
		link.append("</a>");

		return link.toString();
	}

	private String getSimpleImageLink(final String event, final String label, final String image, final String imageOver)
	{
		return getSimpleImageConfirmLink(event, label, image, imageOver, null);
	}

	public String getLinkedLabel( final String url, final String body )
	{
		if( url == null )
		{
			return body;
		}
		else
		{
			return "<a href=\"" + url + "\" hidefocus=\"true\">" + body + "</a>";
		}
	}

	public String getLinkedIDLabel( String id, final String url, final String body )
	{
		if( (id == null) || id.equals("") )
		{
			return getLinkedLabel(url, body);
		}
		
		if( url == null )
		{
			return body;
		}
		else
		{
			return "<a id=\"" + id + "\" href=\"" + url + "\" hidefocus=\"true\">" + body + "</a>";
		}
	}


public String getQualifierLine(PrincipalAccessRightsEditorChip chip, String id, String right, boolean disabled)
	{
		if( disabled )
		{
			return "<img src='images/icons/checkbox_disabled.gif' />";
		}
		else
		{
			final String permission = chip.getPermission(id, right);
			return "<a href=\"#\" onclick=\"setEntityAndPermission('" + id + "', '" + right + "', '" + permission + "'); setScrollAndSubmit(); return false;\"><img id=\"" + id + "_" + right + "_" + permission +  "\" src='images/icons/checkbox_" + permission + ".gif'/></a>";
		}
	}
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/security/../head.inc");
    _jspx_dependants.add("/security/../emptyFooter.inc");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n\r\n");


	final DisplayState theDisplayState = (DisplayState) request.getAttribute(MasterServlet.STATE);
	final Frame frame = (Frame) request.getAttribute(AbstractChip.FRAME_KEY);

	 /*
	 //to be definitive NOT serializable
	InputStream noser = (InputStream)session.getAttribute( "NOT_SERIALIZABLE");
	if( noser==null )
	{
		session.setAttribute( "NOT_SERIALIZABLE", new ByteArrayInputStream( new byte[0] ));
	}
	*/


      out.write("\r\n\r\n");

	PrincipalAccessRightsEditorChip theChip = (PrincipalAccessRightsEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);

	String selectTypeEvent = theChip.getEventID(PrincipalAccessRightsEditorChip.SELECT_TYPE_EVENT);

	String eventQualifier = theChip.getEventID(PrincipalAccessRightsEditorChip.TYPEORFD_EVENT);
	String eventPermission = theChip.getEventID(PrincipalAccessRightsEditorChip.PERMISSION_EVENT);
	String eventRight = theChip.getEventID(PrincipalAccessRightsEditorChip.RIGHT_EVENT);
	String eventChangePermission = theChip.getEventID(PrincipalAccessRightsEditorChip.CHANGE_PERMISSION_EVENT);
	
	final boolean disabled = !theChip.canChangeRights();

	Set types = theChip.getTypes();

      out.write("\r\n\r\n");
      out.write("\r\n\r\n<script language=\"JavaScript1.2\">\r\n\tfunction setEntityAndPermission( entity, right, permission )\r\n\t{\r\n\t\tdocument.editorForm.elements['");
      out.print( eventQualifier );
      out.write("'].value=entity;\r\n\t\tdocument.editorForm.elements['");
      out.print( eventPermission );
      out.write("'].value=permission;\r\n\t\tdocument.editorForm.elements['");
      out.print( eventRight );
      out.write("'].value=right;\r\n\t\tdocument.editorForm.elements['");
      out.print( eventChangePermission );
      out.write("'].value='true';\r\n\t}\r\n</script>\r\n\r\n<input type=\"hidden\" name=\"");
      out.print( selectTypeEvent );
      out.write("\"/>\r\n<table class=\"table.principalAccessRightsEditorChipHeader\">\r\n\t<tr>\r\n\t\t<td>&nbsp;</td>\r\n\t\t<td class=\"sectionheader\">\r\n\t\t\t<div class=\"sh\">");
      out.print(localized("principal.security.section"));
      out.write("&nbsp;");
      out.print(theChip.isChanged() ? "*" : "");
      out.write("</div>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n\r\n<table class=\"principalAccessRightsEditorChip\">\t\r\n\t<tr><td class=\"spacer\" colspan=\"4\"><div>&nbsp;</div></td></tr>\r\n\t<tr>\r\n\t\t<td class=\"arrowButton\">&nbsp;</td>\r\n\t\t<td class=\"description\" colspan=\"3\"><div>");
      out.print(localized("principal.security.tab.composedtypes.description"));
      out.write("</div></td>\r\n\t</tr>\r\n\t<tr><td class=\"spacer\" colspan=\"4\"><div>&nbsp;</div></td></tr>\r\n\t\r\n\t<tr>\r\n \t\t<td class=\"arrowButton\">&nbsp;</td>\r\n \t\t<td class=\"attrLabel\"><div>");
      out.print(localized("principal.security.tab.composedtypes"));
      out.write(":</div></td>\r\n\t\t<td class=\"objects\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr class=\"headline\">\r\n\t\t\t\t\t<td>");

						theChip.getToolbar().render(pageContext);
					
      out.write("</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t<!-- type list start -->\r\n\t\t\t\t\t\t<div style=\"overflow:auto\" id=\"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\">\r\n");

	if( ConfigConstants.getInstance().ENABLE_SCROLLBAR && types.size()>12 )
					{

      out.write("\r\n\t\t\t\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\t\t\tdocument.getElementById( \"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\" ).style.height=260;\r\n\t\t\t\t\t\t\t</script>\r\n");

							}

      out.write("\r\n\t\t\t\t\t\t\t<table class=\"listtable\" cellpadding=\"1px\" cellspacing=\"0px\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width:30px;\"><div style=\"width:30px; padding-left:2px;\"/></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width:30px;\"><div style=\"width:30px; padding-left:2px;\">");
      out.print( localized("type") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width:208px;\"><div style=\"width:208px; padding-left:2px;\">");
      out.print( localized("code") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width:209px;\"><div style=\"width:209px; padding-left:2px;\">");
      out.print( localized("name") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t</tr>\r\n");

								if( types.isEmpty() )
								{

      out.write("\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td class=\"disabled\" width=\"496px\" colspan=\"4\" style=\"border: 1px solid #bbbbbb\"><div class=\"disabled\">");
      out.print( localized( "listisempty" ) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n");

								}
								else
								{
									for( final Iterator it = types.iterator(); it.hasNext(); )
									{
										final ComposedType type = (ComposedType) it.next();
										final boolean selected = theChip.isSelected(type);
										final String typeCode = type.getCode();
										String typeName = type.getName();
										if( typeName == null )
										{
											typeName = localized("notdefined");
										}

      out.write("\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td valign=\"top\" ");
      out.print( (selected ? "class=\"selected\"" : "" ) );
      out.write(" style=\"border-left: 1px solid #bbbbbb; width:30px; text-align:center;\">\r\n\t\t\t\t\t\t\t\t\t\t<input class=\"header\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t onclick=\"document.editorForm.elements['");
      out.print( selectTypeEvent );
      out.write("'].value='");
      out.print( typeCode );
      out.write("';setScrollAndSubmit();\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t type=\"radio\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t name=\"1\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t value=\"2\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t id=\"access_");
      out.print( typeCode );
      out.write("_radio\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t ");
      out.print( selected?" checked" : "" );
      out.write("/>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td ");
      out.print( (selected ? "class=\"selected\"" : "" ) );
      out.write(" style=\"text-align:center;\">\r\n\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( theChip.getIcon(type) );
      out.write("\" \r\n\t\t\t\t\t\t\t\t\t\t\t  border=\"0\" \r\n\t\t\t\t\t\t\t\t\t\t\t  onclick=\"document.editorForm.elements['");
      out.print( selectTypeEvent );
      out.write("'].value='");
      out.print( typeCode );
      out.write("';setScrollAndSubmit();return false;\" \r\n\t\t\t\t\t\t\t\t\t\t\t  onMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\"  \r\n\t\t\t\t\t\t\t\t\t\t\t  onMouseout=\"window.status='';return true;\" \r\n\t\t\t\t\t\t\t\t\t\t\t  id=\"access_");
      out.print( typeCode );
      out.write("_img\"\r\n\t\t\t\t\t\t\t\t\t\t\t  title=\"");
      out.print( localized("select.list.entry") );
      out.write("\" />\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td ");
      out.print( selected ? "class=\"selected\"" : "" );
      out.write(" style=\"padding-left:2px;\">\r\n\t\t\t\t\t\t\t\t\t\t<a href=\"#\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"normallink\"\r\n\t\t\t\t\t\t\t\t\t\t\tonMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\" \r\n\t\t\t\t\t\t\t\t\t\t\tonMouseout=\"window.status='';return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\thidefocus=\"true\" \r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"white-space: nowrap;\"\r\n\t\t\t\t\t\t\t\t\t\t\tonclick=\"document.editorForm.elements['");
      out.print( selectTypeEvent );
      out.write("'].value='");
      out.print( typeCode );
      out.write("';setScrollAndSubmit();return false;\"\r\n\t\t\t\t\t\t\t\t\t\t\tid=\"access_");
      out.print( typeCode );
      out.write("_code\"\r\n\t\t\t\t\t\t\t\t\t\t\ttitle=\"");
      out.print( localized("select.list.entry") );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t");
      out.print( typeCode );
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t<td ");
      out.print( selected ? "class=\"selected\"" : "" );
      out.write(" style=\"border-right: 1px solid #bbbbbb; padding-left:2px;\">\r\n\t\t\t\t\t\t\t\t\t\t<a href=\"#\"\r\n\t\t\t\t\t\t\t\t\t\t\tclass=\"normallink\"\r\n\t\t\t\t\t\t\t\t\t\t\tonMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\" \r\n\t\t\t\t\t\t\t\t\t\t\tonMouseout=\"window.status='';return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\thidefocus=\"true\" \r\n\t\t\t\t\t\t\t\t\t\t\tstyle=\"white-space: nowrap;\"\r\n\t\t\t\t\t\t\t\t\t\t\tonclick=\"document.editorForm.elements['");
      out.print( selectTypeEvent );
      out.write("'].value='");
      out.print( typeCode );
      out.write("';setScrollAndSubmit();return false;\"\r\n\t\t\t\t\t\t\t\t\t\t\tid=\"access_");
      out.print( typeCode );
      out.write("_name\"\r\n\t\t\t\t\t\t\t\t\t\t\ttitle=\"");
      out.print( localized("select.list.entry") );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t");
      out.print( typeName );
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n");

									}
								}

      out.write("\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>");
      out.write("<table class=\"emptyFooter\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"left\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t<td class=\"middle\"> </td>\r\n\t\t<td class=\"right\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t</tr>\r\n</table>\r\n");
      out.write("</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t\t<td>&nbsp;</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"spacer\" colspan=\"4\"><div>&nbsp;</div></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"arrowButton\">&nbsp;</td>\r\n\t\t<td class=\"description\" colspan=\"3\"><div>");
      out.print( localized("typeandattributedescriptors.description") );
      out.write("</div></td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"spacer\" colspan=\"4\"><div>&nbsp;</div></td>\r\n\t</tr>\r\n\t<tr>\r\n \t\t<td class=\"arrowButton\">&nbsp;</td>\r\n \t\t<td class=\"attrLabel\"><div>");
      out.print( localized("typeandattributedescriptors") );
      out.write(":</div></td>\r\n\t\t<td style=\"vertical-align:top;\">\r\n\r\n\t\t\t<table cellspacing=\"0\" cellpadding=\"0\" style=\"width:500px;\">\r\n");

				if( !theChip.isTypeSelected() || !theChip.hasItem() )
				{

      out.write("\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"disabled\">\r\n\t\t\t\t\t\t\t");
      out.print( localized( "listisempty" ) );
      out.write("\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n");

				}
				else
				{

      out.write("\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td>\r\n");

							final String typeCode = theChip.getSelectedType().getCode();
							final String typeName = theChip.getSelectedType().getName() != null ? theChip.getSelectedType().getName() : localized("notdefined");
							final String style = disabled ? "color: silver;" : "";

      out.write("\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventQualifier );
      out.write("\"/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventPermission );
      out.write("\"/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventRight );
      out.write("\"/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventChangePermission );
      out.write("\"/>\r\n\t\t\t\t\t\t\t<table width=\"100%\" class=\"listtable\">\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 150px;\"><div style=\"padding-left:2px;\">");
      out.print( localized("code") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 150px;\"><div style=\"padding-left:2px;\">");
      out.print( localized("name") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; text-align:center; overflow:hidden;\"><div style=\"padding-left:2px;\">");
      out.print( localized("security.read") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; text-align:center; overflow:hidden;\"><div style=\"padding-left:2px;\">");
      out.print( localized("security.change") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; text-align:center; overflow:hidden;\"><div style=\"padding-left:2px;\">");
      out.print( localized("security.create") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; text-align:center; overflow:hidden;\"><div style=\"padding-left:2px;\">");
      out.print( localized("security.remove") );
      out.write("</div></th>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td style=\"border-left: 1px solid #bbbbbb; width:150px;");
      out.print( style );
      out.write("\"><div style=\"overflow:hidden; white-space:nowrap; padding-left:2px;\">");
      out.print( typeCode );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"");
      out.print( style );
      out.write(" width:150px;\"><div style=\"overflow:hidden; white-space:nowrap; padding-left:2px;\">");
      out.print( typeName );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, PrincipalAccessRightsEditorChip.TYPE, AccessManager.READ, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, PrincipalAccessRightsEditorChip.TYPE, AccessManager.CHANGE, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, PrincipalAccessRightsEditorChip.TYPE, AccessManager.CREATE, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px; border-right: 1px solid #bbbbbb;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, PrincipalAccessRightsEditorChip.TYPE, AccessManager.REMOVE, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n");

								for( final Iterator it = theChip.getAttributeDescriptors().iterator(); it.hasNext(); )
								{
									final AttributeDescriptor descr = (AttributeDescriptor) it.next();
									final String descriptorID = theChip.getAttributeDescriptorID(descr);
									final String descriptorQualifier = descr.getQualifier();
									final String descriptorName = descr.getName() != null ? descr.getName() : localized("notdefined");

      out.write("\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"border-left: 1px solid #bbbbbb; white-space:nowrap;");
      out.print( style );
      out.write("\"><div style=\"white-space:nowrap; width:150px; overflow:hidden;padding-left:2px;\">-");
      out.print( descriptorQualifier );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"");
      out.print( style );
      out.write("; white-space:nowrap;\"><div style=\"white-space:nowrap; width:150px; overflow:hidden;\">");
      out.print( descriptorName );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;width: 55px;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, descriptorID, AccessManager.READ, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;width: 55px;\"><div style=\"padding-left:2px;\">");
      out.print( getQualifierLine(theChip, descriptorID, AccessManager.CHANGE, disabled) );
      out.write("</div></td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"width: 55px;\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t<td style=\"border-right: 1px solid #bbbbbb;width: 55px;\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n");

								}

      out.write("\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>");
      out.write("<table class=\"emptyFooter\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"left\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t<td class=\"middle\"> </td>\r\n\t\t<td class=\"right\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t</tr>\r\n</table>\r\n");
      out.write("</td>\r\n\t\t\t\t</tr>\r\n");

							}

      out.write("\r\n\t\t\t</table>\r\n\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td class=\"spacer\" colspan=\"4\"><div>&nbsp;</div></td>\r\n\t</tr>\r\n\r\n\r\n </table>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
