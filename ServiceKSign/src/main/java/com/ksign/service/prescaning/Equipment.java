package com.ksign.service.prescaning;

public class Equipment {
	/**
	 * 장비환경 정보 테이블
	 * create table equipment (
		 * eNO NUMBER(10) , 
		 * eTYPE VARCHAR2(50) , 
		 * eBUSINESS VARCHAR2(200) , 
		 * eDBCOUNT NUMBER(10) , 
		 * eOS VARCHAR2(200) , 
		 * eHOSTNAME VARCHAR2(200) , 
		 * eIP VARCHAR2(100) , 
		 * ePORT NUMBER(20) , 
		 * eSID VARCHAR2(20) , 
		 * eOSID VARCHAR2(50) , 
		 * eOSPW VARCHAR2(50) , 
		 * eDBID VARCHAR2(50) ,  
		 * eDBPW VARCHAR2(50) , 
		 * eSERVER VARCHAR2(200) , 
		 * eFILTER VARCHAR2(200) , 
		 * eENCRYPTOR VARCHAR2(100) , 
		 * eINSTALLPATH VARCHAR2(1000) , 
		 * eAOOLICATIONMETHOD VARCHAR2(1000) ,  
		 * eDETAILS VARCHAR2(1000) , 
		 * eOTHER VARCHAR2(1000) , 
		 * e_P_NO NUMBER(10) , 
		 * e_FILE VARCHAR2(20)   
	 * );
	 */
	
	/**
	 * 장비정보넘버	NUMBER
	 */
	private int eNO;	
	/**
	 * 장비타입	VARCHAR2
	 */
	private String eTYPE;	
	/**
	 * 업무명	VARCHAR2
	 */
	private String eBUSINESS;	
	/**
	 * DB수량	eDBCOUNT
	 */
	private  int eDBCOUNT;	
	/**
	 * OS	VARCHAR2
	 */
	private String eOS;	
	/**
	 * HOSTNAME	VARCHAR2
	 */
	private String eHOSTNAME;	
	/**
	 * IP	VARCHAR2
	 */
	private String eIP;	
	/**
	 * PORT	NUMBER
	 */
	private int ePORT;	
	/**
	 * SID	VARCHAR2
	 */
	private String eSID;	
	/**
	 * OS ID	VARCHAR2
	 */
	private String eOSID;	
	/**
	 * OS PW	VARCHAR2
	 */
	private String eOSPW;	
	/**
	 * DB ID	VARCHAR2
	 */
	private String eDBID;	
	/**
	 * DB PW	VARCHAR2
	 */
	private String eDBPW;	
	/**
	 * 설치SERVER버전	VARCHAR2
	 */
	private String eSERVER;	
	/**
	 * 설치FILTER버전	VARCHAR2
	 */
	private String eFILTER;	
	/**
	 * 설치코어버전	VARCHAR2
	 */
	private String eENCRYPTOR;	
	/**
	 * 설치경로	VARCHAR2
	 */
	private String eINSTALLPATH;	
	/**
	 * 암호화적용방식	VARCHAR2
	 */
	private String eAOOLICATIONMETHOD;	
	/**
	 * 세부사항	VARCHAR2
	 */
	private String eDETAILS;	
	/**
	 * 기타	VARCHAR2
	 */
	private String eOTHER;	
	/**
	 * 고객넘버	VARCHAR2
	 */
	private String e_P_NO;
	/**
	 * 첨부파일명
	 * @return filename
	 */
	private String e_FILE;

	public Equipment(int eNO, String eTYPE, String eBUSINESS, int eDBCOUNT,
			String eOS, String eHOSTNAME, String eIP, int ePORT, String eSID,
			String eOSID, String eOSPW, String eDBID, String eDBPW,
			String eSERVER, String eFILTER, String eENCRYPTOR,
			String eINSTALLPATH, String eAOOLICATIONMETHOD, String eDETAILS,
			String eOTHER, String e_P_NO, String e_FILE) {
		super();
		this.eNO = eNO;
		this.eTYPE = eTYPE;
		this.eBUSINESS = eBUSINESS;
		this.eDBCOUNT = eDBCOUNT;
		this.eOS = eOS;
		this.eHOSTNAME = eHOSTNAME;
		this.eIP = eIP;
		this.ePORT = ePORT;
		this.eSID = eSID;
		this.eOSID = eOSID;
		this.eOSPW = eOSPW;
		this.eDBID = eDBID;
		this.eDBPW = eDBPW;
		this.eSERVER = eSERVER;
		this.eFILTER = eFILTER;
		this.eENCRYPTOR = eENCRYPTOR;
		this.eINSTALLPATH = eINSTALLPATH;
		this.eAOOLICATIONMETHOD = eAOOLICATIONMETHOD;
		this.eDETAILS = eDETAILS;
		this.eOTHER = eOTHER;
		this.e_P_NO = e_P_NO;
		this.e_FILE = e_FILE;
	}

	public int geteNO() {
		return eNO;
	}
	public void seteNO(int eNO) {
		this.eNO = eNO;
	}
	public String geteTYPE() {
		return eTYPE;
	}
	public void seteTYPE(String eTYPE) {
		this.eTYPE = eTYPE;
	}
	public String geteBUSINESS() {
		return eBUSINESS;
	}
	public void seteBUSINESS(String eBUSINESS) {
		this.eBUSINESS = eBUSINESS;
	}
	public int geteDBCOUNT() {
		return eDBCOUNT;
	}
	public void seteDBCOUNT(int eDBCOUNT) {
		this.eDBCOUNT = eDBCOUNT;
	}
	public String geteOS() {
		return eOS;
	}
	public void seteOS(String eOS) {
		this.eOS = eOS;
	}
	public String geteHOSTNAME() {
		return eHOSTNAME;
	}
	public void seteHOSTNAME(String eHOSTNAME) {
		this.eHOSTNAME = eHOSTNAME;
	}
	public String geteIP() {
		return eIP;
	}
	public void seteIP(String eIP) {
		this.eIP = eIP;
	}
	public int getePORT() {
		return ePORT;
	}
	public void setePORT(int ePORT) {
		this.ePORT = ePORT;
	}
	public String geteSID() {
		return eSID;
	}
	public void seteSID(String eSID) {
		this.eSID = eSID;
	}
	public String geteOSID() {
		return eOSID;
	}
	public void seteOSID(String eOSID) {
		this.eOSID = eOSID;
	}
	public String geteOSPW() {
		return eOSPW;
	}
	public void seteOSPW(String eOSPW) {
		this.eOSPW = eOSPW;
	}
	public String geteDBID() {
		return eDBID;
	}
	public void seteDBID(String eDBID) {
		this.eDBID = eDBID;
	}
	public String geteDBPW() {
		return eDBPW;
	}
	public void seteDBPW(String eDBPW) {
		this.eDBPW = eDBPW;
	}
	public String geteSERVER() {
		return eSERVER;
	}
	public void seteSERVER(String eSERVER) {
		this.eSERVER = eSERVER;
	}
	public String geteFILTER() {
		return eFILTER;
	}
	public void seteFILTER(String eFILTER) {
		this.eFILTER = eFILTER;
	}
	public String geteENCRYPTOR() {
		return eENCRYPTOR;
	}
	public void seteENCRYPTOR(String eENCRYPTOR) {
		this.eENCRYPTOR = eENCRYPTOR;
	}
	public String geteINSTALLPATH() {
		return eINSTALLPATH;
	}
	public void seteINSTALLPATH(String eINSTALLPATH) {
		this.eINSTALLPATH = eINSTALLPATH;
	}
	public String geteAOOLICATIONMETHOD() {
		return eAOOLICATIONMETHOD;
	}
	public void seteAOOLICATIONMETHOD(String eAOOLICATIONMETHOD) {
		this.eAOOLICATIONMETHOD = eAOOLICATIONMETHOD;
	}
	public String geteDETAILS() {
		return eDETAILS;
	}
	public void seteDETAILS(String eDETAILS) {
		this.eDETAILS = eDETAILS;
	}
	public String geteOTHER() {
		return eOTHER;
	}
	public void seteOTHER(String eOTHER) {
		this.eOTHER = eOTHER;
	}
	public String getE_P_NO() {
		return e_P_NO;
	}
	public void setE_P_NO(String e_P_NO) {
		this.e_P_NO = e_P_NO;
	}
	public String getE_FILE() {
		return e_FILE;
	}
	public void setE_FILE(String e_FILE) {
		this.e_FILE = e_FILE;
	}
	
	@Override
	public String toString() {
		return "Equipment [eNO=" + eNO + ", eTYPE=" + eTYPE + ", eBUSINESS="
				+ eBUSINESS + ", eDBCOUNT=" + eDBCOUNT + ", eOS=" + eOS
				+ ", eHOSTNAME=" + eHOSTNAME + ", eIP=" + eIP + ", ePORT="
				+ ePORT + ", eSID=" + eSID + ", eOSID=" + eOSID + ", eOSPW="
				+ eOSPW + ", eDBID=" + eDBID + ", eDBPW=" + eDBPW
				+ ", eSERVER=" + eSERVER + ", eFILTER=" + eFILTER
				+ ", eENCRYPTOR=" + eENCRYPTOR + ", eINSTALLPATH="
				+ eINSTALLPATH + ", eAOOLICATIONMETHOD=" + eAOOLICATIONMETHOD
				+ ", eDETAILS=" + eDETAILS + ", eOTHER=" + eOTHER + ", e_P_NO="
				+ e_P_NO + ", e_FILE=" + e_FILE + "]";
	}

}
