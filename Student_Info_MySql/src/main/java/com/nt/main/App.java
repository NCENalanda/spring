package com.nt.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ListStudent_Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ListStudent_Service service=null;
        
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        service=ctx.getBean("stservice", ListStudent_Service.class);
        System.out.println(service.findName(1100));
        ((AbstractApplicationContext) ctx).close();
    }
}
