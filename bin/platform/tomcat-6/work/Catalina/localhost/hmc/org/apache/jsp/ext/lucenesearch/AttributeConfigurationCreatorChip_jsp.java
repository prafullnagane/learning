package org.apache.jsp.ext.lucenesearch;

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
import java.io.IOException;
import de.hybris.platform.lucenesearch.hmc.AttributeConfigurationCreatorChip;

public final class AttributeConfigurationCreatorChip_jsp extends org.apache.jasper.runtime.HttpJspBase
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


 	
	int buttonID = 0;

	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 * If scrolldown is true, then the window will be scrolled down to the position of this button (if possible).
	 * In condition you can provide a java script condition text which has to return true if the event is to be fired 
	 * after the button is pressed.
	 */
	String xpButtonWithCondition(String label, String event, String tooltip, boolean scrolldown, String condition)
	{
		String buttonIDString = "xpBtn_" + event + buttonID;
		String conditionText = (condition != null && condition.trim().length() > 0 ? "if("+condition+")" : "");
		
		// store current form element in currentForm (dirty, i guess)
		String output = "<script id=\"" + buttonIDString + "\" language=\"JavaScript\" type=\"text/JavaScript\">"
							 + "currentForm = getCurrentForm(document.getElementById(\"" + buttonIDString +"\"));"
							 + "</script>";

		output += "<input type=\"hidden\" name=\"" + event + "\" value=\"" + AbstractChip.FALSE + "\" />\n"
				 + "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" title=\"" + tooltip + "\">\n"
				 + "	<tr>\n"
				 + "		<td>\n"
				 + "			<a href=\"#\" hideFocus=\"true\" style=\"text-decoration:none; \" onMouseover=\"window.status='" + tooltip + "'; mOver('" + buttonIDString + "'); return true;\" " + 
					   			"onMouseout=\"window.status=''; mOut('" + buttonIDString + "'); return true;\" onMousedown=\"mClick('" + buttonIDString +"'); return true;\" " +
                  			"onMouseup=\"mOver('" + buttonIDString + "'); return true;\" onFocus=\"mFocus('" + buttonIDString + "'); return true;\" "+
					   			"onBlur=\"mBlur('" + buttonIDString + "'); return true;\" onClick=\"" + conditionText + "{mSubmit('" + buttonIDString + "', '" + event + "', " + scrolldown + ", currentForm ); return true;}\">\n"
		       + "  			<table height=\"23\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"
		       + "    				<tr>\n"
		       + "      				<td id=\"" + buttonIDString + "_left\" style=\"width:4px;\" background=\"images/btn_norm_left.gif\">&nbsp;</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_middle\" style=\"white-space:nowrap; color:#333333; vertical-align:middle;\" background=\"images/btn_norm_middle.gif\" style=\"vertical-align: middle;\">\n"
       	    + "							&nbsp; &nbsp; " + label + " &nbsp; &nbsp; \n"
		       + "						</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_right\" style=\"width:4px\" background=\"images/btn_norm_right.gif\">&nbsp;</td>\n"
		       + "    				</tr>\n"
		       + "				</table>\n"
		       + "			</a>\n"
		       + "		</td>\n"
		       + "		<td>\n"
		       + "			<input type=\"image\" src=\"images/transparent.gif\" hideFocus=\"true\" onClick=\"mClick('" + buttonIDString + "');\">\n"
		       + "		</td>\n"
		       + "	</tr>\n"
		       + "</table>\n";

		buttonID++;
		return output;
 	}

	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 * If scrolldown is true, then the window will be scrolled down to the position of this button (if possible).
	 * In confirmMessage you can provide a message text which has to be confirmed if the button is pressed.
	 */
	String xpButton(String label, String event, String tooltip, boolean scrolldown, String confirmMessage1, String confirmMessage2)
	{
		String buttonIDString = "xpBtn_" + event + buttonID;
		
		String cm = "";
		boolean message1NotEmpty = ((confirmMessage1 != null) && (confirmMessage1.length() > 0));
		boolean message2NotEmpty = ((confirmMessage2 != null) && (confirmMessage2.length() > 0));
		
		if( message1NotEmpty )
		{
			cm = "confirm('" + confirmMessage1 + "')";
		}
		if( message2NotEmpty )
		{
			if( message1NotEmpty )
				cm += " && ";
			cm += "confirm('" + confirmMessage2 + "')";
		}
		
		return xpButtonWithCondition( label, event, tooltip, scrolldown, cm );
	}

	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 * If scrolldown is true, then the window will be scrolled down to the position of this button (if possible).
	 * In confirmMessage you can provide a message text which has to be confirmed if the button is pressed.
	 */
	String xpButton(String label, String event, String tooltip, boolean scrolldown, String confirmMessage)
	{
		return xpButton(label, event, tooltip, scrolldown, confirmMessage, null);
	}
	
	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 * If scrolldown is true, then the window will be scrolled down to the position of this button (if possible).
	 */
	String xpButton(String label, String event, String tooltip, boolean scrolldown)
	{
		return xpButton(label, event, tooltip, scrolldown, null);
	}
	
	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 */
	String xpButton(String label, String event)
	{
		return xpButton(label, event, "", false);
	}
	
	/**
	 * Creates an xp-style clickbutton with the given label which triggers the given event.
	 * The label string may contain html-tags, including <img> e.g.
	 */
	String xpButton(String label, String event, String tooltip)
	{
		return xpButton(label, event, tooltip, false);
	}

	/**
	 * Creates a disabled xp-style button with the given label.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 */
	String xpButtonDisabled(String label, String tooltip)
	{
		String output = "";
		output = "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n"
				 + "	<tr>\n"
				 + "		<td>\n"
		       + "  		<table height=\"23\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" title=\"" + tooltip + "\" "
		       + "				onMouseover=\"window.status='" + tooltip + "'; return true;\" onMouseout=\"window.status=''; return true;\">\n"
		       + "    			<tr>\n"
		       + "      			<td style=\"width:4px\" background=\"images/btn_disabled_left.gif\">&nbsp;</td>\n"
		       + "					<td style=\"white-space:nowrap;\" background=\"images/btn_disabled_middle.gif\" style=\"vertical-align: middle; color:#a1a192;\">\n"
       	    + "      				&nbsp; &nbsp; " + label + " &nbsp; &nbsp; \n"
		       + "					</td>\n"
		       + "      			<td style=\"width:4px\" background=\"images/btn_disabled_right.gif\">&nbsp;</td>\n"
		       + "    			</tr>\n"
		       + "			</table>\n"
		       + "		</td>\n"
		       + "	</tr>\n"
		       + "</table>\n";

		return output;
 	}
	
	/**
	 * Creates a disabled xp-style button with the given label.
	 * The label string may contain html-tags, including <img> e.g.
	 */
	String xpButtonDisabled(String label)
	{
		return xpButtonDisabled(label, "");
	}

	/**
	 * Creates an xp-style clickbutton with the given label which uses the given url string to create an appropriate link.
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 */
	String xpButtonURL(String label, String url, String tooltip)
	{
		String buttonIDString = "xpBtn_" + buttonID;
		String output = "";
		output = "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" title=\"" + tooltip + "\">\n"
				 + "	<tr>\n"
				 + "		<td>\n"
				 + "			<a href=\"#\" hideFocus=\"true\" style=\"text-decoration:none; \" onMouseover=\"window.status='" + tooltip + "'; mOver('" + buttonIDString + "'); return true;\" " + 
					   			"onMouseout=\"window.status=''; mOut('" + buttonIDString + "'); return true;\" onMousedown=\"mClick('" + buttonIDString +"'); return true;\" " +
                  			"onMouseup=\"mOver('" + buttonIDString + "'); return true;\" onFocus=\"mFocus('" + buttonIDString + "'); return true;\" "+
					   			"onBlur=\"mBlur('" + buttonIDString + "'); return true;\" onClick=\"open_window('" + url + "', '_blank', '" + tooltip + "'); return true;\">\n"
		       + "  			<table height=\"23\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"
		       + "    				<tr>\n"
		       + "      				<td id=\"" + buttonIDString + "_left\" style=\"width:4px\" background=\"images/btn_norm_left.gif\">&nbsp;</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_middle\" style=\"white-space:nowrap;\" background=\"images/btn_norm_middle.gif\" style=\"vertical-align: middle;\">\n"
       	    + "							&nbsp; &nbsp; " + label + " &nbsp; &nbsp; \n"
		       + "						</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_right\" style=\"width:4px\" background=\"images/btn_norm_right.gif\">&nbsp;</td>\n"
		       + "    				</tr>\n"
		       + "				</table>\n"
		       + "			</a>\n"
		       + "		</td>\n"
		       + "	</tr>\n"
		       + "</table>\n";

		buttonID++;
		return output;
 	}

	/**
	 * Creates an xp-style clickbutton with the given label which uses the given parameters string to create an appropriate link.
	 * (parameters must be something like "&open=xyzPK" or "&searchtype=product&autoperform=true" etc.).
	 * The label string may contain html-tags, including <img> e.g.
	 * You can also provide a tooltip for this button.
	 */
	String xpButtonLocalLink(String label, String parameters, String tooltip)
	{
		String buttonIDString = "xpBtn_" + buttonID;
		String output = "";
		output = "<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\" title=\"" + tooltip + "\">\n"
				 + "	<tr>\n"
				 + "		<td>\n"
				 + "			<a href=\"" + "#" + "\" hideFocus=\"true\" onMouseover=\"window.status='" + tooltip + "'; mOver('" + buttonIDString + "'); return true;\" " + 
					   			"onMouseout=\"window.status=''; mOut('" + buttonIDString + "'); return true;\" onMousedown=\"mClick('" + buttonIDString +"'); return true;\" " +
                  			"onMouseup=\"mOver('" + buttonIDString + "'); return true;\" onFocus=\"mFocus('" + buttonIDString + "'); return true;\" "+
					   			"onBlur=\"mBlur('" + buttonIDString + "'); return true;\" onClick=\"window.location.href=window.location.href+'" + parameters + "'; return true;\">\n"
		       + "  			<table height=\"23\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\n"
		       + "    				<tr>\n"
		       + "      				<td id=\"" + buttonIDString + "_left\" style=\"width:4px\" background=\"images/btn_norm_left.gif\">&nbsp;</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_middle\" style=\"white-space:nowrap;\" background=\"images/btn_norm_middle.gif\" style=\"vertical-align: middle;\">\n"
       	    + "							&nbsp; &nbsp; " + label + " &nbsp; &nbsp; \n"
		       + "						</td>\n"
		       + "      				<td id=\"" + buttonIDString + "_right\" style=\"width:4px\" background=\"images/btn_norm_right.gif\">&nbsp;</td>\n"
		       + "    				</tr>\n"
		       + "				</table>\n"
		       + "			</a>\n"
		       + "		</td>\n"
		       + "	</tr>\n"
		       + "</table>\n";

		buttonID++;
		return output;
 	}

	String swapButton(String buttonName)
	{
		String output = "";
		
		output = "if(document.getElementById)\n"
			   + "{\n"
			   + "  document.getElementById(id + '_left').style.backgroundImage = 'url(images/" + buttonName + "_left.gif)';\n"
			   + "  document.getElementById(id + '_middle').style.backgroundImage = 'url(images/" + buttonName + "_middle.gif)';\n"
			   + "  document.getElementById(id + '_right').style.backgroundImage = 'url(images/" + buttonName + "_right.gif)';\n"
			   + "}\n"
			   + "else if(document.all)\n"
			   + "{\n"
			   + "  document.all.item(id + '_left').background = \"images/" + buttonName + "_left.gif\";\n"
			   + "  document.all.item(id + '_middle').background = \"images/" + buttonName + "_middle.gif\";\n"
			   + "  document.all.item(id + '_right').background = \"images/" + buttonName + "_right.gif\";\n"
			   + "}\n";
			   
		return output;
	}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/ext/lucenesearch/../../head.inc");
    _jspx_dependants.add("/ext/lucenesearch/../../xp_button.inc");
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
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- start: xp_button.inc -->");
 } 
      out.write("\r\n\r\n\r\n<script language=\"JavaScript\" type=\"text/JavaScript\">\r\n\tvar selectedID = \"\";\r\n\t\r\n\tfunction mOver(id)\r\n\t{\r\n\t\t");
      out.print( swapButton("btn_hover") );
      out.write("\r\n\t}\r\n\t\r\n\tfunction mOut(id)\r\n\t{\r\n\t\tif( id != selectedID )\r\n\t\t{\t\t\t\t\r\n\t\t\t");
      out.print( swapButton("btn_norm") );
      out.write("\r\n\t\t}\r\n\t\telse \r\n\t\t{\r\n\t\t\t");
      out.print( swapButton("btn_selected") );
      out.write("\r\n\t\t}\r\n\t}\r\n\r\n\tfunction mClick(id)\r\n\t{\r\n\t\t");
      out.print( swapButton("btn_clicked") );
      out.write("\r\n\t}\r\n\r\n\tfunction mFocus(id)\r\n\t{\r\n\t\t");
      out.print( swapButton("btn_selected") );
      out.write("\t\t\t\t\r\n\t\tselectedID = id;\r\n\t}\r\n\t\r\n\tfunction mBlur(id)\r\n\t{\r\n\t\tselectedID = \"\";\r\n\t\tmOut(id);\r\n\t}\r\n\t\r\n\tfunction mSubmit(id, event, scroll, formElement)\r\n\t{\r\n\t\tmClick(id);\r\n\t\tformElement.elements[event].value='true';\r\n//\t\tsetScroll();\r\n\t\texit = false;\r\n\t\tif( formElement.onsubmit )\r\n\t\t{\r\n\t\t\tformElement.onsubmit();\r\n\t\t}\r\n\t\tshowWaitIcon();\r\n\t\tformElement.submit();\r\n\t}\r\n\t\r\n\tfunction getCurrentForm(currentElement)\r\n\t{\r\n\t\tif( (currentElement.nodeName == \"body\") || (currentElement.nodeName == \"BODY\") )\r\n\t\t{\r\n\t\t\treturn;\r\n\t\t}\r\n\t\t\r\n\t\tif( (currentElement.nodeName == \"form\") || (currentElement.nodeName == \"FORM\") )\r\n\t\t{\r\n\t\t\treturn currentElement;\r\n\t\t}\r\n\r\n\t\treturn getCurrentForm(currentElement.parentNode);\r\n\t}\r\n</script>\r\n\r\n");
      out.write("\r\n\r\n");
 if( DEBUG_COMMENTS ) { 
      out.write("<!-- end: xp_button.inc -->");
 } 
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n\r\n");

	AttributeConfigurationCreatorChip theChip = (AttributeConfigurationCreatorChip) request.getAttribute(AbstractChip.CHIP_KEY);

      out.write("\r\n\r\n\r\n<table class=\"attribute\" cellspacing=\"0\" cellpadding=\"0\"  title=\" Dieses Attribut ist nicht editierbar.\">\r\n\t<tr>\r\n\t\t<td width=\"16px\">&nbsp;</td>\r\n \t\t<td width=\"110px\">\r\n \t\t\t<span class=\"disabled\">\r\n \t\t\t\t");
      out.print( localized( "lucenesearch.attributeconfigurationcreator.name" ) );
      out.write("\r\n \t\t\t</span>\r\n \t\t</td>\r\n \t\t<td width=\"20px\">&nbsp;</td>\r\n \t\t<td width=\"0px\"></td>\r\n \t\t<td> ");
 theChip.getAttributeSelectorChip().render( pageContext ); 
      out.write(" </td>\r\n \t\t<td> \r\n\t\t\t<div class=\"xp-button chip-event\">\r\n\t\t\t\t<a href=\"#\" title=\"");
      out.print( localized("lucenesearch.attributeconfigurationcreator.tooltip") );
      out.write("\" \r\n\t\t\t\t\tname=\"");
      out.print( theChip.getCommandID(theChip.CREATE_COMMAND) );
      out.write("\" hidefocus=\"true\" id=\"");
      out.print( theChip.getUniqueName() );
      out.write("_a\">\r\n\t\t\t\t\t<span class=\"label\" id=\"");
      out.print( theChip.getUniqueName() );
      out.write("_span\">\r\n\t\t\t\t\t\t");
      out.print( localized("lucenesearch.attributeconfigurationcreator.button") );
      out.write("\r\n\t\t\t\t\t</span>\r\n\t\t\t\t</a>\r\n\t\t\t</div>\r\n\t\t</td>\r\n\t</tr>\r\n</table>\r\n");
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
