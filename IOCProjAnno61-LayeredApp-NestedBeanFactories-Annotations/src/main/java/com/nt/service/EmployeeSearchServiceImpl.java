package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeSearchDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeSearchServiceImpl implements EmployeeSearchService {
    @Autowired
	private EmployeeSearchDAO dao;
   	
	

	
	
	@Override
	public List<EmployeeDTO> searchEmpsByDesg(String[] desgs) throws Exception {
		String cond="(";
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
	
		int length=0;
		//prepare Condition String
		for(int i=0;i<desgs.length;++i){
			if(i==desgs.length-1)
				cond=cond+"'"+desgs[i]+"')";
			else
				cond=cond+"'"+desgs[i]+"',";
		}
		//use DAO
		listBO=dao.findEmpsByDesg(cond);
		//Convert ListBO to  ListDTO
		for(EmployeeBO bo:listBO){
			 EmployeeDTO dto=new EmployeeDTO();
			 BeanUtils.copyProperties(bo,dto);
			 dto.setSno(listDTO.size()+1);
			 listDTO.add(dto);
		}
		/*listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSno(listDTO.size()+1);
			listDTO.add(dto);
		});*/
		return listDTO;
	}//method
}//class
