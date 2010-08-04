/*     */ package com.avaya.jtapi.tsapi;
/*     */ 
/*     */ import javax.telephony.callcenter.ACDManagerAddress;
/*     */ 
/*     */ public final class UserEnteredCode
/*     */ {
/*     */   public static final short UE_ANY = 0;
/*     */   public static final short UE_LOGIN_DIGITS = 2;
/*     */   public static final short UE_CALL_PROMPTER = 5;
/*     */   public static final short UE_DATA_BASE_PROVIDED = 17;
/*     */   public static final short UE_TONE_DETECTOR = 32;
/*     */   public static final short UE_COLLECT = 0;
/*     */   public static final short UE_ENTERED = 1;
/*     */   short type;
/*     */   short indicator;
/*     */   String data;
/*     */   String collectVDN_asn;
/*     */   ACDManagerAddress collectVDN;
/*     */ 
/*     */   public short getType()
/*     */   {
/* 182 */     return this.type;
/*     */   }
/*     */ 
/*     */   public short getIndicator()
/*     */   {
/* 190 */     return this.indicator;
/*     */   }
/*     */ 
/*     */   public String getDigits()
/*     */   {
/* 198 */     return this.data;
/*     */   }
/*     */ 
/*     */   public ACDManagerAddress getCollectVDN()
/*     */   {
/* 206 */     return this.collectVDN;
/*     */   }
/*     */ 
/*     */   public void setCollectVDN(ACDManagerAddress _collectVDN)
/*     */   {
/* 215 */     this.collectVDN = _collectVDN;
/*     */   }
/*     */ 
/*     */   public void setCollectVDN_asn(String _collectVDN_asn) {
/* 219 */     this.collectVDN_asn = _collectVDN_asn;
/*     */   }
/*     */ 
/*     */   public void setData(String _data) {
/* 223 */     this.data = _data;
/*     */   }
/*     */ 
/*     */   public void setIndicator(short _indicator) {
/* 227 */     this.indicator = _indicator;
/*     */   }
/*     */ 
/*     */   public void setType(short _type) {
/* 231 */     this.type = _type;
/*     */   }
/*     */ }

/* Location:           C:\Documents and Settings\Daniel Jurado\Meus documentos\My Dropbox\install\Avaya\jtapi-sdk-5.2.2.483\lib\ecsjtapia.jar
 * Qualified Name:     com.avaya.jtapi.tsapi.UserEnteredCode
 * JD-Core Version:    0.5.4
 */