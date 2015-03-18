package com.ksign.service.prescaning;

public class Etl {
	/**
	 * 암호화대상 넘버	NUMBER
	 */
	private int etl_no;	
	/**
	 * 서비스 명	VARCHAR2
	 */
	private String etl_service;	
	/**
	 * 스키마명	VARCHAR2
	 */
	private String etl_schema;	
	/**
	 * 테이블명	VARCHAR2
	 */
	private String etl_table;	
	/**
	 * 테이블설명	VARCHAR2
	 */
	private String etl_table_info;	
	/**
	 * 건수	NUMBER
	 */
	private int etl_count;	
	/**
	 * 컬럼	VARCHAR2
	 */
	private String etl_calumn;	
	/**
	 * 컬럼설명	VARCHAR2
	 */
	private String etl_calumn_info;	
	/**
	 * 타입	VARCHAR2
	 */
	private String etl_type;	
	/**
	 * 길이	NUMBER
	 */
	private int etl_length;	
	/**
	 * PK	VARCHAR2
	 */
	private String etl_pk;	
	/**
	 * FK	VARCHAR2
	 */
	private String etl_FK;	
	/**
	 * 비고	VARCHAR2
	 */
	private String etl_orther;	
	/**
	 * 정책	VARCHAR2
	 */
	private String etl_policy;	
	/**
	 * 트리거 유무	VARCHAR2
	 */
	private String etl_trigger;	
	/**
	 * 뷰 유무	VARCHAR2
	 */
	private String etlL_mview;	
	/**
	 * 기암호화	VARCHAR2
	 */
	private String etl_h_encrypt;	
	/**
	 * 복수함수	VARCHAR2
	 */
	private String etl_pfuntion;	
	/**
	 * 구분컬럼	VARCHAR2
	 */
	private String etl_devisioncalumn;	
	/**
	 * SELECT	VARCHAR2
	 */
	private String etl_select;	
	/**
	 * FROM	VARCHAR2
	 */
	private String etl_from;	
	/**
	 * WHERE	VARCHAR2
	 */
	private String etl_where;	
	/**
	 * HINT	VARCHAR2
	 */
	private String etl_hint;	
	/**
	 * 고객넘버	NUMBER
	 */
	private int etl_customer_no;
	
	public Etl(int etl_no, String etl_service, String etl_schema,
			String etl_table, String etl_table_info, int etl_count,
			String etl_calumn, String etl_calumn_info, String etl_type,
			int etl_length, String etl_pk, String etl_FK, String etl_orther,
			String etl_policy, String etl_trigger, String etlL_mview,
			String etl_h_encrypt, String etl_pfuntion,
			String etl_devisioncalumn, String etl_select, String etl_from,
			String etl_where, String etl_hint, int etl_customer_no) {
		super();
		this.etl_no = etl_no;
		this.etl_service = etl_service;
		this.etl_schema = etl_schema;
		this.etl_table = etl_table;
		this.etl_table_info = etl_table_info;
		this.etl_count = etl_count;
		this.etl_calumn = etl_calumn;
		this.etl_calumn_info = etl_calumn_info;
		this.etl_type = etl_type;
		this.etl_length = etl_length;
		this.etl_pk = etl_pk;
		this.etl_FK = etl_FK;
		this.etl_orther = etl_orther;
		this.etl_policy = etl_policy;
		this.etl_trigger = etl_trigger;
		this.etlL_mview = etlL_mview;
		this.etl_h_encrypt = etl_h_encrypt;
		this.etl_pfuntion = etl_pfuntion;
		this.etl_devisioncalumn = etl_devisioncalumn;
		this.etl_select = etl_select;
		this.etl_from = etl_from;
		this.etl_where = etl_where;
		this.etl_hint = etl_hint;
		this.etl_customer_no = etl_customer_no;
	}

	public Etl() {
		super();
	}

	public int getEtl_no() {
		return etl_no;
	}

	public void setEtl_no(int etl_no) {
		this.etl_no = etl_no;
	}

	public String getEtl_service() {
		return etl_service;
	}

	public void setEtl_service(String etl_service) {
		this.etl_service = etl_service;
	}

	public String getEtl_schema() {
		return etl_schema;
	}

	public void setEtl_schema(String etl_schema) {
		this.etl_schema = etl_schema;
	}

	public String getEtl_table() {
		return etl_table;
	}

	public void setEtl_table(String etl_table) {
		this.etl_table = etl_table;
	}

	public String getEtl_table_info() {
		return etl_table_info;
	}

	public void setEtl_table_info(String etl_table_info) {
		this.etl_table_info = etl_table_info;
	}

	public int getEtl_count() {
		return etl_count;
	}

	public void setEtl_count(int etl_count) {
		this.etl_count = etl_count;
	}

	public String getEtl_calumn() {
		return etl_calumn;
	}

	public void setEtl_calumn(String etl_calumn) {
		this.etl_calumn = etl_calumn;
	}

	public String getEtl_calumn_info() {
		return etl_calumn_info;
	}

	public void setEtl_calumn_info(String etl_calumn_info) {
		this.etl_calumn_info = etl_calumn_info;
	}

	public String getEtl_type() {
		return etl_type;
	}

	public void setEtl_type(String etl_type) {
		this.etl_type = etl_type;
	}

	public int getEtl_length() {
		return etl_length;
	}

	public void setEtl_length(int etl_length) {
		this.etl_length = etl_length;
	}

	public String getEtl_pk() {
		return etl_pk;
	}

	public void setEtl_pk(String etl_pk) {
		this.etl_pk = etl_pk;
	}

	public String getEtl_FK() {
		return etl_FK;
	}

	public void setEtl_FK(String etl_FK) {
		this.etl_FK = etl_FK;
	}

	public String getEtl_orther() {
		return etl_orther;
	}

	public void setEtl_orther(String etl_orther) {
		this.etl_orther = etl_orther;
	}

	public String getEtl_policy() {
		return etl_policy;
	}

	public void setEtl_policy(String etl_policy) {
		this.etl_policy = etl_policy;
	}

	public String getEtl_trigger() {
		return etl_trigger;
	}

	public void setEtl_trigger(String etl_trigger) {
		this.etl_trigger = etl_trigger;
	}

	public String getEtlL_mview() {
		return etlL_mview;
	}

	public void setEtlL_mview(String etlL_mview) {
		this.etlL_mview = etlL_mview;
	}

	public String getEtl_h_encrypt() {
		return etl_h_encrypt;
	}

	public void setEtl_h_encrypt(String etl_h_encrypt) {
		this.etl_h_encrypt = etl_h_encrypt;
	}

	public String getEtl_pfuntion() {
		return etl_pfuntion;
	}

	public void setEtl_pfuntion(String etl_pfuntion) {
		this.etl_pfuntion = etl_pfuntion;
	}

	public String getEtl_devisioncalumn() {
		return etl_devisioncalumn;
	}

	public void setEtl_devisioncalumn(String etl_devisioncalumn) {
		this.etl_devisioncalumn = etl_devisioncalumn;
	}

	public String getEtl_select() {
		return etl_select;
	}

	public void setEtl_select(String etl_select) {
		this.etl_select = etl_select;
	}

	public String getEtl_from() {
		return etl_from;
	}

	public void setEtl_from(String etl_from) {
		this.etl_from = etl_from;
	}

	public String getEtl_where() {
		return etl_where;
	}

	public void setEtl_where(String etl_where) {
		this.etl_where = etl_where;
	}

	public String getEtl_hint() {
		return etl_hint;
	}

	public void setEtl_hint(String etl_hint) {
		this.etl_hint = etl_hint;
	}

	public int getEtl_customer_no() {
		return etl_customer_no;
	}

	public void setEtl_customer_no(int etl_customer_no) {
		this.etl_customer_no = etl_customer_no;
	}

	@Override
	public String toString() {
		return "Etl [etl_no=" + etl_no + ", etl_service=" + etl_service
				+ ", etl_schema=" + etl_schema + ", etl_table=" + etl_table
				+ ", etl_table_info=" + etl_table_info + ", etl_count="
				+ etl_count + ", etl_calumn=" + etl_calumn
				+ ", etl_calumn_info=" + etl_calumn_info + ", etl_type="
				+ etl_type + ", etl_length=" + etl_length + ", etl_pk="
				+ etl_pk + ", etl_FK=" + etl_FK + ", etl_orther=" + etl_orther
				+ ", etl_policy=" + etl_policy + ", etl_trigger=" + etl_trigger
				+ ", etlL_mview=" + etlL_mview + ", etl_h_encrypt="
				+ etl_h_encrypt + ", etl_pfuntion=" + etl_pfuntion
				+ ", etl_devisioncalumn=" + etl_devisioncalumn
				+ ", etl_select=" + etl_select + ", etl_from=" + etl_from
				+ ", etl_where=" + etl_where + ", etl_hint=" + etl_hint
				+ ", etl_customer_no=" + etl_customer_no + "]";
	}
	
	
	
	
	
	


}
