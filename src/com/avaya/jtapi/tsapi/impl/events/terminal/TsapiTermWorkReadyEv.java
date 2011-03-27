package com.avaya.jtapi.tsapi.impl.events.terminal;

import javax.telephony.Terminal;
import javax.telephony.callcenter.Agent;
import javax.telephony.callcenter.events.AgentTermWorkReadyEv;

@SuppressWarnings("deprecation")
public final class TsapiTermWorkReadyEv extends TsapiAgentTermEv implements
		AgentTermWorkReadyEv {
	public TsapiTermWorkReadyEv(final Terminal _device, final Agent _agent,
			final int _cause, final int _metaCode, final Object _privateData) {
		super(_device, _agent, _cause, _metaCode, _privateData);
	}

	@Override
	public int getID() {
		return 315;
	}
}
