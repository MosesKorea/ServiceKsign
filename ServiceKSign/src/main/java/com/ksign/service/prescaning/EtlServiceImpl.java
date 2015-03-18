package com.ksign.service.prescaning;

public class EtlServiceImpl implements EtlService{
	EtlDao etlDao;
	public EtlDao getEtlDao() {
		return etlDao;
	}

	public void setEtlDao(EtlDao etlDao) {
		this.etlDao = etlDao;
	}

	@Override
	public boolean createEtl(Etl etl) throws Exception {
		// TODO Auto-generated method stub
		return etlDao.createEtl(etl);
	}

	@Override
	public boolean updateEtl(Etl etl) throws Exception {
		// TODO Auto-generated method stub
		return etlDao.updateEtl(etl);
	}

	@Override
	public Etl readEtl(int etl_no) throws Exception {
		// TODO Auto-generated method stub
		return etlDao.readEtl(etl_no);
	}

	@Override
	public boolean deleteEtl(int etl_no) throws Exception {
		// TODO Auto-generated method stub
		return etlDao.deleteEtl(etl_no);
	}

}
