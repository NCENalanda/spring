package com.nt.stud;

/**
 * Hello world!
 *
 */
public class StudentRankService 
{
	public  String  getRank(int studId){
		if(studId==101)
			return "IIT-->1000";
		else
			return "unknown StudentId";
	}
  
}
