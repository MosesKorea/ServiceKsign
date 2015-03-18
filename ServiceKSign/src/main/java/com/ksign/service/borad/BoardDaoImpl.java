package com.ksign.service.borad;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
public class BoardDaoImpl implements BoardDao{
	public final static String namespace="com.bowtech.demo.board.BoardMapper";
	private SqlSession session;
	public SqlSession getSession() {
		return session;
	}
	
	public void setSession(SqlSession session) {
		System.out.println("#### UserDaoImplMyBatis() : setSession()");
		this.session = session;
	}

	@Override
	public int create(Board board) throws Exception {
		return session.insert(namespace+".insertBoard", board);
	}

	@Override
	public Board read(int boardNo) throws Exception {
		return session.selectOne(namespace+".readBoard", boardNo);
	}
	
	@Override
	public int update(Board board) throws Exception {
		return session.update(namespace+".updateBoard", board);
	}

	@Override
	public int updateCount(Board board) throws Exception {
		return session.update(namespace+".updateBoardCount", board);
	}

	@Override
	public int remove(int boardNo) throws Exception {
		session.delete(namespace+".deleteReply", boardNo);
		return session.delete(namespace+".deleteBoard", boardNo);
	}


	@Override
	public List<Board> findBoardList(int startRowNum, int endRowNum, String board_type, String board_content ) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("startRowNum", startRowNum);
		input.put("endRowNum", endRowNum);
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectList(namespace+".selectBoardlist", input);
	}

	@Override
	public int getBoardCount(String board_type, String board_content) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectOne(namespace+".countBoard", input);
	}
	
	@Override
	public List<Board> findBoardReplyList(int startRowNum, int endRowNum, String board_type, String board_content ) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("startRowNum", startRowNum);
		input.put("endRowNum", endRowNum);
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectList(namespace+".selectBoardReplylist", input);
	}
	
	@Override
	public int getBoardReplyCount(String board_type, String board_content) throws Exception {
		Map<String,Object> input=new HashMap<String, Object>();
		input.put("board_type", board_type);
		input.put("board_content", board_content);
		return session.selectOne(namespace+".countBoardReply", input);
	}

}
