package com.nt.test;

import java.lang.reflect.Constructor;
import java.util.Date;

import com.nt.beans.WishGenerator;

public class ClientApp1 {

	public static void main(String[] args)throws Exception {
		Class c=WishGenerator.class;
		System.out.println("c obj class name::"+c.getClass());
		System.out.println("c obj data::"+c.toString());
	}

}
