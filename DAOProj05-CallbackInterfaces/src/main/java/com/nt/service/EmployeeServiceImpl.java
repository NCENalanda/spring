package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public EmployeeDTO findEmpDetialsByNo(int eno) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		//use DAO
		bo=dao.getEmpDetailsByNo(eno);
		
		//copy BO to DTO
		dto=new  EmployeeDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	
	@Override
	public List<EmployeeDTO> findEmpDetailsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getEmpDetailsByDesg(desg);
		//Convert listBO to listDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		return listDTO;
	}//method
}//class
