package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory parentFactory=null,childFactory=null;
		XmlBeanDefinitionReader reader1=null,reader2=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create IOC Container(parent )
		parentFactory=new DefaultListableBeanFactory();
		//create IOC Container(child )
		childFactory=new DefaultListableBeanFactory(parentFactory);
		//reader objs
		reader1=new XmlBeanDefinitionReader(parentFactory);
		reader1.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
	  reader2=new XmlBeanDefinitionReader(childFactory);
	  reader2.loadBeanDefinitions("com/nt/cfgs/presentation1-beans.xml");
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
