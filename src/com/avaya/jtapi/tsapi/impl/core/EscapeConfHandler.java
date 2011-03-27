package com.avaya.jtapi.tsapi.impl.core;

import com.avaya.jtapi.tsapi.csta1.CSTAEscapeSvcConfEvent;
import com.avaya.jtapi.tsapi.csta1.CSTAEvent;
import com.avaya.jtapi.tsapi.tsapiInterface.ConfHandler;

class EscapeConfHandler implements ConfHandler {
	TSProviderImpl prov;
	ConfHandler extraHandler;
	protected Object privateData;

	EscapeConfHandler(final TSProviderImpl _prov,
			final ConfHandler _extraHandler) {
		prov = _prov;
		extraHandler = _extraHandler;
	}

	public Object getPrivateData() {
		return privateData;
	}

	@Override
	public void handleConf(final CSTAEvent event) {
		Object privData = null;
		try {
			if (event == null
					|| !(event.getEvent() instanceof CSTAEscapeSvcConfEvent))
				return;

			privData = event.getPrivData();
			prov.replyPriv = privData;
			privateData = privData;
		} finally {
			if (extraHandler != null)
				extraHandler.handleConf(event);
		}
	}
}
