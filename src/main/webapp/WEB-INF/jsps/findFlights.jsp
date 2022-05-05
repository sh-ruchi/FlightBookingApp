<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flights</title>
<style type="text/css">
  <%@include file="style.css" %>
</style>
</head>
<body>
<a class="alink" href="/flightreservation">[Go To Home Page]</a>
<a class="inp-btn" href="/flightreservation/showLogin"><button class="submit-btn">Logout</button> </a>
<form action="findFlights" method="post" class="f-class">
<fieldset>
<legend><h2>Find Flights</h2></legend>
<pre>
<label for="source">From:</label><input type="text" name="from" class="inp-btn"/><span style="color:red">${msgdc}</span>
<label for="destination">To:</label><input type="text" name="to" class="inp-btn"/><span style="color:red">${msgac}</span><br/>
<label for="traveldate">Departure Date:</label><input type="date" name="departureDate" value="10-05-2022" class="inp-btn"/><span style="color:red">${msgdod}</span>
<br>
<span style="color:red">${msgtofrom}</span>
<input type="reset" value="Clear" class="submit-btn"/>
<input type="submit" value="Search" class="submit-btn"/>
<span style="color:red">${msgfz}</span>
</pre>
</fieldset>
</form>
</body>
</html>


