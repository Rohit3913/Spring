package com.rohit.web.constraints;

import java.util.Arrays;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidProfessionIMP implements ConstraintValidator<validProfession, String> {
	String []professions={"Doctor","Software Enginieer","Politician","Teacher"};
	@Override
	public void initialize(validProfession constraintAnnotation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String Profession, ConstraintValidatorContext context) {

		if(Arrays.asList(professions).contains( Profession)){
			return true;
		}
		
		return false;
	}

}
