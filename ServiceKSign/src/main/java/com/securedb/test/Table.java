package com.securedb.test;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author �뀒�씠釉� 鍮덇컼泥�
 *
 */
public class Table {
	@JsonProperty
	private int seq;
	@JsonProperty
	private String jumin;
	@JsonProperty
	private String juso;
	
	
	public Table() {
		super();
	}
	
	public Table(int seq, String jumin, String juso) {
		super();
		this.seq = seq;
		this.jumin = jumin;
		this.juso = juso;
	}
	
	@Override
	public String toString() {
		return "Table [seq=" + seq + ", jumin=" + jumin + ", juso=" + juso
				+ "]";
	}

	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getJuso() {
		return juso;
	}
	public void setJuso(String juso) {
		this.juso = juso;
	}
	
	
	
}
