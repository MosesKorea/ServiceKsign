package com.ksign.service.demands;

import java.util.List;


public interface DemandsService {
	/**
	 * 고객요구조건정보 생성
	 * @param demands
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean createDemands(Demands demands) throws Exception;
	/**
	 * 고객요구조건정보 수정
	 * @param demands
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean updateDemands(Demands demands) throws Exception;
	/**
	 * 고객요구조건정보 불러오기
	 * @param dENO
	 * @return Customer_demands
	 * @throws Exception
	 */
	public abstract Demands readDemands(int dENO) throws Exception;
	/**
	 * 고객요구조건정보 삭제
	 * @param dENO
	 * @return true/false
	 * @throws Exception
	 */
	public abstract boolean deleteDemands(int dENO) throws Exception;
	/**
	 * 모든 고객요구조건정보 가져오기
	 * @return List<Customer_demands>
	 * @throws Exception
	 */
	public abstract List<Demands> selectDemandsAll() throws Exception;
	
	/**
	 * 고객요구조건 검색리스트 반환
	 * @param word, column
	 * @return List<Customer_demands>
	 * @throws Exception
	 */
	public abstract List<Demands> searchingDemands(String word,String column) throws Exception;


}
