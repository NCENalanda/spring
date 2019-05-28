package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCommand;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(RegisterCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		RegisterCommand command=null;
		//type casting
		command=(RegisterCommand)cmd;
		//form validation logic
		if(command.getSname()==null|| command.getSname().equals("") ||command.getSname().length()==0){
	       errors.rejectValue("sname","sname.required");	
		

     	}
	}
}
