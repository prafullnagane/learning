package org.apache.jsp.generic.organizer;

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
import java.text.MessageFormat;
import de.hybris.platform.hmc.Constants;

public final class organizerListChip_jsp extends org.apache.jasper.runtime.HttpJspBase
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


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/generic/organizer/../../head.inc");
    _jspx_dependants.add("/generic/organizer/../../searchListChipRange.inc");
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


      out.write("\r\n\r\n\r\n");

	OrganizerListChip theChip= (OrganizerListChip) request.getAttribute(AbstractChip.CHIP_KEY);

	boolean isScrollHeader = theChip.isScrollHeader();
	boolean treemode = theChip.getMode() == Constants.LISTMODES.TREE;
	int entryCount = theChip.getListEntryCount();
	boolean showScrollbars = theChip.showScrollbar();

      out.write("\r\n<script language=\"JavaScript1.2\">\r\n");

	if( theChip.hasVisibleContextMenuEntries() )
	{

      out.write("\r\n\t\tvar organizerListContextMenu = new Menu(");
      out.print( theChip.createMenuEntriesForJS(theChip.getMenuEntries()) );
      out.write(", null, null, null, { uniqueName: '");
      out.print( theChip.getUniqueName() );
      out.write("'} );\r\n");

	}
	else
	{

      out.write("\r\n\t\tvar organizerListContextMenu = null;\r\n");

	}

      out.write("\r\n</script>\r\n<table class=\"organizerListChip\" id=\"");
      out.print( theChip.getUniqueName() );
      out.write("_outertable\" cellpadding=\"0\" cellspacing=\"0\" oncontextmenu=\"if( organizerListContextMenu != null ) { organizerListContextMenu.show(event); } return false;\">\r\n\t<col width=\"100%\"/>\r\n\t<tr align=\"left\" valign=\"top\">\r\n\t\t<td>");
 theChip.getToolbar().render( pageContext ); 
      out.write("</td>\r\n\t</tr>\r\n\t<tr>\r\n\t\t<td>\r\n");

			if( isScrollHeader )
			{

      out.write("\r\n\t\t\t\t<div class=\"olcResultList\" id=\"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\">\r\n");

			}
			
			if( !treemode )
			{
				if( isScrollHeader )
				{

      out.write("\r\n\t\t\t\t\t<table id=\"");
      out.print( theChip.getUniqueName() );
      out.write("_innertable\" class=\"");
      out.print( treemode ? "treetable" : "listtable selecttable" + (theChip.isMultipleSelectionAllowed() ? "" : " singleselect") );
      out.write("\" cellpadding=\"0px\" cellspacing=\"0px\">\r\n\r\n");

				}
				else
				{

      out.write("\r\n\t\t\t\t\t<table class=\"listtable\" cellpadding=\"0\" cellspacing=\"0\">\r\n");

				}

      out.write("\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<th class=\"checkbox olcCheckbox\">\r\n\t\t\t\t\t\t\t<input name=\"SELECTOR\" ");
      out.print( theChip.isAllSelected() ? "checked" : "" );
      out.write(" \r\n\t\t\t\t\t\t\t\t\t type=\"");
      out.print( ( theChip.isMultipleSelectionAllowed() ? "checkbox" : "radio" ) );
      out.write("\" \r\n\t\t\t\t\t\t\t\t\t name=\"\" value=\"ALL\" title=\"");
      out.print( localized("select.all.tooltip") );
      out.write("\"\r\n\t\t\t\t\t\t\t\t\t />\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(theChip.getEventID(ListChip.SELECT));
      out.write("\" value=\"\" />   <!-- dummy event to allow lists to be completely de-selected -->\r\n\t\t\t\t\t</th>\r\n\t\t\t\t\t<th class=\"olcIcon\" ");
      out.print( isScrollHeader ? "colspan=\"2\"" : "" );
      out.write(">\r\n\t\t\t\t\t\t<div class=\"olcIcon\">&nbsp;</div>\r\n\t\t\t\t\t</th>\r\n");

						for( final Iterator i = theChip.getChildNodes().iterator(); i.hasNext(); )
						{
							final Node childNode = (Node) i.next();
							
							if( childNode instanceof AttributeNode )
							{
								final String headerQualifier = ((AttributeNode) childNode).getAttributeQualifier();
								
								String width = null;
								if( (isScrollHeader || i.hasNext()) && (theChip.getAttributeWidths().get(headerQualifier) != null) )
								{
									width = theChip.getAttributeWidths().get(headerQualifier).toString();
								}

      out.write("\r\n\t\t\t\t\t\t\t\t<th");
      out.print( (width != null) ? (" style=\"width:" + width + "px\"") : "" );
      out.write('>');
      out.write('\r');
      out.write('\n');

										if( theChip.isSortable(headerQualifier) )
										{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t<div class=\"olcEntry\" style=\"");
      out.print( (width != null) ? ("width:" + width + "px") : "" );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t<a class=\"sort\" hidefocus=\"true\" href=\"");
      out.print(getRequestURL());
      out.write("&#38;");
      out.print(theChip.getEventID(OrganizerListChip.SORT));
      out.write('=');
      out.print(headerQualifier);
      out.write("\" id=\"");
      out.print( theChip.getUniqueName() + "_" + headerQualifier );
      out.write("_sort\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(theChip.getTitle(headerQualifier));
      out.write('\r');
      out.write('\n');

													if( headerQualifier.equals(theChip.getSortAttributeQualifier() ) )
													{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;<img src=\"images/icons/arrow_");
      out.print( theChip.getSortOrderIdentifier() );
      out.write(".gif\" id=\"");
      out.print( theChip.getUniqueName() + "_" + headerQualifier );
      out.write("_sortimg\"/>\r\n");

													}

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");

										}
										else
										{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"olcEntry\" style=\"");
      out.print( (width != null) ? ("width:" + width + "px;") : "" );
      out.write('"');
      out.write('>');
      out.print(theChip.getTitle(headerQualifier));
      out.write("</div>\r\n");

										}

      out.write("\r\n\t\t\t\t\t\t\t\t</th>\r\n");

							}
							else if( childNode instanceof ItemNode )
							{
								final int itemWidth = i.hasNext() ? ((ItemNode) childNode).getWidth() : 0;
								final String itemTitle = ((ItemNode) childNode).getTitle();

      out.write("\r\n\t\t\t\t\t\t\t\t\t<th style=\"");
      out.print( itemWidth > 0 ? "width:" + itemWidth + "px;" : "" );
      out.write("\">\r\n\t\t\t\t\t\t\t\t\t\t<div class=\"olcEntry\" style=\"");
      out.print( itemWidth > 0 ? "width:" + itemWidth + "px;" : "" );
      out.write('"');
      out.write('>');
      out.print( localized(itemTitle) );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t</th>\r\n");

							}
						}

      out.write("\r\n\t\t\t\t</tr>\r\n");

				if( !isScrollHeader )
				{

      out.write("\r\n \t\t\t</table>\r\n");

				}
			}
			else
			{

      out.write("\r\n\t\t\t<table class=\"treetable\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<th class=\"olcCheckbox\">\r\n\t\t\t\t\t\t\t<input name=\"SELECTOR\" class=\"header\" ");
      out.print( theChip.isAllSelected() ? "checked" : "" );
      out.write(" onclick=\"document.editorForm.elements['");
      out.print(theChip.getEventID(GenericItemListChip.SELECT_VISIBLE));
      out.write("'].value='");
      out.print( !theChip.isAllSelected());
      out.write("';setScrollAndSubmit();\" type=\"");
      out.print( ( theChip.isMultipleSelectionAllowed() ? "checkbox" : "radio" ) );
      out.write("\" name=\"\" value=\"ALL\" />\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(theChip.getEventID(GenericItemListChip.SELECT_VISIBLE));
      out.write("\" value=\"\"/>\r\n\t\t\t\t\t\t\t<input type=\"hidden\" name=\"");
      out.print(theChip.getEventID(ListChip.SELECT));
      out.write("\" value=\"\" />   <!-- dummy event to allow lists to be completely de-selected -->\r\n\t\t\t\t\t</th>\r\n\t\t\t\t\t<th class=\"olcIcon\">\r\n\t\t\t\t\t\t<div class=\"olcIcon\">&nbsp;</div>\r\n\t\t\t\t\t</th>\r\n\t\t\t\t\t<th>\r\n\t\t\t\t\t\t<div class=\"olcEntry\">");
      out.print( localized("items") );
      out.write("</div>\r\n\t\t\t\t\t</th>\r\n\t\t\t\t</tr>\r\n");

				if( !isScrollHeader )
				{

      out.write("\r\n\t\t\t</table>\r\n");

				}
			}
			if( !isScrollHeader )
			{
				

      out.write("\r\n\t\t\t\t<div class=\"olcResultList\" id=\"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\">\r\n");
		
			}
			int diffSize = 300;

			if( theChip.getParent().getParent() instanceof OrganizerChip )
			{
				OrganizerChip organizer = (OrganizerChip) theChip.getParent().getParent();
				OrganizerComponentChip component = organizer.getSearchComponent();
				
				if( (component != null) && component.isExpanded() && (organizer.getSearchChip() != null) )
				{
					diffSize = (organizer.getSearchChip().getListEntryCount() * 25) - (isScrollHeader ? 25 : 0);
					if( theChip.isEditing() )
					{
						diffSize += 520;
					}
					else
					{
						diffSize += 430;
					}
				}
			}
			
			if( treemode )
			{
				String height = (entryCount == 0) ? "21" : ("getResultListHeightAbsolute(" + diffSize + ", 100, 10000)");
				if( showScrollbars )
				{

      out.write("\r\n\t\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\tdocument.getElementById( \"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\" ).style.height = ");
      out.print( height );
      out.write(";\r\n\t\t\t\t\t</script>\r\n");

				}
			}
			else
			{
				int minheight = theChip.getMinListHeight() + (isScrollHeader ? 25 : 0);
				int maxheight = theChip.getMaxListHeight() + 16 + (isScrollHeader ? 25 : 0);
				
				if( showScrollbars )
				{

      out.write("\r\n\t\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\tdocument.getElementById( \"resultlist_");
      out.print( theChip.getUniqueName() );
      out.write("\" ).style.height=getResultListHeightAbsolute(");
      out.print( diffSize );
      out.write(',');
      out.write(' ');
      out.print( minheight );
      out.write(',');
      out.write(' ');
      out.print( maxheight );
      out.write(");\r\n\t\t\t\t\t</script>\r\n");

				}
			}

			if( !isScrollHeader )
			{

      out.write("\r\n\t \t\t\t<table id=\"");
      out.print( theChip.getUniqueName() );
      out.write("_innertable\" class=\"");
      out.print( treemode ? "treetable" : "listtable selecttable" + (theChip.isMultipleSelectionAllowed() ? "" : " singleselect") );
      out.write("\" cellpadding=\"0px\" cellspacing=\"0px\">\r\n");

			}

      out.write("\r\n\t\t\t\t\t<tr style=\"display:none;\">\r\n\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t<input name=\"");
      out.print(theChip.getEventID(GenericItemListChip.SELECT_VISIBLE));
      out.write("\" value=\"\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\r\n");

						if( !theChip.getListEntries().isEmpty() )
						{
							for (final Iterator theChips = theChip.getListEntries().iterator(); theChips.hasNext();)
							{
								final OrganizerListEntryChip chip = (OrganizerListEntryChip)theChips.next();
								chip.setLast( !theChips.hasNext() );

      out.write("\r\n\t\t\t\t\t\t\t\t\t<tr id=\"");
      out.print( chip.getUniqueName() );
      out.write("_tr\" class=\"doubleclick-event ");
      out.print( chip.getCommandID(GenericItemListEntryChip.OPEN_EDITOR) );
      out.write(' ');
      out.print( theChip.isListEntrySelected(chip) ? "selected" : "" );
      out.write("\" onclick=\"\" ondblclick=\"\">\t");
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t<td class=\"checkbox olcCheckbox\">\r\n\t\t\t\t\t\t\t\t\t\t\t<div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<input class=\"header\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t type=\"");
      out.print( ( theChip.isMultipleSelectionAllowed() ? "checkbox" : "radio" ) );
      out.write("\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t name=\"");
      out.print(theChip.getEventID(ListChip.SELECT));
      out.write("\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t value=\"");
      out.print(chip.getPosition());
      out.write("\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t ");
      out.print(theChip.isListEntrySelected( chip )?" checked":"");
      out.write("/>\r\n\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t");
 chip.render(pageContext); 
      out.write("\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n");

							}
						}
						else
						{

      out.write("\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td class=\"olcEmpty\" colspan=\"");
      out.print( theChip.getHeaderCount() + 3 );
      out.write("\" >\r\n");

											if (theChip.isNewSearch())
											{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t&nbsp;\r\n");

											}
											else
											{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(localized("searchresultempty"));
      out.write('\r');
      out.write('\n');

											}

      out.write("\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n");

						}

      out.write("\r\n\t\t\t\t</table>\r\n\t\t\t</div>\r\n");

	int rangeCount = theChip.getMaxItemsPerPage();
	int totalCount = theChip.getItemCount();
	
	int ranges = (int)Math.ceil( (double)totalCount / rangeCount );
	int currentRange = (int)Math.ceil( (double)theChip.getRangeStart()/ rangeCount );
	currentRange++;
	
	int startRange = Math.max( Math.min( currentRange - 5, ranges - 10 ), 1 );
	
	boolean isEditing = theChip instanceof OrganizerListChip && ((OrganizerListChip) theChip).isEditing();

      out.write("\r\n<table class=\"footer\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td align=\"left\" valign=\"bottom\" width=\"7px\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t<td style=\"white-space:nowrap\">\r\n\t\t\t");
      out.print( (totalCount == 0 ? 0 : (theChip.getRangeStart() + 1)) );
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print( theChip.getRangeStart()+theChip.getListEntryCount() );
      out.write("\r\n\t\t\t");
      out.print( localized("searchlist.of") );
      out.write("\r\n\t\t\t");
      out.print( totalCount );
      out.write("&nbsp;&nbsp;\r\n\t\t</td>\r\n\t\t<td width=\"100%\">&nbsp;</td>\r\n\r\n\t\t<td>\r\n");

			boolean enabled = theChip.getRangeStart() > 0  && !isEditing;

      out.write("\t\t\r\n\t\t\t");
      out.print( getFooterButton(theChip.getEventID(GenericItemSearchListChip.FIRST_PAGE),
												  localized("searchlist.first"), localized("searchlist.first.tooltip"),
												  "images/icons/footer_first" + (enabled ? "" : "_inactive") + ".gif",
												  null,
												  false, 
												  enabled) );
      out.write('\r');
      out.write('\n');

			if( enabled )
			{

      out.write("\r\n\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\taddKeyEvent(\"F\", \"");
      out.print( theChip.getEventID(GenericItemSearchListChip.FIRST_PAGE) );
      out.write("\");\r\n\t\t\t\t</script>\r\n");

			}

      out.write("\r\n\t\t</td>\r\n\t\t<td>\r\n\t\t\t");
      out.print( getFooterButton(theChip.getEventID(GenericItemSearchListChip.PREVIOUS_PAGE),
												  localized("searchlist.previous"), localized("searchlist.previous.tooltip"),
												  "images/icons/footer_previous" + (enabled ? "" : "_inactive") + ".gif",
												  null, 
												  false, 
												  enabled) );
      out.write('\r');
      out.write('\n');

			if( enabled )
			{

      out.write("\r\n\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\taddKeyEvent(String.fromCharCode(33), \"");
      out.print( theChip.getEventID(GenericItemSearchListChip.PREVIOUS_PAGE) );
      out.write("\");\r\n\t\t\t\t</script>\r\n");

			}

      out.write("\r\n\t\t</td>\r\n");

	if( ranges > 0 )
	{
		final String event = theChip.getEventID(GenericItemSearchListChip.RANGESTART);

		String tooltip;
		String imageID;
		int value;

      out.write("\r\n\t\t<td><input type=\"hidden\" name=\"");
      out.print( event );
      out.write("\" value=\"\" /></td>\r\n\r\n");
		
		for( int i = startRange; i <= ranges && i <= (startRange + 10); i++ )
		{

      out.write("\r\n\t\t\t<td>\r\n");

					if( currentRange == i )
					{

      out.write("\r\n\t\t\t\t\t\t<div style=\"font-weight:bold; font-size:9pt; width:20px; text-align:center; vertical-align:middle; ");
      out.print( isEditing ? "color:#888888;" : "" );
      out.write('"');
      out.write('>');
      out.print( i );
      out.write("</div>\r\n");

					}
					else if( !isEditing )
					{
						tooltip = localized("searchlist.goto") + " " + i;	// i18n
						
						
						imageID = event + i + "_img";
						value = rangeCount * (i - 1);

      out.write("\t\t\t\r\n\t\t\t\t\t\t\t<a href=\"#\" hidefocus=\"true\" style=\"text-decoration:none;\" alt=\"");
      out.print( tooltip );
      out.write("\"\r\n\t\t\t\t\t\t\t\tonMouseover=\"window.status='");
      out.print( tooltip );
      out.write("'; document.getElementById('");
      out.print( imageID + "_bg_left" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_l.gif)'; document.getElementById('");
      out.print( imageID + "_bg_middle" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_m.gif)'; document.getElementById('");
      out.print( imageID + "_bg_right" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_r.gif)'; return true;\"\r\n\t\t\t\t\t\t\t\tonMouseout=\"window.status='");
      out.print( tooltip );
      out.write("'; document.getElementById('");
      out.print( imageID + "_bg_left" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_l.gif)'; document.getElementById('");
      out.print( imageID + "_bg_middle" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_m.gif)'; document.getElementById('");
      out.print( imageID + "_bg_right" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_r.gif)'; return true;\"\r\n\t\t\t\t\t\t\t\tonFocus=\"window.status='");
      out.print( tooltip );
      out.write("'; document.getElementById('");
      out.print( imageID + "_bg_left" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_l.gif)'; document.getElementById('");
      out.print( imageID + "_bg_middle" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_m.gif)'; document.getElementById('");
      out.print( imageID + "_bg_right" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_hover_r.gif)'; return true;\"\r\n\t\t\t\t\t\t\t\tonBlur=\"window.status='");
      out.print( tooltip );
      out.write("'; document.getElementById('");
      out.print( imageID + "_bg_left" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_l.gif)'; document.getElementById('");
      out.print( imageID + "_bg_middle" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_m.gif)'; document.getElementById('");
      out.print( imageID + "_bg_right" );
      out.write("').style.backgroundImage = 'url(images/icons/footer_background_r.gif)'; return true;\"\r\n\t\t\t\t\t\t\t\tonclick=\"document.editorForm.elements['");
      out.print( event );
      out.write("'].value = ");
      out.print( value );
      out.write("; setScrollAndSubmit(); return false;\"\r\n\t\t\t\t\t\t\t\t>\r\n\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<table style=\"vertical-align:middle; height:23px;\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t<td id=\"");
      out.print( imageID + "_bg_left" );
      out.write("\" style=\"width:3px;vertical-align:middle;\" background=\"images/icons/footer_background_l.gif\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t<td id=\"");
      out.print( imageID + "_bg_middle" );
      out.write("\" style=\"white-space:nowrap; vertical-align:middle; text-align:center;\" background=\"images/icons/footer_background_m.gif\">\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t<div style=\"font-size:8pt; text-align:center; margin-top: 1px; width:");
      out.print( i<100 ? "10" : "18" );
      out.write("px;\" title=\"");
      out.print( tooltip );
      out.write('"');
      out.write('>');
      out.print( i );
      out.write("</div>\r\n\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t<td id=\"");
      out.print( imageID + "_bg_right" );
      out.write("\" style=\"width:3px;vertical-align:middle;\" background=\"images/icons/footer_background_r.gif\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t</td>\r\n");

					}
					else
					{

      out.write("\r\n\t\t\t\t\t\t<div class=\"disabled\" style=\"height:23px; width:15px;\">");
      out.print( i );
      out.write("</div>\r\n");

					}

      out.write("\r\n\t\t\t</td>\r\n");

		}
	}
	enabled = (theChip.getRangeStart() + theChip.getListEntryCount()) < totalCount && !isEditing;

      out.write("\r\n\t\t<td>\r\n\t\t\t");
      out.print( getFooterButton(theChip.getEventID(GenericItemSearchListChip.NEXT_PAGE),
												  localized("searchlist.next"), localized("searchlist.next.tooltip"),
												  "images/icons/footer_next" + (enabled ? "" : "_inactive") + ".gif",
												  null, 
												  false, 
												  enabled) );
      out.write('\r');
      out.write('\n');

			if( enabled )
			{

      out.write("\r\n\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\taddKeyEvent(String.fromCharCode(34), \"");
      out.print( theChip.getEventID(GenericItemSearchListChip.NEXT_PAGE) );
      out.write("\");\r\n\t\t\t\t</script>\r\n");

			}

      out.write("\r\n\t\t</td>\r\n\t\t<td>&nbsp;</td>\r\n\t\t<td>\r\n\t\t\t");
      out.print( getFooterButton(theChip.getEventID(GenericItemSearchListChip.LAST_PAGE),
												  localized("searchlist.last"), localized("searchlist.last.tooltip"),
												  "images/icons/footer_last" + (enabled ? "" : "_inactive") + ".gif",
												  null, 
												  false, 
												  enabled) );
      out.write('\r');
      out.write('\n');

			if( enabled )
			{

      out.write("\r\n\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\t\taddKeyEvent(\"L\", \"");
      out.print( theChip.getEventID(GenericItemSearchListChip.LAST_PAGE) );
      out.write("\");\r\n\t\t\t\t</script>\r\n");

			}

      out.write("\r\n\t\t</td>\r\n\t\t<td align=\"right\" valign=\"bottom\" width=\"7px\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t</tr>\r\n</table>\r\n\r\n");
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- end: searchListChipRange.inc -->");
 } 
      out.write('\r');
      out.write('\n');
      out.write("</th>\r\n\r\n");

				if (theChip.isEditing() && theChip.getSearchableColumns().size()>0)
				{

      out.write("\r\n\t\t\t\t\t\t<div class=\"isEditing\" align=\"center\">\r\n\t\t\t\t\t\t\t<table class=\"isEditing\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t<tr class=\"rowToolbar\">\r\n\t\t\t\t\t\t\t\t\t<td>\r\n\t\t\t\t\t\t\t\t\t\t<table cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td colspan=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t<table class=\"toolbar\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/bluebar_corner_small_ul.gif\" border=\"0\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"middleBlue\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/bluebar_corner_small_ur.gif\" border=\"0\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t\t<tr class=\"tabRow\">\r\n");

												for (int i=0; i<theChip.getOperationChips().length; i++)
												{
													NamedChip chip = theChip.getOperationChips()[i];
													boolean active = chip.equals(theChip.getActiveOperationChip());
													if (active)
													{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"editortab_active\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/editortab_left.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topMiddle\">");
      out.print( localized(chip.getName()) );
      out.write("</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/editortab_right.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");

													}
													else
													{

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"editortab\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/editortab_left.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topMiddle\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"chip-event\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<a href=\"#\" title=\"");
      out.print( localized(chip.getName()) );
      out.write("\" hidefocus=\"true\" class=\"editortab\"\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tname=\"");
      out.print( chip.getCommandID(ListOperationChip.SELECT) );
      out.write("\" id=\"");
      out.print( chip.getUniqueName() );
      out.write("_tab\">\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print( localized(chip.getName()) );
      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</a>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"topCorner\"><img src=\"images/editortab_right.gif\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\r\n");

													}
												}

      out.write("\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"tabRowRest\">&nbsp;</td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t<td class=\"rowContent\">\r\n");

											theChip.getActiveOperationChip().render(pageContext);

      out.write("\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\r\n\t\t\t\t\t\t\t\t<tr class=\"rowFooter\">\r\n\t\t\t\t\t\t\t\t\t<td colspan=\"20\">\r\n\t\t\t\t\t\t\t\t\t\t<table class=\"footer\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"bottomCorner\"><img src=\"images/editortab_corner_bl.gif\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"middle\"></td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"bottomCorner\"><img src=\"images/editortab_corner_br.gif\"/></td>\r\n\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t</div>\r\n");

				}

      out.write("\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n<script language=\"JavaScript1.2\">\r\n\taddKeyFunction(\"A\", function() { setEvent(\"");
      out.print( theChip.getEventID(GenericItemListChip.SELECT_VISIBLE) );
      out.write("\"); setScrollAndSubmit(); return false;});\r\n</script>\r\n");
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
