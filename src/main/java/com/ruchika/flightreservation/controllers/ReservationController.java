package com.ruchika.flightreservation.controllers;
/***
 * 
 * @author Ruchika Sharma
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.ruchika.flightreservation.dao.FlightDAO;
import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.pojo.Reservation;
import com.ruchika.flightreservation.services.ReservationRequest;
import com.ruchika.flightreservation.services.ReservationService;


@Controller
public class ReservationController {

	@Autowired
	FlightDAO flightDao;

	@Autowired
	ReservationService reservationService;
	
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation(@RequestParam("flightId") Long flightId,ModelMap modelMap) {
		
		Flight flight = flightDao.findFlightById(flightId);
		modelMap.addAttribute("flight",flight);
		
		return "completeReservation";
	}
	
	@RequestMapping(value="/completeReservation", method = RequestMethod.POST)
	public String completeReservation(ReservationRequest request,ModelMap modelMap) {
		Reservation reservation= reservationService.bookFlight(request);
		modelMap.addAttribute("msg","Flight Booked Successfully");
		modelMap.addAttribute("booking","Your Booking Id is: "+reservation.getId());
		modelMap.addAttribute("email","Please refer your registered Email Id for the itinerary "+request.getPassengerEmail());
		
		return "reservationConfirmation";
	}
}
