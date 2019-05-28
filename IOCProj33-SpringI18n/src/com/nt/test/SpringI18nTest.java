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
		ApplicationContext ctx = null;
		Locale locale = null,locale1=null;
		String msg1 = null, msg2 = null, msg3 = null, msg4 = null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		// create IOC container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		locale = new Locale(args[0], args[1]);
		locale1=new Locale(args[2],args[3]);
		// get Labels
		msg1 = ctx.getMessage("btn.cap1", new Object[] {"me"}, "cap1", locale);
		msg2 = ctx.getMessage("btn.cap2", new Object[] {}, "cap2", locale);
		msg3 = ctx.getMessage("btn.cap3", new Object[] {}, "cap3", locale1);
		msg4 = ctx.getMessage("btn.cap4", new Object[] {}, "cap4", locale1);
		//create JFrame window
		frame=new JFrame();
		frame.setTitle("Spring I18n App");
		frame.setLayout(new FlowLayout());
	
		//add comps
		btn1=new JButton(msg1);
		btn2=new JButton(msg2);
		btn3=new JButton(msg3);
		btn4=new JButton(msg4);
		frame.add(btn1);frame.add(btn2);
		frame.add(btn3);frame.add(btn4);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
