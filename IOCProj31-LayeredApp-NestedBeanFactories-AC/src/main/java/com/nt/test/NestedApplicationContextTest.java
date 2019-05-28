package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.EmployeeSearchController;
import com.nt.vo.EmployeeVO;

public class NestedApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext pCtx=null,cCtx=null;
		EmployeeSearchController controller=null;
		List<EmployeeVO> listVO=null;
		//create ParentContainer
		pCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		//create ChildContainer
		cCtx=new ClassPathXmlApplicationContext(new String[]{"com/nt/cfgs/presentation-beans.xml"},pCtx);
		//get Bean (Controller)
		controller=cCtx.getBean("empController",EmployeeSearchController.class);
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
