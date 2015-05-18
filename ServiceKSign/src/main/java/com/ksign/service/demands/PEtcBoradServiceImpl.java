package com.ksign.service.demands;

import java.util.List;

public class PEtcBoradServiceImpl implements PEtcBoradService{
	PEtcBoradService demands_listService;

	public PEtcBoradService getDemands_listService() {
		return demands_listService;
	}

	public void setDemands_listService(PEtcBoradService demands_listService) {
		this.demands_listService = demands_listService;
	}

	@Override
	public boolean createDemandsList(PEtcBorad demands_list)
			throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.createDemandsList(demands_list);
	}

	@Override
	public PEtcBorad readDemandsList(int de_no) throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.readDemandsList(de_no);
	}

	@Override
	public boolean updateDemandsList(PEtcBorad demands_list)
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
	public List<PEtcBorad> listDemands(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return demands_listService.listDemands(p_no);
	}

}
