package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;

public class Student_SFController extends SimpleFormController {
	private List<StudentCommand> list;
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		StudentCommand command=null;
		
		String str=null;
		command=(StudentCommand) cmd;
		str=command.toString();
		list=new ArrayList<>();
		list.add(command);
		
		return new ModelAndView(this.getSuccessView(),"result",str);
	}
	
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String msg="Double Posting not allowed ";
		return new ModelAndView("error" , "errMsg", msg);
	}

}
