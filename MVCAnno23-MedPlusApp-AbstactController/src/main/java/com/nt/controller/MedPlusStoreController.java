package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.dto.MedicineDetailsDTO;
import com.nt.service.MedPlusStoreService;

@Controller
public class MedPlusStoreController  {
 
@Autowired
	private MedPlusStoreService service;
	
	
    @RequestMapping(value="/medplus.htm")
	public String processRequest(Map<String,Object> map) throws Exception {
		List<MedicineDetailsDTO> listDTO=null;
		//use sErvice class
		listDTO=service.getAllMedicines();
		//prepare MAV object
		map.put("listMed",listDTO);
		return "show_report";
	}

}
