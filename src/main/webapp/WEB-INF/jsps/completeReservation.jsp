<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Complete Reservation</title>
</head>
<body>
<a href="/flightreservation">[Go To Home Page]</a>
<a href="/flightreservation/showLogin"><button class="btn">Logout</button> </a>
<h2>Complete Reservation</h2>
Airline: ${flight.operatingAirlines}<br/>
Departure City: ${flight.departureCity}<br/>
Arrival City: ${flight.arrivalCity}<br/>
Departure Date: ${flight.dateOfDeparture}<br/>


<form action="completeReservation" method="post">
<pre>
<h2>Passenger Info:</h2>
First Name: <input type="text" name="passengerFirstName" required/><br/>
Last Name: <input type="text" name="passengerLastName" required/><br/>
Email: <input type="email" name="passengerEmail" required/><br/>
Phone: <input type="tel" name="passengerPhone" placeholder="1234567890" required size="10" required/><br/>

<h2>Card Details:</h2>
Name on the card: <input type="text" name="nameOnTheCard" required/><br/>
Card No: <input type="text" name="cardNumber" size="16" required/><br/>
Expiry Date: <input type="text" name="expirationDate" required/><br/>
CVV Number: <input type="text" name="securityCode"  size="3" required/><br/>

<input type="hidden" name="flightId" value="${flight.id}"/>
</pre>
<input type="submit" value="Confirm"/> 
<input type="reset" value="Reset"/>
</form>
<a href="/flightreservation/showLogin"><button class="btn">Cancel</button> </a>

</body>
</html>