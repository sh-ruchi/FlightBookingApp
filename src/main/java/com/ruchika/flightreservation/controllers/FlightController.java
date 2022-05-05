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
public class FlightController {

	@Autowired 
	FlightDAO flightDao;
	
	@Autowired
	FlightValidator flightValidator;
	
	@RequestMapping("/searchAgain")
	public String searchAgain() {
		return "findFlights";
	}
	
	@RequestMapping(value="/findFlights",method = RequestMethod.POST)
	public String findFlights(Flight flight,@RequestParam("from") String from,@RequestParam("to") String to,
		@RequestParam("departureDate") String departureDate,ModelMap modelMap) {
			
				System.out.println("from:"+from);
				System.out.println("to:"+to);
				System.out.println("departureDate:"+departureDate);
				if(flightValidator.validateDepartureCity(to,from)){
					modelMap.addAttribute("msgdc","Field cannot be empty & to and from cannot be same");
					return "findFlights";
				}
				else if(flightValidator.validateDateOfDeparture(departureDate)) {
					modelMap.addAttribute("msgdod","Field cannot be empty");
					return "findFlights";
				}
				else if(flightValidator.validateArrivalCity(from,to)){
					modelMap.addAttribute("msgac","Field cannot be empty & to and from cannot be same");
					return "findFlights";
				}
				
					   
		   List<Flight> flights=flightDao.findFlights(from, to, departureDate);
		   modelMap.addAttribute("flights", flights);
		   // setting the attributes in the modelMap so that the next view can dispaly the result
		   return "displayFlights";
		
		
	
	}
	
//	@RequestMapping(value="/addFlight",method = RequestMethod.POST)
//	public String addFlights(@RequestParam("flightNumber") String flightNumber,
//			@RequestParam("operatingAirlines") String operatingAirlines,@RequestParam("departureCity") String departureCity,
//			@RequestParam("arrivalCity") String arrivalCity,@RequestParam("dateOfDeparture") @DateTimeFormat(pattern = "MM-dd-yyyy") String departureDate
//			, ModelMap modelMap) {
//		
//			
//		    Flight flight=flightDao.createFlight(flightNumber,operatingAirlines,departureCity,arrivalCity,departureDate);
//		   // setting the attributes in the modelMap so that the next view can display the result
//			modelMap.addAttribute("flight",flight);
//		
//			return "admin/addedFlight";
//		
//		
//	
//	}
//	
//	@RequestMapping(value="/showAddFlight")
//	public String showAddFlight() {
//		return "admin/addFlight";
//	}
}