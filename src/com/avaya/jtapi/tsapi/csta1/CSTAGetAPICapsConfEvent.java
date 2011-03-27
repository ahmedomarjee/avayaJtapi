package com.avaya.jtapi.tsapi.csta1;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import com.avaya.jtapi.tsapi.asn1.ASNInteger;

public final class CSTAGetAPICapsConfEvent extends CSTAConfirmation {
	int alternateCall;
	int answerCall;
	int callCompletion;
	int clearCall;
	int clearConnection;
	int conferenceCall;
	int consultationCall;
	int deflectCall;
	int pickupCall;
	int groupPickupCall;
	int holdCall;
	int makeCall;
	int makePredictiveCall;
	int queryMwi;
	int queryDnd;
	int queryFwd;
	int queryAgentState;
	int queryLastNumber;
	int queryDeviceInfo;
	int reconnectCall;
	int retrieveCall;
	int setMwi;
	int setDnd;
	int setFwd;
	int setAgentState;
	int transferCall;
	int eventReport;
	int callClearedEvent;
	int conferencedEvent;
	int connectionClearedEvent;
	int deliveredEvent;
	int divertedEvent;
	int establishedEvent;
	int failedEvent;
	int heldEvent;
	int networkReachedEvent;
	int originatedEvent;
	int queuedEvent;
	int retrievedEvent;
	int serviceInitiatedEvent;
	int transferredEvent;
	int callInformationEvent;
	int doNotDisturbEvent;
	int forwardingEvent;
	int messageWaitingEvent;
	int loggedOnEvent;
	int loggedOffEvent;
	int notReadyEvent;
	int readyEvent;
	int workNotReadyEvent;
	int workReadyEvent;
	int backInServiceEvent;
	int outOfServiceEvent;
	int privateEvent;
	int routeRequestEvent;
	int reRoute;
	int routeSelect;
	int routeUsedEvent;
	int routeEndEvent;
	int monitorDevice;
	int monitorCall;
	int monitorCallsViaDevice;
	int changeMonitorFilter;
	int monitorStop;
	int monitorEnded;
	int snapshotDeviceReq;
	int snapshotCallReq;
	int escapeService;
	int privateStatusEvent;
	int escapeServiceEvent;
	int escapeServiceConf;
	int sendPrivateEvent;
	int sysStatReq;
	int sysStatStart;
	int sysStatStop;
	int changeSysStatFilter;
	int sysStatReqEvent;
	int sysStatReqConf;
	int sysStatEvent;
	public static final int PDU = 125;

	public static CSTAGetAPICapsConfEvent decode(final InputStream in) {
		final CSTAGetAPICapsConfEvent _this = new CSTAGetAPICapsConfEvent();
		_this.doDecode(in);

		return _this;
	}

	@Override
	public void decodeMembers(final InputStream memberStream) {
		alternateCall = ASNInteger.decode(memberStream);
		answerCall = ASNInteger.decode(memberStream);
		callCompletion = ASNInteger.decode(memberStream);
		clearCall = ASNInteger.decode(memberStream);
		clearConnection = ASNInteger.decode(memberStream);
		conferenceCall = ASNInteger.decode(memberStream);
		consultationCall = ASNInteger.decode(memberStream);
		deflectCall = ASNInteger.decode(memberStream);
		pickupCall = ASNInteger.decode(memberStream);
		groupPickupCall = ASNInteger.decode(memberStream);
		holdCall = ASNInteger.decode(memberStream);
		makeCall = ASNInteger.decode(memberStream);
		makePredictiveCall = ASNInteger.decode(memberStream);
		queryMwi = ASNInteger.decode(memberStream);
		queryDnd = ASNInteger.decode(memberStream);
		queryFwd = ASNInteger.decode(memberStream);
		queryAgentState = ASNInteger.decode(memberStream);
		queryLastNumber = ASNInteger.decode(memberStream);
		queryDeviceInfo = ASNInteger.decode(memberStream);
		reconnectCall = ASNInteger.decode(memberStream);
		retrieveCall = ASNInteger.decode(memberStream);
		setMwi = ASNInteger.decode(memberStream);
		setDnd = ASNInteger.decode(memberStream);
		setFwd = ASNInteger.decode(memberStream);
		setAgentState = ASNInteger.decode(memberStream);
		transferCall = ASNInteger.decode(memberStream);
		eventReport = ASNInteger.decode(memberStream);
		callClearedEvent = ASNInteger.decode(memberStream);
		conferencedEvent = ASNInteger.decode(memberStream);
		connectionClearedEvent = ASNInteger.decode(memberStream);
		deliveredEvent = ASNInteger.decode(memberStream);
		divertedEvent = ASNInteger.decode(memberStream);
		establishedEvent = ASNInteger.decode(memberStream);
		failedEvent = ASNInteger.decode(memberStream);
		heldEvent = ASNInteger.decode(memberStream);
		networkReachedEvent = ASNInteger.decode(memberStream);
		originatedEvent = ASNInteger.decode(memberStream);
		queuedEvent = ASNInteger.decode(memberStream);
		retrievedEvent = ASNInteger.decode(memberStream);
		serviceInitiatedEvent = ASNInteger.decode(memberStream);
		transferredEvent = ASNInteger.decode(memberStream);
		callInformationEvent = ASNInteger.decode(memberStream);
		doNotDisturbEvent = ASNInteger.decode(memberStream);
		forwardingEvent = ASNInteger.decode(memberStream);
		messageWaitingEvent = ASNInteger.decode(memberStream);
		loggedOnEvent = ASNInteger.decode(memberStream);
		loggedOffEvent = ASNInteger.decode(memberStream);
		notReadyEvent = ASNInteger.decode(memberStream);
		readyEvent = ASNInteger.decode(memberStream);
		workNotReadyEvent = ASNInteger.decode(memberStream);
		workReadyEvent = ASNInteger.decode(memberStream);
		backInServiceEvent = ASNInteger.decode(memberStream);
		outOfServiceEvent = ASNInteger.decode(memberStream);
		privateEvent = ASNInteger.decode(memberStream);
		routeRequestEvent = ASNInteger.decode(memberStream);
		reRoute = ASNInteger.decode(memberStream);
		routeSelect = ASNInteger.decode(memberStream);
		routeUsedEvent = ASNInteger.decode(memberStream);
		routeEndEvent = ASNInteger.decode(memberStream);
		monitorDevice = ASNInteger.decode(memberStream);
		monitorCall = ASNInteger.decode(memberStream);
		monitorCallsViaDevice = ASNInteger.decode(memberStream);
		changeMonitorFilter = ASNInteger.decode(memberStream);
		monitorStop = ASNInteger.decode(memberStream);
		monitorEnded = ASNInteger.decode(memberStream);
		snapshotDeviceReq = ASNInteger.decode(memberStream);
		snapshotCallReq = ASNInteger.decode(memberStream);
		escapeService = ASNInteger.decode(memberStream);
		privateStatusEvent = ASNInteger.decode(memberStream);
		escapeServiceEvent = ASNInteger.decode(memberStream);
		escapeServiceConf = ASNInteger.decode(memberStream);
		sendPrivateEvent = ASNInteger.decode(memberStream);
		sysStatReq = ASNInteger.decode(memberStream);
		sysStatStart = ASNInteger.decode(memberStream);
		sysStatStop = ASNInteger.decode(memberStream);
		changeSysStatFilter = ASNInteger.decode(memberStream);
		sysStatReqEvent = ASNInteger.decode(memberStream);
		sysStatReqConf = ASNInteger.decode(memberStream);
		sysStatEvent = ASNInteger.decode(memberStream);
	}

	public int getAlternateCall() {
		return alternateCall;
	}

	public int getAnswerCall() {
		return answerCall;
	}

	public int getBackInServiceEvent() {
		return backInServiceEvent;
	}

	public int getCallClearedEvent() {
		return callClearedEvent;
	}

	public int getCallCompletion() {
		return callCompletion;
	}

	public int getCallInformationEvent() {
		return callInformationEvent;
	}

	public int getChangeMonitorFilter() {
		return changeMonitorFilter;
	}

	public int getChangeSysStatFilter() {
		return changeSysStatFilter;
	}

	public int getClearCall() {
		return clearCall;
	}

	public int getClearConnection() {
		return clearConnection;
	}

	public int getConferenceCall() {
		return conferenceCall;
	}

	public int getConferencedEvent() {
		return conferencedEvent;
	}

	public int getConnectionClearedEvent() {
		return connectionClearedEvent;
	}

	public int getConsultationCall() {
		return consultationCall;
	}

	public int getDeflectCall() {
		return deflectCall;
	}

	public int getDeliveredEvent() {
		return deliveredEvent;
	}

	public int getDivertedEvent() {
		return divertedEvent;
	}

	public int getDoNotDisturbEvent() {
		return doNotDisturbEvent;
	}

	public int getEscapeService() {
		return escapeService;
	}

	public int getEscapeServiceConf() {
		return escapeServiceConf;
	}

	public int getEscapeServiceEvent() {
		return escapeServiceEvent;
	}

	public int getEstablishedEvent() {
		return establishedEvent;
	}

	public int getEventReport() {
		return eventReport;
	}

	public int getFailedEvent() {
		return failedEvent;
	}

	public int getForwardingEvent() {
		return forwardingEvent;
	}

	public int getGroupPickupCall() {
		return groupPickupCall;
	}

	public int getHeldEvent() {
		return heldEvent;
	}

	public int getHoldCall() {
		return holdCall;
	}

	public int getLoggedOffEvent() {
		return loggedOffEvent;
	}

	public int getLoggedOnEvent() {
		return loggedOnEvent;
	}

	public int getMakeCall() {
		return makeCall;
	}

	public int getMakePredictiveCall() {
		return makePredictiveCall;
	}

	public int getMessageWaitingEvent() {
		return messageWaitingEvent;
	}

	public int getMonitorCall() {
		return monitorCall;
	}

	public int getMonitorCallsViaDevice() {
		return monitorCallsViaDevice;
	}

	public int getMonitorDevice() {
		return monitorDevice;
	}

	public int getMonitorEnded() {
		return monitorEnded;
	}

	public int getMonitorStop() {
		return monitorStop;
	}

	public int getNetworkReachedEvent() {
		return networkReachedEvent;
	}

	public int getNotReadyEvent() {
		return notReadyEvent;
	}

	public int getOriginatedEvent() {
		return originatedEvent;
	}

	public int getOutOfServiceEvent() {
		return outOfServiceEvent;
	}

	@Override
	public int getPDU() {
		return 125;
	}

	public int getPickupCall() {
		return pickupCall;
	}

	public int getPrivateEvent() {
		return privateEvent;
	}

	public int getPrivateStatusEvent() {
		return privateStatusEvent;
	}

	public int getQueryAgentState() {
		return queryAgentState;
	}

	public int getQueryDeviceInfo() {
		return queryDeviceInfo;
	}

	public int getQueryDnd() {
		return queryDnd;
	}

	public int getQueryFwd() {
		return queryFwd;
	}

	public int getQueryLastNumber() {
		return queryLastNumber;
	}

	public int getQueryMwi() {
		return queryMwi;
	}

	public int getQueuedEvent() {
		return queuedEvent;
	}

	public int getReadyEvent() {
		return readyEvent;
	}

	public int getReconnectCall() {
		return reconnectCall;
	}

	public int getReRoute() {
		return reRoute;
	}

	public int getRetrieveCall() {
		return retrieveCall;
	}

	public int getRetrievedEvent() {
		return retrievedEvent;
	}

	public int getRouteEndEvent() {
		return routeEndEvent;
	}

	public int getRouteRequestEvent() {
		return routeRequestEvent;
	}

	public int getRouteSelect() {
		return routeSelect;
	}

	public int getRouteUsedEvent() {
		return routeUsedEvent;
	}

	public int getSendPrivateEvent() {
		return sendPrivateEvent;
	}

	public int getServiceInitiatedEvent() {
		return serviceInitiatedEvent;
	}

	public int getSetAgentState() {
		return setAgentState;
	}

	public int getSetDnd() {
		return setDnd;
	}

	public int getSetFwd() {
		return setFwd;
	}

	public int getSetMwi() {
		return setMwi;
	}

	public int getSnapshotCallReq() {
		return snapshotCallReq;
	}

	public int getSnapshotDeviceReq() {
		return snapshotDeviceReq;
	}

	public int getSysStatEvent() {
		return sysStatEvent;
	}

	public int getSysStatReq() {
		return sysStatReq;
	}

	public int getSysStatReqConf() {
		return sysStatReqConf;
	}

	public int getSysStatReqEvent() {
		return sysStatReqEvent;
	}

	public int getSysStatStart() {
		return sysStatStart;
	}

	public int getSysStatStop() {
		return sysStatStop;
	}

	public int getTransferCall() {
		return transferCall;
	}

	public int getTransferredEvent() {
		return transferredEvent;
	}

	public int getWorkNotReadyEvent() {
		return workNotReadyEvent;
	}

	public int getWorkReadyEvent() {
		return workReadyEvent;
	}

	@Override
	public Collection<String> print() {
		final Collection<String> lines = new ArrayList<String>();
		lines.add("CSTAGetAPICapsConfEvent ::=");
		lines.add("{");

		final String indent = "  ";

		lines.addAll(ASNInteger.print(alternateCall, "alternateCall", indent));
		lines.addAll(ASNInteger.print(answerCall, "answerCall", indent));
		lines.addAll(ASNInteger.print(callCompletion, "callCompletion", indent));
		lines.addAll(ASNInteger.print(clearCall, "clearCall", indent));
		lines.addAll(ASNInteger.print(clearConnection, "clearConnection",
				indent));
		lines.addAll(ASNInteger.print(conferenceCall, "conferenceCall", indent));
		lines.addAll(ASNInteger.print(consultationCall, "consultationCall",
				indent));
		lines.addAll(ASNInteger.print(deflectCall, "deflectCall", indent));
		lines.addAll(ASNInteger.print(pickupCall, "pickupCall", indent));
		lines.addAll(ASNInteger.print(groupPickupCall, "groupPickupCall",
				indent));
		lines.addAll(ASNInteger.print(holdCall, "holdCall", indent));
		lines.addAll(ASNInteger.print(makeCall, "makeCall", indent));
		lines.addAll(ASNInteger.print(makePredictiveCall, "makePredictiveCall",
				indent));
		lines.addAll(ASNInteger.print(queryMwi, "queryMwi", indent));
		lines.addAll(ASNInteger.print(queryDnd, "queryDnd", indent));
		lines.addAll(ASNInteger.print(queryFwd, "queryFwd", indent));
		lines.addAll(ASNInteger.print(queryAgentState, "queryAgentState",
				indent));
		lines.addAll(ASNInteger.print(queryLastNumber, "queryLastNumber",
				indent));
		lines.addAll(ASNInteger.print(queryDeviceInfo, "queryDeviceInfo",
				indent));
		lines.addAll(ASNInteger.print(reconnectCall, "reconnectCall", indent));
		lines.addAll(ASNInteger.print(retrieveCall, "retrieveCall", indent));
		lines.addAll(ASNInteger.print(setMwi, "setMwi", indent));
		lines.addAll(ASNInteger.print(setDnd, "setDnd", indent));
		lines.addAll(ASNInteger.print(setFwd, "setFwd", indent));
		lines.addAll(ASNInteger.print(setAgentState, "setAgentState", indent));
		lines.addAll(ASNInteger.print(transferCall, "transferCall", indent));
		lines.addAll(ASNInteger.print(eventReport, "eventReport", indent));
		lines.addAll(ASNInteger.print(callClearedEvent, "callClearedEvent",
				indent));
		lines.addAll(ASNInteger.print(conferencedEvent, "conferencedEvent",
				indent));
		lines.addAll(ASNInteger.print(connectionClearedEvent,
				"connectionClearedEvent", indent));
		lines.addAll(ASNInteger.print(deliveredEvent, "deliveredEvent", indent));
		lines.addAll(ASNInteger.print(divertedEvent, "divertedEvent", indent));
		lines.addAll(ASNInteger.print(establishedEvent, "establishedEvent",
				indent));
		lines.addAll(ASNInteger.print(failedEvent, "failedEvent", indent));
		lines.addAll(ASNInteger.print(heldEvent, "heldEvent", indent));
		lines.addAll(ASNInteger.print(networkReachedEvent,
				"networkReachedEvent", indent));
		lines.addAll(ASNInteger.print(originatedEvent, "originatedEvent",
				indent));
		lines.addAll(ASNInteger.print(queuedEvent, "queuedEvent", indent));
		lines.addAll(ASNInteger.print(retrievedEvent, "retrievedEvent", indent));
		lines.addAll(ASNInteger.print(serviceInitiatedEvent,
				"serviceInitiatedEvent", indent));
		lines.addAll(ASNInteger.print(transferredEvent, "transferredEvent",
				indent));
		lines.addAll(ASNInteger.print(callInformationEvent,
				"callInformationEvent", indent));
		lines.addAll(ASNInteger.print(doNotDisturbEvent, "doNotDisturbEvent",
				indent));
		lines.addAll(ASNInteger.print(forwardingEvent, "forwardingEvent",
				indent));
		lines.addAll(ASNInteger.print(messageWaitingEvent,
				"messageWaitingEvent", indent));
		lines.addAll(ASNInteger.print(loggedOnEvent, "loggedOnEvent", indent));
		lines.addAll(ASNInteger.print(loggedOffEvent, "loggedOffEvent", indent));
		lines.addAll(ASNInteger.print(notReadyEvent, "notReadyEvent", indent));
		lines.addAll(ASNInteger.print(readyEvent, "readyEvent", indent));
		lines.addAll(ASNInteger.print(workNotReadyEvent, "workNotReadyEvent",
				indent));
		lines.addAll(ASNInteger.print(workReadyEvent, "workReadyEvent", indent));
		lines.addAll(ASNInteger.print(backInServiceEvent, "backInServiceEvent",
				indent));
		lines.addAll(ASNInteger.print(outOfServiceEvent, "outOfServiceEvent",
				indent));
		lines.addAll(ASNInteger.print(privateEvent, "privateEvent", indent));
		lines.addAll(ASNInteger.print(routeRequestEvent, "routeRequestEvent",
				indent));
		lines.addAll(ASNInteger.print(reRoute, "reRoute", indent));
		lines.addAll(ASNInteger.print(routeSelect, "routeSelect", indent));
		lines.addAll(ASNInteger.print(routeUsedEvent, "routeUsedEvent", indent));
		lines.addAll(ASNInteger.print(routeEndEvent, "routeEndEvent", indent));
		lines.addAll(ASNInteger.print(monitorDevice, "monitorDevice", indent));
		lines.addAll(ASNInteger.print(monitorCall, "monitorCall", indent));
		lines.addAll(ASNInteger.print(monitorCallsViaDevice,
				"monitorCallsViaDevice", indent));
		lines.addAll(ASNInteger.print(changeMonitorFilter,
				"changeMonitorFilter", indent));
		lines.addAll(ASNInteger.print(monitorStop, "monitorStop", indent));
		lines.addAll(ASNInteger.print(monitorEnded, "monitorEnded", indent));
		lines.addAll(ASNInteger.print(snapshotDeviceReq, "snapshotDeviceReq",
				indent));
		lines.addAll(ASNInteger.print(snapshotCallReq, "snapshotCallReq",
				indent));
		lines.addAll(ASNInteger.print(escapeService, "escapeService", indent));
		lines.addAll(ASNInteger.print(privateStatusEvent, "privateStatusEvent",
				indent));
		lines.addAll(ASNInteger.print(escapeServiceEvent, "escapeServiceEvent",
				indent));
		lines.addAll(ASNInteger.print(escapeServiceConf, "escapeServiceConf",
				indent));
		lines.addAll(ASNInteger.print(sendPrivateEvent, "sendPrivateEvent",
				indent));
		lines.addAll(ASNInteger.print(sysStatReq, "sysStatReq", indent));
		lines.addAll(ASNInteger.print(sysStatStart, "sysStatStart", indent));
		lines.addAll(ASNInteger.print(sysStatStop, "sysStatStop", indent));
		lines.addAll(ASNInteger.print(changeSysStatFilter,
				"changeSysStatFilter", indent));
		lines.addAll(ASNInteger.print(sysStatReqEvent, "sysStatReqEvent",
				indent));
		lines.addAll(ASNInteger.print(sysStatReqConf, "sysStatReqConf", indent));
		lines.addAll(ASNInteger.print(sysStatEvent, "sysStatEvent", indent));

		lines.add("}");
		return lines;
	}

	public void setAlternateCall(final int alternateCall) {
		this.alternateCall = alternateCall;
	}

	public void setAnswerCall(final int answerCall) {
		this.answerCall = answerCall;
	}

	public void setBackInServiceEvent(final int backInServiceEvent) {
		this.backInServiceEvent = backInServiceEvent;
	}

	public void setCallClearedEvent(final int callClearedEvent) {
		this.callClearedEvent = callClearedEvent;
	}

	public void setCallCompletion(final int callCompletion) {
		this.callCompletion = callCompletion;
	}

	public void setCallInformationEvent(final int callInformationEvent) {
		this.callInformationEvent = callInformationEvent;
	}

	public void setChangeMonitorFilter(final int changeMonitorFilter) {
		this.changeMonitorFilter = changeMonitorFilter;
	}

	public void setChangeSysStatFilter(final int changeSysStatFilter) {
		this.changeSysStatFilter = changeSysStatFilter;
	}

	public void setClearCall(final int clearCall) {
		this.clearCall = clearCall;
	}

	public void setClearConnection(final int clearConnection) {
		this.clearConnection = clearConnection;
	}

	public void setConferenceCall(final int conferenceCall) {
		this.conferenceCall = conferenceCall;
	}

	public void setConferencedEvent(final int conferencedEvent) {
		this.conferencedEvent = conferencedEvent;
	}

	public void setConnectionClearedEvent(final int connectionClearedEvent) {
		this.connectionClearedEvent = connectionClearedEvent;
	}

	public void setConsultationCall(final int consultationCall) {
		this.consultationCall = consultationCall;
	}

	public void setDeflectCall(final int deflectCall) {
		this.deflectCall = deflectCall;
	}

	public void setDeliveredEvent(final int deliveredEvent) {
		this.deliveredEvent = deliveredEvent;
	}

	public void setDivertedEvent(final int divertedEvent) {
		this.divertedEvent = divertedEvent;
	}

	public void setDoNotDisturbEvent(final int doNotDisturbEvent) {
		this.doNotDisturbEvent = doNotDisturbEvent;
	}

	public void setEscapeService(final int escapeService) {
		this.escapeService = escapeService;
	}

	public void setEscapeServiceConf(final int escapeServiceConf) {
		this.escapeServiceConf = escapeServiceConf;
	}

	public void setEscapeServiceEvent(final int escapeServiceEvent) {
		this.escapeServiceEvent = escapeServiceEvent;
	}

	public void setEstablishedEvent(final int establishedEvent) {
		this.establishedEvent = establishedEvent;
	}

	public void setEventReport(final int eventReport) {
		this.eventReport = eventReport;
	}

	public void setFailedEvent(final int failedEvent) {
		this.failedEvent = failedEvent;
	}

	public void setForwardingEvent(final int forwardingEvent) {
		this.forwardingEvent = forwardingEvent;
	}

	public void setGroupPickupCall(final int groupPickupCall) {
		this.groupPickupCall = groupPickupCall;
	}

	public void setHeldEvent(final int heldEvent) {
		this.heldEvent = heldEvent;
	}

	public void setHoldCall(final int holdCall) {
		this.holdCall = holdCall;
	}

	public void setLoggedOffEvent(final int loggedOffEvent) {
		this.loggedOffEvent = loggedOffEvent;
	}

	public void setLoggedOnEvent(final int loggedOnEvent) {
		this.loggedOnEvent = loggedOnEvent;
	}

	public void setMakeCall(final int makeCall) {
		this.makeCall = makeCall;
	}

	public void setMakePredictiveCall(final int makePredictiveCall) {
		this.makePredictiveCall = makePredictiveCall;
	}

	public void setMessageWaitingEvent(final int messageWaitingEvent) {
		this.messageWaitingEvent = messageWaitingEvent;
	}

	public void setMonitorCall(final int monitorCall) {
		this.monitorCall = monitorCall;
	}

	public void setMonitorCallsViaDevice(final int monitorCallsViaDevice) {
		this.monitorCallsViaDevice = monitorCallsViaDevice;
	}

	public void setMonitorDevice(final int monitorDevice) {
		this.monitorDevice = monitorDevice;
	}

	public void setMonitorEnded(final int monitorEnded) {
		this.monitorEnded = monitorEnded;
	}

	public void setMonitorStop(final int monitorStop) {
		this.monitorStop = monitorStop;
	}

	public void setNetworkReachedEvent(final int networkReachedEvent) {
		this.networkReachedEvent = networkReachedEvent;
	}

	public void setNotReadyEvent(final int notReadyEvent) {
		this.notReadyEvent = notReadyEvent;
	}

	public void setOriginatedEvent(final int originatedEvent) {
		this.originatedEvent = originatedEvent;
	}

	public void setOutOfServiceEvent(final int outOfServiceEvent) {
		this.outOfServiceEvent = outOfServiceEvent;
	}

	public void setPickupCall(final int pickupCall) {
		this.pickupCall = pickupCall;
	}

	public void setPrivateEvent(final int privateEvent) {
		this.privateEvent = privateEvent;
	}

	public void setPrivateStatusEvent(final int privateStatusEvent) {
		this.privateStatusEvent = privateStatusEvent;
	}

	public void setQueryAgentState(final int queryAgentState) {
		this.queryAgentState = queryAgentState;
	}

	public void setQueryDeviceInfo(final int queryDeviceInfo) {
		this.queryDeviceInfo = queryDeviceInfo;
	}

	public void setQueryDnd(final int queryDnd) {
		this.queryDnd = queryDnd;
	}

	public void setQueryFwd(final int queryFwd) {
		this.queryFwd = queryFwd;
	}

	public void setQueryLastNumber(final int queryLastNumber) {
		this.queryLastNumber = queryLastNumber;
	}

	public void setQueryMwi(final int queryMwi) {
		this.queryMwi = queryMwi;
	}

	public void setQueuedEvent(final int queuedEvent) {
		this.queuedEvent = queuedEvent;
	}

	public void setReadyEvent(final int readyEvent) {
		this.readyEvent = readyEvent;
	}

	public void setReconnectCall(final int reconnectCall) {
		this.reconnectCall = reconnectCall;
	}

	public void setReRoute(final int reRoute) {
		this.reRoute = reRoute;
	}

	public void setRetrieveCall(final int retrieveCall) {
		this.retrieveCall = retrieveCall;
	}

	public void setRetrievedEvent(final int retrievedEvent) {
		this.retrievedEvent = retrievedEvent;
	}

	public void setRouteEndEvent(final int routeEndEvent) {
		this.routeEndEvent = routeEndEvent;
	}

	public void setRouteRequestEvent(final int routeRequestEvent) {
		this.routeRequestEvent = routeRequestEvent;
	}

	public void setRouteSelect(final int routeSelect) {
		this.routeSelect = routeSelect;
	}

	public void setRouteUsedEvent(final int routeUsedEvent) {
		this.routeUsedEvent = routeUsedEvent;
	}

	public void setSendPrivateEvent(final int sendPrivateEvent) {
		this.sendPrivateEvent = sendPrivateEvent;
	}

	public void setServiceInitiatedEvent(final int serviceInitiatedEvent) {
		this.serviceInitiatedEvent = serviceInitiatedEvent;
	}

	public void setSetAgentState(final int setAgentState) {
		this.setAgentState = setAgentState;
	}

	public void setSetDnd(final int setDnd) {
		this.setDnd = setDnd;
	}

	public void setSetFwd(final int setFwd) {
		this.setFwd = setFwd;
	}

	public void setSetMwi(final int setMwi) {
		this.setMwi = setMwi;
	}

	public void setSnapshotCallReq(final int snapshotCallReq) {
		this.snapshotCallReq = snapshotCallReq;
	}

	public void setSnapshotDeviceReq(final int snapshotDeviceReq) {
		this.snapshotDeviceReq = snapshotDeviceReq;
	}

	public void setSysStatEvent(final int sysStatEvent) {
		this.sysStatEvent = sysStatEvent;
	}

	public void setSysStatReq(final int sysStatReq) {
		this.sysStatReq = sysStatReq;
	}

	public void setSysStatReqConf(final int sysStatReqConf) {
		this.sysStatReqConf = sysStatReqConf;
	}

	public void setSysStatReqEvent(final int sysStatReqEvent) {
		this.sysStatReqEvent = sysStatReqEvent;
	}

	public void setSysStatStart(final int sysStatStart) {
		this.sysStatStart = sysStatStart;
	}

	public void setSysStatStop(final int sysStatStop) {
		this.sysStatStop = sysStatStop;
	}

	public void setTransferCall(final int transferCall) {
		this.transferCall = transferCall;
	}

	public void setTransferredEvent(final int transferredEvent) {
		this.transferredEvent = transferredEvent;
	}

	public void setWorkNotReadyEvent(final int workNotReadyEvent) {
		this.workNotReadyEvent = workNotReadyEvent;
	}

	public void setWorkReadyEvent(final int workReadyEvent) {
		this.workReadyEvent = workReadyEvent;
	}
}
