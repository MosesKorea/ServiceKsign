package com.ksign.service.demands;

import java.util.List;


public class DemandsServiceImpl implements DemandsService{
	DemandsDao demandsDao;

	@Override
	public boolean createDemands(Demands demands) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.createDemands(demands);
	}

	@Override
	public boolean updateDemands(Demands demands) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.updateDemands(demands);
	}

	@Override
	public Demands readDemands(int dENO) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.readDemands(dENO);
	}

	@Override
	public boolean deleteDemands(int dENO) throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.deleteDemands(dENO);
	}

	@Override
	public List<Demands> selectDemandsAll() throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.selectDemandsAll();
	}

	@Override
	public List<Demands> searchingDemands(String word, String column)
			throws Exception {
		// TODO Auto-generated method stub
		return demandsDao.searchingDemands(word, column);
	}
	
	

}
