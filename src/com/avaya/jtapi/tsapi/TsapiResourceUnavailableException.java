package com.avaya.jtapi.tsapi;

import javax.telephony.ResourceUnavailableException;

public final class TsapiResourceUnavailableException extends
		ResourceUnavailableException implements ITsapiException {
	private static final long serialVersionUID = 1L;
	int errorType = 0;
	int errorCode = 0;

	public TsapiResourceUnavailableException(final int _errorType,
			final int _errorCode, final int type) {
		super(type);
		errorType = _errorType;
		errorCode = _errorCode;
	}

	public TsapiResourceUnavailableException(final int _errorType,
			final int _errorCode, final int type, final String s) {
		super(type, s);
		errorType = _errorType;
		errorCode = _errorCode;
	}

	@Override
	public int getErrorCode() {
		return errorCode;
	}

	@Override
	public int getErrorType() {
		return errorType;
	}
}
