package com.ksign.service.prescaning;

public class Pre_scaningServiceImpl implements Pre_scaningService{
	Pre_scaningDao pre_scaningDao;

	public Pre_scaningDao getPre_scaningDao() {
		return pre_scaningDao;
	}

	public void setPre_scaningDao(Pre_scaningDao pre_scaningDao) {
		this.pre_scaningDao = pre_scaningDao;
	}

	@Override
	public boolean createPre_scaning(Pre_scaning pre_scaning) throws Exception {
		// TODO Auto-generated method stub
		return pre_scaningDao.createPre_scaning(pre_scaning);
	}

	@Override
	public boolean updatePre_scaning(Pre_scaning pre_scaning) throws Exception {
		// TODO Auto-generated method stub
		return pre_scaningDao.updatePre_scaning(pre_scaning);
	}

	@Override
	public Pre_scaning readPre_scaning(int pre_no) throws Exception {
		// TODO Auto-generated method stub
		return pre_scaningDao.readPre_scaning(pre_no);
	}

	@Override
	public boolean deletePre_scaning(int pre_no) throws Exception {
		// TODO Auto-generated method stub
		return pre_scaningDao.deletePre_scaning(pre_no);
	}

}
