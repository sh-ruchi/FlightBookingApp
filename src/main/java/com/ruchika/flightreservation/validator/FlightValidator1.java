package com.ruchika.flightreservation.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Set;

import javax.validation.Constraint;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;

import com.ruchika.flightreservation.dao.FlightDAO;
import com.ruchika.flightreservation.pojo.Flight;

@Component
public class FlightValidator1{
	
	
	public void validateFindFlights(Flight flight) {
	//Flight flight;
		
	}}	
		
		//Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//
//	flight = new Flight();
//
//	Set<ConstraintViolation<Flight>> errors = validator.validateProperty(flight,"departureCity");
//	if("cannot be null".equals(errors.iterator().next().getMessage()));
//	    return "cannot be null";
//	
//	}


//@Component
//public class FlightValidator implements Validator {
//
//	 @Override
//	    public boolean supports(Class<?> obj) {
//	        
//	        //object must be of type UserCommandClass or subclass of 
//	        //UserCommandClass
//	        //here we check if our class is matching our commandclass
//	        // and returns true or false 
//	       return Flight.class.isAssignableFrom(obj); //To change body of generated methods, choose Tools | Templates.
//	    }
//
//	    @Override
//	    public void validate(Object o, Errors errors) {    
//	        //To change body of generated methods, choose Tools | Templates.
//	        
//	     Flight flight= (Flight) o;
//	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "departureCity", "Empty-departureCity","departureCity cannot be empty");
//	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "arrivalCity", "Empty-arrivalCity","arrivalCity cannot be empty");
//	     ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateOfDeparture", "Empty-dateOfDeparture","dateOfDeparture cannot be empty");
//	     if(!(flight.getDepartureCity().length()<3))
//	         errors.rejectValue("departureCity","departureCity-format-error","Enter atleast 3 characters");
//	     
//	     if(flight.getArrivalCity().length()<3) {
//	    	 errors.rejectValue("departureCity","departureCity-format-error","Enter atleast 3 characters");
//	     }
//	    	 
//	   // Validation.buildDefaultValidatorFactory().getValidator().validateProperty(object, propertyName, groups)
//	    }  
//}
