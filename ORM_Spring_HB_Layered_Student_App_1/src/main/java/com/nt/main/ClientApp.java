package com.nt.main;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nt.controller.StudentController;
import com.nt.domain.Student;
import com.nt.log.Log4jInitializer;
import com.nt.utility.HibernateUtil;

public class ClientApp {
	private static Logger logger=Logger.getLogger(ClientApp.class);
	

	
	static {
		
		try {
			Log4jInitializer.initializeLog4j();
			logger.info("Log4j     Initialized");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.error("Log4j  Initialized -----Reason->"+e.getMessage());
		}
	}

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Apptication  started");
		String str =null;
		Scanner sc=null;
		Object obj=null;
		sc=new Scanner(System.in);
		StudentController controller=new StudentController();
		Student st=new Student();
		
		//outer try
		try {
			
	     for(int i=97; i<100;) {
	    	 if(i==98) {
	    		 System.out.println("    Choose Proper Option as 1  2  3  4   9   ");
	    		 sc.nextLine();
	    	 }
	    	// inner try
	    	 try {
	    	 
	    	 
	    	 
	       System.out.println("insert---> 1 ");
	       System.out.println("show  ---> 2 ");
	       System.out.println("update---> 3 ");
	       System.out.println("delete---> 4 ");
	       System.out.println("Exit  ---> 9 ");
	        i=sc.nextInt();
	        if(i==9) {
	        	logger.info("---Application Shutdown---");
	        	System.out.println("---Application Shutdown---");
	        	break;
		         }//if
	        
	        
	        
	      switch(i) {
	      case 1: 
	      {
	    	  logger.info("--Insert Details--");
	    	  System.out.println("Id ");
	    	  st.setId(sc.nextInt());
	    	  System.out.println("Rank ");
	    	  st.setRank(sc.nextInt());
	    	  System.out.println("Name ");
	    	  st.setName(sc.next());
	    	  
	    	str= controller.saveStudent(st);
	    	 System.out.println("-----------------------"+str+"----------------------------");
	      }//close Statement
	      break;
	      
	      
	      case 2: 
	      {
	    	  logger.info("--Show Details--");
	    	  System.out.println("Id ");
	    	  st.setId(sc.nextInt());
	    	  
	    	  obj=controller.getStudent(st.getId());
	    	  System.out.println(obj.toString());
	      }//close Statement
	      break;
	      
		case 3: 
	      {
	    	  logger.info("--Update Details--");
	    	  System.out.println("Id ");
	    	  st.setId(sc.nextInt());
	    	  System.out.println("Rank ");
	    	  st.setRank(sc.nextInt());
	    	  System.out.println("Name ");
	    	  st.setName(sc.next());
	    	  
	    	  str=controller.updateStudent(st);
	    	  System.out.println("-----------------------"+str+"----------------------------");
	      }//close Statement
	      break;
	      
		case 4: 
	      {
	    	  logger.info("--Delete Details--");
	    	  System.out.println("Enter Id ");
	    	  st.setId(sc.nextInt());
	    	  
	    	 str= controller.deleteStudent(st.getId());
	    	 System.out.println("-----------------------"+str+"----------------------------");
	      }//close Statement
	      break;
	      default:
	      {
	    	  logger.info("--Invalid Otions--");
	    	  System.out.println(" Invalid  Inputs 1 to 4");
	      }//close Statement
	      break;
	      }//switch
	    }//inner try
	    	 catch (HibernateException e) {
	 			// TODO: handle exception
	 			logger.error("Hibernate in inner:  R--> "+e.getMessage());
	 			e.printStackTrace();
	 		}//catch
	 		catch (Exception e) {
	 			// TODO: handle exception
	 			logger.fatal("Exception in inner:  R--> "+e.getMessage());
	 			i=98;
	 			e.printStackTrace();
	 		}// inner catch
	    	 
	    	 
	    	 
	    	 
	    	 
	     }//for  
		}//outer try
		catch (HibernateException e) {
			// TODO: handle exception
			logger.error("Hibernate in outer:  R--> "+e.getMessage());
			e.printStackTrace();
		}//outer catch
		catch (Exception e) {
			// TODO: handle exception
			logger.fatal("Exception in outer:  R--> "+e.getMessage());
			e.printStackTrace();
		}//outer catch
	}//main

}//class
