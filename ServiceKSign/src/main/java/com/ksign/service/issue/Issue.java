package com.ksign.service.issue;

import java.sql.Date;

public class Issue {
	/**
	 * 이슈 넘버	NUMBER
	 */
	private int is_no;
	/**
	 * 대상넘버	NUMBER
	 */
	private int project_no;	
	/**
	 * 내용	VARCHAR2
	 */
	private String is_content;
	/**
	 * 문제점	VARCHAR2
	 */
	private String is_problem;
	/**
	 * 방안	VARCHAR2
	 */
	private String is_solution;
	/**
	 * 최종발견일	SYSDATE
	 */
	private Date is_date;
	/**
	 * 완료예정일	SYSDATE
	 */
	private String is_completion;
	/**
	 * 비고	VARCHAR2
	 */
	private String is_note;
	/**
	 * 완료/비완료	VARCHAR2
	 */
	private String is_com_fail;
	/**
	 * 상태	NUMBER
	 */
	private int is_state;
	public Issue(int is_no, int project_no, String is_content,
			String is_problem, String is_solution, Date is_date,
			String is_completion, String is_note, String is_com_fail,
			int is_state) {
		super();
		this.is_no = is_no;
		this.project_no = project_no;
		this.is_content = is_content;
		this.is_problem = is_problem;
		this.is_solution = is_solution;
		this.is_date = is_date;
		this.is_completion = is_completion;
		this.is_note = is_note;
		this.is_com_fail = is_com_fail;
		this.is_state = is_state;
	}
	public int getIs_no() {
		return is_no;
	}
	public void setIs_no(int is_no) {
		this.is_no = is_no;
	}
	public int getProject_no() {
		return project_no;
	}
	public void setProject_no(int project_no) {
		this.project_no = project_no;
	}
	public String getIs_content() {
		return is_content;
	}
	public void setIs_content(String is_content) {
		this.is_content = is_content;
	}
	public String getIs_problem() {
		return is_problem;
	}
	public void setIs_problem(String is_problem) {
		this.is_problem = is_problem;
	}
	public String getIs_solution() {
		return is_solution;
	}
	public void setIs_solution(String is_solution) {
		this.is_solution = is_solution;
	}
	public Date getIs_date() {
		return is_date;
	}
	public void setIs_date(Date is_date) {
		this.is_date = is_date;
	}
	public String getIs_completion() {
		return is_completion;
	}
	public void setIs_completion(String is_completion) {
		this.is_completion = is_completion;
	}
	public String getIs_note() {
		return is_note;
	}
	public void setIs_note(String is_note) {
		this.is_note = is_note;
	}
	public String getIs_com_fail() {
		return is_com_fail;
	}
	public void setIs_com_fail(String is_com_fail) {
		this.is_com_fail = is_com_fail;
	}
	public int getIs_state() {
		return is_state;
	}
	public void setIs_state(int is_state) {
		this.is_state = is_state;
	}
	@Override
	public String toString() {
		return "Issue [is_no=" + is_no + ", project_no=" + project_no
				+ ", is_content=" + is_content + ", is_problem=" + is_problem
				+ ", is_solution=" + is_solution + ", is_date=" + is_date
				+ ", is_completion=" + is_completion + ", is_note=" + is_note
				+ ", is_com_fail=" + is_com_fail + ", is_state=" + is_state
				+ "]";
	}


}
