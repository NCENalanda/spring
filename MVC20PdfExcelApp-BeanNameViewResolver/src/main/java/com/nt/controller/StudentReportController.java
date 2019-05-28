package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDTO;

public class StudentReportController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		StudentDTO dto1=null,dto2=null;
		List<StudentDTO> listDTO=null;
		//construct  data
		 dto1=new StudentDTO();
		 dto1.setSno(101); dto1.setSanme("raja"); dto1.setCourse("java");
		 dto2=new StudentDTO();
		 dto2.setSno(102); dto2.setSanme("rani"); dto2.setCourse("java");
		 listDTO=new ArrayList();
		 listDTO.add(dto1); listDTO.add(dto2);
		 
		 //return MAV object
		 if(req.getParameter("type").equalsIgnoreCase("excel")){
			 return new ModelAndView("stev","studList",listDTO);
		 }
		 else{
			 return new ModelAndView("stpv","studList",listDTO);
		 }
	}

}
