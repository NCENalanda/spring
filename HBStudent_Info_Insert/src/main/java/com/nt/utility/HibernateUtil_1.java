package com.nt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil_1 {

   
  private static SessionFactory factory=null;
  {
	  System.out.println("HibernateUtil.enclosing_method()");
	  Configuration cfg=null;
	  cfg=new Configuration();
	  cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
	  factory=cfg.buildSessionFactory();
	  
  }
  

  public static Session getSession(){
	  Session ses=null;
	  if(factory!=null)
		  ses=factory.openSession();
	  return ses;   
  }
  
  
  public static void closeSession(Session ses){
	  ses.close();
  }
 
}
