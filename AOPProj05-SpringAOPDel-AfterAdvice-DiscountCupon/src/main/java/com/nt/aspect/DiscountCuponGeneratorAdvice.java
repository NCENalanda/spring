package com.nt.aspect;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponGeneratorAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {

		float billAmt=0.0f;
		String msg=null;
		FileWriter writer=null;
		
		System.out.println("target method name::"+method.getName()+" return value::"+retVal);
	
		System.out.println("target method args");
		for(Object arg:args){
			System.out.println(Arrays.toString((String[])arg));
		}
		System.out.println("Target class name::"+target.getClass());
		
		billAmt=(float)retVal;
		if(billAmt>=50000)
			  msg="Avail  30% discount on next purchase";
		else if(billAmt>=30000)
			msg="Avail  20% discount on next purchase";
		else if(billAmt>=10000)
			msg="Avail  10% discount on next purchase";
		else
			msg="Avail  5% discount on next purchase";
		try{
		//write to file..
		writer=new FileWriter("E:\\discount.txt");
		writer.write(msg);
		writer.flush();
		writer.close();
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}//method
}///class
