package com.ruchika.flightreservation.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.ruchika.flightreservation.pojo.Passenger;

public class PassengerValidator implements Validator {

	@Override
	public boolean supports(Class<?> obj) {
		// TODO Auto-generated method stub
		  return Passenger.class.isAssignableFrom(obj);
	}

	@Override
	public void validate(Object o, Errors errors) {
		// TODO Auto-generated method stub
		 Passenger passenger= (Passenger) o;
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerFirstName", "Empty-first","FirstName cannot be empty");
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerLasName", "Empty-last","LastName cannot be empty");
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerEmail", "Empty-email","Email cannot be empty");
	     if(!passenger.getEmail().contains("@")) {
	         errors.rejectValue("email","email-format-error","Your email is not valid");
	    } 
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerPhone","Empty-phone","Email cannot be empty");
	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passengerPhone","Empty-phone","Email cannot be empty");
		
	}

}
