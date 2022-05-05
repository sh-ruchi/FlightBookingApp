<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Flight</title>
</head>
<style type="text/css">
  <%@include file="style.css" %>
</style>
</head>

<body style="font-size: 2rem; padding:3%">
<h2 style="color:green">Flight with id ${flightId}  Successfully deleted!!</h2>
<a href="/flightreservation/showAddFlight"><button class="btn">Add More Flights</button></a>
<a href="/flightreservation/showLogin"><button class="btn">Logout</button> </a>
<input type="hidden" name="flightId" value="${flight.id}"/>
</body>
</html>