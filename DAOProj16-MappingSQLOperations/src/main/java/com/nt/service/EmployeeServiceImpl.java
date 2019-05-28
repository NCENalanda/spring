package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.mchange.v2.codegen.bean.BeangenUtils;
import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
   

	private EmployeeDAO dao;
	
	 public EmployeeServiceImpl(EmployeeDAO dao) {
			this.dao = dao;
		}
    
	@Override
	public List<EmployeeDTO> searchEmpsByDesgs(String desg1, String desg2) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		listBO=dao.getEmployeesByDesgs(desg1, desg2);
		//Convert ListBO to ListDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

	@Override
	public EmployeeDTO searchEmpByNo(int no) {
		EmployeeBO bo=null;
		EmployeeDTO dto=null;
		//use DAO
		bo=dao.getEmployeeByNo(no);
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}
	
	@Override
	public String registerEmp(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
		   return "Emp Registration failed";
		else
			return "Emp Registration completed";
	}

}
