package com.seayan.controller.action;	

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardViewActhion implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String url = "/board/boardView.jsp";
		
		String num = request.getParameter("num");
		
		BoardDAO bDao = BoardDAO.getInstance();
		
		BoardVO bVO = bDao.selectOneBoardByNum(num);

		request.setAttribute("board", bVO);
				
		RequestDispatcher dispatcher =request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
	
}
