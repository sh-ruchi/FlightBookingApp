<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Flights</title>
</head>
<body>

<form action="findFlights" method="post">
<fieldset>
<legend><h2>Find Flights</h2></legend>
<pre>
<label for="source">From:</label>
<input type="text" name="from"/>
<label for="destination">To:</label>
<input type="text" name="to"/><br/>
<label for="traveldate">Departure Date:</label>
<input type="text" name="departureDate"/>
<input type="submit" name="Search"/>
</pre>
</fieldset>
</form>
</body>
</html>