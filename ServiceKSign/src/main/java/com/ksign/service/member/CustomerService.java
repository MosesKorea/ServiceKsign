package com.ksign.service.member;

import java.util.List;

public interface CustomerService {
	/**
	 * 사용자 생성
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createCustomer(Customer customer) throws Exception;
	/**
	 * 사용자 정보 읽기
	 * @param cno
	 * @return Customer
	 * @throws Exception
	 */
	public abstract Customer readCustomer(int cno) throws Exception;
	/**
	 * 사용자 정보 수정
	 * @param customer
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateCustomer(Customer customer) throws Exception;
	/**
	 * 사용자 정보 삭제
	 * @param cno
	 * @return
	 * @throws Exception
	 */
	public abstract boolean delelteCustomer(int cno) throws Exception;
	/**
	 * 모든 사용자 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Customer> selectAllCustomer() throws Exception;

}
