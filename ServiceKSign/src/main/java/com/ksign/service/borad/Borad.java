package com.ksign.service.borad;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Borad {
	
	/*CREATE TABLE board (
    board_no             NUMBER(10) NOT NULL,
    board_category_no    NUMBER(10) NOT NULL,
    board_writer         VARCHAR2(50) NOT NULL,
    board_title          VARCHAR2(100) NOT NULL,
    board_filename       VARCHAR2(100) NOT NULL,
    board_count          NUMBER(50) NOT NULL,
    board_content        VARCHAR2(100) NOT NULL,
    board_date           DATE NULL,
    board_reference_no   NUMBER(10) NOT NULL,
    board_reply_dep      NUMBER(50) NOT NULL,
    board_reply_order    NUMBER(50) NOT NULL,
    member_no            NUMBER(10) NOT NULL
);*/
@JsonProperty("idx")
private int idx;//게시판 순서 번호
@JsonProperty("board_no")
private int board_no;//게시판 번호(pk)
@JsonProperty("board_category_no")
private int board_category_no;//게시판 종류
@JsonProperty("board_writer")
private String board_writer;//게지물 작성자
@JsonProperty("board_title")
private String board_title;//게시물제목
@JsonProperty("board_filename")
private String board_filename;//저장파일이름
@JsonProperty("board_count")
private int board_count;//게시물 번호
@JsonProperty("board_content")
private String board_content;//게시물내용
@JsonProperty("board_date")
private Date board_date;//게시날짜
@JsonProperty("board_reference_no")
private int board_reference_no;//댓글 참조 번호(게시판별)
@JsonProperty("board_reply_dep")
private int board_reply_dep;//답글 들여쓰기
@JsonProperty("board_reply_order")
private int board_reply_order;//답글 순서
@JsonProperty("member_no")
private int member_no;//회원 번호
@JsonProperty("board_kind_no")
private int board_kind_no;//종류
@JsonProperty("board_kind_name")
private String board_kind_name;//종류 이름

public Borad() {
	super();
}

public Borad(int idx, int board_no, int board_category_no, String board_writer,
		String board_title, String board_filename, int board_count,
		String board_content, Date board_date, int board_reference_no,
		int board_reply_dep, int board_reply_order, int member_no,
		int board_kind_no, String board_kind_name) {
	super();
	this.idx = idx;
	this.board_no = board_no;
	this.board_category_no = board_category_no;
	this.board_writer = board_writer;
	this.board_title = board_title;
	this.board_filename = board_filename;
	this.board_count = board_count;
	this.board_content = board_content;
	this.board_date = board_date;
	this.board_reference_no = board_reference_no;
	this.board_reply_dep = board_reply_dep;
	this.board_reply_order = board_reply_order;
	this.member_no = member_no;
	this.board_kind_no = board_kind_no;
	this.board_kind_name = board_kind_name;
}

public int getIdx() {
	return idx;
}

public void setIdx(int idx) {
	this.idx = idx;
}

public int getBoard_no() {
	return board_no;
}

public void setBoard_no(int board_no) {
	this.board_no = board_no;
}

public int getBoard_category_no() {
	return board_category_no;
}

public void setBoard_category_no(int board_category_no) {
	this.board_category_no = board_category_no;
}

public String getBoard_writer() {
	return board_writer;
}

public void setBoard_writer(String board_writer) {
	this.board_writer = board_writer;
}

public String getBoard_title() {
	return board_title;
}

public void setBoard_title(String board_title) {
	this.board_title = board_title;
}

public String getBoard_filename() {
	return board_filename;
}

public void setBoard_filename(String board_filename) {
	this.board_filename = board_filename;
}

public int getBoard_count() {
	return board_count;
}

public void setBoard_count(int board_count) {
	this.board_count = board_count;
}

public String getBoard_content() {
	return board_content;
}

public void setBoard_content(String board_content) {
	this.board_content = board_content;
}

public Date getBoard_date() {
	return board_date;
}

public void setBoard_date(Date board_date) {
	this.board_date = board_date;
}

public int getBoard_reference_no() {
	return board_reference_no;
}

public void setBoard_reference_no(int board_reference_no) {
	this.board_reference_no = board_reference_no;
}

public int getBoard_reply_dep() {
	return board_reply_dep;
}

public void setBoard_reply_dep(int board_reply_dep) {
	this.board_reply_dep = board_reply_dep;
}

public int getBoard_reply_order() {
	return board_reply_order;
}

public void setBoard_reply_order(int board_reply_order) {
	this.board_reply_order = board_reply_order;
}

public int getMember_no() {
	return member_no;
}

public void setMember_no(int member_no) {
	this.member_no = member_no;
}

public int getBoard_kind_no() {
	return board_kind_no;
}

public void setBoard_kind_no(int board_kind_no) {
	this.board_kind_no = board_kind_no;
}

public String getBoard_kind_name() {
	return board_kind_name;
}

public void setBoard_kind_name(String board_kind_name) {
	this.board_kind_name = board_kind_name;
}

@Override
public String toString() {
	return "Borad [idx=" + idx + ", board_no=" + board_no
			+ ", board_category_no=" + board_category_no + ", board_writer="
			+ board_writer + ", board_title=" + board_title
			+ ", board_filename=" + board_filename + ", board_count="
			+ board_count + ", board_content=" + board_content
			+ ", board_date=" + board_date + ", board_reference_no="
			+ board_reference_no + ", board_reply_dep=" + board_reply_dep
			+ ", board_reply_order=" + board_reply_order + ", member_no="
			+ member_no + ", board_kind_no=" + board_kind_no
			+ ", board_kind_name=" + board_kind_name + "]";
}




}
