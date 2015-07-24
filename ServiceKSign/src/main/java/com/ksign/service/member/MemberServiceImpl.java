package com.ksign.service.member;

import java.util.List;

import com.ksign.service.admin.util.ListPageConfigBean;
import com.ksign.service.admin.util.ListResultBean;
import com.ksign.service.admin.util.PageCounter;

public class MemberServiceImpl implements MemberService{
	MemberDao memberDao;
	
	public MemberDao getMemberDao() {
		return memberDao;
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Override
	public int createMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.createMember(member);
	}

	@Override
	public Member readMember(int uno) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.readMember(uno);
	}

	@Override
	public int updateMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.updateMember(member);
	}

	@Override
	public int delelteMember(int uno) throws Exception {
		// TODO Auto-generated method stub
		return memberDao.delelteMember(uno);
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

	@Override
	public Member findMemberbyId(String uid) throws MemberNotFoundException, Exception {
		Member findMember = memberDao.selectIdByMember(uid);
		if(findMember == null){
			throw new MemberNotFoundException(uid +"는 존재하지 않는 아이디입니다.");
		}
		return  findMember;
	}

	
	@Override
	public Member login(String member_id, String member_pw) throws MemberNotFoundException,PasswordMismatchException,Exception {
		Member member = this.findMemberbyId(member_id);
		boolean isMatch = member.isMatchPassword(member_pw);
		if(isMatch){
			return member;
		}else{
			throw new PasswordMismatchException("비밀번호가 일치하지 않습니다.");
		}
	}

	@Override
	public boolean existedMember(String member_id) throws ExistedMemberException,Exception {
		boolean existedMember = memberDao.existedMember(member_id);
		if(existedMember){
			throw new ExistedMemberException("아이디가 존재합니다.");
		}else{
			return existedMember;
		}
	}
	
	@Override
	public ListResultBean findMemberAdminList(ListPageConfigBean pageConfig)
			throws Exception {
		// 전체 글의 갯수
		int recordCount = memberDao.getCount();
		ListResultBean listResultBean = null;
		listResultBean = PageCounter.getPagingInfo(
				Integer.parseInt(pageConfig.getSelectPage()),
				pageConfig.getRowCount(), pageConfig.getPagingCount(),
				recordCount);

		List<Member> boardList = memberDao.findAllMemberList(
				listResultBean.getStartRowNum(), listResultBean.getEndRowNum());
		listResultBean.setList(boardList);
		return listResultBean;
	}
	@Override
	public ListResultBean findMemberAdminListBy(ListPageConfigBean pageConfig, String text, String findType)
			throws Exception {
		// 전체 글의 갯수
		int recordCount = memberDao.findMemberCount(text, findType);
		ListResultBean listResultBean = null;
		listResultBean = PageCounter.getPagingInfo(
				Integer.parseInt(pageConfig.getSelectPage()),
				pageConfig.getRowCount(), pageConfig.getPagingCount(),
				recordCount);

		List<Member> boardList = memberDao.findAllMemberListBy(
				listResultBean.getStartRowNum(), listResultBean.getEndRowNum(), text, findType);
		listResultBean.setList(boardList);
		return listResultBean;
	}



}
