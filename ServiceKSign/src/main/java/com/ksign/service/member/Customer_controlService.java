package com.ksign.service.member;

import java.util.List;

public interface Customer_controlService {
	/**
	 * 사용자 생성
	 * @param control
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createCustomer_control(Customer_control control) throws Exception;
	/**
	 * 사용자 정보 읽기
	 * @param ccno
	 * @return Customer_control
	 * @throws Exception
	 */
	public abstract Customer_control readCustomer_control(int ccno) throws Exception;
	/**
	 * 사용자 정보 수정
	 * @param control
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateCustomer_control(Customer_control control) throws Exception;
	/**
	 * 사용자 정보 삭제
	 * @param ccno
	 * @return
	 * @throws Exception
	 */
	public abstract boolean delelteCustomer_control(int ccno) throws Exception;
	/**
	 * 모든 사용자 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Customer_control> selectAllCustomer_control() throws Exception;

}
