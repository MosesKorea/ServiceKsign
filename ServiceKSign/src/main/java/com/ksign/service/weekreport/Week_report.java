package com.ksign.service.weekreport;

import java.sql.Date;

public class Week_report {
	/**
	 * 업무번호	NUMBER
	 */
	private int re_no;
	/**
	 * 고객사 넘버	NUMBER
	 */
	private int re_custom;
	/**
	 * 업무내용	VARCHAR2
	 */
	private String re_content;
	/**
	 * 시작일	SYSDATE
	 */
	private Date re_startday;
	/**
	 * 완료일	SYSDATE
	 * @return
	 */
	private Date re_finishday;
	/**
	 * 작성자(USER_NO?)	NUMBER_no
	 */
	private int re_writer;
	/**
	 * 프로젝트 넘버	NUMBER
	 */
	private int re_project_no;
	/**
	 * 주간보고 공지사항	VARCHAR2
	 */
	private String re_notice;
	public Week_report(int re_no, int re_custom, String re_content,
			Date re_startday, Date re_finishday, int re_writer,
			int re_project_no, String re_notice) {
		super();
		this.re_no = re_no;
		this.re_custom = re_custom;
		this.re_content = re_content;
		this.re_startday = re_startday;
		this.re_finishday = re_finishday;
		this.re_writer = re_writer;
		this.re_project_no = re_project_no;
		this.re_notice = re_notice;
	}
	public int getRe_no() {
		return re_no;
	}
	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}
	public int getRe_custom() {
		return re_custom;
	}
	public void setRe_custom(int re_custom) {
		this.re_custom = re_custom;
	}
	public String getRe_content() {
		return re_content;
	}
	public void setRe_content(String re_content) {
		this.re_content = re_content;
	}
	public Date getRe_startday() {
		return re_startday;
	}
	public void setRe_startday(Date re_startday) {
		this.re_startday = re_startday;
	}
	public Date getRe_finishday() {
		return re_finishday;
	}
	public void setRe_finishday(Date re_finishday) {
		this.re_finishday = re_finishday;
	}
	public int getRe_writer() {
		return re_writer;
	}
	public void setRe_writer(int re_writer) {
		this.re_writer = re_writer;
	}
	public int getRe_project_no() {
		return re_project_no;
	}
	public void setRe_project_no(int re_project_no) {
		this.re_project_no = re_project_no;
	}
	public String getRe_notice() {
		return re_notice;
	}
	public void setRe_notice(String re_notice) {
		this.re_notice = re_notice;
	}
	@Override
	public String toString() {
		return "Week_report [re_no=" + re_no + ", re_custom=" + re_custom
				+ ", re_content=" + re_content + ", re_startday=" + re_startday
				+ ", re_finishday=" + re_finishday + ", re_writer=" + re_writer
				+ ", re_project_no=" + re_project_no + ", re_notice="
				+ re_notice + "]";
	}


}
