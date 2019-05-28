package com.nt.aspect;



import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("logAdvice")
@Aspect
@Order(20)
public class LogAroundAdvice {
   private static Logger logger;
   public LogAroundAdvice() {
	  logger=Logger.getLogger(LogAroundAdvice.class);
	  PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
  }
	
   @Around("execution(*  com.nt.service.*.*(..))")
	public Object logging(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		Object args[]=null;
		logger.debug("Entering into "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		args=pjp.getArgs();
		if(((Float)args[0])<=50000)
			args[1]=((Float)args[1])-0.5f;
		
		retVal=pjp.proceed(args);
		logger.debug("Exiting from "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		return retVal;
	}

}
