package com.ruchika.flightreservation.dao;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ruchika.flightreservation.pojo.Flight;
import com.ruchika.flightreservation.pojo.User;
import com.ruchika.flightreservation.util.ConvertToDate;

@Component
public class FlightDAO extends DAO{

	
	@Autowired
	ConvertToDate cvDate;
	
	public FlightDAO() {
		System.out.println("*** Flight  DAO ****");
		//default constructor
	}
	
	@SuppressWarnings({ "deprecation", "unchecked", "rawtypes", "unused" })
	public List<Flight> findFlights(String departureCity, String arrivalCity, String dateOfDeparture){
		
		
		begin();
		Query query= getSession().createQuery("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture");
		query.setParameter("departureCity",departureCity);
		query.setParameter("arrivalCity",arrivalCity);
		try {
			query.setParameter("dateOfDeparture",cvDate.convertToDate(dateOfDeparture));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Flight> flights=query.getResultList();
		close();
		return flights;
		
			
	}
	
		public Flight findFlightById(Long id){
		
		begin();
		Flight flight=(Flight) getSession().get(Flight.class,id);
		close();
		return flight;
		
		}

		
		public Flight createFlight(String flightNumber,String operatingAirlines,String departureCity,String arrivalCity,String departureDate) {
			
			String datetimeLocal = departureDate+":00";
			//System.out.println(Timestamp.valueOf(datetimeLocal.replace("T"," ")));
			Timestamp ts= Timestamp.valueOf(datetimeLocal.replace("T"," "));
			System.out.println(ts);
			ts.getTime();
			String[] dateTime = datetimeLocal.split("T");
			System.out.println(dateTime[0]);
			System.out.println(dateTime[1]);	
			begin();
			Flight flight = new Flight();
			flight.setFlightNumber(flightNumber);
			flight.setOperatingAirlines(operatingAirlines);
			flight.setDepartureCity(departureCity);
			flight.setArrivalCity(arrivalCity);
			try {
				flight.setDateOfDeparture(cvDate.convertToDate(dateTime[0]));
				flight.setEstimatedDepartureTime(ts);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			getSession().save(flight);
			commit();
			close();
			return flight;
			
	    }
		
		@SuppressWarnings("deprecation")
		public void deleteFlight(Long id) {
			begin();
			Query query= getSession().createQuery("delete from Flight where id=:id");
			query.setParameter("id",id);
			query.executeUpdate();
			commit();
			close();

		}
		
		public List<Flight> displayAllFlights() {
			begin();
			Query query= getSession().createQuery("from Flight");
			List<Flight> flights=query.getResultList();
			close();
			return flights;
			
		}

}
