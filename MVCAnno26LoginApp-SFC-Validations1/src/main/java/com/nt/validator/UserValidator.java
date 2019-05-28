package com.nt.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.UserCommand;

@Component("userValidator")
public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		UserCommand cmd=null;
		//type casting
		cmd=(UserCommand)command;
		if(cmd.getUname()==null || cmd.getUname().equals("") || cmd.getUname().length()==0){
			errors.rejectValue("uname","uname.required" );
		}
		if(cmd.getPwd()==null || cmd.getPwd().equals("") || cmd.getPwd().length()==0){
			errors.rejectValue("pwd","pwd.required" );
		}
	}

}
