# FlightBookingApp
Flight Booking Application Created using Spring Boot<br/>

I plan to try integrating a 3rd party payment option in the application if possible.<br/>

Scope of the Project would include, <br/>
- User Registration<br/>
- User Login <br/>
- Searching flights <br/>
- Book Flight <br/>
- Receiving notification on flight booking <br/>
- Addmin user can add new flights in Db, delete flights and view all flights in DB

if time permits , would like to achieve flight web check-In Use case as well. <br/>

# Steps to execute the application 
1. execute mvn clean install  to generate a war file
2. run java -jar <warFileName>.war to run the application
3. You need to have the below database tables in your MySQL and configure the same in  your project 
    a. user
    b. flight
    c. passenger
    d. reservation

# Accomplishments in Milestone -1 
1: Pojo classes have been created,
2. Started implementing Controller Classes. Currently UserController is WIP. 

# Accomplishments in Milestone -2 
i. Implemented the "user registration", "user login" , "findFlight" and "displayFlight"( or search results)  views/jsps  
ii. Created DAO  classes and used Hibernate DAO with HQL queries for dbaccess
iii. Implemented "UserController" to handle user registration, user login use cases and to display Search Flights page if correct credentials were entered as were stored in database.
iv. Implemented "FlightController" to search the flights between 2 cities based on departure date 
v.  Also implemented the method to display the "flight search results" in a tabular form .
vi. All database tables for reservation database have been created.

# Accomplishments in Milestone -3
	i. Handled Flight selection: Selecting a flight from the search results  
	ii. Displaying the selected flight details on a new View Page  'completeReservation' 
	iii. Created Reservation View Page 'completeReservation'
	iv. Created Resrvation Controller Class that displays the selected flight details based on ID and displays 
	    form for the passenger to add the personal details for booking the flight.
      
 # Accomplishments in Milestone 4:
i.  Handled the final Booking of the flight 
ii. Tested the use cases end to end 
iii. Added Email support to receive Itinerary on email.
iv. Add DAO Classes 
v. Added admin user fnunctionalities:
  i.  Adding new flights
  ii. displaying all the flights 
  iii. deleting database 

    
