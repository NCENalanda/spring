package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class Student_SFController extends SimpleFormController {
	private Student_Service service;
	
	public Student_SFController(Student_Service service) {
		// TODO Auto-generated constructor stub
		this.service=service;
	}
	
	
	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("__________-------------RegisterController.referenceData()------------------________________________");
		
		Map<String,List<String>> map=null;
		List<String> listCountry=null, listState=null,listDistrict=null,listCourse=null,listHobbies=null;
		
		//Country
		listCountry=new ArrayList<>();
		listCountry.add("India");
		listCountry.add("USA");listCountry.add("France");listCountry.add("Russia");listCountry.add("Brazil");
		
		//state
		listState=new ArrayList<>();
		listState.add("Andra Pradesh");
		listState.add("Bihar");listState.add("Uttar Pradesh");listState.add("Jharkhand");listState.add("Assam");listState.add("Panjab");
		
		//district
		listDistrict=new ArrayList<>();
		listDistrict.add("Khagaria");listDistrict.add("Patna");listDistrict.add("Gya");listDistrict.add("Bhagalpur");
		listDistrict.add("Nalanda");listDistrict.add("Purnia");listDistrict.add("Chapara");
		
		//course
		listCourse=new ArrayList<>();
		listCourse.add("Core Java");listCourse.add("Advance Java");listCourse.add("Spring");listCourse.add("Hibernate");
		listCourse.add("WebService");listCourse.add("Design Pattern");
		
		
		//hobbies
		listHobbies=new ArrayList<>();
		listHobbies.add("Singing");listHobbies.add("Dancing");listHobbies.add("Travelling");listHobbies.add("Swiming");
		
		//set the all list in Map
		map=new HashMap<>();
		map.put("lcountry", listCountry);
		map.put("lstate",listState);
		map.put("ldistrict",listDistrict);
		map.put("lcourse",listCourse);
		map.put("lhobbies",listHobbies);
		
		
		return map;
	}//close method
	
	
	
	
	
	
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object cmd,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		StudentCommand command=null;
		ModelAndView mav=null;
		String str=null;
		StudentDTO dto=null;
		List<StudentDTO> listDTO=null;
		Map<String, List<String>> refmap=null;
		dto=new StudentDTO();
		//casting Command Obj
		command=(StudentCommand) cmd;
		//convert Command to Dto
		BeanUtils.copyProperties(command, dto);
		
		//call the referenceData(-);
		refmap=this.referenceData(request);
		
		//save the data in database
		str=service.insertInfo(dto);
		//get all records & Refresh 
		listDTO=service.getAllRecords();
		System.out.println("Command    "+command.toString());
		System.out.println("dto    "+dto.toString());
		mav=new ModelAndView();
		mav.addObject("message", str);
		mav.addObject("list", listDTO);
		mav.addObject("stCmd", cmd);
		mav.addObject("lcountry", refmap.get("lcountry"));
		mav.addObject("lstate", refmap.get("lstate"));
		mav.addObject("ldistrict",refmap.get("ldistrict"));
		mav.addObject("lcourse", refmap.get("lcourse"));
		mav.addObject("lhobbies", refmap.get("lhobbies"));
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
