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
	<form:form action="/add" method="POST" modelAttribute="song">
	  <div class="form-group">
	    <form:label path= "title" for="exampleFormControlInput1">Title</form:label>
	    <form:errors path="title"/>
	    <form:input path="title" class="form-control" id="exampleFormControlInput1" placeholder="Title"/>
	  </div>
	  <div class="form-group">
	    <form:label path= "artist" for="exampleFormControlInput1">Artist</form:label>
	    <form:errors path="artist"/>
	    <form:input path="artist" class="form-control" id="exampleFormControlInput1" placeholder="Artist"/>
	  </div>
	  <div class="form-group">
	    <label for="exampleFormControlSelect1">Rating(1-10)</label>
	    <form:select path="rate"  class="form-control" id="exampleFormControlSelect1">
	      <form:option value="1">1</form:option>
	      <form:option value="2">2</form:option>
	      <form:option value="3">3</form:option>
	      <form:option value="4">4</form:option>
	      <form:option value="5">5</form:option>
	      <form:option value="6">6</form:option>
	      <form:option value="7">7</form:option>
	      <form:option value="8">8</form:option>
	      <form:option value="9">9</form:option>
	      <form:option value="10">10</form:option>
	    </form:select>
	    <form:errors path="rate"/>
	  </div>
	  <input class="btn btn-primary mb-2" type="submit" value="Submit">
	  
  
	</form:form> 
</body>
</html>