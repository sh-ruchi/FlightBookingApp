package com.ruchika.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchika.flightreservation.pojo.Reservation;

/**
 * @author Ruchika Sharma
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}


