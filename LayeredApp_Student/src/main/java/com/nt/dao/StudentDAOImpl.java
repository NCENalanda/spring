package com.nt.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Student;
import com.nt.utility.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {

	
	public int insert(Student st) throws Exception {
	    Session ses=null;
	    Transaction tx=null;
	    boolean flag=false;
	    int idVal=0;
	    //get Session
		ses=HibernateUtil.getSession();
		try{
		 tx=ses.beginTransaction();
		 
		 idVal=(Integer)ses.save(st);
		 
		 flag=true;
		}
		catch(HibernateException he){
			flag=false;
			throw he;
		}
		catch(Exception e){
			flag=false;
			throw e;
		}
		finally{
			if(flag)
				tx.commit();
			else
				tx.rollback();
			
		 HibernateUtil.closeSession(ses);
		}
		
		return idVal;
	}//method
}//class
