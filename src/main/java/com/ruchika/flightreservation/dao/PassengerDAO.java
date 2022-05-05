package com.ruchika.flightreservation.dao;

import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.Passenger;

@Component
public class PassengerDAO extends DAO{

	public PassengerDAO() {
		System.out.println("****Passenger DAO ****");
	}
	
	public Passenger createPassenger(String passengerFirstName,String passengerLastName,String passengerPhone,String passengerEmail) {
		
		begin();
		Passenger passenger= new Passenger();
		passenger.setFirstName(passengerFirstName);
		passenger.setLastName(passengerLastName);
		passenger.setEmail(passengerEmail);
		passenger.setPhone(passengerPhone);
		getSession().save(passenger);
		commit();
		close();
		return passenger;
	}
}
