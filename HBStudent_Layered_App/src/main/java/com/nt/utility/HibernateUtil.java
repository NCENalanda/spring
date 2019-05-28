package com.nt.utility;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static Logger logger=Logger.getLogger(HibernateUtil.class);
private static SessionFactory factory;
private static Configuration cfg;


static {
	Configuration cfg=new Configuration();
	try {
		System.out.println("HibernateUtil.enclosing_method()");
	cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
	if(cfg!=null) {
		logger.info("Configuration SucessFul");
		factory=cfg.buildSessionFactory();
		if(factory!=null)
			logger.info("SessionFactory  Sucessful");
				
	              }//if
	}//try
	catch (HibernateException e) {
		logger.error("HibernateUtil not Work  R::>"+e.getMessage());
		e.printStackTrace();
	}//catch
	catch (Exception e) {
		logger.fatal("HibernateUtil not Work  R::>"+e.getMessage());
	}//catch
	
	
       }//static


public static Session getSession() {
	Session ses=null;
	logger.debug("getSession()   ");
	Calendar cal=Calendar.getInstance();
	if(factory!=null)
		ses=factory.openSession();
	if(ses!=null)
		logger.info(" New Session    "+String.valueOf(cal.getTime()));
	return ses;
	
}//close getSession()

public static void closeSession(Session ses) {
	logger.debug("closeSession()");
	if(ses!=null)
		ses.close();
	logger.info("close the Session");
	
}//closeSession()

public static void closeSessionFactory() {
	logger.debug("closeSessionFactory()");
	factory.close();
	logger.info("SessionFactory closed");
}

}//class
