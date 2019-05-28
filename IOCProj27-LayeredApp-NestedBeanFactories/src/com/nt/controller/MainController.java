package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeService service;

	public MainController(EmployeeService service) {
		this.service = service;
	}
	
	public List<EmployeeVO> getEmpsByDesgs(String desgs[])throws Exception{
		List<EmployeeDTO> listDTO=null;
		List<EmployeeVO> listVO=new ArrayList();
		//use SErvice
		listDTO=service.fetchEmpsByDesg(desgs);
		//convert listDTO to listVO
		listDTO.forEach(dto->{
			//Copy each DTO to each VO
			EmployeeVO vo=new EmployeeVO();
			vo.setSno(String.valueOf(dto.getSno()));
			vo.setEno(String.valueOf(dto.getEno()));
			vo.setEname(dto.getEname());
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setDesg(dto.getDesg());
			//add Each VO to  ListVO
			listVO.add(vo);
		});
	
	/*	for(EmployeeDTO dto:listDTO){
			//Copy Each DTO class obj to each VO class obj
			vo=new EmployeeVO();
			//BeanUtils.copyProperties(dto,vo);  //we can not use becoz types are not matching
			vo.setSno(String.valueOf(dto.getSno()));
			vo.setEno(String.valueOf(dto.getEno()));
			vo.setEname(dto.getEname());
			vo.setDesg(dto.getDesg());
			vo.setSalary(String.valueOf(dto.getSalary()));
			//add VO class obj to listVO
			listVO.add(vo);
		}//for
*/	
		return listVO;
	}//method
}//class
