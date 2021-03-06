/**
 * ESUP-Portail Commons - Copyright (c) 2006 ESUP-Portail consortium
 * http://sourcesup.cru.fr/projects/esup-commons
 */
package org.esupportail.commons.services.authentication;



/** 
 * An abstract authenticator.
 */
@SuppressWarnings("serial")
public abstract class AbstractAuthenticationService implements AuthenticationService {
	
	/**
	 * True if enabled.
	 */
	private boolean enabled = true;

	/**
	 * Bean constructor.
	 */
	protected AbstractAuthenticationService() {
		super();
	}

	/**
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	public void afterPropertiesSet() {
		// nothing to check
	}

	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}

}
