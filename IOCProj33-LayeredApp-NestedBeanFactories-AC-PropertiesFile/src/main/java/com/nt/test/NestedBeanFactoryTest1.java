package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeSearchController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		EmployeeSearchController controller=null;
		List<EmployeeVO> listVO=null;
		//create ParentContainer
		pFactory=new DefaultListableBeanFactory();
		pReader=new XmlBeanDefinitionReader(pFactory);
		pReader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		//create ChildContainer
		cFactory=new DefaultListableBeanFactory(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		cReader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//get Bean (Controller)
		controller=cFactory.getBean("empController",EmployeeSearchController.class);
		try{
		//inovke method
		listVO=controller.getEmpsByDesg(new String[]{"CLERK","MANAGER"});
		listVO.forEach(vo->{
			System.out.println(vo.getSno()+" "+vo.getEno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getSalary()+" "+vo.getDeptno());
		});
		}
		
		catch(Exception e){
			System.out.println("Internal problem--->"+e.getMessage());
		}
	}//main
}//class
