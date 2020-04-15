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
<div class="jumbotron">
	<a href="/">Dashboard</a>
	<table class="table table-dark" >
	    <thead>
	        <tr>
	            <th scope="col">Name</th>
	            <th scope="col">Creator</th>
	            <th scope="col">Version</th>
	        </tr>
	    </thead>
	    <tbody>
	        <tr>
	            <td><c:out value="${lang.name}"/></td>
	            <td><c:out value="${lang.creator}"/></td>
	            <td><c:out value="${lang.version}"/></td>
	        </tr>
	    </tbody>
	</table>
</div>
</body>
</html>