<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
  <%@include file="style.css" %>
</style>
</head>

<body style="font-size: 2rem; padding:3%">
<h2 style="color:green">Below Flight details have been added Successfully !!</h2>
<table>
<tr>
<th>Airlines</th>
<th>Departure City</th>
<th>Arrival City</th>
<th>Departure Date</th>
<th>Departure Time</th>
</tr>
<tr>
<td>${flight.operatingAirlines}</td>
<td>${flight.departureCity}</td>
<td>${flight.arrivalCity}</td>
<td>${flight.dateOfDeparture}</td>
<td>${flight.estimatedDepartureTime}</td>
<td><form action="/showDelete" action="post">
<!-- input type=submit value ="Delete"-->
<a href="/flightreservation/showDelete?flightId=${flight.id}">
Delete
</a>
<input type="hidden" name="flightId" value="${flight.id}"/>
</form></td>
</tr>
</table>
<a href="/flightreservation/showAddFlight"><button class="btn">Add More</button></a>
<a href="/flightreservation/showLogin"><button class="btn">Logout</button> </a>

</body>
</html>