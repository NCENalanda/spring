package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.Student_Search_DAO;
import com.nt.dto.StudentDTO;

public class Student_Info_ServiceImpl implements Student_Info_Service {
	private Student_Search_DAO dao;
	public Student_Info_ServiceImpl(Student_Search_DAO dao) {
		// TODO Auto-generated constructor stub
		 this.dao=dao;
	}

	@Override
	public List<StudentDTO> getInfo(StudentDTO dto) {
		
		
		System.out.println("**********************************************************************************************");
		System.out.println("in  service");
		System.out.println("*************************************************************************************************");
		// TODO Auto-generated method stub
		StudentBO bo=null;
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=new ArrayList<>();
		//set properties of bo
		bo=new StudentBO();
		bo.setName(dto.getName());
		bo.setRank(dto.getRank());
		bo.setId(dto.getId());
		
		listBO=dao.search(bo);
		System.out.println("listbo"+listBO.toString());
		//intialize the listDTO
	
		//conert the contaniers listBO to listDTO;
		listBO.forEach(bo1 -> {
			StudentDTO  dto1= new StudentDTO();
			BeanUtils.copyProperties(bo1, dto1);
			listDTO.add(dto1);
			
		});
		System.out.println("listDTO"+listDTO.toString());
		return listDTO;
	}

}
