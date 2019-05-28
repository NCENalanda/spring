package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentCommandValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(StudentCommand.class);
	}

	public void validate(Object cmd, Errors errors) {
		StudentCommand command=null;
		//type casting
		command=(StudentCommand)cmd;
		//write server side form validation logic..
		if(command.getSname()==null ||command.getSname().trim().length()==0 || command.getSname().trim()=="")
			errors.rejectValue("sname", "stCmd.sname.required");
		
		 if(command.getSadd()==null || command.getSadd().trim().length()==0 || command.getSadd().trim()=="")
			errors.rejectValue("sadd", "stCmd.sadd.required");
		   else  if(command.getSadd().length()<7 ||command.getSadd().length()>15)
			   errors.rejectValue("sadd","stCmd.sadd.range" );
		 
		   if(command.getCourse()==null || command.getCourse().trim().length()==0 || command.getCourse().trim()=="")
			   errors.rejectValue("course","stCmd.course.required");
		 
		   if(command.getAge()==null)
			   errors.rejectValue("age", "stCmd.age.required");
		   else if (command.getAge()<=0 || command.getAge()>=150)
			   errors.rejectValue("age", "stCmd.age.range");
			   
	
	}
}
