package com.seayan.controller;

import com.seayan.controller.action.Action;
import com.seayan.controller.action.BoardCheckPassAction;
import com.seayan.controller.action.BoardCheckPassFormAction;
import com.seayan.controller.action.BoardDeleteAction;
import com.seayan.controller.action.BoardListAction;
import com.seayan.controller.action.BoardUpdateAction;
import com.seayan.controller.action.BoardUpdateFormAction;
import com.seayan.controller.action.BoardViewActhion;
import com.seayan.controller.action.BoardWriteAction;
import com.seayan.controller.action.BoardWriteFormAction;

public class ActionFactory {
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {
		super();
	}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAction(String command) {
		Action action = null;
		System.out.println("ActionFactory : "+command);
		
		if (command.equals("board_list")) {
			action = new BoardListAction();
		}else if(command.equals("board_write_form")) {
			action = new BoardWriteFormAction();
		}else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_write")) {
			action = new BoardWriteAction();
		}else if (command.equals("board_view")) {
			action = new BoardViewActhion();
		}else if (command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		}else if (command.equals("board_update")) {
			action = new BoardUpdateAction();
		}else if (command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}else if (command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		}
		return action;
	}
}
