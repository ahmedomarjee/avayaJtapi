package com.avaya.jtapi.tsapi.impl.events.provider;

import javax.telephony.Provider;
import javax.telephony.privatedata.events.PrivateProvEv;

import com.avaya.jtapi.tsapi.impl.events.TsapiObserverEvent;

@SuppressWarnings("deprecation")
public abstract class TsapiProvEvent extends TsapiObserverEvent implements
		PrivateProvEv {
	Provider jtapi_provider = null;

	TsapiProvEvent(final Provider _provider, final int _cause,
			final int _metaCode, final Object _privateData) {
		this(_provider, _cause, _metaCode, _privateData, 0);
	}

	public TsapiProvEvent(final Provider _provider, final int _cause,
			final int _metaCode, final Object _privateData,
			final int _eventPackage) {
		super(_cause, _metaCode, _privateData, _eventPackage);
		jtapi_provider = _provider;
	}

	@Override
	public final Provider getProvider() {
		return jtapi_provider;
	}
}
