package com.nt.test;

import java.lang.reflect.Constructor;

public class ClientApp {

	public static void main(String[] args) throws Exception{
		Test test=null;
		Class c=null;
		/*test=new Test();  //gives error
		test.display();*/
		
		/*//load the class
		c=Class.forName("com.nt.test.Test");
		test =(Test)c.newInstance();  //gives error
		test.display();
*/		
		//load the class
		c=Class.forName("com.nt.test.Test");
		//get constructors
		Constructor cons[]=c.getDeclaredConstructors();
		cons[0].setAccessible(true);
		test=(Test)cons[0].newInstance();
		test.display();
		
		
	}

}
