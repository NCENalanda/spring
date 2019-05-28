package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDTO> fetchStudents() {
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=new ArrayList();
	   //use dAO
		listBO=dao.getAllStudents();
		//copy listBO to listDTO
		listBO.forEach(bo->{
			StudentDTO dto=new StudentDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}
	
	@Override
	public StudentDTO fetchStudentBySno(int sno) {
		StudentBO bo=null;
		StudentDTO dto=null;
		//use DAO
		bo=dao.getStudentBySno(sno);
		//convert BO to DTO
		dto=new StudentDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}
	
	@Override
	public String modifyStudentBySno(StudentDTO dto) {
		StudentBO bo=null;
		int count=0;
		//Convert DTO to BO
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.updateStudent(bo);
		if(count==0)
			return dto.getSno()+"Updation failed";
		else
			return dto.getSno()+" updation succeded";
	}
	
	@Override
	public String removeStudentBySno(int sno) {
		int count=0;
		//use DAO
		count=dao.deleteStudent(sno);
		if(count==0)
			return sno+" number student  deletion failed";
		else
			return sno+" number student  deletion succeded";
	}

}
