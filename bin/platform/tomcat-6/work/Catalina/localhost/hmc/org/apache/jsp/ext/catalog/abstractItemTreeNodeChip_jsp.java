package org.apache.jsp.ext.catalog;

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

public final class abstractItemTreeNodeChip_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/ext/catalog/../../head.inc");
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


      out.write('\r');
      out.write('\n');

	final AbstractItemTreeNodeChip theChip = (AbstractItemTreeNodeChip)request.getAttribute(AbstractChip.CHIP_KEY);

      out.write("\r\n<input type=\"hidden\" name=\"");
      out.print(theChip.getEventID(AbstractTreeNodeChip.EDIT));
      out.write("\" value=\"");
      out.print(AbstractChip.FALSE);
      out.write("\" />\r\n<table class=\"abstractItemTreeNodeChip\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n\t\t<td class=\"aitncIcon\">\r\n\t\t\t<div onclick=\"document.editorForm.elements['");
      out.print(theChip.getEventID(AbstractTreeNodeChip.EDIT));
      out.write("'].value='");
      out.print(AbstractChip.TRUE);
      out.write("';setScrollAndSubmit();\">\r\n\t\t\t\t<img src=\"");
      out.print(theChip.getIcon());
      out.write("\" border=\"0\">\r\n\t\t\t</div>\r\n\t\t</td>\r\n\t\t<td class=\"aitncName\">\r\n\t\t\t<div onclick=\"document.editorForm.elements['");
      out.print(theChip.getEventID(AbstractTreeNodeChip.EDIT));
      out.write("'].value='");
      out.print(AbstractChip.TRUE);
      out.write("';setScrollAndSubmit();\">\r\n\t\t\t\t");
      out.print(theChip.getName());
      out.write("\r\n\t\t\t</div>\r\n\t\t</td>\r\n\t</tr>\r\n\t");

		if( theChip.isExpanded() )
		{
			for( final Iterator it = theChip.getAllChildren().iterator(); it.hasNext(); )
			{
				final AbstractTreeNodeChip child = (AbstractTreeNodeChip)it.next();
				
      out.write("\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td class=\"aitncTreeIMG\" background=\"");
      out.print(it.hasNext() ? "images/vert.gif" : "");
      out.write("\">\r\n\t\t\t\t\t\t\t");

								if( child.hasChildren() )
								{
									if( child.isExpanded() )
									{
										
      out.write("<input type=\"hidden\" name=\"");
      out.print(child.getEventID( AbstractTreeNodeChip.COLLAPSE ));
      out.write("\" value=\"");
      out.print(AbstractChip.FALSE);
      out.write("\" /><div onclick=\"document.editorForm.elements['");
      out.print(child.getEventID(AbstractTreeNodeChip.COLLAPSE ));
      out.write("'].value='");
      out.print(AbstractChip.TRUE);
      out.write("';setScrollAndSubmit();\">");

										if (it.hasNext())
										{
											
      out.write("<img src=\"images/minus.gif\"></td>");

										}
										else
										{
											
      out.write("<img src=\"images/minusend.gif\"></td>");

										}
										
      out.write("</div>");

									}
									else
									{
										
      out.write("<input type=\"hidden\" name=\"");
      out.print(child.getEventID(AbstractTreeNodeChip.EXPAND));
      out.write("\" value=\"");
      out.print(AbstractChip.FALSE);
      out.write("\" /><div onclick=\"document.editorForm.elements['");
      out.print(child.getEventID(AbstractTreeNodeChip.EXPAND));
      out.write("'].value='");
      out.print(AbstractChip.TRUE);
      out.write("';setScrollAndSubmit();\">");

										if (it.hasNext())
										{
											
      out.write("<img src=\"images/plus.gif\"></td>");

										}
										else
										{
											
      out.write("<img src=\"images/plusend.gif\"></td>");

										}
										
      out.write("</div>");

									}
								}
								else
								{
									if (it.hasNext())
									{
										
      out.write("<img src=\"images/horiz.gif\"></td>");

									}
									else
									{
										
      out.write("<img src=\"images/end.gif\"></td>");

									}
								}
							
      out.write("\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td class=\"aitncContext\">");
 child.render(pageContext); 
      out.write("</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t");

			}
		}
	
      out.write("\r\n</table>\r\n");
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