package com.ksign.service.prescaning;

public class Equipment {
	/**
	 * 장비정보넘버	NUMBER
	 */
	private int e_no;	
	/**
	 * 장비타입	VARCHAR2
	 */
	private String e_type;	
	/**
	 * 업무명	VARCHAR2
	 */
	private String e_business;	
	/**
	 * DB수량	NUMBER
	 */
	private  int e_Dbcount;	
	/**
	 * OS	VARCHAR2
	 */
	private String e_os;	
	/**
	 * HOSTNAME	VARCHAR2
	 */
	private String e_hostname;	
	/**
	 * IP	VARCHAR2
	 */
	private String e_ip;	
	/**
	 * PORT	NUMBER
	 */
	private int e_port;	
	/**
	 * SID	VARCHAR2
	 */
	private String e_sid;	
	/**
	 * OS ID	VARCHAR2
	 */
	private String e_osid;	
	/**
	 * OS PW	VARCHAR2
	 */
	private String e_ospw;	
	/**
	 * DB ID	VARCHAR2
	 */
	private String e_dbid;	
	/**
	 * DB PW	VARCHAR2
	 */
	private String e_dbpw;	
	/**
	 * SERVER버전	VARCHAR2
	 */
	private String e_server;	
	/**
	 * FILTER버전	VARCHAR2
	 */
	private String e_filter;	
	/**
	 * 코어버전	VARCHAR2
	 */
	private String e_encryptor;	
	/**
	 * 설치경로	VARCHAR2
	 */
	private String e_installpath;	
	/**
	 * 적용방식	VARCHAR2
	 */
	private String e_applicationmethod;	
	/**
	 * 세부사항	VARCHAR2
	 */
	private String e_details;	
	/**
	 * 기타	VARCHAR2
	 */
	private String e_other;	
	/**
	 * 고객넘버	VARCHAR2
	 */
	private String e_custom_no;
	
	
	public Equipment(int e_no, String e_type, String e_business, int e_Dbcount,
			String e_os, String e_hostname, String e_ip, int e_port,
			String e_sid, String e_osid, String e_ospw, String e_dbid,
			String e_dbpw, String e_server, String e_filter,
			String e_encryptor, String e_installpath,
			String e_applicationmethod, String e_details, String e_other,
			String e_custom_no) {
		super();
		this.e_no = e_no;
		this.e_type = e_type;
		this.e_business = e_business;
		this.e_Dbcount = e_Dbcount;
		this.e_os = e_os;
		this.e_hostname = e_hostname;
		this.e_ip = e_ip;
		this.e_port = e_port;
		this.e_sid = e_sid;
		this.e_osid = e_osid;
		this.e_ospw = e_ospw;
		this.e_dbid = e_dbid;
		this.e_dbpw = e_dbpw;
		this.e_server = e_server;
		this.e_filter = e_filter;
		this.e_encryptor = e_encryptor;
		this.e_installpath = e_installpath;
		this.e_applicationmethod = e_applicationmethod;
		this.e_details = e_details;
		this.e_other = e_other;
		this.e_custom_no = e_custom_no;
	}
	
	public int getE_no() {
		return e_no;
	}
	public void setE_no(int e_no) {
		this.e_no = e_no;
	}
	public String getE_type() {
		return e_type;
	}
	public void setE_type(String e_type) {
		this.e_type = e_type;
	}
	public String getE_business() {
		return e_business;
	}
	public void setE_business(String e_business) {
		this.e_business = e_business;
	}
	public int getE_Dbcount() {
		return e_Dbcount;
	}
	public void setE_Dbcount(int e_Dbcount) {
		this.e_Dbcount = e_Dbcount;
	}
	public String getE_os() {
		return e_os;
	}
	public void setE_os(String e_os) {
		this.e_os = e_os;
	}
	public String getE_hostname() {
		return e_hostname;
	}
	public void setE_hostname(String e_hostname) {
		this.e_hostname = e_hostname;
	}
	public String getE_ip() {
		return e_ip;
	}
	public void setE_ip(String e_ip) {
		this.e_ip = e_ip;
	}
	public int getE_port() {
		return e_port;
	}
	public void setE_port(int e_port) {
		this.e_port = e_port;
	}
	public String getE_sid() {
		return e_sid;
	}
	public void setE_sid(String e_sid) {
		this.e_sid = e_sid;
	}
	public String getE_osid() {
		return e_osid;
	}
	public void setE_osid(String e_osid) {
		this.e_osid = e_osid;
	}
	public String getE_ospw() {
		return e_ospw;
	}
	public void setE_ospw(String e_ospw) {
		this.e_ospw = e_ospw;
	}
	public String getE_dbid() {
		return e_dbid;
	}
	public void setE_dbid(String e_dbid) {
		this.e_dbid = e_dbid;
	}
	public String getE_dbpw() {
		return e_dbpw;
	}
	public void setE_dbpw(String e_dbpw) {
		this.e_dbpw = e_dbpw;
	}
	public String getE_server() {
		return e_server;
	}
	public void setE_server(String e_server) {
		this.e_server = e_server;
	}
	public String getE_filter() {
		return e_filter;
	}
	public void setE_filter(String e_filter) {
		this.e_filter = e_filter;
	}
	public String getE_encryptor() {
		return e_encryptor;
	}
	public void setE_encryptor(String e_encryptor) {
		this.e_encryptor = e_encryptor;
	}
	public String getE_installpath() {
		return e_installpath;
	}
	public void setE_installpath(String e_installpath) {
		this.e_installpath = e_installpath;
	}
	public String getE_applicationmethod() {
		return e_applicationmethod;
	}
	public void setE_applicationmethod(String e_applicationmethod) {
		this.e_applicationmethod = e_applicationmethod;
	}
	public String getE_details() {
		return e_details;
	}
	public void setE_details(String e_details) {
		this.e_details = e_details;
	}
	public String getE_other() {
		return e_other;
	}
	public void setE_other(String e_other) {
		this.e_other = e_other;
	}
	public String getE_custom_no() {
		return e_custom_no;
	}
	public void setE_custom_no(String e_custom_no) {
		this.e_custom_no = e_custom_no;
	}
	
	
	@Override
	public String toString() {
		return "Equipment [e_no=" + e_no + ", e_type=" + e_type
				+ ", e_business=" + e_business + ", e_Dbcount=" + e_Dbcount
				+ ", e_os=" + e_os + ", e_hostname=" + e_hostname + ", e_ip="
				+ e_ip + ", e_port=" + e_port + ", e_sid=" + e_sid
				+ ", e_osid=" + e_osid + ", e_ospw=" + e_ospw + ", e_dbid="
				+ e_dbid + ", e_dbpw=" + e_dbpw + ", e_server=" + e_server
				+ ", e_filter=" + e_filter + ", e_encryptor=" + e_encryptor
				+ ", e_installpath=" + e_installpath + ", e_applicationmethod="
				+ e_applicationmethod + ", e_details=" + e_details
				+ ", e_other=" + e_other + ", e_custom_no=" + e_custom_no + "]";
	}	
	
	
	

}
