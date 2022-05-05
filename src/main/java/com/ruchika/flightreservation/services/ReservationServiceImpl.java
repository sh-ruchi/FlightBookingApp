package com.ruchika.flightreservation.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruchika.flightreservation.dao.FlightDAO;
import com.ruchika.flightreservation.dao.PassengerDAO;
import com.ruchika.flightreservation.dao.ReservationDAO;
import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.pojo.Passenger;
import com.ruchika.flightreservation.pojo.Reservation;
import com.ruchika.flightreservation.validator.PassengerValidator;


@Service
public class ReservationServiceImpl implements ReservationService {

	
	@Autowired
	FlightDAO flightDao;
	
	@Autowired
	PassengerDAO passengerDao;
	
	@Autowired
	ReservationDAO reservationDao;
	
	@Autowired
	GeneratePDFDocument generatePdf;
	
	@Autowired
	SendMail sendMail;
		
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		
		//Make Payment 
		// if the payment is successful, retrieve flight id
	
		Long flightId= request.getFlightId();
		
		// we need this flight for creating  reservation
		Flight flight=flightDao.findFlightById(flightId);
		
		// save passenger info- create a passenger in db for this flight 
		Passenger passenger= passengerDao.createPassenger(request.getPassengerFirstName(),request.getPassengerLastName(), request.getPassengerPhone(),request.getPassengerEmail());
		 
		
		//Create Reservation 
		Reservation reservation=reservationDao.createReservation(flight, passenger,false);
		System.out.println(System.getProperty("user.dir"));
		String filePath=System.getProperty("user.dir")+"/bookings/"+"NEU"+java.time.LocalDateTime.now().toString().replaceAll("[^a-zA-Z0-9]", "_")+reservation.getId()+".pdf";
		generatePdf.generateItinerary(filePath,reservation);
		sendMail.sendEmail(passenger.getEmail(), filePath, reservation);
		return reservation;
		
	}

}
