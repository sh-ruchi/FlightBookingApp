package com.ruchika.flightreservation.services;

import com.ruchika.flightreservation.pojo.Reservation;

public interface ReservationService {

	public Reservation bookFlight(ReservationRequest request);
}
