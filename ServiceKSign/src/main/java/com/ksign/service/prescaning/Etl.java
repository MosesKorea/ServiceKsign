package com.ksign.service.prescaning;

public class Etl {
	
	/**
	 * 암호화 컬럼 정보 테이블
	 * create table etl (
			 * ETLNO NUMBER(10) , 
			 * ETLSERVICE VARCHAR2(50) , 
			 * ETLSCHEMA VARCHAR2(50) , 
			 * ETLTABLE VARCHAR2(50) , 
			 * ETLTABLEINFO VARCHAR2(1000) , 
			 * ETLCOUNT NUMBER(100) , 
			 * ETLCALUMN VARCHAR2(50) , 
			 * ETLCALUMNINFO VARCHAR2(1000) , 
			 * ETLTYPE VARCHAR2(50) , 
			 * ETLLENGTH NUMBER(100) , 
			 * ETLPK VARCHAR2(50) , 
			 * ETLFK VARCHAR2(50) ,  
			 * ETLOTHER VARCHAR2(1000) , 
			 * ETLPOLICY VARCHAR2(50) , 
			 * ETLTRIGGER VARCHAR2(50) , 
			 * ETLMVIEW VARCHAR2(50) , 
			 * ETLHENCRYPT VARCHAR2(50) , 
			 * ETLPFUNCTION VARCHAR2(50) ,  
			 * ETLDEVISIONCALUMN VARCHAR2(50) , 
			 * ETLSELECT VARCHAR2(50) , 
			 * ETLFROM VARCHAR2(50) , 
			 * ETLWHERE VARCHAR2(50) , 
			 * ETLHINT VARCHAR2(50) , 
			 * ETL_P_FILE NUMBER(10) ,
			 * ETL_FILE VARCHAR2(20)
		);
	 */
	/**
	 * 암호화대상 넘버
	 */
	private int ETLNO; 
	/**
	 * 서비스 명
	 */
	private String ETLSERVICE;
	/**
	 * 테이블명
	 */
	private String ETLSCHEMA; 
	/**
	 * 스키마명
	 */
	private String ETLTABLE; 
	/**
	 * 테이블설명
	 */
	private String ETLTABLEINFO; 
	/**
	 * 건수
	 */
	private int ETLCOUNT; 
	/**
	 * 컬럼
	 */
	private String ETLCALUMN; 
	/**
	 * 컬럼설명
	 */
	private String ETLCALUMNINFO; 
	/**
	 * 타입
	 */
	private String ETLTYPE ; 
	/**
	 * 길이
	 */
	private int ETLLENGTH ; 
	/**
	 * PK
	 */
	private String ETLPK ; 
	/**
	 * FK
	 */
	private String ETLFK ;  
	/**
	 * 비고
	 */
	private String ETLOTHER ; 
	/**
	 * 정책
	 */
	private String ETLPOLICY ; 
	/**
	 * 트리거 유무
	 */
	private String ETLTRIGGER ; 
	/**
	 * 뷰 유무
	 */
	private String ETLMVIEW ; 
	/**
	 * 기암호화
	 */
	private String ETLHENCRYPT ; 
	/**
	 * 복수함수
	 */
	private String ETLPFUNCTION ;  
	/**
	 * 구분컬럼
	 */
	private String ETLDEVISIONCALUMN ; 
	/**
	 * SELECT
	 */
	private String ETLSELECT ; 
	/**
	 * FROM
	 */
	private String ETLFROM ; 
	/**
	 * WHERE
	 */
	private String ETLWHERE ; 
	/**
	 * HINT
	 */
	private String ETLHINT ; 
	/**
	 * 해당프로벡트넘버
	 */
	private int ETL_P_FILE ;
	/**
	 * 첨부파일1
	 */
	private String ETL_FILE ;
	
	public Etl(int eTLNO, String eTLSERVICE, String eTLSCHEMA, String eTLTABLE,
			String eTLTABLEINFO, int eTLCOUNT, String eTLCALUMN,
			String eTLCALUMNINFO, String eTLTYPE, int eTLLENGTH, String eTLPK,
			String eTLFK, String eTLOTHER, String eTLPOLICY, String eTLTRIGGER,
			String eTLMVIEW, String eTLHENCRYPT, String eTLPFUNCTION,
			String eTLDEVISIONCALUMN, String eTLSELECT, String eTLFROM,
			String eTLWHERE, String eTLHINT, int eTL_P_FILE, String eTL_FILE) {
		super();
		ETLNO = eTLNO;
		ETLSERVICE = eTLSERVICE;
		ETLSCHEMA = eTLSCHEMA;
		ETLTABLE = eTLTABLE;
		ETLTABLEINFO = eTLTABLEINFO;
		ETLCOUNT = eTLCOUNT;
		ETLCALUMN = eTLCALUMN;
		ETLCALUMNINFO = eTLCALUMNINFO;
		ETLTYPE = eTLTYPE;
		ETLLENGTH = eTLLENGTH;
		ETLPK = eTLPK;
		ETLFK = eTLFK;
		ETLOTHER = eTLOTHER;
		ETLPOLICY = eTLPOLICY;
		ETLTRIGGER = eTLTRIGGER;
		ETLMVIEW = eTLMVIEW;
		ETLHENCRYPT = eTLHENCRYPT;
		ETLPFUNCTION = eTLPFUNCTION;
		ETLDEVISIONCALUMN = eTLDEVISIONCALUMN;
		ETLSELECT = eTLSELECT;
		ETLFROM = eTLFROM;
		ETLWHERE = eTLWHERE;
		ETLHINT = eTLHINT;
		ETL_P_FILE = eTL_P_FILE;
		ETL_FILE = eTL_FILE;
	}

	public int getETLNO() {
		return ETLNO;
	}
	public void setETLNO(int eTLNO) {
		ETLNO = eTLNO;
	}
	public String getETLSERVICE() {
		return ETLSERVICE;
	}
	public void setETLSERVICE(String eTLSERVICE) {
		ETLSERVICE = eTLSERVICE;
	}
	public String getETLSCHEMA() {
		return ETLSCHEMA;
	}
	public void setETLSCHEMA(String eTLSCHEMA) {
		ETLSCHEMA = eTLSCHEMA;
	}
	public String getETLTABLE() {
		return ETLTABLE;
	}
	public void setETLTABLE(String eTLTABLE) {
		ETLTABLE = eTLTABLE;
	}
	public String getETLTABLEINFO() {
		return ETLTABLEINFO;
	}
	public void setETLTABLEINFO(String eTLTABLEINFO) {
		ETLTABLEINFO = eTLTABLEINFO;
	}
	public int getETLCOUNT() {
		return ETLCOUNT;
	}
	public void setETLCOUNT(int eTLCOUNT) {
		ETLCOUNT = eTLCOUNT;
	}
	public String getETLCALUMN() {
		return ETLCALUMN;
	}
	public void setETLCALUMN(String eTLCALUMN) {
		ETLCALUMN = eTLCALUMN;
	}
	public String getETLCALUMNINFO() {
		return ETLCALUMNINFO;
	}
	public void setETLCALUMNINFO(String eTLCALUMNINFO) {
		ETLCALUMNINFO = eTLCALUMNINFO;
	}
	public String getETLTYPE() {
		return ETLTYPE;
	}
	public void setETLTYPE(String eTLTYPE) {
		ETLTYPE = eTLTYPE;
	}
	public int getETLLENGTH() {
		return ETLLENGTH;
	}
	public void setETLLENGTH(int eTLLENGTH) {
		ETLLENGTH = eTLLENGTH;
	}
	public String getETLPK() {
		return ETLPK;
	}
	public void setETLPK(String eTLPK) {
		ETLPK = eTLPK;
	}
	public String getETLFK() {
		return ETLFK;
	}
	public void setETLFK(String eTLFK) {
		ETLFK = eTLFK;
	}
	public String getETLOTHER() {
		return ETLOTHER;
	}
	public void setETLOTHER(String eTLOTHER) {
		ETLOTHER = eTLOTHER;
	}
	public String getETLPOLICY() {
		return ETLPOLICY;
	}
	public void setETLPOLICY(String eTLPOLICY) {
		ETLPOLICY = eTLPOLICY;
	}
	public String getETLTRIGGER() {
		return ETLTRIGGER;
	}
	public void setETLTRIGGER(String eTLTRIGGER) {
		ETLTRIGGER = eTLTRIGGER;
	}
	public String getETLMVIEW() {
		return ETLMVIEW;
	}
	public void setETLMVIEW(String eTLMVIEW) {
		ETLMVIEW = eTLMVIEW;
	}
	public String getETLHENCRYPT() {
		return ETLHENCRYPT;
	}
	public void setETLHENCRYPT(String eTLHENCRYPT) {
		ETLHENCRYPT = eTLHENCRYPT;
	}
	public String getETLPFUNCTION() {
		return ETLPFUNCTION;
	}
	public void setETLPFUNCTION(String eTLPFUNCTION) {
		ETLPFUNCTION = eTLPFUNCTION;
	}
	public String getETLDEVISIONCALUMN() {
		return ETLDEVISIONCALUMN;
	}
	public void setETLDEVISIONCALUMN(String eTLDEVISIONCALUMN) {
		ETLDEVISIONCALUMN = eTLDEVISIONCALUMN;
	}
	public String getETLSELECT() {
		return ETLSELECT;
	}
	public void setETLSELECT(String eTLSELECT) {
		ETLSELECT = eTLSELECT;
	}
	public String getETLFROM() {
		return ETLFROM;
	}
	public void setETLFROM(String eTLFROM) {
		ETLFROM = eTLFROM;
	}
	public String getETLWHERE() {
		return ETLWHERE;
	}
	public void setETLWHERE(String eTLWHERE) {
		ETLWHERE = eTLWHERE;
	}
	public String getETLHINT() {
		return ETLHINT;
	}
	public void setETLHINT(String eTLHINT) {
		ETLHINT = eTLHINT;
	}
	public int getETL_P_FILE() {
		return ETL_P_FILE;
	}
	public void setETL_P_FILE(int eTL_P_FILE) {
		ETL_P_FILE = eTL_P_FILE;
	}
	public String getETL_FILE() {
		return ETL_FILE;
	}
	public void setETL_FILE(String eTL_FILE) {
		ETL_FILE = eTL_FILE;
	}
	
	@Override
	public String toString() {
		return "Etl [ETLNO=" + ETLNO + ", ETLSERVICE=" + ETLSERVICE
				+ ", ETLSCHEMA=" + ETLSCHEMA + ", ETLTABLE=" + ETLTABLE
				+ ", ETLTABLEINFO=" + ETLTABLEINFO + ", ETLCOUNT=" + ETLCOUNT
				+ ", ETLCALUMN=" + ETLCALUMN + ", ETLCALUMNINFO="
				+ ETLCALUMNINFO + ", ETLTYPE=" + ETLTYPE + ", ETLLENGTH="
				+ ETLLENGTH + ", ETLPK=" + ETLPK + ", ETLFK=" + ETLFK
				+ ", ETLOTHER=" + ETLOTHER + ", ETLPOLICY=" + ETLPOLICY
				+ ", ETLTRIGGER=" + ETLTRIGGER + ", ETLMVIEW=" + ETLMVIEW
				+ ", ETLHENCRYPT=" + ETLHENCRYPT + ", ETLPFUNCTION="
				+ ETLPFUNCTION + ", ETLDEVISIONCALUMN=" + ETLDEVISIONCALUMN
				+ ", ETLSELECT=" + ETLSELECT + ", ETLFROM=" + ETLFROM
				+ ", ETLWHERE=" + ETLWHERE + ", ETLHINT=" + ETLHINT
				+ ", ETL_P_FILE=" + ETL_P_FILE + ", ETL_FILE=" + ETL_FILE + "]";
	}

}
