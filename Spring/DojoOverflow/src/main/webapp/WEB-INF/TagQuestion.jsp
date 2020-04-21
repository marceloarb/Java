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
	<form:form action="/add/question" method="POST" modelAttribute="question">
	  <div class="form-group">
	    <form:label path= "question" for="exampleFormControlInput1">Question</form:label>
	    <form:errors path="question"/>
	    <form:input path="question" class="form-control" id="exampleFormControlInput1" placeholder="Question"/>
	  </div>
	  <form:form action="/add/tag" method="POST" modelAttribute="Tag">
		  <div class="form-group">
		    <form:label path= "tag" for="exampleFormControlInput1">Tag</form:label>
		    <form:errors path="tag"/>
		    <form:input path="tag" class="form-control" id="exampleFormControlInput1" placeholder="Tag"/>
		  </div>
	<form:hidden path="product" value="${product.id}" /> 
  	<input class="btn btn-primary mb-2" type="submit" value="Submit">
  	</form:form>
	</form:form> 
</body>
</html>