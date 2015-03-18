package com.ksign.service.issue;

import java.util.List;

public interface IssueService {
	/**
	 * 이슈 생성
	 * @param issue
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createIssue(Issue issue) throws Exception;
	/**
	 * 이슈 수정
	 * @param issue
	 * @return
	 * @throws Exception
	 */
	public abstract boolean updateIssue(Issue issue) throws Exception;
	/**
	 * 이슈 읽기
	 * @param i_no
	 * @return
	 * @throws Exception
	 */
	public abstract Issue readIssue(int i_no) throws Exception;
	/**
	 * 이슈 삭제
	 * @param i_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean deleteIssue(int i_no) throws Exception;
	/**
	 * 이슈 리스트 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Issue> listIssue() throws Exception;
	/**
	 * 프로젝트에 관한 이슈 반환
	 * @param p_no
	 * @return
	 * @throws Exception
	 */
	public abstract List<Issue> projectlistIssue(int p_no) throws Exception;
	/**
	 * 이슈 상태에 따른 반환
	 * @param state
	 * @return
	 * @throws Exception
	 */
	public abstract List<Issue> statelistIssue(int state) throws Exception;
}
