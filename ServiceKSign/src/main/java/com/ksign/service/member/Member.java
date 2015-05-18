package com.ksign.service.member;

import java.sql.Date;

/**
 * @author user
 *
 */
public class Member {
	
	/**
	 * create table user (
			 * UNO NUMBER(10) , 
			 * UID VARCHAR2(10) , 
			 * UPW VARCHAR2(10) , 
			 * UNAME VARCHAR2(20) , 
			 * UCOMPANY VARCHAR2(20) , 
			 * UTYPE NUMBER(2) , 
			 * UDEPT NUMBER(10) , 
			 * UMAIL VARCHAR2(20) , 
			 * UPNUMBER NUMBER(14) , 
			 * UONUMBER NUMBER(14) , 
			 * UDATE SYSDATE
 		);
	 */


	/**
	 * 직원 넘버
	 */
	private int UNO; 
	/**
	 * 아이디
	 */
	private String UID; 
	/**
	 * 패스워드
	 */
	private String UPW; 
	/**
	 * 이름
	 */
	private String UNAME; 
	/**
	 * 회사
	 */
	private String UCOMPANY; 
	/**
	 * 유저타입
	 */
	private int UTYPE; 
	/**
	 * 부서
	 */
	private int UDEPT; 
	/**
	 * 메일
	 */
	private String UMAIL; 
	/**
	 * 핸드폰넘버
	 */
	private int UPNUMBER; 
	/**
	 * 사무실 넘버
	 */
	private int UONUMBER; 
	/**
	 * 가입일
	 */
	private Date UDATE;
	public Member(int uNO, String uID, String uPW, String uNAME,
			String uCOMPANY, int uTYPE, int uDEPT, String uMAIL, int uPNUMBER,
			int uONUMBER, Date uDATE) {
		super();
		UNO = uNO;
		UID = uID;
		UPW = uPW;
		UNAME = uNAME;
		UCOMPANY = uCOMPANY;
		UTYPE = uTYPE;
		UDEPT = uDEPT;
		UMAIL = uMAIL;
		UPNUMBER = uPNUMBER;
		UONUMBER = uONUMBER;
		UDATE = uDATE;
	}
	public int getUNO() {
		return UNO;
	}
	public void setUNO(int uNO) {
		UNO = uNO;
	}
	public String getUID() {
		return UID;
	}
	public void setUID(String uID) {
		UID = uID;
	}
	public String getUPW() {
		return UPW;
	}
	public void setUPW(String uPW) {
		UPW = uPW;
	}
	public String getUNAME() {
		return UNAME;
	}
	public void setUNAME(String uNAME) {
		UNAME = uNAME;
	}
	public String getUCOMPANY() {
		return UCOMPANY;
	}
	public void setUCOMPANY(String uCOMPANY) {
		UCOMPANY = uCOMPANY;
	}
	public int getUTYPE() {
		return UTYPE;
	}
	public void setUTYPE(int uTYPE) {
		UTYPE = uTYPE;
	}
	public int getUDEPT() {
		return UDEPT;
	}
	public void setUDEPT(int uDEPT) {
		UDEPT = uDEPT;
	}
	public String getUMAIL() {
		return UMAIL;
	}
	public void setUMAIL(String uMAIL) {
		UMAIL = uMAIL;
	}
	public int getUPNUMBER() {
		return UPNUMBER;
	}
	public void setUPNUMBER(int uPNUMBER) {
		UPNUMBER = uPNUMBER;
	}
	public int getUONUMBER() {
		return UONUMBER;
	}
	public void setUONUMBER(int uONUMBER) {
		UONUMBER = uONUMBER;
	}
	public Date getUDATE() {
		return UDATE;
	}
	public void setUDATE(Date uDATE) {
		UDATE = uDATE;
	}
	@Override
	public String toString() {
		return "Member [UNO=" + UNO + ", UID=" + UID + ", UPW=" + UPW
				+ ", UNAME=" + UNAME + ", UCOMPANY=" + UCOMPANY + ", UTYPE="
				+ UTYPE + ", UDEPT=" + UDEPT + ", UMAIL=" + UMAIL
				+ ", UPNUMBER=" + UPNUMBER + ", UONUMBER=" + UONUMBER
				+ ", UDATE=" + UDATE + "]";
	}
	
	

}
