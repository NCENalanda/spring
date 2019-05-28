package com.nt.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Student;
import com.nt.utility.HibernateUtil;

public class StudentDAOImpl implements StudentDAO {

	@Override
	public Object getStudentInfo(int id)throws Exception {
		// TODO Auto-generated method stub
		Object obj=null;
		Session ses=null;
		
		//get the session
		ses=HibernateUtil.getSession();
		//no need og transaction
		obj=ses.get(Student.class, id);
		if(obj==null) {
			obj= new String("Student not Found by Id "+id);	
		}//if
		HibernateUtil.closeSession(ses);
		return obj;
	}//method

	@Override
	public String updateStudentInfo(Student st)throws Exception {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		//get new session
		ses=HibernateUtil.getSession();
		try {
		//get tTransaction enviroment
		tx=ses.beginTransaction();
		ses.update(st);
		flag=true;
		}//try
		catch (HibernateException e) {
			// TODO: handle exception
			flag=false;
		}//catch
		catch (Exception e) {
			// TODO: handle exception
			flag=false;
		}//catch
		finally {
			if(!flag)
				tx.rollback();
			tx.commit();
			HibernateUtil.closeSession(ses);	
		}//finally
		return new String(String.valueOf(flag));
	}//method

	@Override
	public String saveStudentInfo(Student st) {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		boolean flag=false;
		int id=0;
		//get new session
		ses=HibernateUtil.getSession();
		try {
		//get tTransaction enviroment
		tx=ses.beginTransaction();
		 id=(int) ses.save(st);
		flag=true;
		}//try
		catch (HibernateException e) {
			// TODO: handle exception
			flag=false;
		}//catch
		catch (Exception e) {
			// TODO: handle exception
			flag=false;
		}//catch
		finally {
			if(!flag)
				tx.rollback();
			tx.commit();
			HibernateUtil.closeSession(ses);
		}//finally
		return new String(String.valueOf(flag));
	}//method

@Override
public String deleteStudentInfo(Student st) throws Exception {
	// TODO Auto-generated method stub
	Session ses=null;
	Transaction tx=null;
	boolean flag=false;
	int id=0;
	//get new session
	ses=HibernateUtil.getSession();
	try {
	//get tTransaction enviroment
	tx=ses.beginTransaction();
	//delete the Student Record
	 ses.delete(st);
	flag=true;
	}//try
	catch (HibernateException e) {
		// TODO: handle exception
		flag=false;
	}//catch
	catch (Exception e) {
		// TODO: handle exception
		flag=false;
	}//catch
	finally {
		if(!flag)
			tx.rollback();
		tx.commit();
		HibernateUtil.closeSession(ses);
	}//finally
	return new String(String.valueOf(flag));
	
}

}
