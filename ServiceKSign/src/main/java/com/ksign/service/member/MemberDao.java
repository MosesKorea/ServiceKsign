package com.ksign.service.member;

import java.util.List;

public interface MemberDao {
	/**
	 * 사용자 생성
	 * @param member
	 * @return
	 * @throws Exception
	 */
	public abstract int createMember(Member member) throws Exception;
	/**
	 * 사용자 정보 읽기
	 * @param m_no
	 * @return Member
	 * @throws Exception
	 */
	public abstract Member readMember(int m_no) throws Exception;
	/**
	 * 사용자 정보 수정
	 * @param member
	 * @return
	 * @throws Exception
	 */
	public abstract int updateMember(Member member) throws Exception;
	/**
	 * 사용자 정보 삭제
	 * @param m_no
	 * @return
	 * @throws Exception
	 */
	public abstract int delelteMember(int m_no) throws Exception;
	/**
	 * 모든 사용자 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> selectAllMember() throws Exception;
	/**
	 * 회사에따른 사용자 반환
	 * @param ucompany
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> selectCompanyMember(String ucompany) throws Exception;

	/**
	 * 아이디로 회원정보 찾기
	 * @param uid
	 * @return Member
	 * @throws Exception
	 */
	public abstract Member selectIdByMember(String uid) throws Exception;
	
	/**
	 * ID 중복 체크
	 * @param uid
	 * @return
	 * @throws Exception
	 */
	public abstract boolean existedMember(String uid) throws Exception;
	
	/**
	 * 총 카운트 반환
	 * @return
	 * @throws Exception
	 */
	public abstract int getCount() throws Exception;
	
	/**
	 * 모든 사용자를 페이징하여 불러옴
	 * @param startRowNum
	 * @param endRowNum
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> findAllMemberList(int startRowNum, int endRowNum)	throws Exception;
	
	/**
	 * 맴버를 타입별로 찾아서 반환해줌
	 * @param text
	 * @param findType
	 * @return
	 * @throws Exception
	 */
	int findMemberCount(String text, String findType) throws Exception;
	
	/**
	 * 모든 맴버의 리스트 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> findMemberList() throws Exception;
	
	public List<Member> findAllMemberListBy(int startRowNum, int endRowNum, String text, String findType)
			throws Exception;
	
	

}
