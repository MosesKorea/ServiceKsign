package com.ksign.service.issue;

import java.sql.Date;

public class Issue {
	/**
	 * create table ISSUE_LIST (
			 * ISNO NUMBER(10) , 
			 * IS_P_NO NUMBER(10) , 
			 * ISTYPE VARCHAR2(50) , 
			 * ISCONTENT VARCHAR2(1000) , 
			 * ISPROBLEM VARCHAR2(5000) , 
			 * ISSOLUTION VARCHAR2(5000) , 
			 * ISWRITER VARCHAR2(20) , 
			 * ISDATE SYSDATE() , 
			 * ISCOMPLETIONDATE SYSDATE() , 
			 * ISNOTE VARCHAR2(1000) , 
			 * ISCOMFAIL VARCHAR2(2) , 
			 * ISSTATE NUMBER(3),
			 * IS_FILE VARCHAR2(20)
	 * );
	 */
	/**
	 * 이슈 넘버
	 */
	private int ISNO; 
	/**
	 * 대상넘버
	 */
	private int IS_P_NO; 
	/**
	 * 이슈구분
	 */
	private String ISTYPE; 
	/**
	 * 내용
	 */
	private String ISCONTENT; 
	/**
	 * 문제점
	 */
	private String ISPROBLEM; 
	/**
	 * 방안
	 */
	private String ISSOLUTION; 
	/**
	 * 담당엔지니어
	 */
	private String ISWRITER; 
	/**
	 * 최종발견일
	 */
	private Date ISDATE; 
	/**
	 * 완료예정일
	 */
	private Date ISCOMPLETIONDATE; 
	/**
	 * 비고
	 */
	private String ISNOTE; 
	/**
	 * 완료/비완료
	 */
	private String ISCOMFAIL; 
	/**
	 * 상태
	 */
	private int ISSTATE;
	/**
	 * 첨부파일1
	 */
	private String IS_FILE;
	public Issue(int iSNO, int iS_P_NO, String iSTYPE, String iSCONTENT,
			String iSPROBLEM, String iSSOLUTION, String iSWRITER, Date iSDATE,
			Date iSCOMPLETIONDATE, String iSNOTE, String iSCOMFAIL,
			int iSSTATE, String iS_FILE) {
		super();
		ISNO = iSNO;
		IS_P_NO = iS_P_NO;
		ISTYPE = iSTYPE;
		ISCONTENT = iSCONTENT;
		ISPROBLEM = iSPROBLEM;
		ISSOLUTION = iSSOLUTION;
		ISWRITER = iSWRITER;
		ISDATE = iSDATE;
		ISCOMPLETIONDATE = iSCOMPLETIONDATE;
		ISNOTE = iSNOTE;
		ISCOMFAIL = iSCOMFAIL;
		ISSTATE = iSSTATE;
		IS_FILE = iS_FILE;
	}
	public int getISNO() {
		return ISNO;
	}
	public void setISNO(int iSNO) {
		ISNO = iSNO;
	}
	public int getIS_P_NO() {
		return IS_P_NO;
	}
	public void setIS_P_NO(int iS_P_NO) {
		IS_P_NO = iS_P_NO;
	}
	public String getISTYPE() {
		return ISTYPE;
	}
	public void setISTYPE(String iSTYPE) {
		ISTYPE = iSTYPE;
	}
	public String getISCONTENT() {
		return ISCONTENT;
	}
	public void setISCONTENT(String iSCONTENT) {
		ISCONTENT = iSCONTENT;
	}
	public String getISPROBLEM() {
		return ISPROBLEM;
	}
	public void setISPROBLEM(String iSPROBLEM) {
		ISPROBLEM = iSPROBLEM;
	}
	public String getISSOLUTION() {
		return ISSOLUTION;
	}
	public void setISSOLUTION(String iSSOLUTION) {
		ISSOLUTION = iSSOLUTION;
	}
	public String getISWRITER() {
		return ISWRITER;
	}
	public void setISWRITER(String iSWRITER) {
		ISWRITER = iSWRITER;
	}
	public Date getISDATE() {
		return ISDATE;
	}
	public void setISDATE(Date iSDATE) {
		ISDATE = iSDATE;
	}
	public Date getISCOMPLETIONDATE() {
		return ISCOMPLETIONDATE;
	}
	public void setISCOMPLETIONDATE(Date iSCOMPLETIONDATE) {
		ISCOMPLETIONDATE = iSCOMPLETIONDATE;
	}
	public String getISNOTE() {
		return ISNOTE;
	}
	public void setISNOTE(String iSNOTE) {
		ISNOTE = iSNOTE;
	}
	public String getISCOMFAIL() {
		return ISCOMFAIL;
	}
	public void setISCOMFAIL(String iSCOMFAIL) {
		ISCOMFAIL = iSCOMFAIL;
	}
	public int getISSTATE() {
		return ISSTATE;
	}
	public void setISSTATE(int iSSTATE) {
		ISSTATE = iSSTATE;
	}
	public String getIS_FILE() {
		return IS_FILE;
	}
	public void setIS_FILE(String iS_FILE) {
		IS_FILE = iS_FILE;
	}
	@Override
	public String toString() {
		return "Issue [ISNO=" + ISNO + ", IS_P_NO=" + IS_P_NO + ", ISTYPE="
				+ ISTYPE + ", ISCONTENT=" + ISCONTENT + ", ISPROBLEM="
				+ ISPROBLEM + ", ISSOLUTION=" + ISSOLUTION + ", ISWRITER="
				+ ISWRITER + ", ISDATE=" + ISDATE + ", ISCOMPLETIONDATE="
				+ ISCOMPLETIONDATE + ", ISNOTE=" + ISNOTE + ", ISCOMFAIL="
				+ ISCOMFAIL + ", ISSTATE=" + ISSTATE + ", IS_FILE=" + IS_FILE
				+ "]";
	}



}
