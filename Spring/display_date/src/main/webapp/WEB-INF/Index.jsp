<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello World</h1>
	<a href="/date"><h2>Date Template</h2></a>
	<a href="/time"><h2>Time Template</h2></a>
	<h1><c:out value="${count}"/></h1>
</body>
</html>