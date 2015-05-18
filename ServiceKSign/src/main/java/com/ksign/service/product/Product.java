package com.ksign.service.product;

public class Product {
	/**
	 * PRODUCTNO	제품넘버
PRODUCTTYPE	제품 타입
PRODUCTNAME	제품이름

	 */
	/**
	 * 제품넘버	NUMBER
	 */
	private int PRODUCTNO;
	/**
	 * 제품 타입	VARCHAR2
	 */
	private String PRODUCTTYPE;
	/**
	 * 제품이름	VARCHAR2
	 */
	private String PRODUCTNAME;
	public Product(int pRODUCTNO, String pRODUCTTYPE, String pRODUCTNAME) {
		super();
		PRODUCTNO = pRODUCTNO;
		PRODUCTTYPE = pRODUCTTYPE;
		PRODUCTNAME = pRODUCTNAME;
	}
	public int getPRODUCTNO() {
		return PRODUCTNO;
	}
	public void setPRODUCTNO(int pRODUCTNO) {
		PRODUCTNO = pRODUCTNO;
	}
	public String getPRODUCTTYPE() {
		return PRODUCTTYPE;
	}
	public void setPRODUCTTYPE(String pRODUCTTYPE) {
		PRODUCTTYPE = pRODUCTTYPE;
	}
	public String getPRODUCTNAME() {
		return PRODUCTNAME;
	}
	public void setPRODUCTNAME(String pRODUCTNAME) {
		PRODUCTNAME = pRODUCTNAME;
	}
	@Override
	public String toString() {
		return "Product [PRODUCTNO=" + PRODUCTNO + ", PRODUCTTYPE="
				+ PRODUCTTYPE + ", PRODUCTNAME=" + PRODUCTNAME + "]";
	}
	
	

	

}
