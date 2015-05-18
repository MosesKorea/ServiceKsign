package com.ksign.service.project;

import java.sql.Date;

public class Project {

/*	create table PROJECT (
 * 			PNO NUMBER(10) , 
 * 			PNAME VARCHAR2(30) , 
 *          PTYPE VARCHAR2(30) , 
 *          PLEVEL NUMBER(3) , 
 *          PSTARTDAY SYSDATE , 
 *          PFINISHDAY SYSDATE,
 *          PPERSENT NUMBER(4) , 
 *          PSTEP VARCHAR(10) , 
 *          PCONDITION VARCHAR2(2000) , 
 *          PCOMMENT VARCHAR2(2000) , 
 *          PCREATEDAY SYSDATE   
 *          );
*/
	/**
	 *  프로젝트 넘버
	 */
	private int pNO;
	/**
	 *  프로젝트 이름
	 */
	private String pNAME;
	/**
	 *  프로젝트 타입
	 *  공공, 민수, 금융, 교육
	 */
	private String pTYPE;
	/**
	 *  프로젝트에 난이도
	 */
	private int pLEVEL;
	/**
	 * 프로젝트 시작일
	 */
	private Date pSTARTDAY;
	/**
	 *  완료 예정일
	 */
	private Date pFINISHDAY;
	/**
	 * 프로젝트 진행률
	 * 10 퍼센트씩	 
	 */
	private int pPERSENT;
	/**
	 * 진행단계
	 * 착수,분석,설계(개발기),이행(운영기),안정화
	 */
	private String pSTEP; 
	/**
	 * 진행상태
	 * 양호,지연,중단
	 */
	private String pCONDITION; 
	/**
	 * 프로젝트 개요
	 */
	 private String pCOMMENT; 
	/**
	 * 프로젝트 등록일
	 */
	 private Date pCREATEDAY;
	 
	 
	public Project() {
		super();
		System.out.println("객체 생성");
	}


	public Project(int pNO, String pNAME, String pTYPE, int pLEVEL,
			Date pSTARTDAY, Date pFINISHDAY, int pPERSENT, String pSTEP,
			String pCONDITION, String pCOMMENT, Date pCREATEDAY) {
		super();
		this.pNO = pNO;
		this.pNAME = pNAME;
		this.pTYPE = pTYPE;
		this.pLEVEL = pLEVEL;
		this.pSTARTDAY = pSTARTDAY;
		this.pFINISHDAY = pFINISHDAY;
		this.pPERSENT = pPERSENT;
		this.pSTEP = pSTEP;
		this.pCONDITION = pCONDITION;
		this.pCOMMENT = pCOMMENT;
		this.pCREATEDAY = pCREATEDAY;
	}


	public int getpNO() {
		return pNO;
	}


	public void setpNO(int pNO) {
		this.pNO = pNO;
	}


	public String getpNAME() {
		return pNAME;
	}


	public void setpNAME(String pNAME) {
		this.pNAME = pNAME;
	}


	public String getpTYPE() {
		return pTYPE;
	}


	public void setpTYPE(String pTYPE) {
		this.pTYPE = pTYPE;
	}


	public int getpLEVEL() {
		return pLEVEL;
	}


	public void setpLEVEL(int pLEVEL) {
		this.pLEVEL = pLEVEL;
	}


	public Date getpSTARTDAY() {
		return pSTARTDAY;
	}


	public void setpSTARTDAY(Date pSTARTDAY) {
		this.pSTARTDAY = pSTARTDAY;
	}


	public Date getpFINISHDAY() {
		return pFINISHDAY;
	}


	public void setpFINISHDAY(Date pFINISHDAY) {
		this.pFINISHDAY = pFINISHDAY;
	}


	public int getpPERSENT() {
		return pPERSENT;
	}


	public void setpPERSENT(int pPERSENT) {
		this.pPERSENT = pPERSENT;
	}


	public String getpSTEP() {
		return pSTEP;
	}


	public void setpSTEP(String pSTEP) {
		this.pSTEP = pSTEP;
	}


	public String getpCONDITION() {
		return pCONDITION;
	}


	public void setpCONDITION(String pCONDITION) {
		this.pCONDITION = pCONDITION;
	}


	public String getpCOMMENT() {
		return pCOMMENT;
	}


	public void setpCOMMENT(String pCOMMENT) {
		this.pCOMMENT = pCOMMENT;
	}


	public Date getpCREATEDAY() {
		return pCREATEDAY;
	}


	public void setpCREATEDAY(Date pCREATEDAY) {
		this.pCREATEDAY = pCREATEDAY;
	}


	@Override
	public String toString() {
		return "Project [pNO=" + pNO + ", pNAME=" + pNAME + ", pTYPE=" + pTYPE
				+ ", pLEVEL=" + pLEVEL + ", pSTARTDAY=" + pSTARTDAY
				+ ", pFINISHDAY=" + pFINISHDAY + ", pPERSENT=" + pPERSENT
				+ ", pSTEP=" + pSTEP + ", pCONDITION=" + pCONDITION
				+ ", pCOMMENT=" + pCOMMENT + ", pCREATEDAY=" + pCREATEDAY + "]";
	}
	
	
	
	
	
	
	
	
}
