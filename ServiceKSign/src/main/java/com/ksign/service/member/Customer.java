package com.ksign.service.member;

import java.sql.Date;

public class Customer {
	
	/**
	 * create table CUSTOMER (
			 * CNO NUMBER(10) , 
			 * CID VARCHAR2(10) , 
			 * CPW VARCHAR2(10) , 
			 * CNAME VARCHAR2(20) , 
			 * CCOMPANY VARCHAR2(20) , 
			 * CDEPT VARCHAR2(20) , 
			 * CMAIL VARCHAR2(20) , 
			 * CPNUMBER NUMBER(14) , 
			 * CONUMBER NUMBER(14) , 
			 * CADDRESS VARCHAR2(200) , 
			 * CTYPE CHAR(2) , 
			 * C_SEALS_TYPE CHAR(2) ,  
			 * CDATE SYSDATE() ,
			 * C_P_NO NUMBER(10) 
	 * );
	 */

	/**
	 * 고객사 넘버
	 */
	private int CNO; 
	/**
	 * 아이디
	 */
	private String CID; 
	/**
	 * 패스워드
	 */
	private String CPW; 
	/**
	 * 이름
	 */
	private String CNAME; 
	/**
	 * 사이트명
	 */
	private String CCOMPANY; 
	/**
	 * 부서
	 */
	private String CDEPT; 
	/**
	 * 메일
	 */
	private String CMAIL; 
	/**
	 * 핸드폰넘버
	 */
	private int CPNUMBER; 
	/**
	 * 사무실 넘버
	 */
	private int CONUMBER; 
	/**
	 * 회사주소
	 */
	private String CADDRESS; 
	/**
	 * 고객사구분
	 */
	private char CTYPE; 
	/**
	 * 관리구분
	 */
	private char C_SEALS_TYPE;  
	/**
	 * 등록일
	 */
	private Date CDATE;
	/**
	 * 프로젝트 넘버
	 */
	private int C_P_NO;
	public Customer(int cNO, String cID, String cPW, String cNAME,
			String cCOMPANY, String cDEPT, String cMAIL, int cPNUMBER,
			int cONUMBER, String cADDRESS, char cTYPE, char c_SEALS_TYPE,
			Date cDATE, int c_P_NO) {
		super();
		CNO = cNO;
		CID = cID;
		CPW = cPW;
		CNAME = cNAME;
		CCOMPANY = cCOMPANY;
		CDEPT = cDEPT;
		CMAIL = cMAIL;
		CPNUMBER = cPNUMBER;
		CONUMBER = cONUMBER;
		CADDRESS = cADDRESS;
		CTYPE = cTYPE;
		C_SEALS_TYPE = c_SEALS_TYPE;
		CDATE = cDATE;
		C_P_NO = c_P_NO;
	}
	public int getCNO() {
		return CNO;
	}
	public void setCNO(int cNO) {
		CNO = cNO;
	}
	public String getCID() {
		return CID;
	}
	public void setCID(String cID) {
		CID = cID;
	}
	public String getCPW() {
		return CPW;
	}
	public void setCPW(String cPW) {
		CPW = cPW;
	}
	public String getCNAME() {
		return CNAME;
	}
	public void setCNAME(String cNAME) {
		CNAME = cNAME;
	}
	public String getCCOMPANY() {
		return CCOMPANY;
	}
	public void setCCOMPANY(String cCOMPANY) {
		CCOMPANY = cCOMPANY;
	}
	public String getCDEPT() {
		return CDEPT;
	}
	public void setCDEPT(String cDEPT) {
		CDEPT = cDEPT;
	}
	public String getCMAIL() {
		return CMAIL;
	}
	public void setCMAIL(String cMAIL) {
		CMAIL = cMAIL;
	}
	public int getCPNUMBER() {
		return CPNUMBER;
	}
	public void setCPNUMBER(int cPNUMBER) {
		CPNUMBER = cPNUMBER;
	}
	public int getCONUMBER() {
		return CONUMBER;
	}
	public void setCONUMBER(int cONUMBER) {
		CONUMBER = cONUMBER;
	}
	public String getCADDRESS() {
		return CADDRESS;
	}
	public void setCADDRESS(String cADDRESS) {
		CADDRESS = cADDRESS;
	}
	public char getCTYPE() {
		return CTYPE;
	}
	public void setCTYPE(char cTYPE) {
		CTYPE = cTYPE;
	}
	public char getC_SEALS_TYPE() {
		return C_SEALS_TYPE;
	}
	public void setC_SEALS_TYPE(char c_SEALS_TYPE) {
		C_SEALS_TYPE = c_SEALS_TYPE;
	}
	public Date getCDATE() {
		return CDATE;
	}
	public void setCDATE(Date cDATE) {
		CDATE = cDATE;
	}
	public int getC_P_NO() {
		return C_P_NO;
	}
	public void setC_P_NO(int c_P_NO) {
		C_P_NO = c_P_NO;
	}
	@Override
	public String toString() {
		return "Customer [CNO=" + CNO + ", CID=" + CID + ", CPW=" + CPW
				+ ", CNAME=" + CNAME + ", CCOMPANY=" + CCOMPANY + ", CDEPT="
				+ CDEPT + ", CMAIL=" + CMAIL + ", CPNUMBER=" + CPNUMBER
				+ ", CONUMBER=" + CONUMBER + ", CADDRESS=" + CADDRESS
				+ ", CTYPE=" + CTYPE + ", C_SEALS_TYPE=" + C_SEALS_TYPE
				+ ", CDATE=" + CDATE + ", C_P_NO=" + C_P_NO + "]";
	}

	
	
}
