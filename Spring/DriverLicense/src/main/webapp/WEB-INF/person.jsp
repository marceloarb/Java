<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/add/person" method="POST" modelAttribute="person">
	  <div class="form-group">
	    <form:label path= "firstName" for="exampleFormControlInput1">First Name</form:label>
	    <form:errors path="firstName"/>
	    <form:input path="firstName" class="form-control" id="exampleFormControlInput1" placeholder="firstName"/>
	  </div>
	  <div class="form-group">
	    <form:label path= "lastName" for="exampleFormControlInput1">Last Name</form:label>
	    <form:errors path="lastName"/>
	    <form:input path="lastName" class="form-control" id="exampleFormControlInput1" placeholder="lastName"/>
	  </div>

	  <input class="btn btn-primary mb-2" type="submit" value="Submit">
	  
  
	</form:form> 
</body>
</html>