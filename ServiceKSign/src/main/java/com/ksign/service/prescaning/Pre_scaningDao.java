package com.ksign.service.prescaning;

public interface Pre_scaningDao {
	/**
	 * 사전조사 환경 정보를 생성
	 * @param pre_scaning
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createPre_scaning(Pre_scaning pre_scaning) throws Exception;
	/**
	 * 사전조사 환경 정보 수정
	 * @param pre_scaning
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updatePre_scaning(Pre_scaning pre_scaning) throws Exception;
	/**
	 * 사전조사 환경 정보 읽기
	 * @param pre_no
	 * @return
	 * @throws Exception
	 */
	public abstract Pre_scaning readPre_scaning(int pre_no) throws Exception;
	/**
	 * 사전조사 환경 정보 삭제
	 * @param pre_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deletePre_scaning(int pre_no) throws Exception;
}
