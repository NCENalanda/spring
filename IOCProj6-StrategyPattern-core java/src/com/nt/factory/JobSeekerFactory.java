package com.nt.factory;

import com.nt.comps.Course;
import com.nt.comps.DotNetCourse;
import com.nt.comps.JavaCourse;
import com.nt.comps.JobSeeker;
import com.nt.comps.TestingToolsCourse;

public class JobSeekerFactory {
	
	public static JobSeeker  getInstance(String courseType){
		   JobSeeker seeker=null;
		   Course course=null;
		   //create Target class obj
		   seeker=new JobSeeker();
		   if(courseType.equalsIgnoreCase("java")){
			   course=new JavaCourse();
		   }
		   else if(courseType.equalsIgnoreCase(".net")){
			   course=new DotNetCourse();
		   }
		   else if(courseType.equalsIgnoreCase("testing")){
			   course=new TestingToolsCourse();
		   }
		   else{
			   throw new IllegalArgumentException("Invalid Course Type");
		   }
		   //assign Course obj ot JobSeeker Object
		   seeker.setCourse(course);
		   return seeker;
	}//method
}//class
