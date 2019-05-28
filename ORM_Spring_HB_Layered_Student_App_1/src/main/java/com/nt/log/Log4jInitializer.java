package com.nt.log;

import com.nt.commons.*;
import org.apache.log4j.PropertyConfigurator;

public class Log4jInitializer {
	
	public  static  void initializeLog4j()throws Exception{
		PropertyConfigurator.configure("src/main/java/com/nt/commons/log4j.properties");
	}
}
