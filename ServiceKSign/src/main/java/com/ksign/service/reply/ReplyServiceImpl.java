package com.ksign.service.reply;

import java.util.List;


public class ReplyServiceImpl implements ReplyService {

	private ReplyDao replyDao;
	
	public ReplyDao getReplyDao(){
		return replyDao;
	}
	
	public void setReplyDao(ReplyDao replyDao) {
		this.replyDao = replyDao;
	}
	
	@Override
	public int create(Reply reply) throws Exception {
		return replyDao.create(reply);
	}

	@Override
	public List<Reply> findReplyList(int board_no) throws Exception {
		return replyDao.findReplyList(board_no);
	}

	@Override
	public int createReply(Reply reply) throws Exception {
		return replyDao.createReply(reply);
	}

	@Override
	public int update(Reply reply) throws Exception {
		return replyDao.update(reply);
	}

	@Override
	public int remove(int replyNo) throws Exception {
		return replyDao.remove(replyNo);
	}

	@Override
	public Reply read(int reply_no) throws Exception {
		return replyDao.read(reply_no);
	}

	@Override
	public int getReplyCount(int reply_reference_no, int reply_dep)
			throws Exception {
		return replyDao.getReplyCount(reply_reference_no, reply_dep);
	}

	@Override
	public int changeReplyStatus(int replyNo) throws Exception {
		return replyDao.changeReplyStatus(replyNo);
	}

}
