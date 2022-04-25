/**
 *  UserRepository to save data to database
 */
package com.ruchika.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruchika.flightreservation.pojo.User;

/**
 * @author Ruchika Sharma
 *
 */
public interface UserRepository extends JpaRepository<User,Long>{

	User findByEmail(String email);
	

}
