package com.ksign.service.borad.controller;

import java.text.DateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ksign.service.borad.*;
import com.ksign.service.borad.BoardService;
import com.ksign.service.borad.util.ListPageConfigBean;
import com.ksign.service.borad.util.ListResultBean;

public class BoradListController {
	BoardService boardService;

	public BoardService getBoardService() {
		return boardService;
	}

	public void setBoardService(BoardService boardService) {
		this.boardService = boardService;
	}
	
	public BoradListController(){
		System.out.println("#########BoradListController");
	}
	/**
	 * boardlist 諛섑솚�븯�뿬 �럹�씠吏��뿉 蹂댁뿬以�
	 * @param model
	 * @return borad/list
	 */
	@RequestMapping(value="/boardList",method=RequestMethod.GET)
	public String listBorad(Model model,HttpServletRequest request,
			@RequestParam(value="pageNo",defaultValue="1")String pageNo,
			@RequestParam(value="type",defaultValue="")String type,
			@RequestParam(value="content", defaultValue="")String content){
		
		int row = 10;
		int pageCount = 5;
		
		ListPageConfigBean pageConfig = new ListPageConfigBean(row, pageCount, pageNo, type, content);
		ListResultBean boardListPage = null;
		try {
			if (type.equals("reply")) {
				boardListPage=boardService.findBoardReplyList(pageConfig);
			}else{
				boardListPage=boardService.findBoardList(pageConfig);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		List<Board> boardlist = boardListPage.getList();
		
		//DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM);
		
		
		model.addAttribute("boardListPage", boardListPage);
		model.addAttribute("boardList", boardlist);
		model.addAttribute("type", type);
		model.addAttribute("content", content);
		
		return "board/list";
	}
	
}
