package com.nt.aspect;

import java.io.FileWriter;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class LoanAuditingAdvice {
	
	/*public void loanAuditing(JoinPoint jp, int lid,String ltype,String mgmr)throws Throwable{
		String auditMsg=null;
		FileWriter writer=null;
		System.out.println("target method details"+jp.getSignature());
		System.out.println("target method args"+Arrays.toString(jp.getArgs()));
		System.out.println("taget method args"+lid+" "+ltype+" "+mgmr);
		//prepare auditing Message
		auditMsg=mgmr+" has got "+lid+" loan for approval at"+new Date()+"loan type::"+ltype;
		//write audit message to Audit Log file
		writer =new FileWriter("e:\\auditLog1.txt",true);
		writer.write(auditMsg);
		writer.flush();
		writer.close();
	}//method
*/	
	/*public void loanAuditing( int lid,String ltype,String mgmr)throws Throwable{
		String auditMsg=null;
		FileWriter writer=null;
		//prepare auditing Message
				auditMsg=mgmr+" has got "+lid+" loan for approval at"+new Date()+"loan type::"+ltype;
				//write audit message to Audit Log file
				writer =new FileWriter("e:\\auditLog1.txt",true);
				writer.write(auditMsg+"\n");
				writer.flush();
				writer.close();
		
	}
	*/
	
	public void loanAuditing(JoinPoint jp)throws Throwable{
	String auditMsg=null;
	FileWriter writer=null;
	Object args[]=null;
	System.out.println("target method details"+jp.getSignature());
	System.out.println("target method args"+Arrays.toString(jp.getArgs()));
	args=jp.getArgs();
	//args[0]=((Integer)args[0])+1;
	jp.getArgs()[0]=((Integer)args[0])+1;
	//prepare auditing Message
	auditMsg=args[2]+" manager has got "+args[0]+" loan for approval at  "+new Date()+"   loan type::"+args[1];
	//write audit message to Audit Log file
	  writer =new FileWriter("e:\\auditLog1.txt",true);
	  writer.write(auditMsg);
	  writer.flush();
	  writer.close();
    }//method

}//classs
