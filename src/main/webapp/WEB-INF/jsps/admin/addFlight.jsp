<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Flights</title>
</head>
<body "background-image: url('plane.jpg');  background-repeat: no-repeat;background-size: cover;>
<a href="/flightreservation">[Go To Home Page]</a>
<a href="/flightreservation/showFlights">[ShowAll Flights]</a>
<a href="/flightreservation/showLogin"><button class="btn">Logout</button> </a>
<form action="addFlight" method="post" class="f-class">
<fieldset>
<legend><h2> Add Flights </h2></legend>

	<pre>
	Flight Number: <input class="inp-btn" type="text" name="flightNumber" required/><br>
	Operating Airlines: <input  class="inp-btn" type="text" name="operatingAirlines" required/><br>
	Departure City: <input  class="inp-btn" type="text" name="departureCity" placeholder="Enter departureCity" required/><br>
	Arrival City: <input  class="inp-btn" type="text" name="arrivalCity" required/><br>
	Date of Departure: <input  class="inp-btn" type="datetime-local" name="dateOfDeparture"  value="MM-dd-yyyy" required/><br>
	<!-- Time of Departure: <input  class="inp-btn" type="time" name="timeOfDeparture" required/--><br>
	</pre>
	<input type="reset" value="Reset" class="submit-btn">
	<input type="submit" value="Add Flight" class="submit-btn"/><br>
	
</fieldset>
</form>
</body>
</html>