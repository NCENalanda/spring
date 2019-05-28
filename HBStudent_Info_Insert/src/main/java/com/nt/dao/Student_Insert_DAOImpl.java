package com.nt.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.domain.Student;
import com.nt.utility.HibernateUtil;
import com.nt.utility.HibernateUtil_1;

public class Student_Insert_DAOImpl implements Student_Insert_DAO {

	@Override
	public int saveStudent(Student command) {
		// TODO Auto-generated method stub
		Session ses=null;
		Transaction tx=null;
		int id=0;
		System.out.println(command.toString());
		boolean flag=false;
		System.out.println("Student_Insert_DAOImpl.saveStudent()  before ");
		//get the Session(Connection)
				ses=HibernateUtil.getSession();
		try {
		System.out.println("Student_Insert_DAOImpl.saveStudent() after ");
		//start the Transaction Enviroment
		tx=ses.beginTransaction();
		 id=(Integer) ses.save(command);
		System.out.println(id);
		flag=true;
		
		}
		catch (HibernateException e) {
			flag=false;
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			flag=false;
			e.printStackTrace();
		}
		finally {
			if(flag)
			  tx.commit();
			else {
				tx.rollback();
			}
			HibernateUtil.closeSession(ses);
		}
		return id;
	}

}
