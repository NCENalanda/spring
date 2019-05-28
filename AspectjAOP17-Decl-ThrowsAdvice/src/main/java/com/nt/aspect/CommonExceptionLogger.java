package com.nt.aspect;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.aspectj.lang.JoinPoint;

import com.nt.errors.InvalidInputsException;

public class CommonExceptionLogger {
   Logger logger=Logger.getLogger(CommonExceptionLogger.class);
   
   public CommonExceptionLogger() {
	 PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
}
   
	public void exceptionLogger(JoinPoint jp,IllegalArgumentException iae){
		logger.error(iae.toString()+" exception is raised in"+jp.getSignature()+" with args"+Arrays.toString(jp.getArgs()));
		throw new InvalidInputsException(iae.getMessage());
	}
	
}
