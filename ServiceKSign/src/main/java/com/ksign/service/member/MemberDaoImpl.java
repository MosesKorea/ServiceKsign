package com.ksign.service.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;


public class MemberDaoImpl implements MemberDao{
	public final static String namespace="com.ksign.service.member.MemberMapper";
	private SqlSession session;
	public SqlSession getSession() {
		return session;
	}
	
	public void setSession(SqlSession session) {
		System.out.println("#### UserDaoImplMyBatis() : setSession()");
		this.session = session;
	}
	@Override
	public int createMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return session.insert(namespace+".create", member);
	}

	@Override
	public Member readMember(int uno) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".findMemberByNo", uno);
	}

	@Override
	public int updateMember(Member member) throws Exception {
		// TODO Auto-generated method stub
		return session.update(namespace + ".updateMember", member);
	}

	@Override
	public int delelteMember(int uno) throws Exception {
		// TODO Auto-generated method stub
		return session.delete(namespace + ".deleteMember", uno);
	}

	@Override
	public List<Member> selectAllMember() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".findMemberList");
	}

	@Override
	public List<Member> selectCompanyMember(String c_type) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectIdByMember(String uid) throws Exception {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+".findMemberById", uid);
	}
	
	@Override
	public List<Member> findMemberList() throws Exception {
		// TODO Auto-generated method stub
		return session.selectList(namespace+".findMemberList");
	}

	@Override
	public boolean existedMember(String uid) throws Exception {
		int existedCount = session.selectOne(namespace +".existedMember", uid);
		if(existedCount>0){
			return true;
		}else{
			return false;
		}
		
	}

	@Override
	public int getCount() throws Exception {
		return getSession().selectOne(namespace+".getCount");
	}
	@Override
	public List<Member> findAllMemberList(int startRowNum, int endRowNum)
			throws Exception {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("startRowNum", startRowNum);
		map.put("endRowNum", endRowNum);
		return getSession().selectList(namespace+".findAllMemberList", map);
	}
	
	public List<Member> findAllMemberListBy(int startRowNum, int endRowNum, String text, String findType)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("startRowNum", startRowNum);
		map.put("endRowNum", endRowNum);
		map.put("text", text);
		map.put("findType", findType);
		return getSession().selectList(namespace+".findMemberListBy", map);
	}

	@Override
	public int findMemberCount(String text, String findType) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("text", text);
		map.put("findType", findType);
		
		return getSession().selectOne(namespace+".findMemberCount", map);
	}

}
