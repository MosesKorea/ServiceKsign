package com.ksign.service.borad;

import java.util.List;

import com.ksign.service.borad.util.ListPageConfigBean;
import com.ksign.service.borad.util.ListResultBean;
import com.ksign.service.borad.util.PageCounter;



public class BoardServiceImpl implements BoardService{

	private BoardDao boardDao;
	
	public BoardDao getBoardDao(){
		return boardDao;
	}
	
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	@Override
	public int create(Board board) throws Exception {
		return boardDao.create(board);
	}
	
	@Override
	public Board read(int boardNo) throws Exception {
		return boardDao.read(boardNo);
	}
	
	@Override
	public int update(Board board) throws Exception {
		return boardDao.update(board);
	}

	@Override
	public int updateCount(Board board) throws Exception {
		return boardDao.updateCount(board);
	}

	@Override
	public int remove(int boardNo) throws Exception {
		return boardDao.remove(boardNo);
	}
	
	@Override
	public ListResultBean findBoardList(ListPageConfigBean pageConfig) throws Exception {
		// ?�체 �?�� �?��
		int count = boardDao.getBoardCount(pageConfig.getSearchType(), pageConfig.getSearchContent());
		// ?�이�?처리 �?�� ?�보 ?�정
		ListResultBean listResultBean = null;
		listResultBean = PageCounter.getPagingInfo(
				Integer.parseInt(pageConfig.getSelectPage()),
				pageConfig.getRowCount(), pageConfig.getPagingCount(),
				count);

		List<Board> boardList = boardDao.findBoardList(
				listResultBean.getStartRowNum(), listResultBean.getEndRowNum(), pageConfig.getSearchType(), pageConfig.getSearchContent() );
		listResultBean.setList(boardList);

		return listResultBean;
	}
	
	@Override
	public ListResultBean findBoardReplyList(ListPageConfigBean pageConfig) throws Exception {
		// ?�체 �?�� �?��
		int count = boardDao.getBoardReplyCount(pageConfig.getSearchType(), pageConfig.getSearchContent());
		// ?�이�?처리 �?�� ?�보 ?�정
		ListResultBean listResultBean = null;
		listResultBean = PageCounter.getPagingInfo(
				Integer.parseInt(pageConfig.getSelectPage()),
				pageConfig.getRowCount(), pageConfig.getPagingCount(),
				count);

		List<Board> boardList = boardDao.findBoardReplyList(
				listResultBean.getStartRowNum(), listResultBean.getEndRowNum(), pageConfig.getSearchType(), pageConfig.getSearchContent() );
		listResultBean.setList(boardList);

		return listResultBean;
	}

}
