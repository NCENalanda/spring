package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringI18nTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		String s1=null,s2=null,s3=null,s4=null;
		Locale locale=null,locale1=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//create Locale object
		locale=new Locale(args[0],args[1]);
		locale1=new Locale(args[2],args[3]);
		
		//get Messages (Labels)
		s1=ctx.getMessage("label1",null, "msg1",locale);
		s2=ctx.getMessage("label2",new Object[]{"customer"}, "msg2",locale);
		s3=ctx.getMessage("label3",new Object[]{"customer"}, "msg3",locale);
		s4=ctx.getMessage("label4",new Object[]{"customer"}, "msg4",locale);
		//create JFrame 
		frame=new JFrame();
		frame.setLayout(new FlowLayout());
		btn1=new JButton(s1);
		btn2=new JButton(s2);
		btn3=new JButton(s3);
		btn4=new JButton(s4);
		frame.add(btn1); frame.add(btn2);frame.add(btn3);frame.add(btn4);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		//close container
		((AbstractApplicationContext) ctx).close();
	}
}
