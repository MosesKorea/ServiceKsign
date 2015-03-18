package com.ksign.service.prescaning;

public class Pre_scaning {
	
	/*create table pre_scaning_step (
			pre_no NUMBER(10), 
			pre_customer_no NUMBER(10),
			pre_licence_pre NUMBER(10),
			pre_os_environment NUMBER(10),
			pre_encryption_column NUMBER(10), 
			PROJECT_NO NUMBER(10) 
			)*/
	/**
	 * 사전환경조사서 헤더넘버
	 */
	private int pre_no;
	/**
	 * 사전환경조사서 고객정보 넘버
	 */
	private int pre_customer_no;
	/**
	 * 사전환경조사서 장비조사넘버
	 */
	private int pre_os_environment;
	/**
	 * 사전환경조사서 암호화대상조사 넘버
	 */
	private int pre_encryption_column;
	/**
	 * 프로젝트 헤더에 관한 넘버
	 */
	private int project_no;
	
	
	public Pre_scaning(int pre_no, int pre_customer_no, int pre_os_environment,
			int pre_encryption_column, int project_no) {
		super();
		this.pre_no = pre_no;
		this.pre_customer_no = pre_customer_no;
		this.pre_os_environment = pre_os_environment;
		this.pre_encryption_column = pre_encryption_column;
		this.project_no = project_no;
	}
	public Pre_scaning() {
		super();
	}
	public int getPre_no() {
		return pre_no;
	}
	public void setPre_no(int pre_no) {
		this.pre_no = pre_no;
	}
	public int getPre_customer_no() {
		return pre_customer_no;
	}
	public void setPre_customer_no(int pre_customer_no) {
		this.pre_customer_no = pre_customer_no;
	}
	public int getPre_os_environment() {
		return pre_os_environment;
	}
	public void setPre_os_environment(int pre_os_environment) {
		this.pre_os_environment = pre_os_environment;
	}
	public int getPre_encryption_column() {
		return pre_encryption_column;
	}
	public void setPre_encryption_column(int pre_encryption_column) {
		this.pre_encryption_column = pre_encryption_column;
	}
	public int getProject_no() {
		return project_no;
	}
	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}
	@Override
	public String toString() {
		return "Pre_scaning [pre_no=" + pre_no + ", pre_customer_no="
				+ pre_customer_no + ", pre_os_environment="
				+ pre_os_environment + ", pre_encryption_column="
				+ pre_encryption_column + ", project_no=" + project_no + "]";
	}
	
	
	
	
}
