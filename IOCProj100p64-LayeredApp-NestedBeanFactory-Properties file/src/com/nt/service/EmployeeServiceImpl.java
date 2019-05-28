package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;
	
	@Override
	public List<EmployeeDTO> findEmpsByDesg(String desg) throws Exception {
			List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=null;
		EmployeeDTO dto=null;
		//b.logic
		desg=desg.toUpperCase();
		//use DAO
		listBO=dao.retriveEmpsByDesg(desg);
		//Convert ListBO to ListDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO){
			dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		}
		return listDTO;
	}//method

}
