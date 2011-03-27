package com.avaya.jtapi.tsapi.impl.events.conn;

import javax.telephony.callcontrol.events.CallCtlConnEstablishedEv;

import com.avaya.jtapi.tsapi.ITsapiCallInfo;

@SuppressWarnings("deprecation")
public class TsapiConnEstablishedEvent extends TsapiCallCtlConnEvent implements
		CallCtlConnEstablishedEv, ITsapiCallInfo {
	public TsapiConnEstablishedEvent(final ConnEventParams params) {
		super(params);
	}

	@Override
	public final int getID() {
		return 206;
	}
}
