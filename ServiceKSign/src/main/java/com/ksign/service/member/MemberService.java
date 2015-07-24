package com.ksign.service.member;

import java.util.List;

import com.ksign.service.admin.util.ListPageConfigBean;
import com.ksign.service.admin.util.ListResultBean;


public interface MemberService {
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
	public abstract Member readMember(int uno) throws Exception;
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
	public abstract int delelteMember(int uno) throws Exception;
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
	public abstract Member findMemberbyId(String uid) throws MemberNotFoundException, Exception;
	
	/**
	 * 로그인로직
	 * @param member_id
	 * @param member_pw
	 * @return
	 * @throws Exception
	 */
	public Member login(String member_id, String member_pw)throws Exception;
	/**
	 * 중복아이디 확인
	 * @param member_id
	 * @return
	 * @throws Exception
	 */
	public boolean existedMember(String member_id)throws  Exception;
	/**
	 * 페이징
	 * @param pageConfig
	 * @return
	 * @throws Exception
	 */
	ListResultBean findMemberAdminList(ListPageConfigBean pageConfig)throws Exception;
	/**
	 * 페이징
	 * @param pageConfig
	 * @param text
	 * @param findType
	 * @return
	 * @throws Exception
	 */
	ListResultBean findMemberAdminListBy(ListPageConfigBean pageConfig, String text, String findType) throws Exception;
	
	
	
}
