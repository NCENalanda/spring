package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	 private EmployeeDAO  dao;
	 private String type;

	public EmployeeServiceImpl(EmployeeDAO dao,String type) {
		this.dao = dao;
		this.type=type;
		System.out.println("ServiceImpl::: "+type);
	}

	@Override
	public List<EmployeeDTO> fetchEmpsByDesg(String[] desg) throws Exception {
		String cond=null;
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		//prepare SQL Query condition from desg[]
		cond="(";                                         // ('CLERK','MANAGER','ANALYST')
		for(int i=0;i<desg.length;++i){
			if(i==desg.length-1)
				cond=cond+"'"+desg[i]+"'";
			else 
				cond=cond+"'"+desg[i]+"',";
		}
		cond=cond+")";
		//use DAO
		
		listBO=dao.retrieveEmpsByDesg(cond);
		listBO.forEach(bo->{
			//Copy Each BO to Each DTO
			EmployeeDTO dto=new EmployeeDTO();
			dto.setSno(listDTO.size()+1);
			/*dto.setEname(bo.getEname());
			dto.setSalary(bo.getSalary());
			dto.setEno(bo.getEno());
			dto.setDesg(bo.getDesg());*/
			BeanUtils.copyProperties(bo,dto);
			//add each dto to ListDTO
			listDTO.add(dto);
		});
		
		/*//Convert listBO to listDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO){
			//copy each BO to each DTO
			dto=new EmployeeDTO();
			dto.setSno(listDTO.size()+1);
			
			dto.setEno(bo.getEno());
			dto.setEname(bo.getEname());
			dto.setSalary(bo.getSalary());
			dto.setDesg(bo.getJob());
			BeanUtils.copyProperties(bo,dto);
			//add BO to list Collection
			listDTO.add(dto);
		}*/
		return listDTO;
	}//method
}//class
