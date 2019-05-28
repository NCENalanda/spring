package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

import oracle.net.aso.c;

public class StudentCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		
		return clazz.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object cmd, Errors errors) {
		// TODO Auto-generated method stub
		
		StudentCommand command=null;
		command=(StudentCommand) cmd;
		if(command.getName()==null||command.getName().trim().length()==0||command.getName().trim()=="")
			errors.rejectValue("name", "stCmd.name.requried");
		else if(command.getName().length()<=3)
			errors.rejectValue("name","stCmd.name.range.min");
		else if(command.getName().length()>=10)
			errors.rejectValue("name","stCmd.name.range.max");
		
		if(command.getRank()==null)
			errors.rejectValue("rank", "stCmd.rank.requried");
		else if(command.getRank()<0)
			errors.rejectValue("rank", "stCmd.rank.range.min");
		else if(command.getRank()>200)
			errors.rejectValue("rank", "stCmd.rank.range.max");

	}

}
