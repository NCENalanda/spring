package com.nt.test;

import java.util.Scanner;

import org.hibernate.HibernateException;

import com.nt.controller.StudentController;
import com.nt.utility.HibernateUtil;
import com.nt.vo.StudentVO;

public class ClientApp {

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null;
		String course=null;
		String m1=null,m2=null,m3=null;
		StudentVO vo=null;
		StudentController controller=null;
		String result=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter name::");
		name=sc.next();
		System.out.println("Enter Course::");
		course=sc.next();
		System.out.println("Enter Marks1::");
		m1=sc.next();
		System.out.println("Enter Marks2::");
		m2=sc.next();
		System.out.println("Enter Marks3::");
		m3=sc.next();
		
		//prepare VO class object
		vo=new StudentVO();
		vo.setSname(name); vo.setCourse(course);
		vo.setM1(m1);vo.setM2(m2);vo.setM3(m3);
		
		//create Controller class object
		controller=new StudentController();
		try{
		  result=controller.evaluateStudent(vo);
		  System.out.println("Result:::"+result);
		}
		catch(HibernateException he){
			System.out.println("Internal Problem ::"+he.getMessage());
		}
		catch(Exception e){
			System.out.println("Internal Problem ::"+e.getMessage());
		}
		
		//close SessionFactory
		HibernateUtil.closeSessionFactory();
		
	}//main
}//class
