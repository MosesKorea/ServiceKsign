package com.ksign.service.customer;

import java.util.List;

public interface CustomerDao {
	/**
	 * 고객정보 생성
	 * @param customer
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean createCustomer(Customer customer) throws Exception;
	/**
	 * 고객정보 수정
	 * @param customer
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean updateCustomer(Customer customer) throws Exception;
	/**
	 * 고객정보 불러오기
	 * @param c_no
	 * @return Customer
	 * @throws Exception
	 */
	public abstract Customer readCustomer(int c_no) throws Exception;
	/**
	 * 고객정보 삭제
	 * @param c_no
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean deleteCustomer(int c_no) throws Exception;
	/**
	 * 모든 고객정보 가져오기
	 * @return List<Customer>
	 * @throws Exception
	 */
	public abstract List<Customer> selectCustomerAll() throws Exception;
	
	/**
	 * 검색리스트 반환
	 * @param word, column
	 * @return List<Customer>
	 * @throws Exception
	 */
	public abstract List<Customer> searchingCustomer(String word,String column) throws Exception;
	
	
	
}
