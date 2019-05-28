package com.nt.log;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class FactoryLog {
	private static Logger logger=Logger.getLogger(FactoryLog.class);
static {
		
		Layout layout=null;
		Appender appender=null;
		System.out.println("------------------------FactoryLog.enclosing_method()----------------------------");
		//Try and catch block
		try {
		//create the layout obj
		layout= new HTMLLayout();
		//crete the Appender object
		
		appender=new FileAppender(layout, "MVCLog.html",false);
		
		//add appender to Logger
		logger.addAppender(appender);
		//set Logger level to reterive log message 
		logger.setLevel(Level.ALL);
		logger.debug("MVCStudent_Info_Insert_Log4J_SimpleFormController_4/src/main/java/com/nt/log/FactoryLog.staticblock.Log4J initialized");
		
		}//try
		catch (IOException e) {
			// TODO Auto-generated catch block
			logger.error("MVCStudent_Info_Insert_Log4J_SimpleFormController_4/src/main/java/com/nt/log/FactoryLog.staticblock.Log4J initialized failed");
		}//catch
		
		catch (Exception e) {
			// TODO: handle exception
			logger.error("MVCStudent_Info_Insert_Log4J_SimpleFormController_4/src/main/java/com/nt/log/FactoryLog.staticblock.Log4J initialized failed");
		}//catch
	}//static
    
public static Logger getLogger(){
	System.out.println("-------------------------FactoryLog.getLogger()---------------------------------------");
	return logger;
}

}
