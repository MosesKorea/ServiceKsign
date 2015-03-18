package com.ksign.service.product;

public class Product {
	
	/**
	 * 제품넘버	NUMBER
	 */
	private int p_no;
	/**
	 * 제품 타입	VARCHAR2
	 */
	private String p_type;
	/**
	 * 제품이름	VARCHAR2
	 */
	private String p_name;
	public Product(int p_no, String p_type, String p_name) {
		super();
		this.p_no = p_no;
		this.p_type = p_type;
		this.p_name = p_name;
	}
	public int getP_no() {
		return p_no;
	}
	public void setP_no(int p_no) {
		this.p_no = p_no;
	}
	public String getP_type() {
		return p_type;
	}
	public void setP_type(String p_type) {
		this.p_type = p_type;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	@Override
	public String toString() {
		return "Product [p_no=" + p_no + ", p_type=" + p_type + ", p_name="
				+ p_name + "]";
	}

	

}
