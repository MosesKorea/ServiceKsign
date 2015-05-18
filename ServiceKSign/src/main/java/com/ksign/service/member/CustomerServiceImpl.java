package com.ksign.service.member;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
	CustomerDao customer;
	public CustomerDao getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerDao customer) {
		this.customer = customer;
	}

	@Override
	public boolean createCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return this.customer.createCustomer(customer);
	}

	@Override
	public Customer readCustomer(int cno) throws Exception {
		// TODO Auto-generated method stub
		return this.readCustomer(cno);
	}

	@Override
	public boolean updateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return this.updateCustomer(customer);
	}

	@Override
	public boolean delelteCustomer(int cno) throws Exception {
		// TODO Auto-generated method stub
		return this.delelteCustomer(cno);
	}

	@Override
	public List<Customer> selectAllCustomer() throws Exception {
		// TODO Auto-generated method stub
		return this.selectAllCustomer();
	}

}
