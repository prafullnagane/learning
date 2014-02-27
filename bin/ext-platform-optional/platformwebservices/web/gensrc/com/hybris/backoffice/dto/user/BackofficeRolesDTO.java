/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Dec 13, 2013 6:34:48 PM                     ---
 * ----------------------------------------------------------------
 */
package com.hybris.backoffice.dto.user;

import com.hybris.backoffice.dto.user.BackofficeRoleDTO;
import de.hybris.platform.webservices.dto.AbstractCollectionDTO;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated collection dto class for type BackofficeRole first defined at extension backoffice
 */
@SuppressWarnings("all")
@XmlRootElement(name = "backofficeroles")
public class BackofficeRolesDTO extends AbstractCollectionDTO
{
	/** <i>Generated variable</i> - List of <code>BackofficeRoleDTO*/
	private List<BackofficeRoleDTO>  backofficerolesList;
	
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BackofficeRolesDTO()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - for generic creation.
	 */
	public BackofficeRolesDTO(final List<BackofficeRoleDTO> backofficerolesList)
	{
		super();
		this.backofficerolesList=backofficerolesList;
	}
	
	
	/**
	 * @return the backofficeroles
	 */
	@XmlElement(name = "backofficerole")
	public List<BackofficeRoleDTO> getBackofficeRoles()
	{
		return	backofficerolesList;
	}
	
	/**
	 * @param backofficerolesList 
	 *  the backofficerolesList to set   
	 */
	public void setBackofficeRoles(final List<BackofficeRoleDTO> backofficerolesList)
	{
		this.backofficerolesList=backofficerolesList;
	}
	
}
