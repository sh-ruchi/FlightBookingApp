<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
</head>
<body>

<form action="userRegistration" method="post">
<fieldset>
<legend><h2> User Registration </h2></legend>

	<pre>
	First Name: <input type="text" name="firstName"/>
	Last Name: <input type="text" name="lastName"/>
	User Name: <input type="text" name="email" placeholder="Enter email"/>
	Password: <input type="password" name="password">
	Confirm Password: <input type="password" name="confirmPassword"/>
	<input type="submit" value="Register"/>
	</pre>
</fieldset>
</form>

</body>
</html>