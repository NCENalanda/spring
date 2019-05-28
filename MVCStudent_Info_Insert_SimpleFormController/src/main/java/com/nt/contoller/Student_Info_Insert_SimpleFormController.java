package com.nt.contoller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Info_Insert_Service;

public class Student_Info_Insert_SimpleFormController extends SimpleFormController {
	private Student_Info_Insert_Service service;
	
	public Student_Info_Insert_SimpleFormController(Student_Info_Insert_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		String msg=null;
		StudentCommand command=null;
		command=(StudentCommand) cmd;
		StudentDTO dto=null;
		dto=new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		msg=service.save(dto);
		return new ModelAndView(getSuccessView(),"result",msg);
	}
}
