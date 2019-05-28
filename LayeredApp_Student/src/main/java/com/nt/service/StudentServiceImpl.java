package com.nt.service;

import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;
import com.nt.domain.Student;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	
	public String generateResult(StudentDTO  dto)throws Exception{
		int total=0;
		float avg=0.0f;
		String result=null;
		Student st=null; //domain class
		StudentDAO dao=null;
		int idVal=0;
		//read inputs and develop b.logic
		
			result="Hard Luck..Try Again";
		//prepare Domain class
		st=new Student();
		st.setName(dto.getName());
		st.setRank(dto.getRank());
		st.setId(dto.getId());
		
		//get DAO
		dao=StudentDAOFactory.getInstance();
		//use DAO
		idVal=dao.insert(st);
		if(idVal==0)
			return "Student Registration Failed";
		else
			return "Student Registered with Id::"+idVal;
	}//generateResult(-)

	
}//class
