package com.avaya.jtapi.tsapi.adapters;

import javax.telephony.callcenter.CallCenterCallEvent;
import javax.telephony.callcenter.CallCenterCallListener;
import javax.telephony.callcenter.CallCenterTrunkEvent;

public class CallCenterCallListenerAdapter extends CallListenerAdapter
		implements CallCenterCallListener {
	@Override
	public void applicationData(final CallCenterCallEvent event) {
	}

	@Override
	public void trunkInvalid(final CallCenterTrunkEvent event) {
	}

	@Override
	public void trunkValid(final CallCenterTrunkEvent event) {
	}
}
