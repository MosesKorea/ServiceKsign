package com.ksign.service.project;

import java.util.List;

public class ProjectServiceImpl implements ProjectService{
	ProjectDao projectDao;

	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	@Override
	public boolean createProject(Project project) throws Exception {
		// TODO Auto-generated method stub
		return projectDao.createProject(project);
	}

	@Override
	public boolean updateProject(Project project) throws Exception {
		// TODO Auto-generated method stub
		return projectDao.updateProject(project);
	}

	@Override
	public Project readProject(int pro_no) throws Exception {
		// TODO Auto-generated method stub
		return projectDao.readProject(pro_no);
	}

	@Override
	public boolean deleteProject(int pro_no) throws Exception {
		// TODO Auto-generated method stub
		return projectDao.deleteProject(pro_no);
	}

	@Override
	public List<Project> selectAllProject() throws Exception {
		// TODO Auto-generated method stub
		return projectDao.selectAllProject();
	}

}
