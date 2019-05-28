package com.nt.service;

import com.nt.dao.StudentDAO;
import com.nt.dao.StudentDAOFactory;
import com.nt.domain.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO  dao;

	@Override
	public Object getStudent(int id)throws Exception {
		// TODO Auto-generated method stub
		Object obj =null;
		dao=StudentDAOFactory.getInstance();
		obj=dao.getStudentInfo(id);
		return obj;
	}

	@Override
	public Object updateStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		Object obj=this.getStudent(st.getId());
		//know the Object type of reference
		if(obj instanceof Student) {
			dao=StudentDAOFactory.getInstance();
			obj=dao.updateStudentInfo(st);
		}//if
		return obj;
	}//method

	@Override
	public String saveStudent(Student st)throws Exception {
		// TODO Auto-generated method stub
		dao=StudentDAOFactory.getInstance();
		String str=dao.saveStudentInfo(st);
		return str;
	}

	@Override
	public String deleteStudent(int id) throws Exception {
		// TODO Auto-generated method stub
		Object obj=null;
		obj= this.getStudent(id);
		//know the Object type of reference
		if(obj instanceof Student) {
			dao=StudentDAOFactory.getInstance();
			obj=dao.deleteStudentInfo((Student) obj);	
		}//if
		return obj.toString();
	}

}
