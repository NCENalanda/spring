package com.nt.listeners;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCPerformanceAnalyzerListener implements ApplicationListener {
  private long start=0;
  private long end=0;
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
       if(event.toString().indexOf("Refreshed")!=-1){
    	   System.out.println("IOC container started at::"+new Date());
    	    start=System.currentTimeMillis();
       }
       else if(event.toString().indexOf("Closed")!=-1){
    	   end=System.currentTimeMillis();
    	   System.out.println("IOC container stopped at::"+new Date());
    	   System.out.println("IOC Container is there in running mode for "+(end-start)+"  ms");
    	   
       }
	}

}//class
