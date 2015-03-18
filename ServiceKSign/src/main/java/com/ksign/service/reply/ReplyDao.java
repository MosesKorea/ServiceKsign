package com.ksign.service.reply;

import java.util.List;

public interface ReplyDao{
	
	/**
	 * ��� ��
	 * @param reply
	 * @return
	 * @throws Exception
	 */
	public abstract int create(Reply reply) throws Exception;
	
	/**
	 * ��� ���
	 * @param board_no
	 * @return
	 * @throws Exception
	 */
	public abstract List<Reply> findReplyList(int board_no ) throws Exception;
	
	/**
	 * ��� ��
	 * @param reply
	 * @return
	 * @throws Exception
	 */
	public abstract int createReply(Reply reply) throws Exception;
	
	/**
	 * ����
	 * @param reply
	 * @return
	 * @throws Exception
	 */
	public abstract int update(Reply reply) throws Exception;
	
	/**
	 * ����
	 * @param replyNo
	 * @return
	 * @throws Exception
	 */
	public abstract int remove(int replyNo) throws Exception;
	
	/**
	 * �б�
	 * @param reply_no
	 * @return
	 * @throws Exception
	 */
	public abstract Reply read(int reply_no) throws Exception;
	
	/**
	 * ��ۿ� ��� �޸� ����
	 * @param reply_reference_no
	 * @param reply_dep
	 * @return
	 * @throws Exception
	 */
	public abstract int getReplyCount(int reply_reference_no, int reply_dep) throws Exception;
	
	/**
	 * ��� ���� ���·� ��ȯ
	 * @param replyNo
	 * @return
	 * @throws Exception
	 */
	public abstract int changeReplyStatus(int replyNo) throws Exception;
	
}
