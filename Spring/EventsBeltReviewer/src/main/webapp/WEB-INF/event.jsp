<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ page isErrorPage="true" %> 
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/logout" method="get">
	<button class="btn btn-danger">logout</button>
</form>
	<h1>Here are some of the events in your state:</h1>
	<table class="table table-dark" >
	    <thead>
	        <tr>
	            <th scope="col">Name</th>
	            <th scope="col">Date</th>
	            <th scope="col">Location</th>
	            <th scope="col">Host</th>
	            <th scope="col">Actions</th>
	            
	        </tr>
	    </thead>
	    <tbody>
	    <c:forEach items="${ outOfStates}" var="outstate">
	        <tr>
	            <td><c:out value="${outstate.name }"/> </td>
	            <td><fmt:formatDate pattern ="MMMM dd, yyyy" value ="${outstate.date}"/></td>
	            <td><c:out value="${outstate.state}"/> </td>
	            <td><c:out value="${outstate.user.email}"/></td>
	            <c:choose>
	            <c:when test="${ userInSession == outstate.user }">
            	<td><a href="/delete/${ outstate.id }/event" >Delete</a>  |  <a href="/event/${outstate.id }/edit">Edit</a></td>
            	</c:when>
            	<c:otherwise>
					<c:choose>
	            	<c:when test="${ outstate.user_event.contains(userInSession) }">
            		<td><a href="/delete/${outstate.id }"> Cancel</a> </td>
					</c:when>
					<c:otherwise>
					<td><a href="/event/${outstate.id }"> Join</a> </td>
					</c:otherwise>
					</c:choose>
            	</c:otherwise>
            	</c:choose>
	           
	        </tr>
	 </c:forEach>
	    </tbody>
	</table>
	<hr>
<h1>Here are some of the events in other states:</h1>

	<table class="table table-dark" >
	    <thead>
	        <tr>
	            <th scope="col">Name</th>
	            <th scope="col">Date</th>
	            <th scope="col">Location</th>
	            <th scope="col">Host</th>
	            <th scope="col">Actions</th>
	            
	        </tr>
	    </thead>
	    <tbody>
	    <c:forEach items="${ allstate}" var="state">
	        <tr>
	            <td><c:out value="${state.name }"/> </td>
	            <td><fmt:formatDate pattern ="MMMM dd, yyyy" value ="${state.date}"/></td>
	            <td><c:out value="${state.state}"/> </td>
	            <td><c:out value="${state.user.email}"/></td>
	            <c:choose>
	            <c:when test="${ userInSession == state.user }">
            	<td><a href="/delete/${ state.id }/event" >Delete</a>  |  <a href="/event/${state.id }/edit">Edit</a></td>
            	</c:when>
            	<c:otherwise>
            	 	<c:choose>
	            	<c:when test="${ state.user_event.contains(userInSession) }">
            		<td><a href="/delete/${state.id }"> Cancel</a> </td>
					</c:when>
					<c:otherwise>
					<td><a href="/event/${state.id }"> Join</a> </td>
					</c:otherwise>
					</c:choose>
            	</c:otherwise>
            	</c:choose>
	        </tr>
	 </c:forEach>
	    </tbody>
	</table>
	
	
	
	
	<hr>
	<h1>Create Event</h1>
	<div class="jumbotron">
	
	<form:form method="POST" action="/event" modelAttribute="event">
	  <div class="form-row">
	  <div class="form-group col-md-6">
	      <form:label path="name" for="inputEmail4">Name</form:label>
	      <form:input  path="name" class="form-control" id="inputEmail4"/>
	      <form:errors path="name"/>
	    </div>
	    <div class="form-group col-md-6">
	       <form:label path="date" for="inputEmail4">Date</form:label>
	      <form:input type="date" path="date" class="form-control" id="inputEmail4"/>
	      <form:errors path="date"/>
	    </div>
	    <div class="form-group col-md-6">
	      <form:label path="location" for="inputEmail4">Location</form:label>
	      <form:input  path="location" class="form-control" id="inputEmail4"/>
	      <form:errors path="location"/>
	    </div>
	    <div class="form-group col-md-4">
	      <form:label path="state" for="inputState">State</form:label>
	      <form:select path="state" id="inputState" class="form-control">
	        <option value="CA" >CA</option>
	         <option value="TX" >TX</option>
	         <option value="NY" >NY</option>
	      </form:select>
	      <form:errors path="state"/>
	    </div>

	    
	  </div>
	  <button type="submit" class="btn btn-primary">Sign in</button>
	  
	</form:form>  
	</div>
	  
</body>
</html>