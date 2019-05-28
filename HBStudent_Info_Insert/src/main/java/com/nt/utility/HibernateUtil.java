package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	
	static{
	 try{	
		 System.out.println("HibernateUtil.enclosing_method()  before---------------------");
	  Configuration cfg=new Configuration();
	  //BootStrap hibernate
	  cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
	  System.out.println("----------------------------------HibernateUtil Configuration----------------------------    ");
	  //create SessionFactory object
	  factory=cfg.buildSessionFactory();
	  System.out.println("HibernateUtil.enclosing_method() after-----------------"+factory);
	 }
	 catch(HibernateException he){
		 System.out.println("---------------------Exception 1-----------------------");
		 he.printStackTrace();
	 }
	}
	
	public static Session getSession(){
		Session ses=null;
		//create Session
		if(factory!=null)
			ses=factory.openSession();
		System.out.println("HibernateUtil.getSession()-------------------------"+ses);
		return ses;
	}
	
	public static void closeSession(Session ses){
		if(ses!=null)
			ses.close();
	}
	
	public static  void closeSessionFactory(){
		if(factory!=null)
			factory.close();
	}

}
