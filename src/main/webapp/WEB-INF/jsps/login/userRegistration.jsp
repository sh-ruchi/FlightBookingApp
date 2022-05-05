<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<style type="text/css">
  <%@include file="style.css" %>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
	}
</style>
</head>
<body "background-image: url('plane.jpg');  background-repeat: no-repeat;background-size: cover;>

<form:form action="userRegistration" method="post" class="f-class" modelAttribute="user">
<fieldset>
<legend><h2> User Registration </h2></legend>

	<pre>
	First Name:<form:input cssClass="inp-btn" type="text" path="firstName"/><form:errors path="firstName" cssClass="error"/><br>
	Last Name: <form:input cssClass="inp-btn" type="text" path="lastName" /><form:errors path="lastName" cssClass="error"/><br>
	User Name: <form:input cssClass="inp-btn" type="text" path="email" placeholder="Enter email" /><form:errors path="email" cssClass="error"/>
	<p style="color:red">${msg1}</p><br>
	Password: <form:input cssClass="inp-btn" type="password" path="password" /><form:errors path="password" cssClass="error"/><br>
	Confirm Password: <input  class="inp-btn" type="password" name="confirmPassword" /><br>
	</pre>
	<input type="reset" value="Reset" class="submit-btn">
	<input type="submit" value="Register" class="submit-btn"/><br>
	<p style="color:red">${msg}</p><a href="showLogin">Click Here to Login</a>
</fieldset>
</form:form>

</body>
</html>