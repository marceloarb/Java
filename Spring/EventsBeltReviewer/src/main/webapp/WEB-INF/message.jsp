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
	<h1>Leave your message</h1>
	<form:form action="/message" method="POST" modelAttribute="message">
	    <div class="form-group col-md-6">
	    <form:input type="hidden" path="user" value="${session.getAttribute('userId') }"/>
	      <form:label path="message" for="inputEmail4">Name</form:label>
	      <form:input  path="message" class="form-control" id="inputEmail4"/>
	      <form:errors path="message"/>
	    </div>
	    
	    
	   
	    <input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>  
</div>
</body>
</html>