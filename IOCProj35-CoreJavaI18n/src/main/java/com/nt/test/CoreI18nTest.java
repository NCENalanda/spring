package com.nt.test;

import java.awt.FlowLayout;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CoreI18nTest {

	public static void main(String[] args) {
		Locale locale=null;
		ResourceBundle bundle=null;
		JFrame frame=null;
		JButton btn1=null,btn2=null,btn3=null,btn4=null;
		//prepare Locale object
		locale=new Locale(args[0],args[1]);
		//Create ResourceBundle  class object
        bundle=ResourceBundle.getBundle("com.nt.commons.App",locale);
        //create JFrame with Buttions
        frame=new JFrame();
        frame.setLayout(new FlowLayout());
        btn1=new JButton(bundle.getString("label1"));
        btn2=new JButton(bundle.getString("label2"));
        btn3=new JButton(bundle.getString("label3"));
        btn4=new JButton(bundle.getString("label4"));
        frame.add(btn1); frame.add(btn2); frame.add(btn3);frame.add(btn4);
        frame.setVisible(true);
        frame.pack();
      
   }
}
