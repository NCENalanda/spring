package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
import com.nt.dao.EmployeeSearchDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

public class EmployeeSearchServiceImpl implements EmployeeSearchService {
	private EmployeeSearchDAO dao;

	public EmployeeSearchServiceImpl(EmployeeSearchDAO dao) {
		this.dao = dao;
	}

	public List<EmployeeResultDTO> findEmployees(EmployeeDTO dto) {
		List<EmployeeResultBO> listRBO=null;
		List<EmployeeResultDTO> listRDTO=null;
		EmployeeResultDTO rdto=null;
		EmployeeBO bo=null;
		//convert inputs dto to  inputs bo
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		//use dAO
		listRBO=dao.search(bo);
		//copy listRBO to listRDTO
		listRDTO=new ArrayList();
		for(EmployeeResultBO rbo:listRBO){
			rdto=new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo,rdto);
			listRDTO.add(rdto);
		}//for
		return listRDTO;
	}

}
