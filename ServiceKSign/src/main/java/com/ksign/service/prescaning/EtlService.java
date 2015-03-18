package com.ksign.service.prescaning;

public interface EtlService {
	/**
	 * 암호화대상 정보 생서
	 * @param etl
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createEtl(Etl etl) throws Exception;
	/**
	 * 암호화 대상 정보 수정
	 * @param etl
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateEtl(Etl etl) throws Exception;
	/**
	 * 안호화 대상 정보 읽기
	 * @param etl_no
	 * @return
	 * @throws Exception
	 */
	public abstract Etl readEtl(int etl_no) throws Exception;
	/**
	 * 안호화 대상 정보 삭제
	 * @param etl_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteEtl(int etl_no) throws Exception;
}
