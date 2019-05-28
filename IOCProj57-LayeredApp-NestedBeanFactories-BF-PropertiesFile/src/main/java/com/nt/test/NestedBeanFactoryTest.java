package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeSearchController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader pReader=null,cReader=null;
		EmployeeSearchController controller=null;
		List<EmployeeVO> listVO=null;
		BeanFactoryPostProcessor bfpp=null;
		//create ParentContainer
		pFactory=new DefaultListableBeanFactory();
		cFactory=new DefaultListableBeanFactory(pFactory); 
		
		pReader=new XmlBeanDefinitionReader(pFactory);
		cReader=new XmlBeanDefinitionReader(cFactory);
		pReader.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		cReader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//get BeanFactoryPostProccesor(PropertyPlaceholderConfigurer)
		bfpp=pFactory.getBean("pphc",BeanFactoryPostProcessor.class);
		bfpp.postProcessBeanFactory(pFactory);
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
