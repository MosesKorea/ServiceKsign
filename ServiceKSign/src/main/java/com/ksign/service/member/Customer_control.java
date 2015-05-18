package com.ksign.service.member;

import java.sql.Date;

public class Customer_control {
	/**
	 * create table customer_control (
		 * CCNO NUMBER(10) , 
		 * CCTYPE VARCHAR2(10) , 
		 * CCSITENAME VARCHAR2(50) , 
		 * CCDEPT VARCHAR2(20) , 
		 * CCNAME VARCHAR2(10) , 
		 * CCDATE SYSDATE 
		 * );
	 */
	/**
	 * 관리번호
	 */
	private int CCNO; 
	/**
	 * 관리구분
	 */
	private String CCTYPE; 
	/**
	 * 담당SITE명
	 */
	private String CCSITENAME; 
	/**
	 * 담당 영업팀
	 */
	private String CCDEPT; 
	/**
	 * 담당영업성명
	 */
	private String CCNAME; 
	/**
	 * 등록일
	 */
	private Date CCDATE;
	public Customer_control(int cCNO, String cCTYPE, String cCSITENAME,
			String cCDEPT, String cCNAME, Date cCDATE) {
		super();
		CCNO = cCNO;
		CCTYPE = cCTYPE;
		CCSITENAME = cCSITENAME;
		CCDEPT = cCDEPT;
		CCNAME = cCNAME;
		CCDATE = cCDATE;
	}
	public int getCCNO() {
		return CCNO;
	}
	public void setCCNO(int cCNO) {
		CCNO = cCNO;
	}
	public String getCCTYPE() {
		return CCTYPE;
	}
	public void setCCTYPE(String cCTYPE) {
		CCTYPE = cCTYPE;
	}
	public String getCCSITENAME() {
		return CCSITENAME;
	}
	public void setCCSITENAME(String cCSITENAME) {
		CCSITENAME = cCSITENAME;
	}
	public String getCCDEPT() {
		return CCDEPT;
	}
	public void setCCDEPT(String cCDEPT) {
		CCDEPT = cCDEPT;
	}
	public String getCCNAME() {
		return CCNAME;
	}
	public void setCCNAME(String cCNAME) {
		CCNAME = cCNAME;
	}
	public Date getCCDATE() {
		return CCDATE;
	}
	public void setCCDATE(Date cCDATE) {
		CCDATE = cCDATE;
	}
	@Override
	public String toString() {
		return "Customer_control [CCNO=" + CCNO + ", CCTYPE=" + CCTYPE
				+ ", CCSITENAME=" + CCSITENAME + ", CCDEPT=" + CCDEPT
				+ ", CCNAME=" + CCNAME + ", CCDATE=" + CCDATE + "]";
	}

	
}
