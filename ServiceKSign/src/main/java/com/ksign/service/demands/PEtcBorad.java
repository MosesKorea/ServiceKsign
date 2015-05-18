package com.ksign.service.demands;

public class PEtcBorad {
	
	/**
	 * 요구사항 넘버	NUMBER
	 */
	private int de_no;	
	/**
	 * 요구사항목록	VARCHAR2
	 */
	private String de_type;	
	/**
	 * 요구사항명	VARCHAR2
	 */
	private String de_name;	
	/**
	 * 처리내용	VARCHAR2
	 */
	private String de_procese;
	/**
	 * 분류	VARCHAR2
	 */
	private String de_class;
	/**
	 * 중요도	CHAR
	 */
	private char de_status;
	/**
	 * 난이도	CHAR
	 */
	private char de_level;
	/**
	 * 수용여부	VARCHAR2
	 */
	private String de_accommodation;
	/**
	 * 출처	VARCHAR2
	 */
	private String de_provenance;
	/**
	 * 비고	VARCHAR2
	 */
	private String de_note;
	/**
	 *  정의서 넘버	NUMBER
	 */
	private int demands_no;
	public PEtcBorad(int de_no, String de_type, String de_name,
			String de_procese, String de_class, char de_status, char de_level,
			String de_accommodation, String de_provenance, String de_note,
			int demands_no) {
		super();
		this.de_no = de_no;
		this.de_type = de_type;
		this.de_name = de_name;
		this.de_procese = de_procese;
		this.de_class = de_class;
		this.de_status = de_status;
		this.de_level = de_level;
		this.de_accommodation = de_accommodation;
		this.de_provenance = de_provenance;
		this.de_note = de_note;
		this.demands_no = demands_no;
	}
	public int getDe_no() {
		return de_no;
	}
	public void setDe_no(int de_no) {
		this.de_no = de_no;
	}
	public String getDe_type() {
		return de_type;
	}
	public void setDe_type(String de_type) {
		this.de_type = de_type;
	}
	public String getDe_name() {
		return de_name;
	}
	public void setDe_name(String de_name) {
		this.de_name = de_name;
	}
	public String getDe_procese() {
		return de_procese;
	}
	public void setDe_procese(String de_procese) {
		this.de_procese = de_procese;
	}
	public String getDe_class() {
		return de_class;
	}
	public void setDe_class(String de_class) {
		this.de_class = de_class;
	}
	public char getDe_status() {
		return de_status;
	}
	public void setDe_status(char de_status) {
		this.de_status = de_status;
	}
	public char getDe_level() {
		return de_level;
	}
	public void setDe_level(char de_level) {
		this.de_level = de_level;
	}
	public String getDe_accommodation() {
		return de_accommodation;
	}
	public void setDe_accommodation(String de_accommodation) {
		this.de_accommodation = de_accommodation;
	}
	public String getDe_provenance() {
		return de_provenance;
	}
	public void setDe_provenance(String de_provenance) {
		this.de_provenance = de_provenance;
	}
	public String getDe_note() {
		return de_note;
	}
	public void setDe_note(String de_note) {
		this.de_note = de_note;
	}
	public int getDemands_no() {
		return demands_no;
	}
	public void setDemands_no(int demands_no) {
		this.demands_no = demands_no;
	}
	@Override
	public String toString() {
		return "Demands_list [de_no=" + de_no + ", de_type=" + de_type
				+ ", de_name=" + de_name + ", de_procese=" + de_procese
				+ ", de_class=" + de_class + ", de_status=" + de_status
				+ ", de_level=" + de_level + ", de_accommodation="
				+ de_accommodation + ", de_provenance=" + de_provenance
				+ ", de_note=" + de_note + ", demands_no=" + demands_no + "]";
	}
	
	


}
