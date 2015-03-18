package com.ksign.service.member;

import java.util.List;

public interface MemberService {
	/**
	 * 상ㅇ자 생성
	 * @param member
	 * @return
	 * @throws Exception
	 */
	public abstract boolean createMember(Member member) throws Exception;
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
	public abstract boolean updateMember(Member member) throws Exception;
	/**
	 * 사용자 정보 삭제
	 * @param m_no
	 * @return
	 * @throws Exception
	 */
	public abstract boolean delelteMember(int m_no) throws Exception;
	/**
	 * 모든 사용자 반환
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> selectAllMember() throws Exception;
	/**
	 * 회사에따른 사용자 반환
	 * @param c_type
	 * @return
	 * @throws Exception
	 */
	public abstract List<Member> selectCompanyMember(String c_type) throws Exception;

}
