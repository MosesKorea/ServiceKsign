package com.ksign.service.demands;

import java.util.List;

import com.ksign.service.customer.Customer;

public class Customer_demandsServiceImpl implements Customer_demandsService{
	Customer_demandsDao demandsDao;
	
	public Customer_demandsDao getDemandsDao() {
		return demandsDao;
	}

	public void setDemandsDao(Customer_demandsDao demandsDao) {
		this.demandsDao = demandsDao;
	}

	@Override
	public boolean createCustomer_demands(Customer_demands customer_demands)
			throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.createCustomer_demands(customer_demands);
	}

	@Override
	public boolean updateCustomer_demands(Customer_demands customer_demands)
			throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.updateCustomer_demands(customer_demands);
	}

	@Override
	public Customer readCustomer_demands(int cd_no) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.readCustomer_demands(cd_no);
	}

	@Override
	public boolean deleteCustomer_demands(int cd_no) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.deleteCustomer_demands(cd_no);
	}

	@Override
	public List<Customer_demands> selectCustomer_demandsAll() throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.selectCustomer_demandsAll();
	}

	@Override
	public List<Customer_demands> searchingCustomer_demands(String word,
			String column) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.searchingCustomer_demands(word, column);
	}

}
