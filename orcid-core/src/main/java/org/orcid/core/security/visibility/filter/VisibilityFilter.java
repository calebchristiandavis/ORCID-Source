/**
 * =============================================================================
 *
 * ORCID (R) Open Source
 * http://orcid.org
 *
 * Copyright (c) 2012-2013 ORCID, Inc.
 * Licensed under an MIT-Style License (MIT)
 * http://orcid.org/open-source-license
 *
 * This copyright and license information (including a link to the full license)
 * shall be included in its entirety in all copies or substantial portion of
 * the software.
 *
 * =============================================================================
 */
package org.orcid.core.security.visibility.filter;

import org.orcid.jaxb.model.message.OrcidMessage;
import org.orcid.jaxb.model.message.Visibility;

/**
 * 2011-2012 ORCID
 * 
 * @author Declan Newman (declan) Date: 16/03/2012
 */
public interface VisibilityFilter {

    OrcidMessage filter(OrcidMessage messageToBeFiltered, Visibility... visibilities);

    OrcidMessage filter(OrcidMessage messageToBeFiltered, boolean removeAttribute, Visibility... visibilities);
}
