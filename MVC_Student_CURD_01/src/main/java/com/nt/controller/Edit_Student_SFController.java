package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class Edit_Student_SFController extends SimpleFormController {
	
	private Student_Service service;
	public Edit_Student_SFController(Student_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		// TODO Auto-generated method stub
		StudentDTO dto=null;
		StudentCommand cmd=null;
		//read the id from request
		int id=Integer.parseInt(req.getParameter("id"));
		
		//get data from service
		dto=service.get_Records_By_ID(id);
		cmd=new StudentCommand();
		//convert DTO to Command
		BeanUtils.copyProperties(dto, cmd);
		
		return cmd;
	}//close
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav=null;
		String msg=null;
		StudentDTO dto=null;
		StudentCommand cmd=null;
		List<StudentDTO> listDTO=null;
		//casting the Command
		cmd=(StudentCommand) command;
		
		dto=new StudentDTO();
		//convert cmd to DTO
		BeanUtils.copyProperties(cmd, dto);
		
		//records updated so calling the service
		msg=service.updateInfo(dto);
		
		//get all records
		listDTO=service.getAllRecords();
		//System.out.println(listDTO.toString());
		mav=new ModelAndView();
		//add the both msg & listDTO as attribute
		mav.addObject("message",msg);
		mav.addObject("list", listDTO);
		mav.setViewName("all_records");
		
		return mav;
	}
	
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		String msg="Double Posting not allowed ";
		return new ModelAndView("error" , "errMsg", msg);
	}
}
