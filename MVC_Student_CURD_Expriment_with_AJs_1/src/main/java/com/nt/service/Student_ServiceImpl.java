
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.Student_DAO;
import com.nt.dto.StudentDTO;

public class Student_ServiceImpl implements Student_Service {

	private Student_DAO dao;
	
	public Student_ServiceImpl(Student_DAO dao) {
		// TODO Auto-generated constructor stub
		this.dao=dao;
		
	}
	
	@Override
	public List<StudentDTO> getAllRecords() {
		// TODO Auto-generated method stub
		List<StudentDTO> list_dto=new ArrayList<>();
		List<StudentBO> list_bo=null;
		list_bo=dao.fetchAllRecords();
		list_bo.forEach(bo ->{
			StudentDTO dto=new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			list_dto.add(dto);
		});
		return list_dto;
	}

	@Override
	public StudentDTO get_Records_By_ID(int id) {
		// TODO Auto-generated method stub
		StudentBO bo;
		StudentDTO dto=null;
		dto=new StudentDTO();
		bo=dao.getInfo_By_ID(id);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}//close
	
	
	@Override
	public String updateInfo(StudentDTO dto) {
		// TODO Auto-generated method stub
		
		int count=0;
		StudentBO bo=null;
		bo=new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		System.out.println(bo.toString());
		count=dao.updateInfo(bo);
		if(count==0)
		return "Records Not Update  whoose ID "+dto.getId();
		return "Records  Updated  whoose ID "+dto.getId();

	}//close updateInfo(-)
	
	@Override
	public String deleteInfo(int id) {
		// TODO Auto-generated method stub
		int count=0;
		count=dao.deleteInfo(id);
		if(count==0)	
			return "Records Not Delete  whoose ID "+id;
		return "Records  Deleted Successfully  whoose ID "+id;
	}//close
	
	
	@Override
	public String insertInfo(StudentDTO dto) {
		// TODO Auto-generated method stub
		StudentBO bo;
		int count=0;
		bo=new StudentBO();
		
		BeanUtils.copyProperties(dto, bo);
		
		count=dao.insertInfo(bo);
		if(count==0)	
			return "Records Not Insert  whoose ID ";
		return "Records  Inserted Successfully  whoose ID ";
	}//close

}
