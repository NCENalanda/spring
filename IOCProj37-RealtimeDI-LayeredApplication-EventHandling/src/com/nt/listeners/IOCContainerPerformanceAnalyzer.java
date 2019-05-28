package com.nt.listeners;

import java.util.Date;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCContainerPerformanceAnalyzer implements ApplicationListener {
    private long start,end;
	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
		if(ae.toString().indexOf("Refreshed")!=-1){
			start=System.currentTimeMillis();
			System.out.println("IOCContainer is started at::"+new Date());
		}
		else{
			end=System.currentTimeMillis();
			System.out.println("IOCContainer is stopped at::"+new Date());
			System.out.println("IOCContainer is in runnig mode for"+(end-start)+"ms");
		}
	}
}
