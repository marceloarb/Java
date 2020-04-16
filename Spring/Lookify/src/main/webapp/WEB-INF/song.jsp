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
<a class="btn btn-primary" href="/">Back</a>
	<table class="table table"  >
	    <thead>
	        <tr>
	            <th scope="col">Title</th>
	            <th scope="col">Artist</th>
	            <th scope="col">Rate</th>
	            <th scope="col">Action</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td><c:out value="${song.title}"/></td>
	            <td><c:out value="${song.artist}"/></td>
	            <td><c:out value="${song.rate}"/></td>
	            <td> <a href="/song/${song.id}/delete">Delete</a></td>
	        </tr>
	    </tbody>
	</table>
</body>
</html>