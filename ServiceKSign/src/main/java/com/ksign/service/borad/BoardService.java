package com.ksign.service.borad;

import java.util.List;

import com.ksign.service.borad.util.ListPageConfigBean;
import com.ksign.service.borad.util.ListResultBean;


public interface BoardService {

	/**
	 * �� ��
	 * @param board
	 * @return
	 * @throws Exception
	 */
	public abstract int create(Board board) throws Exception;
	
	/**
	 * �� ����
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
	 * �� ��ȸ�� ����
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
	 * @param pageConfig
	 * @return
	 * @throws Exception
	 */
	public abstract ListResultBean findBoardList(ListPageConfigBean pageConfig) throws Exception;
	
	/**
	 * ���� ���� �˻� ���
	 * @param pageConfig
	 * @return
	 * @throws Exception
	 */
	public abstract ListResultBean findBoardReplyList(ListPageConfigBean pageConfig) throws Exception;
	

}
