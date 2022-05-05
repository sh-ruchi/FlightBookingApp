/**
 * 
 */
package com.ruchika.flightreservation.pojo;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * @author Ruchika Sharma
 *
 */

@Entity
@Table(name = "user" )
public class User extends GenericEntity {
	
	
	@Column(name = "FIRST_NAME")
	@NotBlank
	@Size(min = 3, max = 60)
	private String firstName;
	
	@Column(name = "LAST_NAME")
	@NotBlank
	@Size(min = 3, max = 60)
	private String lastName;
	
	@Column(name = "EMAIL")
	@NotBlank
	@NotNull
	@Email
	private String email;
	
	@Column(name = "PASSWORD")
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	
		
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public String toString() {
		return " [firstName=" + firstName + ", lastName=" + lastName + ", email="+ email +",password="+password+"]";	
	
	}
}
