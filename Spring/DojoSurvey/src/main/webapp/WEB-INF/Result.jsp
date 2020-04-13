<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>

<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
		<h2>Submitted Info</h2>
		<h2 >Name: <c:out value="${name}"/></h2>
		<h2 >Dojo Location: <c:out value="${location}"/></h2>
		<h2 >Favorite Language: <c:out value="${language}"/></h2>
		<h2 >Comment: <c:out value="${comment}"/></h2>
	</div>
</body>
</html>