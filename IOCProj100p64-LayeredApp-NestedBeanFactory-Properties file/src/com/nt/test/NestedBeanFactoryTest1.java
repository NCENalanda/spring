package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.nt.config.BusinessAppConfig;
import com.nt.config.PresentationAppConfig;
import com.nt.controller.EmployeeController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactoryTest1 {

	public static void main(String[] args) {
		ApplicationContext childCtx=null,parentCtx=null;
		EmployeeController controller=null;
		List<EmployeeDTO> listDTO=null;
		//create parent IOC container
		parentCtx=new AnnotationConfigApplicationContext(BusinessAppConfig.class);
		//create child IOC container
		childCtx=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		((GenericApplicationContext) childCtx).setParent(parentCtx);

		//get Controller class obj
		controller=childCtx.getBean("empController",EmployeeController.class);
		try{
		//invoke method
		listDTO=controller.processRequest("clerk");
		for(EmployeeDTO dto:listDTO){
			System.out.println(dto);
		}
		}
		catch(Exception e){
			System.out.println("Internal problem::--->"+e.getMessage());
		}
		
		
	}

}
