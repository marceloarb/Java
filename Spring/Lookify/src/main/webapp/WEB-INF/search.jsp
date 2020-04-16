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
<h1><c:out value="${artist}"/></h1>
	<table class="table table-dark"  >
	    <thead>
	        <tr>
	            <th scope="col">Title</th>
	            <th scope="col">Artist</th>
	            <th scope="col">Rate</th>
	            <th scope="col">Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <c:forEach items="${songs}" var="song">
	        <tr>
	            <td><a href="/song/${song.id}"><c:out value="${song.title}"/></a></td>
	            <td><c:out value="${song.artist}"/></td>
	            <td><c:out value="${song.rate}"/></td>
	            <td> <a href="/song/${song.id}/delete">Delete</a></td>
	        </tr>
	        </c:forEach>
	    </tbody>
	</table>
</body>
</html>