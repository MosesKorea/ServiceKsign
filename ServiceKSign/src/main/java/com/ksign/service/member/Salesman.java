package com.ksign.service.member;

import java.sql.Date;

public class Salesman {

	/**
	 * create table salesman (
			 * SNO NUMBER(10) , 
			 * SNAME VARCHAR2(20) , 
			 * SDEPT NUMBER(2) , 
			 * SMAIL VARCHAR2(20) , 
			 * SPNUMBER NUMBER(14) , 
			 * SONUMBER NUMBER(14) , 
			 * SDATE SYSDATE()
		);
	 */
	/**
	 * 영업넘버
	 */
	private int SNO; 
	/**
	 * 영업이름
	 */
	private String SNAME; 
	/**
	 * 영업부서
	 */
	private int SDEPT; 
	/**
	 * 영업메일
	 */
	private String SMAIL; 
	/**
	 * 개인전화번호
	 */
	private int SPNUMBER; 
	/**
	 * 사무실 전화번호
	 */
	private int SONUMBER; 
	/**
	 * 등록일
	 */
	private Date SDATE;
	public Salesman(int sNO, String sNAME, int sDEPT, String sMAIL,
			int sPNUMBER, int sONUMBER, Date sDATE) {
		super();
		SNO = sNO;
		SNAME = sNAME;
		SDEPT = sDEPT;
		SMAIL = sMAIL;
		SPNUMBER = sPNUMBER;
		SONUMBER = sONUMBER;
		SDATE = sDATE;
	}
	public int getSNO() {
		return SNO;
	}
	public void setSNO(int sNO) {
		SNO = sNO;
	}
	public String getSNAME() {
		return SNAME;
	}
	public void setSNAME(String sNAME) {
		SNAME = sNAME;
	}
	public int getSDEPT() {
		return SDEPT;
	}
	public void setSDEPT(int sDEPT) {
		SDEPT = sDEPT;
	}
	public String getSMAIL() {
		return SMAIL;
	}
	public void setSMAIL(String sMAIL) {
		SMAIL = sMAIL;
	}
	public int getSPNUMBER() {
		return SPNUMBER;
	}
	public void setSPNUMBER(int sPNUMBER) {
		SPNUMBER = sPNUMBER;
	}
	public int getSONUMBER() {
		return SONUMBER;
	}
	public void setSONUMBER(int sONUMBER) {
		SONUMBER = sONUMBER;
	}
	public Date getSDATE() {
		return SDATE;
	}
	public void setSDATE(Date sDATE) {
		SDATE = sDATE;
	}
	@Override
	public String toString() {
		return "Salesman [SNO=" + SNO + ", SNAME=" + SNAME + ", SDEPT=" + SDEPT
				+ ", SMAIL=" + SMAIL + ", SPNUMBER=" + SPNUMBER + ", SONUMBER="
				+ SONUMBER + ", SDATE=" + SDATE + "]";
	}
	
	
}
