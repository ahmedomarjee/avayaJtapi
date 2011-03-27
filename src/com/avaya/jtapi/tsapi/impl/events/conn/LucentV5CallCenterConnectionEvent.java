package com.avaya.jtapi.tsapi.impl.events.conn;

import javax.telephony.MetaEvent;

import com.avaya.jtapi.tsapi.LucentV5CallInfo;
import com.avaya.jtapi.tsapi.impl.events.call.CallEventParams;

public class LucentV5CallCenterConnectionEvent extends
		LucentCallCenterConnectionEvent implements LucentV5CallInfo {
	public LucentV5CallCenterConnectionEvent(final CallEventParams params,
			final MetaEvent event, final int eventId) {
		super(params, event, eventId);
	}

	@Override
	public boolean canSetBillRate() {
		return callEventParams.isFlexibleBilling();
	}

	@Override
	public int getCallOriginatorType() {
		return callEventParams.getCallOriginatorType();
	}

	@Override
	public String getUCID() {
		return callEventParams.getUcid();
	}

	@Override
	public boolean hasCallOriginatorType() {
		return callEventParams.hasCallOriginatorType();
	}
}
