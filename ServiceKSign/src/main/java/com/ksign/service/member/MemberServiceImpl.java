package com.ksign.service.member;

import java.util.List;

public class MemberServiceImpl implements MemberService{
	MemberDao memberDao;
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public boolean createMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.createMember(member);
	}

	@Override
	public Member readMember(int m_no) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.readMember(m_no);
	}

	@Override
	public boolean updateMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.updateMember(member);
	}

	@Override
	public boolean delelteMember(int m_no) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.delelteMember(m_no);
	}

	@Override
	public List<Member> selectAllMember() throws Exception {
		// TODO Auto-generated method stub
		return memberDao.selectAllMember();
	}

	@Override
	public List<Member> selectCompanyMember(String c_type) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.selectCompanyMember(c_type);
	}

}
