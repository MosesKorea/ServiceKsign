package com.ksign.service.borad;

import java.sql.Date;



public class Board {
	
	/*
	 		  create table BOARD (
		 		  b_no NUMBER(10), 
		 		  b_type NUMBER(2), 
		 		  product_no NUMBER(10), 
		 		  b_title VARCHAR2(20), 
		 		  b_content VARCHAR2(5000), 
		 		  b_write VARCHAR2(10),
		 		  b_date SYSDATE, 
		 		  b_count NUMBER(10), 
		 		  b_plusfile1 VARCHAR2(20), 
		 		  b_plusfile2 VARCHAR2(20), 
		 		  b_reference_no NUMBER(10), 
		 		  b_reply_dep NUMBER(50), 
		 		  b_reply_order NUMBER(50),
		 		  b_reply_count NUMBER(10), 
		 		  m_no NUMBER(10)   
		 	  );
	*/
	
	/**
	 * 글 순서
	 */
	private int idx;
	
	/**
	 * 글번호
	 */
	private int b_no;
	/**
	 * 제목
	 */
	private String b_title;
	
	/**
	 * 내용
	 */
	private String b_content;
	
	/**
	 * 작성자
	 */
	private String b_write;
	
	/**
	 * 비밀번호
	 */
	private String b_pw;
	/**
	 * 조회수
	 */
	private int b_count;
	
	/**
	 * 파일 이름1
	 */
	private String b_plusfile1;
	/**
	 * 파일 이름2
	 */
	private String b_plusfile2;
	
	/**
	 * 생성일
	 */
	private Date b_date;
	/**
	 * 참조번호
	 */
	private int b_reference_no;
	/**
	 * 답글깊이
	 */
	private int b_reply_dep;
	/**
	 * 답글부모번호
	 */
	private int b_reply_order;
	/**
	 * 댓글갯수
	 */
	private int b_reply_count;
	
	public Board(int idx, int b_no, String b_title, String b_content,
			String b_write, String b_pw, int b_count, String b_plusfile1,
			String b_plusfile2, Date b_date, int b_reference_no,
			int b_reply_dep, int b_reply_order, int b_reply_count) {
		super();
		this.idx = idx;
		this.b_no = b_no;
		this.b_title = b_title;
		this.b_content = b_content;
		this.b_write = b_write;
		this.b_pw = b_pw;
		this.b_count = b_count;
		this.b_plusfile1 = b_plusfile1;
		this.b_plusfile2 = b_plusfile2;
		this.b_date = b_date;
		this.b_reference_no = b_reference_no;
		this.b_reply_dep = b_reply_dep;
		this.b_reply_order = b_reply_order;
		this.b_reply_count = b_reply_count;
	}
	
	public Board() {
		super();
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public String getB_write() {
		return b_write;
	}
	public void setB_write(String b_write) {
		this.b_write = b_write;
	}
	public String getB_pw() {
		return b_pw;
	}
	public void setB_pw(String b_pw) {
		this.b_pw = b_pw;
	}
	public int getB_count() {
		return b_count;
	}
	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	public String getB_plusfile1() {
		return b_plusfile1;
	}
	public void setB_plusfile1(String b_plusfile1) {
		this.b_plusfile1 = b_plusfile1;
	}
	public String getB_plusfile2() {
		return b_plusfile2;
	}
	public void setB_plusfile2(String b_plusfile2) {
		this.b_plusfile2 = b_plusfile2;
	}
	public Date getB_date() {
		return b_date;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public int getB_reference_no() {
		return b_reference_no;
	}
	public void setB_reference_no(int b_reference_no) {
		this.b_reference_no = b_reference_no;
	}
	public int getB_reply_dep() {
		return b_reply_dep;
	}
	public void setB_reply_dep(int b_reply_dep) {
		this.b_reply_dep = b_reply_dep;
	}
	public int getB_reply_order() {
		return b_reply_order;
	}
	public void setB_reply_order(int b_reply_order) {
		this.b_reply_order = b_reply_order;
	}
	public int getB_reply_count() {
		return b_reply_count;
	}
	public void setB_reply_count(int b_reply_count) {
		this.b_reply_count = b_reply_count;
	}
	
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", b_no=" + b_no + ", b_title=" + b_title
				+ ", b_content=" + b_content + ", b_write=" + b_write
				+ ", b_pw=" + b_pw + ", b_count=" + b_count + ", b_plusfile1="
				+ b_plusfile1 + ", b_plusfile2=" + b_plusfile2 + ", b_date="
				+ b_date + ", b_reference_no=" + b_reference_no
				+ ", b_reply_dep=" + b_reply_dep + ", b_reply_order="
				+ b_reply_order + ", b_reply_count=" + b_reply_count + "]";
	}

	
	
}
