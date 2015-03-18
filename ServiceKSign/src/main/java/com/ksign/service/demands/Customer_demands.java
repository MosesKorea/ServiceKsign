package com.ksign.service.demands;

import java.sql.Date;

public class Customer_demands {
	
	/**
	 * 정의서 넘버	NUMBER
	 */
	private int cd_no;	
	/**
	 * 고객정보 넘버	NUMBER
	 */
	private int customer_no;	
	/**
	 * 작성일	SYSDATE
	 */
	private Date cd_date;	
	/**
	 * 작성자	VARCHAR2
	 */
	private String cd_writer;	
	/**
	 * 프로젝트명	VARCHAR2
	 */
	private String cd_sys_name;	
	/**
	 * 전화번호	NUMBER
	 */
	private int cd_demands_list_no;	
	/**
	 * 프로젝트 넘버	NUMBER
	 */
	private int project_no;
	
	public Customer_demands(int cd_no, int customer_no, Date cd_date,
			String cd_writer, String cd_sys_name, int cd_demands_list_no,
			int project_no) {
		super();
		this.cd_no = cd_no;
		this.customer_no = customer_no;
		this.cd_date = cd_date;
		this.cd_writer = cd_writer;
		this.cd_sys_name = cd_sys_name;
		this.cd_demands_list_no = cd_demands_list_no;
		this.project_no = project_no;
	}
	public Customer_demands() {
		super();
	}
	
	public int getCd_no() {
		return cd_no;
	}
	public void setCd_no(int cd_no) {
		this.cd_no = cd_no;
	}
	public int getCustomer_no() {
		return customer_no;
	}
	public void setCustomer_no(int customer_no) {
		this.customer_no = customer_no;
	}
	public Date getCd_date() {
		return cd_date;
	}
	public void setCd_date(Date cd_date) {
		this.cd_date = cd_date;
	}
	public String getCd_writer() {
		return cd_writer;
	}
	public void setCd_writer(String cd_writer) {
		this.cd_writer = cd_writer;
	}
	public String getCd_sys_name() {
		return cd_sys_name;
	}
	public void setCd_sys_name(String cd_sys_name) {
		this.cd_sys_name = cd_sys_name;
	}
	public int getCd_demands_list_no() {
		return cd_demands_list_no;
	}
	public void setCd_demands_list_no(int cd_demands_list_no) {
		this.cd_demands_list_no = cd_demands_list_no;
	}
	public int getProject_no() {
		return project_no;
	}
	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}
	
	@Override
	public String toString() {
		return "Customer_demands [cd_no=" + cd_no + ", customer_no="
				+ customer_no + ", cd_date=" + cd_date + ", cd_writer="
				+ cd_writer + ", cd_sys_name=" + cd_sys_name
				+ ", cd_demands_list_no=" + cd_demands_list_no
				+ ", project_no=" + project_no + "]";
	}
	
	


}
