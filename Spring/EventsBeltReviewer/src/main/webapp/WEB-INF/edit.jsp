<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
	<h1>Edit</h1>
	<form:form action="/event/${event.id}" method="POST" modelAttribute="event">
		<input type="hidden" name="_method" value="put">
		<form:input type="hidden" path="user" value="${session.getAttribute('userId') }"/>
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="date">Date</form:label>
	        <form:errors path="date"/>
	        <form:input type="date" path="date"/>
	    </p>
	    <p>
	        <form:label path="location">Location</form:label>
	        <form:errors path="location"/>
	        <form:input path="location"/>
	    </p>
	    <div class="form-group col-md-4">
	      <form:label path="state" for="inputState">State</form:label>
	      <form:select path="state" id="inputState" class="form-control">
	        <option value="CA" >CA</option>
	         <option value="TX" >TX</option>
	         <option value="NY" >NY</option>
	      </form:select>
	      <form:errors path="state"/>
	    </div>
	    <input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>  
</div>
</body>
</html>