package com.ksign.service.demands;

public class Demands {
	/**
	 * create table CUSTMER_DEMANDS (
		 * DENO NUMBER(10) , 
		 * DETYPE VARCHAR2(20) , 
		 * DENAME VARCHAR2(200) , 
		 * DEPROCESE VARCHAR2(5000) , 
		 * DECLASS VARCHAR2(20) , 
		 * DESTATUS VARCHAR2(2) , 
		 * DELEVEL CHAR(2) , 
		 * DEACCOMMODATION VARCHAR2(20) , 
		 * DEPROVENCE VARCHAR2(100) , 
		 * DENOTE VARCHAR2(1000) , 
		 * DE_FILE VARCHAR2(20) , 
		 * DE_P_NO NUMBER(10) 
	 * );
	 */
	
	/**
	 * 요구사항 넘버
	 */
	 private int DENO; 
	/**
	 * 요구사항타입
	 */
	 private String DETYPE; 
	/**
	 * 요구사항명
	 */
	 private String DENAME; 
	/**
	 * 처리내용
	 */
	 private String DEPROCESE; 
	/**
	 * 분류
	 */
	 private String DECLASS; 
	/**
	 * 중요도
	 */
	 private String DESTATUS; 
	/**
	 * 난이도
	 */
	 private char DELEVEL; 
	/**
	 * 수용여부
	 */
	 private String DEACCOMMODATION; 
	/**
	 * 출처
	 */
	 private String DEPROVENCE; 
	/**
	 * 비고
	 */
	 private String DENOTE; 
	/**
	 * 첨부파일1
	 */
	 private String DE_FILE; 
	/**
	 * 해당프로벡트넘버
	 */
	 private int DE_P_NO;
	 
	 
	public Demands(int dENO, String dETYPE, String dENAME,
			String dEPROCESE, String dECLASS, String dESTATUS, char dELEVEL,
			String dEACCOMMODATION, String dEPROVENCE, String dENOTE,
			String dE_FILE, int dE_P_NO) {
		super();
		DENO = dENO;
		DETYPE = dETYPE;
		DENAME = dENAME;
		DEPROCESE = dEPROCESE;
		DECLASS = dECLASS;
		DESTATUS = dESTATUS;
		DELEVEL = dELEVEL;
		DEACCOMMODATION = dEACCOMMODATION;
		DEPROVENCE = dEPROVENCE;
		DENOTE = dENOTE;
		DE_FILE = dE_FILE;
		DE_P_NO = dE_P_NO;
	}
	
	public int getDENO() {
		return DENO;
	}
	public void setDENO(int dENO) {
		DENO = dENO;
	}
	public String getDETYPE() {
		return DETYPE;
	}
	public void setDETYPE(String dETYPE) {
		DETYPE = dETYPE;
	}
	public String getDENAME() {
		return DENAME;
	}
	public void setDENAME(String dENAME) {
		DENAME = dENAME;
	}
	public String getDEPROCESE() {
		return DEPROCESE;
	}
	public void setDEPROCESE(String dEPROCESE) {
		DEPROCESE = dEPROCESE;
	}
	public String getDECLASS() {
		return DECLASS;
	}
	public void setDECLASS(String dECLASS) {
		DECLASS = dECLASS;
	}
	public String getDESTATUS() {
		return DESTATUS;
	}
	public void setDESTATUS(String dESTATUS) {
		DESTATUS = dESTATUS;
	}
	public char getDELEVEL() {
		return DELEVEL;
	}
	public void setDELEVEL(char dELEVEL) {
		DELEVEL = dELEVEL;
	}
	public String getDEACCOMMODATION() {
		return DEACCOMMODATION;
	}
	public void setDEACCOMMODATION(String dEACCOMMODATION) {
		DEACCOMMODATION = dEACCOMMODATION;
	}
	public String getDEPROVENCE() {
		return DEPROVENCE;
	}
	public void setDEPROVENCE(String dEPROVENCE) {
		DEPROVENCE = dEPROVENCE;
	}
	public String getDENOTE() {
		return DENOTE;
	}
	public void setDENOTE(String dENOTE) {
		DENOTE = dENOTE;
	}
	public String getDE_FILE() {
		return DE_FILE;
	}
	public void setDE_FILE(String dE_FILE) {
		DE_FILE = dE_FILE;
	}
	public int getDE_P_NO() {
		return DE_P_NO;
	}
	public void setDE_P_NO(int dE_P_NO) {
		DE_P_NO = dE_P_NO;
	}
	
	@Override
	public String toString() {
		return "Customer_demands [DENO=" + DENO + ", DETYPE=" + DETYPE
				+ ", DENAME=" + DENAME + ", DEPROCESE=" + DEPROCESE
				+ ", DECLASS=" + DECLASS + ", DESTATUS=" + DESTATUS
				+ ", DELEVEL=" + DELEVEL + ", DEACCOMMODATION="
				+ DEACCOMMODATION + ", DEPROVENCE=" + DEPROVENCE + ", DENOTE="
				+ DENOTE + ", DE_FILE=" + DE_FILE + ", DE_P_NO=" + DE_P_NO
				+ "]";
	}
	 
	 

}