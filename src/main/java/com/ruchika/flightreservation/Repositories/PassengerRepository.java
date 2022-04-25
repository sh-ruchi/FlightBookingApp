package com.ruchika.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchika.flightreservation.pojo.Passenger;

/**
 * @author Ruchika Sharma
 *
 */
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}


