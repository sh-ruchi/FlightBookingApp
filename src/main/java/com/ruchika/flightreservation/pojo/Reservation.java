/**
 * 
 */
package com.ruchika.flightreservation.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author Ruchika Sharma
 *
 */

@Entity
public class Reservation extends GenericEntity {

	@Column(name="CHECKED_IN")
	private Boolean checkedIn;
	
	@Column(name="NUMBER_OF_BAGS")
	private int numberOfBags;
	
	
	@OneToOne
	private Passenger passenger;
	
	@OneToOne
	private Flight flight;
	
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
