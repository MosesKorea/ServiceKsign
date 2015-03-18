package com.ksign.service.member;

import java.sql.Date;

/**
 * @author user
 *
 */
public class Member {
	
	/*create table cutomer (
	c_no NUMBER(10) , 
	c_id VARCHAR2(10) , 
	c_pw VARCHAR2(10) , 
	c_name VARCHAR2(20) , 
	c_company VARCHAR2(20) , 
	c_dept NUMBER(2) , 
	c_mail VARCHAR2(20) , 
	c_pnumber NUMBER(14) , 
	c_onumber NUMBER(14) , 
	u_segmentation VARCHAR2(15) ,
	u_permission CHAR(1) ,
	u_date SYSDATE() ,
	C_TYPE CHAR(2)  );*/
	/**
	 * 맴버넘버
	 */
	private int m_no;
	private String m_id;
	private String m_pw;
	private String m_name;
	private String m_company;
	private String m_dept;
	private String m_mail;
	private int m_pnumber;
	private int m_onumber;
	/**
	 * 사용유무(고객사만)
	 */
	private String m_segmentation;
	/**
	 * 메일사용유무체크
	 */
	private char m_permission;
	private Date m_date;
	/**
	 * 고객사 유형
	 */
	private char m_type;
	
	public Member(int m_no, String m_id, String m_pw, String m_name,
			String m_company, String m_dept, String m_mail, int m_pnumber,
			int m_onumber, String m_segmentation, char m_permission,
			Date m_date, char m_type) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_name = m_name;
		this.m_company = m_company;
		this.m_dept = m_dept;
		this.m_mail = m_mail;
		this.m_pnumber = m_pnumber;
		this.m_onumber = m_onumber;
		this.m_segmentation = m_segmentation;
		this.m_permission = m_permission;
		this.m_date = m_date;
		this.m_type = m_type;
	}
	public Member() {
		super();
	}
	
	public int getM_no() {
		return m_no;
	}
	public void setM_no(int m_no) {
		this.m_no = m_no;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pw() {
		return m_pw;
	}
	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_company() {
		return m_company;
	}
	public void setM_company(String m_company) {
		this.m_company = m_company;
	}
	public String getM_dept() {
		return m_dept;
	}
	public void setM_dept(String m_dept) {
		this.m_dept = m_dept;
	}
	public String getM_mail() {
		return m_mail;
	}
	public void setM_mail(String m_mail) {
		this.m_mail = m_mail;
	}
	public int getM_pnumber() {
		return m_pnumber;
	}
	public void setM_pnumber(int m_pnumber) {
		this.m_pnumber = m_pnumber;
	}
	public int getM_onumber() {
		return m_onumber;
	}
	public void setM_onumber(int m_onumber) {
		this.m_onumber = m_onumber;
	}
	public String getM_segmentation() {
		return m_segmentation;
	}
	public void setM_segmentation(String m_segmentation) {
		this.m_segmentation = m_segmentation;
	}
	public char getM_permission() {
		return m_permission;
	}
	public void setM_permission(char m_permission) {
		this.m_permission = m_permission;
	}
	public Date getM_date() {
		return m_date;
	}
	public void setM_date(Date m_date) {
		this.m_date = m_date;
	}
	public char getM_type() {
		return m_type;
	}
	public void setM_type(char m_type) {
		this.m_type = m_type;
	}
	
	@Override
	public String toString() {
		return "Member [m_no=" + m_no + ", m_id=" + m_id + ", m_pw=" + m_pw
				+ ", m_name=" + m_name + ", m_company=" + m_company
				+ ", m_dept=" + m_dept + ", m_mail=" + m_mail + ", m_pnumber="
				+ m_pnumber + ", m_onumber=" + m_onumber + ", m_segmentation="
				+ m_segmentation + ", m_permission=" + m_permission
				+ ", m_date=" + m_date + ", m_type=" + m_type + "]";
	}
	
	

}
