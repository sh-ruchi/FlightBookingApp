package com.ruchika.flightreservation.dao;

import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.pojo.Passenger;
import com.ruchika.flightreservation.pojo.Reservation;


@Component
public class ReservationDAO extends DAO {

	public ReservationDAO() {
		System.out.println("**** Reservation DAO ***** ");
	}
	
	public Reservation createReservation(Flight flight,Passenger passenger,Boolean checkIn) {
		
		begin();
		Reservation reservation= new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCheckedIn(false);
		getSession().save(reservation);
		close();
		return reservation;
	}
}
