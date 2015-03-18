package com.ksign.service.weekreport;

import java.util.List;

public class Week_reportServiceImpl implements Week_reportService{
	Week_reportDao week_reportDao;

	public Week_reportDao getWeek_reportDao() {
		return week_reportDao;
	}

	public void setWeek_reportDao(Week_reportDao week_reportDao) {
		this.week_reportDao = week_reportDao;
	}

	@Override
	public boolean createWeek_report(Week_report report) throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.createWeek_report(report);
	}

	@Override
	public boolean updateWeek_report(Week_report report) throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.updateWeek_report(report);
	}

	@Override
	public Week_report readWeek_report(int re_no) throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.readWeek_report(re_no);
	}

	@Override
	public boolean deleteWeek_report(int re_no) throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.deleteWeek_report(re_no);
	}

	@Override
	public List<Week_report> selectWeek_report() throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.selectWeek_report();
	}

	@Override
	public List<Week_report> selectWriterWeek_report() throws Exception {
		// TODO Auto-generated method stub
		return week_reportDao.selectWriterWeek_report();
	}

}
