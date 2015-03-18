package com.ksign.service.demands;

import java.util.List;

import com.ksign.service.customer.Customer;

public interface Customer_demandsDao {
	/**
	 * 고객요구조건정보 생성
	 * @param Customer_demands
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean createCustomer_demands(Customer_demands customer_demands) throws Exception;
	/**
	 * 고객요구조건정보 수정
	 * @param Customer_demands
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean updateCustomer_demands(Customer_demands customer_demands) throws Exception;
	/**
	 * 고객요구조건정보 불러오기
	 * @param cd_no
	 * @return Customer_demands
	 * @throws Exception
	 */
	public abstract Customer readCustomer_demands(int cd_no) throws Exception;
	/**
	 * 고객요구조건정보 삭제
	 * @param cd_no
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean deleteCustomer_demands(int cd_no) throws Exception;
	/**
	 * 모든 고객요구조건정보 가져오기
	 * @return List<Customer_demands>
	 * @throws Exception
	 */
	public abstract List<Customer_demands> selectCustomer_demandsAll() throws Exception;
	
	/**
	 * 고객요구조건 검색리스트 반환
	 * @param word, column
	 * @return List<Customer_demands>
	 * @throws Exception
	 */
	public abstract List<Customer_demands> searchingCustomer_demands(String word,String column) throws Exception;

}
