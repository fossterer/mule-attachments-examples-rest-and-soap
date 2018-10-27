package com.fossterer;

import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class Attachment implements Callable {
	private MuleMessage mule;

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		mule = eventContext.getMessage();

		mule.addOutboundAttachment("ressssssppp.pdf", mule.getPayload(), "text/plain");
		return mule;
	}
}
