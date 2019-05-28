package com.nt.main;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.dao.Student_Insert_DAO;
import com.nt.dao.Student_Insert_DAOImpl;
import com.nt.domain.Student;
import com.nt.utility.HibernateUtil;

public class ClientTest {

	public static void main(String[] args) {
		boolean flag=false;
		SessionFactory factory=null;
		Session ses=null;
		Transaction tx=null;
		Student st=null;
		st=new Student();
		Student_Insert_DAOImpl dao =new Student_Insert_DAOImpl();
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter ID");
		st.setId(1011);
		System.out.println("Enter rank");
		st.setRank(201);
		System.out.println("Enter Name");
		st.setName("Sud");
		try {
		//configration
		Configuration cfg=new Configuration();
		cfg.configure("/com/nt/cfgs/hibernate.cfg.xml");
		 factory =cfg.buildSessionFactory();
		 ses=factory.openSession();
		
		        tx=ses.beginTransaction();
		int id=(int) ses.save(st);
		System.out.println(id);
		flag=true;
		}
		catch(HibernateException hbe) {
			System.out.println("ClientTest.main()  HB");
			flag=false;
		}
		catch(Exception e) {
			System.out.println("ClientTest.main()    Ex");
			flag=false;
		}
		finally {
			if(flag)
				tx.commit();
			else
				tx.rollback();
			

			ses.close();
			factory.close();
			
			
		}
		
		
		
	}
	

}
