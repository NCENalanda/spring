package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.MedicineDetailsDTO;
import com.nt.service.MedPlusStoreService;

public class MedPlusStoreController extends AbstractController {
 

	private MedPlusStoreService service;
	
	   public MedPlusStoreController(MedPlusStoreService service) {
		
			this.service = service;
		}
    
	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<MedicineDetailsDTO> listDTO=null;
		ModelAndView mav=null;
		//use sErvice class
		listDTO=service.getAllMedicines();
		//prepare MAV object
		mav=new ModelAndView();
		mav.setViewName("show_report");
		mav.addObject("listMed",listDTO);
		return mav;
	}

}
