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
import java.util.Iterator;
import de.hybris.platform.hmc.webchips.*;

public final class featureList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.add("/head.inc");
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

	de.hybris.platform.licence.Licence licence = de.hybris.platform.licence.DefaultLicence.getDefaultLicence();

      out.write("\r\n\r\n<table style=\"height:100%\" >\r\n<!--\r\n\t<tr align=\"center\">\r\n\t\t<td style=\"font-size:large\" valign=\"middle\" style=\"height:100%;\">\r\n\t\t\tHier muss noch Content hin! Produktname, Version, Copyright, <a target=\"_hybris\" href=\"http://www.hybris.de/\">Link zu hybris</a>, Statusinformationen, ... &nbsp;\r\n\t\t</td>\r\n\t</tr>\r\n-->\r\n\t<tr align=\"left\">\r\n\t\t<td style=\"width:30px\">&nbsp;</td>\r\n\t\t<td>\r\n\t\t\r\n\t\t</td>\r\n\t\t<td style=\"\" valign=\"top\">\r\n\t\t\t<table>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\">&nbsp;</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\"><img src=\"images/hybris_hep_logo.gif\"><br><br></td>\t\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\">&copy; 1999-2010 <a target=\"_hybris\" href=\"http://www.hybris.de/\">hybris</a></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"2\">happy easter & thanks to all.</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t<td>\r\n\r\n<script type=\"text/javascript\" language=\"JavaScript\">\r\nfunction gc(n){dc=document.cookie;p=n+\"=\";b=dc.indexOf(\"; \"+p);if(b==-1){b=dc.indexOf(p);if(b)return 0;}else b+=2;e=dc.indexOf(\";\",b);if(e==-1)e=dc.length;return unescape(dc.substring(b+p.length,e));}if((navigator.appName!=\"Netscape\")||(parseInt(navigator.appVersion)>4)){x=gc(\"css\");if((!x)||(x!=\"off\"))document.write(\"<link rel=\\\"stylesheet\\\" type=\\\"text/css\\\" href=\\\"../default.css\\\">\");}\r\n");
      out.write("pimg=new Array();i=new Array(\"b\",\"bb1\",\"bb2\",\"bb3\",\"bb4\",\"bb5\",\"bb6\",\"bw1\",\"bw2\",\"bw3\",\"bw4\",\"bw5\",\"bw6\",\"l\",\"r\",\"sbb1\",\"sbb2\",\"sbb3\",\"sbb4\",\"sbb5\",\"sbb6\",\"sbw1\",\"sbw2\",\"sbw3\",\"sbw4\",\"sbw5\",\"sbw6\",\"swb1\",\"swb2\",\"swb3\",\"swb4\",\"swb5\",\"swb6\",\"sww1\",\"sww2\",\"sww3\",\"sww4\",\"sww5\",\"sww6\",\"t\",\"u\",\"w\",\"wb1\",\"wb2\",\"wb3\",\"wb4\",\"wb5\",\"wb6\",\"ww1\",\"ww2\",\"ww3\",\"ww4\",\"ww5\",\"ww6\");for(j=0;j<i.length;++j){pimg[j]=new Image();pimg[j].src=\"images/feature/\"+i[j]+\".png\";}\r\nN=1;K=\"\";F=px=py=0;function sm(i){if(N>120)return;var j=\"abcdefgh\";if(N&1){if(N<19)K+=\" \";K+=(1+N>>1)+\". \";}else K+=\"   \";if(i.f==3)K+=\"o-o  \";else if(i.f==5)K+=\"o-o-o\";else K+=j.charAt(i.x)+(8-i.y)+\" \"+j.charAt(i.X)+(8-i.Y);if(++N&1)K+=\"\\n\";document.getElementById(\"m\"+Math.floor((N-2)/20)).innerHTML=\"<pre>\"+K+\"</pre>\";if(!((N-1)%20))K=\"\";}function un(u,b){for(var i=u.x.length-1;i>=0;--i)Z(b,u.x[i],u.y[i],u.p[i]);}function au(u,b,x,y){u.x.push(x);u.y.push(y);u.p.push(b[x+y*8]);}function st(x){document.getElementById(\"i\").innerHTML=x;}function P(x,y,X,Y,f){this.x=x;this.y=y;this.X=X;this.Y=Y;this.f=f;}function U(){this.x=[];this.y=[];this.p=[];}function em(b,x,y){return !b[x+y*8];}function ge(b,x,y){return b[x+y*8]&7;}function co(b,x,y){return b[x+y*8]&192;}function sa(b,x,y,c){var i=b[x+y*8];return i&&(i&c);}function op(b,x,y,c){var i=b[x+y*8];return i&&!(i&c);}function mo(b,x,y){var i=b[x+y*8];return i&&(i&32);}function la(b,x,y){var i=b[x+y*8];return i&&(i&16);}function ra(x,y){return x>=0&&x<8&&y>=0&&y<8;}function di(c){return c==64?-1:1;}function Z(b,x,y,p){b[x+y*8]=p;return b;}function t(b,x,y,i,j,c,l){var X=x;var Y=y;while(ra(X+=i,Y+=j)&&em(b,X,Y))l.push(new P(x,y,X,Y,0));if(ra(X,Y)&&op(b,X,Y,c))l.push(new P(x,y,X,Y,0));return l;}function ro(b,x,y,c,l){t(b,x,y,1,0,c,t(b,x,y,-1,0,c,t(b,x,y,0,1,c,t(b,x,y,0,-1,c,l))));}function bi(b,x,y,c,l){t(b,x,y,1,1,c,t(b,x,y,-1,-1,c,t(b,x,y,1,-1,c,t(b,x,y,-1,1,c,l))));}function ki(b,x,y,c,l){for(var i=-1;i<2;++i)for(var j=-1;j<2;++j){var X=x+i;var Y=y+j;if((X||Y)&&ra(X,Y)&&!sa(b,X,Y,c))l.push(new P(x,y,X,Y,0));}if(!mo(b,x,y))if(em(b,5,y)&&em(b,6,y)&&!em(b,7,y)&&!mo(b,7,y)){var u=new U();au(u,b,x,y);Z(b,x,y,0);var i=fi(b,c^192);var j=0;var X=-1;while(!j&&++X!=i.length)j=i[X].Y==y&&i[X].X==5;if(!j)l.push(new P(x,y,6,y,3));un(u,b);}else if(em(b,3,y)&&em(b,2,y)&&em(b,1,y)&&!em(b,0,y)&&!mo(b,0,y)){var u=new U();au(u,b,x,y);Z(b,x,y,0);var i=fi(b,c^192);var j=0;var X=-1;while(!j&&++X!=i.length)j=i[X].Y==y&&i[X].X==3;if(!j)l.push(new P(x,y,2,y,5));un(u,b);}}function kn(b,x,y,c,l){for(var i=-2;i<3;++i)for(var j=-2;j<3;++j)if(Math.abs(i)+Math.abs(j)==3){var X=x+i;var Y=y+j;if(ra(X,Y)&&!sa(b,X,Y,c))l.push(new P(x,y,X,Y,0));}}function pa(b,x,y,c,l){var Y=y+di(c);var Z=y+di(c)*2;if(!mo(b,x,y)&&em(b,x,Y)&&em(b,x,Z))l.push(new P(x,y,x,Z,2));if(em(b,x,Y)){if(!Y||Y==7)l.push(new P(x,y,x,Y,4));else l.push(new P(x,y,x,Y,0));}for(var i=-1;i<2;i+=2){var X=x+i;if(ra(X,Y)){if(op(b,X,Y,c)){if(!Y||Y==7)l.push(new P(x,y,X,Y,4));else l.push(new P(x,y,X,Y,0));}else if(em(b,X,Y)&&la(b,X,Y-di(c)))l.push(new P(x,y,X,Y,1));}}}function d(b){for(var y=0;y<8;++y)for(var x=0;x<8;++x){var i=\"<img src=\\\"images/feature/\";if(F==1&&x==px&&y==py)i+=\"s\";i+=(x+y&1)?\"b\":\"w\";if(!em(b,x,y))i+=(sa(b,x,y,64)?\"w\":\"b\")+(ge(b,x,y)&7);document.getElementById(\"\"+x+y).innerHTML=i+\".png\\\">\";}}function ma(b,m){u=new U();for(var x=0;x<8;++x)for(var y=0;y<8;++y)if(la(b,x,y)){au(u,b,x,y);Z(b,x,y,ge(b,x,y)|co(b,x,y)|mo(b,x,y));}au(u,b,m.X,m.Y);if(m.f==4)Z(b,m.X,m.Y,37|co(b,m.x,m.y));else Z(b,m.X,m.Y,ge(b,m.x,m.y)|co(b,m.x,m.y)|32|(m.f==2?16:0));au(u,b,m.x,m.y);Z(b,m.x,m.y,0);if(m.f==1){au(u,b,m.X,m.Y-di(c));Z(b,m.X,m.Y-di(c),0);}else if(m.f==3){au(u,b,5,m.y);au(u,b,7,m.y);Z(Z(b,5,m.y,ge(b,7,m.y)|co(b,7,m.y)|32),7,m.y,0);}else if(m.f==5){au(u,b,3,m.y);au(u,b,0,m.y);Z(Z(b,3,m.y,ge(b,0,m.y)|co(b,0,m.y)|32),0,m.y,0);}return u;}function fi(b,c){var l=[];for(var x=0;x<8;++x)for(var y=0;y<8;++y)if(sa(b,x,y,c)){var i=ge(b,x,y);if(i==1)pa(b,x,y,c,l);else if(i==2)kn(b,x,y,c,l);else if(i==3)bi(b,x,y,c,l);else if(i==4)ro(b,x,y,c,l);else if(i==5){bi(b,x,y,c,l);ro(b,x,y,c,l)}else if(i==6)ki(b,x,y,c,l);}for(var i=0;i<l.length/3;++i){var j=Math.floor(Math.random()*l.length);var k=Math.floor(Math.random()*l.length);var x=l[j];l[j]=l[k];l[k]=x;}return l;}var Sp=[0,60,370,370,450,1000,5000];var Sb=[[0,0,0,0,0,0,0,0,2,3,4,0,0,4,3,2,4,6,12,12,12,4,6,4,4,7,18,25,25,16,7,4,6,11,18,27,27,16,11,6,10,15,24,32,32,24,15,10,10,15,24,32,32,24,15,10,0,0,0,0,0,0,0,0],[-7,-3,1,3,3,1,-3,-7,2,6,14,20,20,14,6,2,6,14,22,26,26,22,14,6,8,18,26,30,30,26,18,8,8,18,30,32,32,30,18,8,6,14,28,32,32,28,14,6,2,6,14,20,20,14,6,2,-7,-3,1,3,3,1,-3,-7],[16,16,16,16,16,16,16,16,26,29,31,31,31,31,29,26,26,28,32,32,32,32,28,26,16,26,32,32,32,32,26,16,16,26,32,32,32,32,26,16,16,28,32,32,32,32,28,16,16,29,31,31,31,31,29,16,16,16,16,16,16,16,16,16],[0,0,0,3,3,0,0,0,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0,-2,10,10,10,10,10,10,10,10,0,0,0,0,0,0,0,0],[-2,-2,-2,0,0,-2,-2,-2,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,0,0,0,2,2,0,0,0,0,0,0,2,2,0,0,0,-2,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0,-2,-2,0,0,0,0,0,0],[3,3,8,-12,-8,-12,10,5,0,0,-5,-5,-12,-12,-12,-12,-5,-5,-7,-15,-15,-15,-15,-15,-15,-7,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20,-20],[]];for(var x=0;x<8;++x)for(var y=0;y<8;++y)Sb[6][x+y*8]=Sb[5][(7-x)+y*8];function sc(b,c){var s=0;for(var x=0;x<8;++x)for(var y=0;y<8;++y){var i=ge(b,x,y);if(i)if(sa(b,x,y,128))s+=Sb[i==6?6:i-1][(7-x)+y*8]+Sp[i];else s-=Sb[i-1][x+(7-y)*8]+Sp[i];}return c==128?s:-s;}function cpu(){if(F!=2)return;var now = new Date();var m=fi(b,c);var bs=-99999;var ws=bs;var bm=0;var C=c^192;var kx=0;var ky=0;for(var i=0;i<m.length;++i){var u=ma(b,m[i]);if(ge(b,kx,ky)!=6||sa(b,kx,ky,C)){kx=ky=0;while(ge(b,kx,ky)!=6||sa(b,kx,ky,C))if(++kx==8){kx=0;++ky;}}var om=fi(b,C);var obs=-99999;var ows=99999;for(var j=0;j<om.length;++j){if(kx==om[j].X&&ky==om[j].Y){obs=-99999;break;}var U=ma(b,om[j]);var r=sc(b,c);un(U,b);obs=Math.max(obs,r);ows=Math.min(ows,r);if(r<ws)break;}un(u,b);if(obs>bs&&ows>ws){bs=obs;ws=ows;bm=m[i];}}ma(b,bm);sm(bm);nx();st(\"Move took \"+(new Date()-now)/1000+\" secs\");}cpw=0;cpb=1;function pw(e){cpw=e.checked;if(F<2&&cpw&&c==64){F=2;setTimeout(\"cpu()\",100);}}function pb(e){cpb=e.checked;if(F<2&&cpb&&c==128){F=2;setTimeout(\"cpu()\",100);}}function l(){b=[];for(i=0;i<8;++i)Z(Z(b,i,6,65),i,1,129);d(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(Z(b,0,0,132),1,0,130),2,0,131),3,0,133),4,0,134),5,0,131),6,0,130),7,0,132),0,7,68),1,7,66),2,7,67),3,7,69),4,7,70),5,7,67),6,7,66),7,7,68));c=64;}function hu(x,y){if(F==0){if(sa(b,x,y,c)){px=x;py=y;F=1;d(b);}}else if(F==1){if(x==px&&y==py){F=0;d(b);return;}var m=fi(b,c);for(var i=0;i<m.length;++i){if(m[i].x==px&&m[i].y==py&&m[i].X==x&&m[i].Y==y&&ge(b,x,y)!=6){var u=ma(b,m[i]);var o=fi(b,c^192);for(var j=0;j<o.length;++j)if(ge(b,o[j].X,o[j].Y)==6&&sa(b,o[j].X,o[j].Y,c)){un(u,b);st(\"Invalid move\");return;}sm(m[i]);nx();return;}}st(\"Invalid move\");}}function nx(){c^=192;F=0;d(b);for(var x=0;x<8;++x)for(var y=0;y<8;++y)if(ge(b,x,y)==6&&sa(b,x,y,c)){var kx=x;var ky=y;}var m=fi(b,c^192);var ic=0;for(var i=0;i<m.length;++i)if(m[i].X==kx&&m[i].Y==ky)ic=1;var m=fi(b,c);var cm=1;for(var i=0;i<m.length;++i){var u=ma(b,m[i]);for(var x=0;x<8;++x)for(var y=0;y<8;++y)if(ge(b,x,y)==6&&sa(b,x,y,c)){var kx=x;var ky=y;}var om=fi(b,c^192);un(u,b);var hm=0;for(var j=0;j<om.length;++j)if(om[j].X==kx&&om[j].Y==ky)hm=1;cm&=hm;}if(cm){alert((ic?\"Check\":\"Stale\")+\"mate!\");F=3;return;}if((cpw&&c==64)||(cpb&&c==128)){F=2;setTimeout(\"cpu()\",500);}}\r\n");
      out.write("</script>\r\n<table>\r\n<tr>\r\n<td>\r\n<table class=\"frame\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"><tr><td class=\"tl\"> </td><td class=\"t\"> </td><td class=\"tr\"> </td></tr><tr><td class=\"l\"> </td><td class=\"box\">\r\n<p><br><h3>chess!</h3>\r\n<input type=\"checkbox\" onClick=\"pw(this)\">CPU White</input><br>\r\n<input type=\"checkbox\" checked=\"true\" onChange=\"pb(this)\">CPU Black</input>\r\n\r\n<center><table><tr><td><img src=\"images/feature/t.png\"><br><script type=\"text/javascript\">\r\n\r\nfor(var i=0;i<8;++i){document.write(\"<img src=\\\"images/feature/l.png\\\">\");for(var j=0;j<8;++j)document.write(\"<span onclick=\\\"hu(\"+j+\",\"+i+\")\\\" id=\\\"\"+j+i+\"\\\"><img></span>\");document.write(\"<img src=\\\"images/feature/r.png\\\"><br>\");}\r\nl();\r\n\r\n</script><img src=\"images/feature/u.png\"><br></td></tr></table></center>\r\n<table><tr>\r\n<td>\r\nPromote to <select class=\"chass\" name=\"Q\">\r\n<option value=\"5\">Queen</option>\r\n<option value=\"2\">Knight</option>\r\n<option value=\"3\">Bishop</option>\r\n<option value=\"4\">Rook</option>\r\n</select>\r\n</td><td>\r\n<div id=\"i\"></div>\r\n");
      out.write("</td></tr>\r\n</table>\r\n</td><td class=\"r\"> </td></tr><tr><td class=\"bl\"> </td><td class=\"b\"> </td><td class=\"br\"> </td></tr></table>\r\n\r\n</td><td>&nbsp;</td><td valign=\"top\">\r\n\r\n\r\n<table class=\"frame\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\"><tr><td class=\"tl\"> </td><td class=\"t\"> </td><td class=\"tr\"> </td></tr><tr><td class=\"l\"> </td>\r\n\r\n<td class=\"box\">\r\n<!--<h3>Game Log</h3>-->\r\n\r\n<center><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"90%\">\r\n<tr><td width=\"33%\" valign=\"top\"><div id=\"m0\"> </div></td><td width=\"33%\" valign=\"top\"><div id=\"m1\"> </div></td><td width=\"33%\" valign=\"top\"><div id=\"m2\"> </div></td></tr><tr><td width=\"33%\" valign=\"top\"><div id=\"m3\"> </div></td><td width=\"33%\" valign=\"top\"><div id=\"m4\"> </div></td><td width=\"33%\" valign=\"top\"><div id=\"m5\"> </div></td></tr></table></center>\r\n</td><td class=\"r\"> </td></tr><tr><td class=\"bl\"> </td><td class=\"b\"> </td><td class=\"br\"> \r\n\r\n</td></tr></table>\r\n\r\n</td></tr></table>\r\n\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n");
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
