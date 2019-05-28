package com.nt.aspect;

import java.io.FileWriter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LoanAuditingAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		FileWriter writer=null;
		System.out.println("taget method name::"+method.getName());
		System.out.println("target method args"+Arrays.toString(args));
		System.out.println("taget class name::"+target.getClass());
		if(args[2]==null || args[2].equals("") || ((String)args[2]).length()==0)
			throw new IllegalArgumentException(" Manager name must be placed");
		//modify arg value
		args[2]="Mr./Miss./Mrs."+args[2];
		writer=new FileWriter("E:\\auditLog.txt",true);
		writer.write("\n"+args[0]+" loan id Loan came for Approval to"+args[2]+" of loan type"+args[1]+" at"+new Date());
        writer.flush();
		writer.close();
	}

}
