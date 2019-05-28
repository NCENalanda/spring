package com.nt.test;

import com.nt.comps.JobSeeker;
import com.nt.factory.JobSeekerFactory;

public class StrategeyPatternTest {

	public static void main(String[] args) {
		JobSeeker jb=null;
		//Get JobSeeker Object
		jb=JobSeekerFactory.getInstance(".net");
		//invoke b.method
		System.out.println(jb.applyJob("CTS"));
	}//main
}//class
