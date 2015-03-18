package com.ksign.service.issue;

import java.util.List;

public class IssueServiceImpl implements IssueService{
	IssueDao issueDao;
	public IssueDao getIssueDao() {
		return issueDao;
	}

	public void setIssueDao(IssueDao issueDao) {
		this.issueDao = issueDao;
	}

	@Override
	public boolean createIssue(Issue issue) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.createIssue(issue);
	}

	@Override
	public boolean updateIssue(Issue issue) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.updateIssue(issue);
	}

	@Override
	public Issue readIssue(int i_no) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.readIssue(i_no);
	}

	@Override
	public boolean deleteIssue(int i_no) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.deleteIssue(i_no);
	}

	@Override
	public List<Issue> listIssue() throws Exception {
		// TODO Auto-generated method stub
		return issueDao.listIssue();
	}

	@Override
	public List<Issue> projectlistIssue(int p_no) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.projectlistIssue(p_no);
	}

	@Override
	public List<Issue> statelistIssue(int state) throws Exception {
		// TODO Auto-generated method stub
		return issueDao.statelistIssue(state);
	}

}
