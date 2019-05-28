package com.nt.main;

import java.util.Scanner;

import org.hibernate.HibernateException;

import com.nt.controller.StudentController;
import com.nt.utility.HibernateUtil;
import com.nt.vo.StudentVO;

public class ClientApp {

	public static void main(String[] args) {
		Scanner sc=null;
		String name=null;
		String rank=null;
		String id=null;
		StudentVO vo=null;
		StudentController controller=null;
		String result=null;
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter name::");
		name=sc.next();
		System.out.println("Enter Rank::");
		rank=sc.next();
		System.out.println("Enter ID ::");
		id=sc.next();
		
		
		//prepare VO class object
		vo=new StudentVO();
		vo.setName(name);
		vo.setRank(rank);
		vo.setId(id);
		
		
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
