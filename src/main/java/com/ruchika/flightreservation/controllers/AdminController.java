/**
 * 
 */
package com.ruchika.flightreservation.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ruchika.flightreservation.dao.FlightDAO;
import com.ruchika.flightreservation.exception.ErrorException;
import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.validator.FlightValidator;

/**
 * @author Ruchika Sharma
 *
 */

@Controller
public class AdminController {

	@Autowired 
	FlightDAO flightDao;
	
	@Autowired
	FlightValidator flightValidator;
		
	@RequestMapping(value="/addFlight",method = RequestMethod.POST)
	public String addFlights(@RequestParam("flightNumber") String flightNumber,
			@RequestParam("operatingAirlines") String operatingAirlines,@RequestParam("departureCity") String departureCity,
			@RequestParam("arrivalCity") String arrivalCity,@RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-dd-yyyy") String departureDate
			, ModelMap modelMap) {
		
			
		    Flight flight=flightDao.createFlight(flightNumber,operatingAirlines,departureCity,arrivalCity,departureDate);
		   // setting the attributes in the modelMap so that the next view can display the result
			modelMap.addAttribute("flight",flight);
		
			return "admin/addedFlight";
		
	}
	
	@RequestMapping(value="/showAddFlight")
	public String showAddFlight() {
		return "admin/addFlight";
	}
	
	@RequestMapping("/showFlights")
	public String showFlights(ModelMap modelMap) {
		
		List<Flight> flights=flightDao.displayAllFlights();
		modelMap.addAttribute("flights",flights);
		return "admin/showAllFlights";
	}
	

	@RequestMapping("/showDelete")
	public String delFlight(ModelMap modelMap,@RequestParam("flightId") String flightId) {
		
		flightDao.deleteFlight(Long.parseLong(flightId));
		System.out.println("deleted");
		modelMap.addAttribute("flightId",flightId);
		return "admin/deleteFlight";
	}
	
//	@RequestMapping(value="/deleteFlight",method = RequestMethod.POST)
//	public String deleteFlight(@RequestParam("flightId") String flightId,ModelMap modelMap){
//		System.out.println("deleted");
//		flightDao.deleteFlight(Long.parseLong(flightId));
//		System.out.println("deleted");
//		modelMap.addAttribute("flightId",flightId);
//		return "admin/deleteFlight";
//		
//	}

}