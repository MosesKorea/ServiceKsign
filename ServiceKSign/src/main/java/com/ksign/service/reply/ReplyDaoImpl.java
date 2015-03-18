package com.ksign.service.reply;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class ReplyDaoImpl implements ReplyDao {

	public final static String namespace="com.bowtech.demo.reply.ReplyMapper";
	private SqlSession session;
	public SqlSession getSession() {
		return session;
	}
	
	public void setSession(SqlSession session) {
		System.out.println("#### ReplyDaoImplMyBatis() : setSession()");
		this.session = session;
	}
	
	@Override
	public int create(Reply reply) throws Exception {
		return session.insert(namespace+".insertRely", reply);
	}

	@Override
	public List<Reply> findReplyList(int board_no) throws Exception {
		return session.selectList(namespace+".selectReplyList", board_no);
	}

	@Override
	public int createReply(Reply reply) throws Exception {
		
		Reply tempReply = null;
		
		// ��۴� ���� �����ȣ, ����, �� ��ȸ�Ѵ�.
		tempReply = session.selectOne(namespace+".readReply", reply.getReply_no());
		
		// ����� 6�ܰ� �̻�� Exception�� �߻� ��Ų��. ���� ��� 5�ܰ�� ���� ��� 6�ܰ� ��� ���� �ʵ��� ó��
		if (tempReply.getReply_dep() >= 5) {
			throw new Exception();   
		}
		
		Map<String,Object> input = new HashMap<String, Object>();
		input.put("reply_reference_no", tempReply.getReply_reference_no());
		input.put("reply_order", tempReply.getReply_order());
		
		// ����� �� 1�� ������Ų��.
		session.update(namespace+".addStep", input);
		
		// ��� ���
		Map<String,Object> input2 = new HashMap<String, Object>();
		input2.put("reply_content", reply.getReply_content());
		input2.put("reply_writer", reply.getReply_writer());
		input2.put("reply_pw", reply.getReply_pw());
		input2.put("reply_reference_no", tempReply.getReply_reference_no());
		input2.put("reply_dep", tempReply.getReply_dep());
		input2.put("reply_order", tempReply.getReply_order());
		input2.put("board_no", reply.getBoard_no());
		
		
		return session.insert(namespace+".insertRelyRely", input2);
	}

	@Override
	public int update(Reply reply) throws Exception {
		return session.update(namespace+".updateReply", reply);
	}

	@Override
	public int remove(int replyNo) throws Exception {
		return session.delete(namespace+".deleteReply", replyNo);
	}

	@Override
	public Reply read(int reply_no) throws Exception {
		return session.selectOne(namespace+".readReply", reply_no);
	}

	@Override
	public int getReplyCount(int reply_reference_no, int reply_dep)
			throws Exception {
		Map<String,Object> input3 = new HashMap<String, Object>();
		input3.put("reply_reference_no", reply_reference_no);
		input3.put("reply_dep", reply_dep);
		return session.selectOne(namespace+".getReplyCount", input3);
	}

	@Override
	public int changeReplyStatus(int replyNo) throws Exception {
		return session.update(namespace+".changeReplyStatus", replyNo);
	}

}
