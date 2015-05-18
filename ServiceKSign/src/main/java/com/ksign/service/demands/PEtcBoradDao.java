package com.ksign.service.demands;

import java.util.List;

public interface PEtcBoradDao {
	/**
	 * 요구사항 생성
	 * @param demands_list
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createDemandsList(PEtcBorad demands_list) throws Exception;
	/**
	 * 요구사항 읽기
	 * @param de_no
	 * @return Demands_list
	 * @throws Exception
	 */
	public abstract PEtcBorad readDemandsList(int de_no) throws Exception;
	/**
	 * 요구사항 수정
	 * @param demands_list
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateDemandsList(PEtcBorad demands_list) throws Exception;
	/**
	 * 요구사항 삭제
	 * @param de_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteDemandsList(int de_no) throws Exception;
	/**
	 * 프로젝트 넘버에 맞는 리스트 반환
	 * @param p_no
	 * @return List<Demands_list>
	 * @throws Exception
	 */
	public abstract List<PEtcBorad> listDemands(int p_no) throws Exception;

}
