/* Copyright 2004 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */

package org.jasig.portal.layout.al;

import org.jasig.portal.PortalException;
import org.jasig.portal.layout.al.common.ILayout;

/**
 * An interface defining an objective representation of a 
 * layout operation.
 * 
 * @author Peter Kharchenko: pkharchenko at unicon.net
 */
public interface ILayoutCommand {
    /**
     * Execute command on a given manager
     * @param manager
     * @return
     */
    public boolean execute(ILayout manager) throws PortalException;
}
