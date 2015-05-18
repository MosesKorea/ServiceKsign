package com.ksign.service.borad;

import java.sql.Date;



public class Board {
	
	/**
	 *	create table PETCBORAD (
		PETCNO NUMBER(10) , 
		PETCTITLE VARCHAR2(20) , 
		PETCWRITHER VARCHAR2(200) ,
		 PETCSYSDATE SYSDATE(5000) , 
		 PETCPASSWD NUMBER(10) , 
		 PETCCONTENT VARCHAR2(5000) , 
		 PETCCOUNT NUMBER(10) , 
		 PETCDEPTNO NUMBER(3) , 
		 PETCHEADNO NUMBER(10) , 
		 PETCHEADNOODER VARCHAR2(50) , 
		 PETC_FILE VARCHAR2(50) , 
		 PETC_P_NO NUMBER(10)
);

	 */
	
	/**
	 * 글 순서
	 */
	private int idx;
	
	/**
	 * 기타넘버
	 */
	private int PETCNO ; 
	/**
	 * 제목
	 */
	private String PETCTITLE; 
	/**
	 * 작성자
	 */
	private String PETCWRITHER; 
	/**
	 * 등록일
	 */
	private Date PETCSYSDATE; 
	/**
	 * 게시물비밀번호
	 */
	private int PETCPASSWD; 
	/**
	 * 내용
	 */
	private String PETCCONTENT; 
	/**
	 * 조회수
	 */
	private int PETCCOUNT; 
	/**
	 * 게시물깊이
	 */
	private int PETCDEPTNO; 
	/**
	 * 답글해더넘버
	 */
	private int PETCHEADNO; 
	/**
	 * 답글해더넘버 어미넘버
	 */
	private int PETCHEADNOODER; 
	/**
	 * 첨부파일
	 */
	private String PETC_FILE; 
	/**
	 * 프로젝트넘버
	 */
	private int PETC_P_NO;
	public Board(int idx, int pETCNO, String pETCTITLE, String pETCWRITHER,
			Date pETCSYSDATE, int pETCPASSWD, String pETCCONTENT,
			int pETCCOUNT, int pETCDEPTNO, int pETCHEADNO, int pETCHEADNOODER,
			String pETC_FILE, int pETC_P_NO) {
		super();
		this.idx = idx;
		PETCNO = pETCNO;
		PETCTITLE = pETCTITLE;
		PETCWRITHER = pETCWRITHER;
		PETCSYSDATE = pETCSYSDATE;
		PETCPASSWD = pETCPASSWD;
		PETCCONTENT = pETCCONTENT;
		PETCCOUNT = pETCCOUNT;
		PETCDEPTNO = pETCDEPTNO;
		PETCHEADNO = pETCHEADNO;
		PETCHEADNOODER = pETCHEADNOODER;
		PETC_FILE = pETC_FILE;
		PETC_P_NO = pETC_P_NO;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public int getPETCNO() {
		return PETCNO;
	}
	public void setPETCNO(int pETCNO) {
		PETCNO = pETCNO;
	}
	public String getPETCTITLE() {
		return PETCTITLE;
	}
	public void setPETCTITLE(String pETCTITLE) {
		PETCTITLE = pETCTITLE;
	}
	public String getPETCWRITHER() {
		return PETCWRITHER;
	}
	public void setPETCWRITHER(String pETCWRITHER) {
		PETCWRITHER = pETCWRITHER;
	}
	public Date getPETCSYSDATE() {
		return PETCSYSDATE;
	}
	public void setPETCSYSDATE(Date pETCSYSDATE) {
		PETCSYSDATE = pETCSYSDATE;
	}
	public int getPETCPASSWD() {
		return PETCPASSWD;
	}
	public void setPETCPASSWD(int pETCPASSWD) {
		PETCPASSWD = pETCPASSWD;
	}
	public String getPETCCONTENT() {
		return PETCCONTENT;
	}
	public void setPETCCONTENT(String pETCCONTENT) {
		PETCCONTENT = pETCCONTENT;
	}
	public int getPETCCOUNT() {
		return PETCCOUNT;
	}
	public void setPETCCOUNT(int pETCCOUNT) {
		PETCCOUNT = pETCCOUNT;
	}
	public int getPETCDEPTNO() {
		return PETCDEPTNO;
	}
	public void setPETCDEPTNO(int pETCDEPTNO) {
		PETCDEPTNO = pETCDEPTNO;
	}
	public int getPETCHEADNO() {
		return PETCHEADNO;
	}
	public void setPETCHEADNO(int pETCHEADNO) {
		PETCHEADNO = pETCHEADNO;
	}
	public int getPETCHEADNOODER() {
		return PETCHEADNOODER;
	}
	public void setPETCHEADNOODER(int pETCHEADNOODER) {
		PETCHEADNOODER = pETCHEADNOODER;
	}
	public String getPETC_FILE() {
		return PETC_FILE;
	}
	public void setPETC_FILE(String pETC_FILE) {
		PETC_FILE = pETC_FILE;
	}
	public int getPETC_P_NO() {
		return PETC_P_NO;
	}
	public void setPETC_P_NO(int pETC_P_NO) {
		PETC_P_NO = pETC_P_NO;
	}
	@Override
	public String toString() {
		return "Board [idx=" + idx + ", PETCNO=" + PETCNO + ", PETCTITLE="
				+ PETCTITLE + ", PETCWRITHER=" + PETCWRITHER + ", PETCSYSDATE="
				+ PETCSYSDATE + ", PETCPASSWD=" + PETCPASSWD + ", PETCCONTENT="
				+ PETCCONTENT + ", PETCCOUNT=" + PETCCOUNT + ", PETCDEPTNO="
				+ PETCDEPTNO + ", PETCHEADNO=" + PETCHEADNO
				+ ", PETCHEADNOODER=" + PETCHEADNOODER + ", PETC_FILE="
				+ PETC_FILE + ", PETC_P_NO=" + PETC_P_NO + "]";
	}
	
	
	
}
