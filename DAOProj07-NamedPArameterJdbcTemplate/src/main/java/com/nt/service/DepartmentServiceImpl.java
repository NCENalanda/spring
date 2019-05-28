package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

import com.nt.bo.DepartmentBO;
import com.nt.dao.DepartmentDAO;
import com.nt.dto.DepartmentDTO;

public class DepartmentServiceImpl implements DepartmentService {

	private DepartmentDAO dao;

	public DepartmentServiceImpl(DepartmentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<DepartmentDTO> searchDeptsByDeptNos(int start, int end) {
		List<DepartmentBO> listBO=null; 
		List<DepartmentDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getDeptDetialsByDeptNo(start, end);
		//convert listBO to listDTO
		listBO.forEach(bo->{
			DepartmentDTO dto=new DepartmentDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}
	
	@Override
	public int findDeptsCountByLocations(String city1, String city2) {
		int count=0;
	//use DAO
		count=dao.getDeptCountByLocations(city1, city2);
		return count;
	}
	
	@Override
	public String addDepartment(DepartmentDTO dto) {
		int count=0;
		DepartmentBO bo=null;
		//convert DTO to BO
		bo=new DepartmentBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.registerDepartment(bo);
		if(count==0)
			return "Registration failed";
		else
			return "Registration succeded";
	}//method
}//class
