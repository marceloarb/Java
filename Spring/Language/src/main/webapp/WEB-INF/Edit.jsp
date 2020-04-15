<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %> 
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
	<h1>Add new language</h1>
	<form:form action="/edit/${lang.id}" method="POST" modelAttribute="lang">
		<input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="creator">Creator</form:label>
	        <form:errors path="creator"/>
	        <form:textarea path="creator"/>
	    </p>
	    <p>
	        <form:label path="version">Version</form:label>
	        <form:errors path="version"/>
	        <form:input path="version"/>
	    </p>
	    <input class="btn btn-primary" type="submit" value="Submit"/>
	</form:form>  
</div>
</body>
</html>