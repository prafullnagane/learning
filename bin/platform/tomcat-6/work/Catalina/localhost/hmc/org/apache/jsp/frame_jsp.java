package org.apache.jsp;

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

public final class frame_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.add("/head.inc");
    _jspx_dependants.add("/js/eventHandler.inc");
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

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n\r\n");
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


      out.write('\r');
      out.write('\n');

	Frame theChip = (Frame)request.getAttribute(AbstractChip.CHIP_KEY);
	Chip mainChip = theChip.getMainChip();
	boolean developerMode = ConfigConstants.getInstance().DEVELOPERMODE;

	String title = "";
	String bodyBackground = "#d3d3d8";		// default background color

	if( theChip instanceof Window )
	{
		title = ((Window)theChip).getName();
		if( ((Window)theChip).getBackgroundColor() != null )
	bodyBackground = ((Window)theChip).getBackgroundColor();
	}
	if( mainChip instanceof ExplorerChip )
	{
		if( ((ExplorerChip)mainChip).getTitle() != null )
		{
	title = title + ": " + ((ExplorerChip)mainChip).getTitle();
		}
	}

	boolean chipIsModal = mainChip.getClass().getName().substring(mainChip.getClass().getName().lastIndexOf('.')+1).startsWith("Modal");
	boolean isModalMediaUpload = mainChip.getClass().getName().substring(mainChip.getClass().getName().lastIndexOf('.')+1).startsWith("ModalMedia");

      out.write("\r\n\r\n\r\n\r\n\r\n<html>\r\n\t<head>\r\n\t\t<title>");
      out.print(title);
      out.write(" - hybris Management Console (hMC)</title>\r\n\t\t<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"/hmc/favicon.ico\">\r\n\t\t<meta http-equiv=\"expires\" content=\"-1\"/>\r\n\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\"/>\r\n\t\t<meta http-equiv=\"pragma\" content=\"no-cache\"/>\r\n\r\n\t<!-- hmc css styles -->\r\n\t\t<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"css/hmc.css\"/>\r\n\r\n\r\n\t<!-- third party javascript libs -->\r\n\r\n\t\t<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"js/hmc.js\"></script>\r\n\r\n\t<!-- date picker (third party, but heavily customized) -->\r\n\t\t<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"js/date.js\"></script>\r\n\t\t<script type=\"text/javascript\" language=\"JavaScript1.2\" src=\"js/calendar.js\"></script>\r\n\r\n\t\t");
 
	if( DEBUG_COMMENTS ) { 
      out.write("<!-- start: js/eventHandler.inc -->");
 }
	
	for( final Iterator events = theDisplayState.getWindowEvents().iterator(); events.hasNext(); )
	{
		WindowEvent event = (WindowEvent) events.next();
		if( event instanceof WindowOpenEvent )
		{
			WindowOpenEvent woe = (WindowOpenEvent) event;
			String name = woe.getWindowName();
			String id = woe.getFrame().getID();
			String strToolbar = "";
						
			if( woe.isShowToolbar() )
			{
				strToolbar = ",toolbar=yes";
			}
			if( woe.isMaximized() )
			{

      out.write("\r\n\t\t\t\t<script language = \"JavaScript1.2\">\r\n\t\t\t\t\tvar width = screen.availWidth;\r\n\t\t\t\t\tvar height = screen.availHeight;\r\n\t\t\t\t\tvar x = 0;\r\n\t\t\t\t\tvar y = 0;\r\n\t\t\t\t\tvar newWindow = window.open(\"");
      out.print( getWindowRequestURL(id) );
      out.write('"');
      out.write(',');
      out.write('"');
      out.print( name );
      out.write("\", \"height=\" + height + \",width=\" + width + \",status=yes,dependent=no,scrollbars=yes");
      out.print( strToolbar );
      out.write(",resizable=yes,directories=no,screenX=\" + x + \",screenY=\" + y);\r\n\t\t\t\t\tnewWindow.focus();\t\t\t\t\t\r\n\t\t\t\t\tnewWindow.moveTo(0,0);\r\n\t\t\t\t\tnewWindow.resizeTo(screen.availWidth,screen.availHeight);\r\n\t\t\t\t</script>\r\n");

			}
			else
			{

      out.write("\r\n\t\t\t\t<script language = \"JavaScript1.2\">\r\n\r\n\t\t\t\t\t\tif( ");
      out.print( woe.isPercentage() );
      out.write(" )\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\t// interpret 'width' as percentage\r\n\t\t\t\t\t\t\tvar height = screen.availHeight * ");
      out.print( woe.getWidth() );
      out.write(" / 100;\r\n\t\t\t\t\t\t\tvar width = screen.availWidth * ");
      out.print( woe.getWidth() );
      out.write(" / 100;\r\n\t\t\t\t\t\t}\r\n\t\t\t\t\t\telse\r\n\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\tvar height = ");
      out.print( woe.getHeight() );
      out.write(";\r\n\t\t\t\t\t\t\tvar width = ");
      out.print( woe.getWidth() );
      out.write(";\r\n\t\t\t\t\t\t}\t\t\t\t\t\t\r\n");

						if( woe.getXOffset() > -1 || woe.getYOffset() > -1 )
						{
							// relative window positioning
							final int xOffset = woe.getXOffset() > -1 ? woe.getXOffset() : 0;
							final int yOffset = woe.getYOffset() > -1 ? woe.getYOffset() : 0;

      out.write("\r\n\t\t\t\t\t\t\tvar currentX, currentY;\t\t// get current window position\r\n\t\t\t\t\t\t\tif( ie5 )\r\n\t\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\t\t// little trick to get current window position in ie\r\n\t\t\t\t\t\t\t\tx0 = window.screenLeft;\r\n\t\t\t\t\t\t\t\ty0 = window.screenTop;\r\n\t\t\t\t\t\t\t\twindow.moveTo(0,0);\r\n\t\t\t\t\t\t\t\tcurrentX = x0 - window.screenLeft;\r\n\t\t\t\t\t\t\t\tcurrentY = y0 - window.screenTop;\r\n\t\t\t\t\t\t\t\twindow.moveTo(currentX, currentY);\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\telse\r\n\t\t\t\t\t\t\t{\r\n\t\t\t\t\t\t\t\t// easier in mozilla etc.\r\n\t\t\t\t\t\t\t\tcurrentX = window.screenX;\r\n\t\t\t\t\t\t\t\tcurrentY = window.screenY;\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\tx = currentX + ");
      out.print( xOffset );
      out.write(";\r\n\t\t\t\t\t\t\ty = currentY + ");
      out.print( yOffset );
      out.write(';');
      out.write('\r');
      out.write('\n');

						}
						else
						{
							// center window positioning

      out.write("\r\n\t\t\t\t\t\t\tx = (screen.width / 2) - (width / 2);\r\n\t\t\t\t\t\t\ty = (screen.height / 2) - (height / 2);\r\n");

						}

      out.write("\r\n\t\t\t\t\tvar newWindow = window.open(\"");
      out.print( getWindowRequestURL(id) );
      out.write('"');
      out.write(',');
      out.write('"');
      out.print( name );
      out.write("\", \"height=\" + height +\",width=\" + width +\",status=yes,dependent=no,scrollbars=yes");
      out.print( strToolbar );
      out.write(",resizable=yes,directories=no,left=\" + x + \",top=\" + y, true);\r\n\t\t\t\t\tnewWindow.focus();\r\n\t\t\t\t</script>\r\n");

			}
			events.remove();
		}
		if( event instanceof WindowRedirectEvent )
		{
			WindowRedirectEvent wre = (WindowRedirectEvent) event;
			if( wre.getFrame() == frame )
			{

      out.write("\r\n\t\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\t\twindow.location.href = \"");
      out.print(response.encodeRedirectURL(wre.getRedirectURL()));
      out.write("\";\r\n\t\t\t\t</script>\r\n");

				events.remove();
				return;
			}
		}
		if( event instanceof WindowRefreshEvent )
		{
			WindowRefreshEvent wre = (WindowRefreshEvent) event;
			String name = wre.getWindowName();
			String id = wre.getFrame().getID();

      out.write("\r\n\t\t\t<script language = \"JavaScript1.2\">\r\n\t\t\t\twindow.open(\"");
      out.print( getWindowRequestURL(id) );
      out.write("\", \"");
      out.print( name );
      out.write("\", \"\");\r\n\t\t\t</script>\r\n");

			events.remove();
		}
		if( event instanceof FrameRefreshEvent )
		{
			FrameRefreshEvent fre = (FrameRefreshEvent) event;
			String name = fre.getWindowName();
			String id = fre.getFrame().getID();

      out.write("\r\n\t\t\t\t<script language = \"JavaScript1.2\">\r\n\t\t\t\t\t");
      out.print( name );
      out.write(".frames['");
      out.print( id );
      out.write("'].document.location=\"");
      out.print( getWindowRequestURL(id) );
      out.write("\";\r\n\t\t\t\t</script>\r\n");

			events.remove();
		}
		if( event instanceof ExternalFrameEvent )
		{
			ExternalFrameEvent efe = (ExternalFrameEvent) event;
			String name = efe.getFrameName();
			String id = efe.getFrame().getID();
			String url = efe.getURL();

      out.write("\r\n\t\t\t<script language = \"JavaScript1.2\">\r\n\t\t\t\t");
      out.print( name );
      out.write(".frames['");
      out.print( id );
      out.write("'].document.location=\"");
      out.print( url );
      out.write("\";\r\n\t\t\t</script>\r\n");

			events.remove();
		}
		if( event instanceof WindowCloseEvent )
		{
			WindowCloseEvent wce = (WindowCloseEvent) event;
			if( wce.getFrame() == frame )
			{

      out.write("\r\n\t\t\t\t<script language = \"JavaScript1.2\">\r\n\t\t\t\t\twindow.close();\r\n\t\t\t\t</script>\r\n");

			}
			events.remove();
			return;
		}
	}

	if( DEBUG_COMMENTS ) { 
      out.write("<!-- end: js/eventHandler.inc -->");
 }

      out.write("\r\n\r\n\r\n\r\n\r\n");
      out.write("\r\n\r\n\r\n\t</head>\r\n\t<body style=\"cursor:default\" bgcolor=\"");
      out.print( bodyBackground );
      out.write("\" leftmargin=\"0\" topmargin=\"0\"\r\n\t\t\tmarginheight=\"0\" marginwidth=\"0\" style=\"height:100%\"\r\n\t\t\tonkeydown=\"if(checkForF5(event)) { exit = false; }\">\r\n\r\n");
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- outer table start (containing the whole page) -->");
 } 
      out.write("\r\n\r\n\t\t<form action=\"");
      out.print( getRequestURL() );
      out.write("\" method=\"post\" onsubmit=\"\" name=\"editorForm\">\r\n\t\t<table style=\"height:100%; width: 100%; white-space:nowrap;\" width=\"100%\" height=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" >\r\n");

			if( theChip.displayHeader() )
			{

      out.write('\r');
      out.write('\n');
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- header (containing hybris platform logo) -->");
 } 
      out.write("\r\n\t\t\t\t<tr class=\"page-header\">\r\n\t\t\t\t\t<td class=\"page-header-left\">&nbsp;&nbsp;");
      out.print(title);
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>\r\n\t\t\t\t\t<td align=\"right\" valign=\"top\" class=\"page-header-right\"><img src=\"css/src/images/y_logo_platform.gif\" border=\"0\" name=\"logo\"></td>\r\n\t\t\t\t</tr>\r\n");

			}

      out.write("\r\n\r\n");
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- top border -->");
 } 
      out.write('\r');
      out.write('\n');

			String bgStyle = (chipIsModal ? (mainChip instanceof ItemChip ? "background-color:"+bodyBackground+";" : "background-color:#f2f2f5;") : "");

      out.write("\r\n\t\t\t<tr style=\"vertical-align:top; ");
      out.print( bgStyle );
      out.write("\">\r\n");

				if( theChip.displayHeader() )
				{

      out.write("\r\n\t\t\t\t\t\r\n");

				}

      out.write("\r\n\t\t\t\t<td id=\"outerTD\" colspan=\"2\" style=\"vertical-align:top; white-space:nowrap;\">\r\n");

					if( theChip.hasSystemMessage() )
					{

      out.write("\r\n\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" style=\"width:100%;\">\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td style=\"padding: 2px; text-align:center;\">\r\n\t\t\t\t\t\t\t\t\t<div style=\"border:2px solid #c00000; font-weight:bold;\">\r\n\t\t\t\t\t\t\t\t\t\t");
      out.print( theChip.getSystemMessage() );
      out.write("\r\n\t\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t\t\t<td>\r\n");

					}

					if( chipIsModal )
					{
						// additional top red border

      out.write("\r\n\t\t\t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\" style=\"width:100%;\">\r\n\t\t\t\t\t\t\t<tr style=\"height:7px; vertical-align:top; font-size:1pt;\">\r\n\t\t\t\t\t\t\t\t<td> </td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t\t<tr style=\"vertical-align:top;\">\r\n\t\t\t\t\t\t\t\t<td style=\"padding:5px;\">\r\n\t\t\t\t\t\t\t\t");
      out.write('\r');
      out.write('\n');

					}
					mainChip.render(pageContext);

					if( theChip.hasSystemMessage() )
					{

      out.write("\r\n\t\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n");

					}

      out.write("\r\n\t\t<!-- script for adding invisible input elements for registered key events (to override internet explorer shortcut keys) -->\r\n\t\t\t<script language=\"JavaScript1.2\">\r\n\t\t\t\tif( ie5 )\r\n\t\t\t\t{\r\n\t\t\t\t\t// overriding explorer access keys\r\n\t\t\t\t\tfor( var i = 0; i < accessKeys.length; i++ )\r\n\t\t\t\t\t{\r\n\t\t\t\t\t\tdocument.write('<input name=\"keymapping_' + accessKeys[i] + '\" accesskey=\"' + accessKeys[i] + '\" style=\"width:0px; height:0px;\"/>');\r\n\t\t\t\t\t}\r\n\t\t\t\t}\r\n\t\t\t</script>\r\n\r\n\t\t\t</td>\r\n");

			if( chipIsModal )
			{

      out.write("\r\n\t\t\t\t\t\t\t");
      out.write("\r\n\t\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t\t</table>\r\n");

			}
			if( theChip.displayHeader() )
			{

      out.write("\r\n\t\t\t\t\r\n");

			}

      out.write("\r\n\t\t\t</tr>\r\n");

			if( !chipIsModal )
			{

      out.write("\r\n\r\n\t\t\t<tr style=\"width:100%; height:7px;\">\r\n\t\t\t\t<td colspan=\"2\"> </td>\r\n\t\t\t</tr>\r\n");

			}

      out.write("\r\n\t\t</table>\r\n\t\t</form>\r\n\r\n\r\n");
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- outer table end -->");
 } 
      out.write("\r\n\r\n<!-- jsp & javascript code to show error and warning messages -->\r\n\t\t<script language=\"JavaScript1.2\">\r\n");

			for (final Iterator it = theDisplayState.getErrorMessages().iterator(); it.hasNext(); )
			{

      out.write("\r\n\t\t\t\ty_showErrorMessage(\"");
      out.print( (String) it.next() );
      out.write("\", \"");
      out.print( localized("popup.error.title") );
      out.write("\", \"");
      out.print( localized("popup.error.button") );
      out.write("\");\r\n");

			}
			theDisplayState.clearErrorMessages();
			for (final Iterator it = theDisplayState.getInfoMessages().iterator(); it.hasNext(); )
			{

      out.write("\r\n\t\t\t\ty_showInfoMessage(\"");
      out.print( (String) it.next() );
      out.write("\", \"");
      out.print( localized("popup.info.title") );
      out.write("\", \"");
      out.print( localized("popup.info.button") );
      out.write("\");\r\n");

			}
			theDisplayState.clearInfoMessages();

      out.write("\r\n\t\t\twindow.scrollTo(");
      out.print( theChip.getScrollX() );
      out.write(',');
      out.write(' ');
      out.print( theChip.getScrollY() );
      out.write(");\r\n\t\t\t\r\n\t\t</script>\r\n");


	class MyObjectInputStream extends ObjectInputStream
	{
		ClassLoader theClassLoader;
		
		public MyObjectInputStream(InputStream in, ClassLoader classLoader) throws IOException
		{
			super(in);
			theClassLoader = classLoader;
		}
		
		protected Class resolveClass(ObjectStreamClass objectstreamclass) throws IOException, ClassNotFoundException
		{
			String s = objectstreamclass.getName();
			return Class.forName(s, false, theClassLoader);
		}
	}

	if( false && Config.getBoolean("core.sourceavailable",false) )
	{
		boolean exception = false;
		byte[] data = null;
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bais = null;
		ObjectInputStream ois = null;
		
		ClassLoader myClassLoader = this.getClass().getClassLoader();
	
		try
		{
			// serialize jalosession		
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject( (Serializable)session.getAttribute("jalosession") );
			data = baos.toByteArray();
			oos.flush();
			oos.close();
			baos.close();
		}
		catch( Exception e )
		{
			exception = true;
			PrintWriter pw = new PrintWriter(out, true);
			out.println("Exception during jalosession serialization: <br>");
			out.println("<pre>");
			e.printStackTrace(pw); 
			out.println("</pre>");
		}
		
		
		
		if( !exception )
		{	
			try
			{
				// deserialize jalosession
				bais = new ByteArrayInputStream( data );
				ois = new MyObjectInputStream( bais, myClassLoader );
				ois.readObject();
				ois.close();
				bais.close();
				System.out.println( "JaloSession Size: "+data.length );
			}
			catch( Exception e )
			{
				exception = true;
				PrintWriter pw = new PrintWriter(out, true);
				out.println("Exception during jalosession de-serialization: <br>");
				out.println("<pre>");
				e.printStackTrace(pw); 
				out.println("</pre>");
			}
		}
			
		if( !exception )
		{	
			try
			{
				// serialize displaystate
				baos = new ByteArrayOutputStream();
				oos = new ObjectOutputStream(baos);
				oos.writeObject( (Serializable)session.getAttribute("state") );
				data = baos.toByteArray();
				oos.flush();
				oos.close();
				baos.close();
			}
			catch( Exception e )
			{
				exception = true;
				PrintWriter pw = new PrintWriter(out, true);
				out.println("Exception during displaystate serialization: <br>");
				out.println("<pre>");
				e.printStackTrace(pw); 
				out.println("</pre>");
			}
		}
	
		if( !exception )
		{	
			try
			{
				// deserialize displaystate
				bais = new ByteArrayInputStream( data );
				ois = new MyObjectInputStream( bais, myClassLoader );
				ois.readObject();
				ois.close();
				bais.close();
				System.out.println( "DisplayState Size: "+data.length );
			}
			catch( Exception e )
			{
				exception = true;
				PrintWriter pw = new PrintWriter(out, true);
				out.println("Exception during displaystate de-serialization: <br>");
				out.println("<pre>");
				e.printStackTrace(pw); 
				out.println("</pre>");
			}
		} 
	}

      out.write('\r');
      out.write('\n');
      out.print( StructureLoader.hasWarnings() ? "<!-- XYZ There are hmc type warnings!! XYZ -->" : "" );
      out.write("\r\n\t</body>\r\n</html>\r\n");
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
