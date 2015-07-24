package com.ksign.service.member;

public class MemberNotFoundException extends Exception{
	public MemberNotFoundException() {
		
	}
	public MemberNotFoundException(String msg) {
		super(msg);
	}
}
