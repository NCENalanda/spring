package com.nt.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import com.nt.config.RootAppConfig;
import com.nt.config.WebMVCAppConfig;

public class MyWebApplicationInitializer implements WebApplicationInitializer {
	static{
		System.out.println("MyWebApplicationInitializer:static block");
	}
	public MyWebApplicationInitializer() {
		System.out.println("MyWebApplicationInitializer:0-param constructor");
	}

	@Override
	public void onStartup(ServletContext sc) throws ServletException {
		System.out.println("onStarup(-)");
		AnnotationConfigWebApplicationContext  rootCtx=null,webCtx=null;
		ContextLoaderListener listener=null;
		DispatcherServlet  ds=null;
		ServletRegistration.Dynamic registration=null;
		//create IOC containers having Configuration classes
		rootCtx=new AnnotationConfigWebApplicationContext();
		rootCtx.register(RootAppConfig.class);
		webCtx=new AnnotationConfigWebApplicationContext();
		webCtx.register(WebMVCAppConfig.class);
		//create and register ContextLoaderListener
		listener=new ContextLoaderListener(rootCtx);
		sc.addListener(listener);
       //create and DispatcherServlet 
		ds=new DispatcherServlet(webCtx);
		registration=sc.addServlet("dispatcher",ds);
		registration.addMapping("*.htm");
		registration.setLoadOnStartup(1);
	}//onStartup
}//class
