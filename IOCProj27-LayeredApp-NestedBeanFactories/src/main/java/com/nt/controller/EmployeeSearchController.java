package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dao.EmployeeSearchDAOImpl;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeSearchService;
import com.nt.service.EmployeeSearchServiceImpl;
import com.nt.vo.EmployeeVO;

public class EmployeeSearchController {
	private EmployeeSearchService service;

	public EmployeeSearchController(EmployeeSearchService service) {
		this.service = service;
		System.out.println("service.name"+((EmployeeSearchServiceImpl)service).getName());
	}
	
	public  List<EmployeeVO>  getEmpsByDesg(String desgs[])throws Exception{
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVO> listVO=new ArrayList();
		//use SErvice
		listDTO=service.searchEmpsByDesg(desgs);
		//copy listDTO to listVO
		listDTO.forEach(dto->{
			 EmployeeVO vo=new EmployeeVO();
			 vo.setSno(String.valueOf(dto.getSno()));
			 vo.setEno(String.valueOf(dto.getEno()));
			 vo.setEname(dto.getEname());
			 vo.setJob(dto.getJob());
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			listVO.add(vo);
		});
		
		return listVO;
	}//method
}//class
