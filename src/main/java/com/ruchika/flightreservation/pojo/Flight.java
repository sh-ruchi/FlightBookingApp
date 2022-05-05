/**
 * 
 */
package com.ruchika.flightreservation.pojo;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author Ruchika Sharma
 *
 */

@Entity
@Table(name ="Flight")
public class Flight extends GenericEntity{
	

  @Column(name="FLIGHT_NUMBER")
  private String flightNumber;
  
  @Column(name="OPERATING_AIRLINES")
  private String operatingAirlines;
  
  @Column(name="DEPARTURE_CITY")
  private String departureCity;
 
  @Column(name="ARRIVAL_CITY")
  private String arrivalCity;
  
  @Column(name="DATE_OF_DEPARTURE")
  @DateTimeFormat(pattern = "MM/dd/yyyy")
  @Temporal(TemporalType.DATE)
  private Date dateOfDeparture;
  
  @Column(name="ESTIMATED_DEPARTURE_TIME")
  private Timestamp estimatedDepartureTime;

public Flight() {
	// TODO Auto-generated constructor stub
}
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
