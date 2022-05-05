<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flights</title>
<style>
table, th, td {
  border: 1px solid black;
}
th{
	width:3%;
}
td{
	width:3%;
}
</style>
</head>
<body>
<br>
<a href="/flightreservation">[Go To Home Page]</a>
<a href="/flightreservation/showLogin"><button class="btn">Logout</button> </a>
<a href="/flightreservation/showAddFlight"><button class="btn">Add More</button></a>
<h2>Operating Flights:</h2>
<form action="showFlights" method="get">
<table>
<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Time</th>
</tr>

<c:forEach items="${flights}" var="flight">
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.estimatedDepartureTime}</td>
<!-- td><a href="showCompleteReservation?flightId=${flight.id}">Book Now</a></td-->
</tr>
</c:forEach>
</table>
</form>
</body>
</html>