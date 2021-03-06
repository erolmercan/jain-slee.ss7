/*
 * TeleStax, Open Source Cloud Communications  
 * Copyright 2012, Telestax Inc and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.restcomm.slee.resource.tcap.wrappers;

import org.restcomm.protocols.ss7.tcap.asn.comp.Problem;
import org.restcomm.protocols.ss7.tcap.asn.comp.Reject;
import org.restcomm.slee.resource.tcap.events.RejectEvent;

/**
 * @author abhayani
 * 
 */
public class RejectEventImpl extends ComponentEventImpl<Reject> implements RejectEvent {

	/**
	 * 
	 */
	public RejectEventImpl(TCAPDialogWrapper dialogWrapper, Reject wrappedReject) {
		super(dialogWrapper, wrappedReject);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.restcomm.protocols.ss7.tcap.asn.comp.Reject#getProblem()
	 */
	@Override
	public Problem getProblem() {
		return this.wrappedComponent.getProblem();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.restcomm.protocols.ss7.tcap.asn.comp.Reject#setProblem(org.restcomm
	 * .protocols.ss7.tcap.asn.comp.Problem)
	 */
	@Override
	public void setProblem(Problem problem) {
		this.wrappedComponent.setProblem(problem);
	}

	@Override
	public boolean isLocalOriginated() {
		return this.wrappedComponent.isLocalOriginated();
	}

	@Override
	public void setLocalOriginated(boolean val) {
		this.wrappedComponent.setLocalOriginated(val);
	}

}
