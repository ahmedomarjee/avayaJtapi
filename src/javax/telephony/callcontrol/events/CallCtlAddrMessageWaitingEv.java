package javax.telephony.callcontrol.events;

/** @deprecated */
public abstract interface CallCtlAddrMessageWaitingEv extends CallCtlAddrEv
{
  public static final int ID = 202;

  public abstract boolean getMessageWaitingState();
}

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     javax.telephony.callcontrol.events.CallCtlAddrMessageWaitingEv
 * JD-Core Version:    0.5.4
 */