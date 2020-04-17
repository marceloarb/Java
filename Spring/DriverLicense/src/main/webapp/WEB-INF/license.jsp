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
	<form:form action="/add/license" method="POST" modelAttribute="license">
	  <div class="form-group">
	    <form:label path= "state" for="exampleFormControlInput1">State</form:label>
	    <form:input path="state" class="form-control" id="exampleFormControlInput1" placeholder="State"/>
	  </div>
	  <div class="form-group">
	    <form:label path= "expirationDate" for="exampleFormControlInput1">Expiration Date</form:label>
	    <form:input path="expirationDate" class="form-control" type="date" id="exampleFormControlInput1" placeholder="Expiration Date"/>
	  </div>
	  
	  <div class="form-group">
	    <label for="exampleFormControlSelect1">People</label>
	    <form:select path="person"  class="form-control" id="exampleFormControlSelect1">
	    	<c:forEach items="${ people }" var="person">
	      <form:option value="${person.id }" > <c:out value="${ person.firstName }"/> </form:option>
	      </c:forEach>
	    </form:select>
	  </div>
	  <input class="btn btn-primary mb-2" type="submit" value="Submit">
  
	</form:form> 
</body>
</html>