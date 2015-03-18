package com.ksign.service.borad;

import java.util.List;


public interface BoardDao{
	/**
	 * �� ��
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int create(Board board) throws Exception;
	
	/**
	 * �ۺ���
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public abstract Board read(int boardNo) throws Exception;

	/**
	 * �� ����
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int update(Board board) throws Exception;
	
	/**
	 * ��Ƚ�� ����
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int updateCount(Board board) throws Exception;
	
	/**
	 * ����
	 * @param boardNo
	 * @return
	 * @throws Exception
	 */
	public abstract int remove(int boardNo) throws Exception;
	
	/**
	 * �� ���
	 * @param startRowNum
	 * @param endRowNum
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract List<Board> findBoardList(int startRowNum, int endRowNum, String board_type, String board_content  ) throws Exception;
	
	/**
	 * �� ��ü �� ��ȸ
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract int getBoardCount(String board_type, String board_content ) throws Exception;
	
	/**
	 * ���� ���� �˻� ���
	 * @param startRowNum
	 * @param endRowNum
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract List<Board> findBoardReplyList(int startRowNum, int endRowNum, String board_type, String board_content  ) throws Exception;
	
	/**
	 * ���� �˻� ��� ��ü �� ��ȸ
	 * @param board_type
	 * @param board_content
	 * @return
	 * @throws Exception
	 */
	public abstract int getBoardReplyCount(String board_type, String board_content ) throws Exception;
	
}
