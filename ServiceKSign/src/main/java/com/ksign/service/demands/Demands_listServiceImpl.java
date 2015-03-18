package com.ksign.service.demands;

import java.util.List;

public class Demands_listServiceImpl implements Demands_listService{
	Demands_listService demands_listService;

	public Demands_listService getDemands_listService() {
		return demands_listService;
	}

	public void setDemands_listService(Demands_listService demands_listService) {
		this.demands_listService = demands_listService;
	}

	@Override
	public boolean createDemandsList(Demands_list demands_list)
			throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.createDemandsList(demands_list);
	}

	@Override
	public Demands_list readDemandsList(int de_no) throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.readDemandsList(de_no);
	}

	@Override
	public boolean updateDemandsList(Demands_list demands_list)
			throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.updateDemandsList(demands_list);
	}

	@Override
	public boolean deleteDemandsList(int de_no) throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.deleteDemandsList(de_no);
	}

	@Override
	public List<Demands_list> listDemands(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.listDemands(p_no);
	}

}
