package com.ksign.service.customer;

import java.sql.Date;

public class Customer {

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
	 * 고객넘버
	 */
	private int c_no;
	/**
	 * 고객id
	 */
	private String c_id;
	/**
	 * 고객pw
	 */
	private String c_pw;
	private String c_name;
	private String c_company;
	private int c_dept;
	private String c_mail;
	private int c_pnumber;
	private int c_onumber;
	private String u_segmentation;
	private char u_permission;
	private Date u_date;
	private char C_TYPE;
	public Customer(int c_no, String c_id, String c_pw, String c_name,
			String c_company, int c_dept, String c_mail, int c_pnumber,
			int c_onumber, String u_segmentation, char u_permission,
			Date u_date, char c_TYPE) {
		super();
		this.c_no = c_no;
		this.c_id = c_id;
		this.c_pw = c_pw;
		this.c_name = c_name;
		this.c_company = c_company;
		this.c_dept = c_dept;
		this.c_mail = c_mail;
		this.c_pnumber = c_pnumber;
		this.c_onumber = c_onumber;
		this.u_segmentation = u_segmentation;
		this.u_permission = u_permission;
		this.u_date = u_date;
		C_TYPE = c_TYPE;
	}
	public int getC_no() {
		return c_no;
	}
	public void setC_no(int c_no) {
		this.c_no = c_no;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getC_pw() {
		return c_pw;
	}
	public void setC_pw(String c_pw) {
		this.c_pw = c_pw;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_company() {
		return c_company;
	}
	public void setC_company(String c_company) {
		this.c_company = c_company;
	}
	public int getC_dept() {
		return c_dept;
	}
	public void setC_dept(int c_dept) {
		this.c_dept = c_dept;
	}
	public String getC_mail() {
		return c_mail;
	}
	public void setC_mail(String c_mail) {
		this.c_mail = c_mail;
	}
	public int getC_pnumber() {
		return c_pnumber;
	}
	public void setC_pnumber(int c_pnumber) {
		this.c_pnumber = c_pnumber;
	}
	public int getC_onumber() {
		return c_onumber;
	}
	public void setC_onumber(int c_onumber) {
		this.c_onumber = c_onumber;
	}
	public String getU_segmentation() {
		return u_segmentation;
	}
	public void setU_segmentation(String u_segmentation) {
		this.u_segmentation = u_segmentation;
	}
	public char getU_permission() {
		return u_permission;
	}
	public void setU_permission(char u_permission) {
		this.u_permission = u_permission;
	}
	public Date getU_date() {
		return u_date;
	}
	public void setU_date(Date u_date) {
		this.u_date = u_date;
	}
	public char getC_TYPE() {
		return C_TYPE;
	}
	public void setC_TYPE(char c_TYPE) {
		C_TYPE = c_TYPE;
	}
	@Override
	public String toString() {
		return "Customer [c_no=" + c_no + ", c_id=" + c_id + ", c_pw=" + c_pw
				+ ", c_name=" + c_name + ", c_company=" + c_company
				+ ", c_dept=" + c_dept + ", c_mail=" + c_mail + ", c_pnumber="
				+ c_pnumber + ", c_onumber=" + c_onumber + ", u_segmentation="
				+ u_segmentation + ", u_permission=" + u_permission
				+ ", u_date=" + u_date + ", C_TYPE=" + C_TYPE + "]";
	}
	
	
	
}
