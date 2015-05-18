package com.ksign.service.project;

import java.util.List;

public interface ProjectDao {
	/**
	 * 프로젝트 정보 생성
	 * @param project
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createProject(Project project) throws Exception;
	/**
	 * 프로젝트 정보 수정
	 * @param project
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateProject(Project project) throws Exception;
	/**
	 * 프로젝트 정보 읽기
	 * @param pro_no
	 * @return
	 * @throws Exception
	 */
	public abstract Project readProject(int pro_no) throws Exception;
	/**
	 * 프로젝트 정보 삭제
	 * @param pro_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteProject(int pro_no) throws Exception;
	/**
	 * 프로젝트 리스트 반홥
	 * @return
	 * @throws Exception
	 */
	public abstract List<Project> selectAllProject() throws Exception;

}
