package com.ksign.service.prescaning;

public interface EquipmentDao {
	/**
	 * 장비 정보 생성
	 * @param equipment
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createEquipment(Equipment equipment) throws Exception;
	/**
	 * 장비정보 수정
	 * @param equipment
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateEquipment(Equipment equipment) throws Exception;
	/**
	 * 장비정보 읽어오기
	 * @param eNO
	 * @return
	 * @throws Exception
	 */
	public abstract Equipment readEquipment(int eNO) throws Exception;
	/**
	 * 장비정보 삭제
	 * @param eNO
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteEquipment(int eNO) throws Exception;
	/**
	 * 장비정보 All 가져오기
	 * @return 장비리스트
	 * @throws Exception
	 */
	public abstract boolean selectAllEquipment() throws Exception;

}
