/**
 * 
 */
package com.ruchika.flightreservation.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Ruchika Sharma
 *
 */

@Entity
public class Flight extends GenericEntity{
	
 
  private String flightNumber;
  private String operatingAirlines;
  private String departureCity;
 
private String arrivalCity;
  
  @DateTimeFormat(pattern = "dd/MM/yyyy")
  @Temporal(TemporalType.DATE)
  private Date dateOfDeparture;
  private Timestamp estimatedDepartureTime;

public String getFlightNumber() {
	return flightNumber;
}
public void setFlightNumber(String flightNumber) {
	this.flightNumber = flightNumber;
}
public String getOperatingAirlines() {
	return operatingAirlines;
}
public void setOperatingAirlines(String operatingAirlines) {
	this.operatingAirlines = operatingAirlines;
}

public String getDepartureCity() {
	return departureCity;
}
public void setDepartureCity(String departureCity) {
	this.departureCity = departureCity;
}
public String getArrivalCity() {
	return arrivalCity;
}
public void setArrivalCity(String arrivalCity) {
	this.arrivalCity = arrivalCity;
}
public Date getDateOfDeparture() {
	return dateOfDeparture;
}
public void setDateOfDeparture(Date dateOfDeparture) {
	this.dateOfDeparture = dateOfDeparture;
}
public Timestamp getEstimatedDepartureTime() {
	return estimatedDepartureTime;
}
public void setEstimatedDepartureTime(Timestamp estimatedDepartureTime) {
	this.estimatedDepartureTime = estimatedDepartureTime;
}

}
