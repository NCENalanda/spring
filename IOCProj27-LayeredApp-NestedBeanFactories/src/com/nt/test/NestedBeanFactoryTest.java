package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		BeanFactory parentFactory=null,childFactory=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create IOC Container(parent )
		parentFactory=new XmlBeanFactory(new ClassPathResource("/com/nt/cfgs/business-beans.xml"));
		//create IOC Container(child )
		childFactory=new XmlBeanFactory(new ClassPathResource("/com/nt/cfgs/presentation1-beans.xml"),parentFactory);
		//get controller bean object
		controller=childFactory.getBean("controller",MainController.class);
		try{
		//invoke b.methods..
		listVO=controller.getEmpsByDesgs(new String[]{"CLERK","MANAGER","SALESMAN"});
		//display listVO
		for(EmployeeVO vo:listVO){
			System.out.println(vo.getSno()+" "+vo.getEno()+" "+vo.getEname()+" "+vo.getDesg()+" "+vo.getSalary());
		}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Intenal Problem---->"+e.getMessage());
		}

	}//main
}//class
