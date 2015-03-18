package com.ksign.service.reply;

import java.sql.Date;

public class Reply {
	
	/*
	 		   re_no             NUMBER(10) NOT NULL,
		       re_content        VARCHAR2(4000) NOT NULL,
		       re_writer         VARCHAR2(50) NOT NULL,
		       re_pw				VARCHAR2(50) NOT NULL,
		       re_date           DATE DEFAULT SYSDATE,
		       re_reference_no   NUMBER(10) NOT NULL,
		       re__dep      		NUMBER(30) NOT NULL,
		       re__order    		NUMBER(30) NOT NULL,
		       b_no             NUMBER(10) NOT NULL
	*/
	
	/**
	 * 댓글 번호
	 */
	private int reply_no;
	
	/**
	 * 댓글 내용
	 */
	private String reply_content;
	
	/**
	 * 작성자
	 */
	private String reply_writer;
	
	/**
	 * 비밀번호
	 */
	private String reply_pw;
	
	/**
	 * 작성일
	 */
	private Date reply_date;
	
	/**
	 * 답글 구룹 번호
	 */
	private int reply_reference_no;
	
	/**
	 * 답글 깊이,레벨
	 */
	private int reply_dep;
	
	/**
	 * 답글 순서
	 */
	private int reply_order;
	
	/**
	 * 댓글 삭제여부 (0: 등록, 1:삭제)
	 */
	private int reply_status;
	
	/**
	 * 글 번호
	 */
	private int board_no;

	public Reply() {
		super();
	}

	public Reply(int reply_no, String reply_content, String reply_writer,
			String reply_pw, Date reply_date, int reply_reference_no,
			int reply_dep, int reply_order, int reply_status, int board_no) {
		super();
		this.reply_no = reply_no;
		this.reply_content = reply_content;
		this.reply_writer = reply_writer;
		this.reply_pw = reply_pw;
		this.reply_date = reply_date;
		this.reply_reference_no = reply_reference_no;
		this.reply_dep = reply_dep;
		this.reply_order = reply_order;
		this.reply_status = reply_status;
		this.board_no = board_no;
	}

	public int getReply_no() {
		return reply_no;
	}

	public void setReply_no(int reply_no) {
		this.reply_no = reply_no;
	}

	public String getReply_content() {
		return reply_content;
	}

	public void setReply_content(String reply_content) {
		this.reply_content = reply_content;
	}

	public String getReply_writer() {
		return reply_writer;
	}

	public void setReply_writer(String reply_writer) {
		this.reply_writer = reply_writer;
	}

	public String getReply_pw() {
		return reply_pw;
	}

	public void setReply_pw(String reply_pw) {
		this.reply_pw = reply_pw;
	}

	public Date getReply_date() {
		return reply_date;
	}

	public void setReply_date(Date reply_date) {
		this.reply_date = reply_date;
	}

	public int getReply_reference_no() {
		return reply_reference_no;
	}

	public void setReply_reference_no(int reply_reference_no) {
		this.reply_reference_no = reply_reference_no;
	}

	public int getReply_dep() {
		return reply_dep;
	}

	public void setReply_dep(int reply_dep) {
		this.reply_dep = reply_dep;
	}

	public int getReply_order() {
		return reply_order;
	}

	public void setReply_order(int reply_order) {
		this.reply_order = reply_order;
	}

	public int getReply_status() {
		return reply_status;
	}

	public void setReply_status(int reply_status) {
		this.reply_status = reply_status;
	}

	public int getBoard_no() {
		return board_no;
	}

	public void setBoard_no(int board_no) {
		this.board_no = board_no;
	}

	@Override
	public String toString() {
		return "Reply [reply_no=" + reply_no + ", reply_content="
				+ reply_content + ", reply_writer=" + reply_writer
				+ ", reply_pw=" + reply_pw + ", reply_date=" + reply_date
				+ ", reply_reference_no=" + reply_reference_no + ", reply_dep="
				+ reply_dep + ", reply_order=" + reply_order
				+ ", reply_status=" + reply_status + ", board_no=" + board_no
				+ "]";
	}

}
