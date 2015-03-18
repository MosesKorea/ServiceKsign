package com.ksign.service.prescaning;

public class EquipmentServiceImpl implements EquipmentService{
	EquipmentDao equipmentDao;
	
	public EquipmentDao getEquipmentDao() {
		return equipmentDao;
	}

	public void setEquipmentDao(EquipmentDao equipmentDao) {
		this.equipmentDao = equipmentDao;
	}

	@Override
	public boolean createEquipment(Equipment equipment) throws Exception {
		// TODO Auto-generated method stub
		return equipmentDao.createEquipment(equipment);
	}

	@Override
	public boolean updateEquipment(Equipment equipment) throws Exception {
		// TODO Auto-generated method stub
		return equipmentDao.updateEquipment(equipment);
	}

	@Override
	public Equipment readEquipment(int e_no) throws Exception {
		// TODO Auto-generated method stub
		return equipmentDao.readEquipment(e_no);
	}

	@Override
	public boolean deleteEquipment(int e_no) throws Exception {
		// TODO Auto-generated method stub
		return equipmentDao.deleteEquipment(e_no);
	}

}
