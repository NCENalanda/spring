package com.nt.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.StudentDTO;
import com.nt.service.Student_Service;

public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDTO dto=null;
		String msg=null;
		Object obj=null;
		Student_Service service=null;
		List<StudentDTO> listdto=null;
		ApplicationContext context=null;
		try {
		context=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service=context.getBean("stservice",Student_Service.class);
		//listdto=service.getAllRecords();
		//System.out.println(listdto.toString());
		// obj=service.getRecordsByID(1225);
		//System.out.println(obj.toString());
		
		dto =new StudentDTO();
		//dto.setId(1225);
		//dto.setName("Govinda");
		//dto.setRank(129);
		System.out.println(dto.toString());
		//msg=service.updateInfo(dto);
		//System.out.println(msg);
		
		//obj=service.getRecordsByID(1225);
		//System.out.println(obj.toString());
		
		//msg=service.deleteInfo(1225);
		//System.out.println(msg);
		dto.setName("Him");
		dto.setRank(141);
		System.out.println(dto.toString());
		msg=service.insertInfo(dto);
		
		//obj=service.getRecordsByID(1225);
		System.out.println(msg);
		
		}//try
		catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			e.printStackTrace();
		}//catch
	
	}

}
