package com.ruchika.flightreservation.validator;

import java.util.Objects;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.Flight;

@Component
public class FlightValidator {

	public boolean validateDateOfDeparture(String dod) {

		if (dod.length() == 0) {
			return true;
		}

		return false;
	}

	public boolean validateDepartureCity(String to, String from) {
		if (validateToFrom(to,from)) {
			return true;
		}
		if (from.length() == 0) {
			return true;
		}
		else
		return false;
	}

	public boolean validateArrivalCity(String to, String from) {
		if (validateToFrom(to,from)) {
			return true;
		}
		if (to.length() == 0) {
			return true;
		}
		else
		return false;
		
	
	}

	public boolean validateToFrom(String dc, String ac) {

		if (dc.equals(ac)) {
			return true;
		}
		return false;
	}

}