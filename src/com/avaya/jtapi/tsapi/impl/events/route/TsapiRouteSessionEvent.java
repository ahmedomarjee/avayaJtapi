/*    */ package com.avaya.jtapi.tsapi.impl.events.route;
/*    */ 
/*    */ import javax.telephony.callcenter.RouteSession;
/*    */ import javax.telephony.callcenter.events.RouteSessionEvent;
/*    */ 
/*    */ public abstract class TsapiRouteSessionEvent
/*    */   implements RouteSessionEvent
/*    */ {
/* 11 */   private RouteSession routeSession = null;
/*    */ 
/*    */   public final RouteSession getRouteSession()
/*    */   {
/* 16 */     return this.routeSession;
/*    */   }
/*    */ 
/*    */   public TsapiRouteSessionEvent(RouteSession routeSession)
/*    */   {
/* 22 */     this.routeSession = routeSession;
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.events.route.TsapiRouteSessionEvent
 * JD-Core Version:    0.5.4
 */