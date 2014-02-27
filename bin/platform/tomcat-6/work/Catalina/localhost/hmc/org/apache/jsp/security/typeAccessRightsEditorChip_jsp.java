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

public final class typeAccessRightsEditorChip_jsp extends org.apache.jasper.runtime.HttpJspBase
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


public String getQualifierLine(TypeAccessRightsEditorChip chip, String qualifier, String right, boolean disabled)
	{
		String permission = chip.getPermission(qualifier, right);
		if( disabled )
		{
			return "<img src='images/icons/checkbox_disabled.gif' />";
		}
		else
		{
			return "<a href=\"#\" onclick=\"setEntityAndPermission('" + qualifier + "', '" + right + "', '" + permission + "'); setScrollAndSubmit(); return false;\"><img id=\"" + qualifier + "_" + right + "_" + permission +  "\" src='images/icons/checkbox_" + permission + ".gif'/></a>";
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

	TypeAccessRightsEditorChip theChip = (TypeAccessRightsEditorChip) request.getAttribute(AbstractChip.CHIP_KEY);
	Set principals = theChip.getPrincipals();
	String eventSelectPrincipal = theChip.getEventID(TypeAccessRightsEditorChip.SELECT_PRINCIPAL_EVENT);
	String eventQualifier = theChip.getEventID(TypeAccessRightsEditorChip.TYPEORFD_EVENT);
	String eventPermission = theChip.getEventID(TypeAccessRightsEditorChip.PERMISSION_EVENT);
	String eventRight = theChip.getEventID(TypeAccessRightsEditorChip.RIGHT_EVENT);
	String eventChangePermission = theChip.getEventID(TypeAccessRightsEditorChip.CHANGE_PERMISSION_EVENT);
	boolean selected = false;

      out.write('\r');
      out.write('\n');
      out.write("\r\n<script language=\"JavaScript1.2\">\r\n\tfunction setEntityAndPermission( entity, right, permission )\r\n\t{\r\n\t\tdocument.editorForm.elements['");
      out.print(theChip.getEventID(TypeAccessRightsEditorChip.TYPEORFD_EVENT));
      out.write("'].value=entity;\r\n\t\tdocument.editorForm.elements['");
      out.print(theChip.getEventID(TypeAccessRightsEditorChip.PERMISSION_EVENT));
      out.write("'].value=permission;\r\n\t\tdocument.editorForm.elements['");
      out.print(theChip.getEventID(TypeAccessRightsEditorChip.RIGHT_EVENT));
      out.write("'].value=right;\r\n\t\tdocument.editorForm.elements['");
      out.print(theChip.getEventID(TypeAccessRightsEditorChip.CHANGE_PERMISSION_EVENT));
      out.write("'].value='true';\r\n\t}\r\n</script>\r\n\r\n<input type=\"hidden\" name=\"");
      out.print( eventSelectPrincipal );
      out.write("\"/>\r\n<table class=\"typeAccessRightsEditorChip\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"sectionheader\">\r\n\t\t\t<div class=\"sh\">");
      out.print(localized("accessrights"));
      out.write("&nbsp;");
      out.print(theChip.isChanged() ? "*" : "");
      out.write("</div>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table width=\"742px\" class=\"attribute\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"arrowButton\">&nbsp;</td>\r\n\t\t\t \t\t<td class=\"attrLabel\">");
      out.print(localized("principals"));
      out.write(":</td>\r\n\t\t\t \t\t<td class=\"noLocalizationFlag\">&nbsp;</td>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>");

									theChip.getToolbar().render(pageContext);
								
      out.write("</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t<!-- principal list start -->\r\n\t\t\t\t\t\t\t\t\t<div style=\"width:100%;overflow:auto;\" id=\"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\">\r\n");

	if( ConfigConstants.getInstance().ENABLE_SCROLLBAR && principals.size()>12 )
								{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\t\t\t\t\t\tdocument.getElementById( \"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\" ).style.height=260;\r\n\t\t\t\t\t\t\t\t\t\t</script>\r\n");

										}

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t<table width=\"100%\" class=\"listtable\" cellpadding=\"1px\" cellspacing=\"0px\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<th style=\"width:30px; text-align:center;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:30px;\">&nbsp;&nbsp;</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<th style=\"width:30px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:30px;\">");
      out.print(localized( "type" ));
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<th style=\"width:30%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:100%\">");
      out.print(localized( "uid" ));
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<th style=\"width:70%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:100%\">");
      out.print(localized( "name" ));
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

											if( principals.isEmpty() )
											{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"disabled\" width=\"100%\" colspan=\"4\" style=\"border: 1px solid #bbbbbb\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" width=\"100%\"><font class=\"disabled\">");
      out.print( localized( "listisempty" ) );
      out.write("</font></div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

											}
											else
											{
												for( final Iterator it = principals.iterator(); it.hasNext(); )
												{
													Principal principal = (Principal) it.next();
													selected = theChip.isSelected(principal);
													String combinedID = theChip.getCombinedID(principal);
													String principalID = principal.getUID();
													String principalName = principal.getName();
													if( principalName == null )
													{
														principalName = localized("notdefined");
													}

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td valign=\"top\" ");
      out.print( (selected ? "class=\"selected\"" : "" ) );
      out.write(" style=\"border-left: 1px solid #bbbbbb; width:30px; text-align:center;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:30px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"header\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t onclick=\"document.editorForm.elements['");
      out.print( eventSelectPrincipal );
      out.write("'].value='");
      out.print( combinedID );
      out.write("';setScrollAndSubmit();\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t type=\"radio\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t name=\"1\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t value=\"2\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t id=\"");
      out.print( combinedID );
      out.write("_radio\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ");
      out.print(selected?" checked":"");
      out.write("/>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td ");
      out.print( (selected ? "class=\"selected\"" : "" ) );
      out.write(">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:30px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print(theChip.getIcon( principal ));
      out.write("\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  border=\"0\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  onclick=\"document.editorForm.elements['");
      out.print( eventSelectPrincipal );
      out.write("'].value='");
      out.print( combinedID );
      out.write("';setScrollAndSubmit();return false;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  onMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  onMouseout=\"window.status='';return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  id=\"");
      out.print( combinedID );
      out.write("_img\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  title=\"");
      out.print( localized("select.list.entry") );
      out.write("\" />\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"30%\" ");
      out.print( selected ? "class=\"selected\"" : "" );
      out.write(">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:100%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"normallink\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonMouseout=\"window.status='';return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thidefocus=\"true\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"white-space: nowrap;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"document.editorForm.elements['");
      out.print( eventSelectPrincipal );
      out.write("'].value='");
      out.print( combinedID );
      out.write("';setScrollAndSubmit();return false;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t   id=\"");
      out.print( combinedID );
      out.write("_id\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"");
      out.print( localized("select.list.entry") );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( principalID );
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td width=\"70%\" ");
      out.print( selected ? "class=\"selected\"" : "" );
      out.write(" style=\"border-right: 1px solid #bbbbbb\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:100%;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tclass=\"normallink\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonMouseover=\"window.status='");
      out.print( localized("select.list.entry") );
      out.write("'; return true;\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonMouseout=\"window.status='';return true;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\thidefocus=\"true\" \r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tstyle=\"white-space: nowrap;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tonclick=\"document.editorForm.elements['");
      out.print( eventSelectPrincipal );
      out.write("'].value='");
      out.print( combinedID );
      out.write("';setScrollAndSubmit();return false;\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t   id=\"");
      out.print( combinedID );
      out.write("_name\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\ttitle=\"");
      out.print( localized("select.list.entry") );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( principalName );
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

												}
											}

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>");
      out.write("<table class=\"emptyFooter\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"left\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t<td class=\"middle\"> </td>\r\n\t\t<td class=\"right\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t</tr>\r\n</table>\r\n");
      out.write("</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td height=\"10px;\">&nbsp;</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n\t\t\t<table width=\"742px\" class=\"attribute\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td class=\"arrowButton\">&nbsp;</td>\r\n\t\t\t \t\t<td class=\"attrLabel\">");
      out.print( localized("typeandattributedescriptors") );
      out.write(":</td>\r\n\t\t\t \t\t<td class=\"noLocalizationFlag\">&nbsp;</td>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n");

									boolean disabled = !theChip.hasItem() || !theChip.isPrincipalSelected();
									String typeCode = theChip.getComposedType() == null ? localized( "type" ) : theChip.getComposedType().getCode();
									String typeName = theChip.getComposedType() == null ? localized( "type" ) : theChip.getComposedType().getName();
									String style = disabled ? "color: silver;" : "";
									typeName = (typeName == null ? typeName = localized("notdefined") : typeName);

      out.write("\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventQualifier );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventPermission );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventRight );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print( eventChangePermission );
      out.write("\"/>\r\n\t\t\t\t\t\t\t\t\t<table width=\"100%\" class=\"listtable\">\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 150px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:150px;\">");
      out.print( localized("code") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 150px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:150px;\">");
      out.print( localized("name") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( localized("security.read") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( localized("security.change") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( localized("security.create") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t\t<th style=\"width: 55px; overflow:hidden;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( localized("security.remove") );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</th>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"border-left: 1px solid #bbbbbb; width:150px;");
      out.print( style );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:150px; overflow:hidden; white-space:nowrap;\">");
      out.print( typeCode );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"");
      out.print( style );
      out.write("; width:150px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:150px; overflow:hidden; white-space:nowrap;\">");
      out.print( typeName );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;");
      out.print( style );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, TypeAccessRightsEditorChip.TYPE, AccessManager.READ, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, TypeAccessRightsEditorChip.TYPE, AccessManager.CHANGE, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, TypeAccessRightsEditorChip.TYPE, AccessManager.CREATE, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center; width:55px; border-right: 1px solid #bbbbbb;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, TypeAccessRightsEditorChip.TYPE, AccessManager.REMOVE, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

										if( theChip.getComposedType() instanceof ComposedType )
										{
											for( final Iterator it = theChip.getAttributeDescriptors().iterator(); it.hasNext(); )
											{
												AttributeDescriptor fd = (AttributeDescriptor) it.next();
												String descriptorID = theChip.getAttributeDescriptorID(fd);

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"border-left: 1px solid #bbbbbb; white-space:nowrap;");
      out.print( style);
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"white-space:nowrap; width:150px; overflow:hidden;\">- ");
      out.print( fd.getQualifier() );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"");
      out.print( style );
      out.write("; white-space:nowrap;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"white-space:nowrap; width:150px; overflow:hidden;\">");
      out.print( fd.getName() );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;width: 55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, descriptorID, AccessManager.READ, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"text-align:center;width: 55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">");
      out.print( getQualifierLine(theChip, descriptorID, AccessManager.CHANGE, disabled) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"width: 55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">&nbsp;</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<td style=\"border-right: 1px solid #bbbbbb;width: 55px;\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"tarecEntry\" style=\"width:55px;\">&nbsp;</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");

											}
										}

      out.write("\r\n\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>");
      out.write("<table class=\"emptyFooter\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"left\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t<td class=\"middle\"> </td>\r\n\t\t<td class=\"right\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t</tr>\r\n</table>\r\n");
      out.write("</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td style=\"height:10px;\">&nbsp;</td>\r\n\t</tr>\r\n</table>\r\n");
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