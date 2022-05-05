<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
<style type="text/css">
  <%@include file="style.css" %>
</style>
</head>
</head>
<body style="background-color: rgb(10, 120, 19);">
<a class="alink" href="/flightreservation">[Go To Home Page]</a>
<form:form action="login" method="post" class="f-class" modelAttribute="user">
<fieldset>
<legend><h2> Login </h2></legend>
<pre> 
User Name:<form:input type="text" path="email"  cssClass="inp-btn"/><br>
Password :<form:input type="password" path="password"  cssClass="inp-btn"/><br><br>
</pre>
<input type="submit" value="Login"  class="submit-btn" onclick="myFunction()">
<input type="reset" value="Reset" class="submit-btn"><br/>
</br>
<p style="color:white">${msg}</p><br>
<p style="color:red">${msg1}</p><br>
</legend>
</fieldset>
<script>
function myFunction() {
  alert({confirmMsg});
}
</script>
</form:form>


</body>
</html>