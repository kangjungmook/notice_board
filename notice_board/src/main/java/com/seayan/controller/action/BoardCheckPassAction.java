package com.seayan.controller.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.saeyan.dao.BoardDAO;
import com.saeyan.dto.BoardVO;

public class BoardCheckPassAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = null;

		String num = request.getParameter("num");
		String pass = request.getParameter("pass");

		BoardDAO bDao = BoardDAO.getInstance();
		BoardVO bVo = bDao.checkPPassWord(pass,num);

		if (bVo.getPass().equals(pass)) {
			url = "/board/checkSuccess.jsp";
		}else {
			url = "/board/boardCheckPass.jsp";
			request.setAttribute("massage","비민번호가 틀렸습니다.");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
