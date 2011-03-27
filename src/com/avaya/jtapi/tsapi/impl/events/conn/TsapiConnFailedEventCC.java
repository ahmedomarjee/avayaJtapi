package com.avaya.jtapi.tsapi.impl.events.conn;

import javax.telephony.callcontrol.events.CallCtlConnFailedEv;

import com.avaya.jtapi.tsapi.ITsapiCallInfo;

@SuppressWarnings("deprecation")
public class TsapiConnFailedEventCC extends TsapiCallCtlConnEvent implements
		CallCtlConnFailedEv, ITsapiCallInfo {
	public TsapiConnFailedEventCC(final ConnEventParams params) {
		super(params);
	}

	@Override
	public final int getID() {
		return 207;
	}
}
