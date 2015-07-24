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
			 * UTYPE VARCHAR2(10) , 
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
	private int uno; 
	
	/**
	 * 아이디
	 */
	private String uid; 
	/**
	 * 패스워드
	 */
	private String upw; 
	/**
	 * 이름
	 */
	private String uname; 
	/**
	 * 회사
	 */
	private String ucompany; 
	/**
	 * 유저타입
	 */
	private String utype; 
	/**
	 * 부서
	 */
	private int udept; 
	/**
	 * 메일
	 */
	private String umail; 
	/**
	 * 핸드폰넘버
	 */
	private int upnumber; 
	/**
	 * 사무실 넘버
	 */
	private int uonumber; 
	/**
	 * 가입일
	 */
	private Date udate;
	
	public Member() {
		super();
	}


	@Override
	public String toString() {
		return "Member [uno=" + uno + ", uid=" + uid + ", upw=" + upw
				+ ", uname=" + uname + ", ucompany=" + ucompany + ", utype="
				+ utype + ", udept=" + udept + ", umail=" + umail
				+ ", upnumber=" + upnumber + ", uonumber=" + uonumber
				+ ", udate=" + udate + "]";
	}




	public int getUno() {
		return uno;
	}




	public void setUno(int uno) {
		this.uno = uno;
	}




	public String getUid() {
		return uid;
	}




	public void setUid(String uid) {
		this.uid = uid;
	}




	public String getUpw() {
		return upw;
	}




	public void setUpw(String upw) {
		this.upw = upw;
	}




	public String getUname() {
		return uname;
	}




	public void setUname(String uname) {
		this.uname = uname;
	}




	public String getUcompany() {
		return ucompany;
	}




	public void setUcompany(String ucompany) {
		this.ucompany = ucompany;
	}




	public String getUtype() {
		return utype;
	}




	public void setUtype(String utype) {
		this.utype = utype;
	}




	public int getUdept() {
		return udept;
	}




	public void setUdept(int udept) {
		this.udept = udept;
	}




	public String getUmail() {
		return umail;
	}




	public void setUmail(String umail) {
		this.umail = umail;
	}




	public int getUpnumber() {
		return upnumber;
	}




	public void setUpnumber(int upnumber) {
		this.upnumber = upnumber;
	}




	public int getUonumber() {
		return uonumber;
	}




	public void setUonumber(int uonumber) {
		this.uonumber = uonumber;
	}




	public Date getUdate() {
		return udate;
	}




	public void setUdate(Date udate) {
		this.udate = udate;
	}




	public Member(int uno, String uid, String upw, String uname,
			String ucompany, String utype, int udept, String umail, int upnumber,
			int uonumber, Date udate) {
		super();
		this.uno = uno;
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.ucompany = ucompany;
		this.utype = utype;
		this.udept = udept;
		this.umail = umail;
		this.upnumber = upnumber;
		this.uonumber = uonumber;
		this.udate = udate;
	}




	public boolean isMatchPassword(String upw){
		boolean isMatch=false;
		if(this.upw.equals(upw)){
			isMatch=true;
		}
		return isMatch;
	}
	
	

}
