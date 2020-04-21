  
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
	<form:form action="/add/product" method="POST" modelAttribute="product">
	  <div class="form-group">
		    <form:label path= "name" for="exampleFormControlInput1">Name</form:label>
		    <form:errors path="name"/>
		    <form:input path="name" class="form-control" id="exampleFormControlInput1" placeholder="Name"/>
	  </div>
  	  <div class="form-group">
		    <form:label path= "description" for="exampleFormControlInput1">description</form:label>
		    <form:errors path="description"/>
		    <form:input path="description" class="form-control" id="exampleFormControlInput1" placeholder="description"/>
	  </div>
		<div class="form-group">
		    <form:label path= "price" for="exampleFormControlInput1">price</form:label>
		    <form:errors path="price"/>
		    <form:input path="price" class="form-control" id="exampleFormControlInput1" placeholder="price"/>
		</div>
	  

	  <input class="btn btn-primary mb-2" type="submit" value="Submit">
	  
  
	</form:form> 
</body>
</html>