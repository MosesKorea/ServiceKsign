package com.ksign.service.member;

import java.util.List;

public class Customer_controlServiceImpl implements Customer_controlService{
	Customer_controlDao ccdao;
	public Customer_controlDao getCcdao() {
		return ccdao;
	}

	public void setCcdao(Customer_controlDao ccdao) {
		this.ccdao = ccdao;
	}

	@Override
	public boolean createCustomer_control(Customer_control control)
			throws Exception {
		// TODO Auto-generated method stub
		return ccdao.createCustomer_control(control);
	}

	@Override
	public Customer_control readCustomer_control(int ccno) throws Exception {
		// TODO Auto-generated method stub
		return ccdao.readCustomer_control(ccno);
	}

	@Override
	public boolean updateCustomer_control(Customer_control control)
			throws Exception {
		// TODO Auto-generated method stub
		return ccdao.updateCustomer_control(control);
	}

	@Override
	public boolean delelteCustomer_control(int ccno) throws Exception {
		// TODO Auto-generated method stub
		return ccdao.delelteCustomer_control(ccno);
	}

	@Override
	public List<Customer_control> selectAllCustomer_control() throws Exception {
		// TODO Auto-generated method stub
		return ccdao.selectAllCustomer_control();
	}

}
