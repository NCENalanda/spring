package com.nt.service;

import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;
import com.nt.domain.Student;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {

	@Override
	public String generateResult(StudentDTO dto) throws Exception {
		int total=0;
		float avg=0.0f;
		String result=null;
		Student st=null; //domain class
		StudentDAO dao=null;
		int idVal=0;
		//read inputs and develop b.logic
		total=dto.getM1()+dto.getM2()+dto.getM3();
		avg=total/3.0f;
		if(avg>=75)
			result="first class with distiction";
		else if(avg>=60)
			result="first class";
		else if(avg>=50)
			result="second class";
		else if(avg>=35)
			result="third class";
		else
			result="Hard Luck..Try Again";
		//prepare Domain class
		st=new Student();
		st.setSname(dto.getSname());
		st.setCourse(dto.getCourse());
		st.setTotal(total);
		st.setAvg(avg);
		st.setResult(result);
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
