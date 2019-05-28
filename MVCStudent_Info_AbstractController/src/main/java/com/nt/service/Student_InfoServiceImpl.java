package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.Student_InfoDAO;
import com.nt.dto.StudentDTO;

public class Student_InfoServiceImpl implements Student_InfoService {
	private Student_InfoDAO dao;
	public Student_InfoServiceImpl(Student_InfoDAO dao) {
		// TODO Auto-generated constructor stub
		System.out.println("------------------Service-------------------------");
		this.dao=dao;
	}

	@Override
	public List<StudentDTO> getAllDetails() {
		// TODO Auto-generated method stub
		
		List<StudentDTO> listDTO=new ArrayList<>();
		List<StudentBO> listBO=null;
		listBO=dao.fetchRecords();
		listBO.forEach(bo ->{
			StudentDTO dto=new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
