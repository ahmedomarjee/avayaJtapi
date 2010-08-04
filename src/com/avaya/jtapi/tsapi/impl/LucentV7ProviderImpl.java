/*    */ package com.avaya.jtapi.tsapi.impl;
/*    */ 
/*    */ import com.avaya.jtapi.tsapi.LucentV7Provider;
/*    */ import com.avaya.jtapi.tsapi.impl.core.TSProviderImpl;
/*    */ import com.avaya.jtapi.tsapi.tsapiInterface.TsapiVendor;
/*    */ import com.avaya.jtapi.tsapi.util.TsapiTrace;
/*    */ import java.util.Vector;
/*    */ 
/*    */ class LucentV7ProviderImpl extends LucentV5ProviderImpl
/*    */   implements LucentV7Provider
/*    */ {
/*    */   public boolean equals(Object obj)
/*    */   {
/* 18 */     if (obj instanceof LucentV7ProviderImpl)
/*    */     {
/* 20 */       return this.tsProvider.equals(((LucentV7ProviderImpl)obj).tsProvider);
/*    */     }
/*    */ 
/* 24 */     return false;
/*    */   }
/*    */ 
/*    */   LucentV7ProviderImpl(String url, Vector<TsapiVendor> vendors)
/*    */   {
/* 34 */     super(url, vendors);
/* 35 */     TsapiTrace.traceConstruction(this, LucentV7ProviderImpl.class);
/*    */   }
/*    */ 
/*    */   LucentV7ProviderImpl(TSProviderImpl _tsProvider)
/*    */   {
/* 45 */     super(_tsProvider);
/* 46 */     TsapiTrace.traceConstruction(this, LucentV7ProviderImpl.class);
/*    */   }
/*    */ 
/*    */   protected void finalize()
/*    */     throws Throwable
/*    */   {
/* 52 */     super.finalize();
/* 53 */     TsapiTrace.traceDestruction(this, LucentV7ProviderImpl.class);
/*    */   }
/*    */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.impl.LucentV7ProviderImpl
 * JD-Core Version:    0.5.4
 */