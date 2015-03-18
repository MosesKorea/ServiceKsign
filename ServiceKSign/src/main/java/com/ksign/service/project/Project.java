package com.ksign.service.project;

import java.sql.Date;

public class Project {

/*	create table K_project (
			project_no NUMBER(10), 
			project_name VARCHAR2(30), 
			project_level NUMBER(3), 
			project_startday SYSDATE, 
			project_finishday SYSDATE, 
			project_comment VARCHAR2(2000)  
			);*/
	/**
	 *  프로젝트 넘버
	 */
	private int p_no;
	/**
	 *  프로젝트 이름
	 */
	private String p_name;
	/**
	 *  프로젝트 난이도
	 */
	private int p_level;
	/**
	 *  프로젝트 시작일
	 */
	private Date p_startday;
	/**
	 *  프로젝트 마침일
	 */
	private Date p_finishday;
	/**
	 *  프로젝트에 관한 코멘트
	 */
	private String p_comment;
	public Project(int p_no, String p_name, int p_level, Date p_startday,
			Date p_finishday, String p_comment) {
		super();
		this.p_no = p_no;
		this.p_name = p_name;
		this.p_level = p_level;
		this.p_startday = p_startday;
		this.p_finishday = p_finishday;
		this.p_comment = p_comment;
	}
	public Project() {
		super();
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getP_level() {
		return p_level;
	}
	public void setP_level(int p_level) {
		this.p_level = p_level;
	}
	public Date getP_startday() {
		return p_startday;
	}
	public void setP_startday(Date p_startday) {
		this.p_startday = p_startday;
	}
	public Date getP_finishday() {
		return p_finishday;
	}
	public void setP_finishday(Date p_finishday) {
		this.p_finishday = p_finishday;
	}
	public String getP_comment() {
		return p_comment;
	}
	public void setP_comment(String p_comment) {
		this.p_comment = p_comment;
	}
	@Override
	public String toString() {
		return "Project [p_no=" + p_no + ", p_name=" + p_name + ", p_level="
				+ p_level + ", p_startday=" + p_startday + ", p_finishday="
				+ p_finishday + ", p_comment=" + p_comment + "]";
	}
	
	
}
