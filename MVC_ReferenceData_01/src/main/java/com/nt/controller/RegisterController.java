package com.nt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;

public class RegisterController extends SimpleFormController {
	
	public RegisterController() {
		// TODO Auto-generated constructor stub
		System.out.println("                  RegisterController.RegisterController()                     ");
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
		map.put("lcountry", listCountry);
		map.put("lstate",listState);
		map.put("ldistrict",listDistrict);
		map.put("lcourse",listCourse);
		map.put("lhobbies",listHobbies);
		
		
		return map;
	}//close method
	
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("---------------------__________________RegisterController.onSubmit()_________________________---------------------------");
		ModelAndView mav=null;
		Map<String, List<String>> refmap=null;
		//call the referenceData(-);
		refmap=this.referenceData(request);
		
		mav=new ModelAndView();
		mav.setViewName("register");
		//set the attribute of all reference data & Command Obj in MAV
		mav.addObject("stCmd", command);
		mav.addObject("lcountry", refmap.get("lcountry"));
		mav.addObject("lstate", refmap.get("lstate"));
		mav.addObject("ldistrict",refmap.get("ldistrict"));
		mav.addObject("lcourse", refmap.get("lcourse"));
		mav.addObject("lhobbies", refmap.get("lhobbies"));
		
		System.out.println(command.toString());
		
		return mav;
	}

}
