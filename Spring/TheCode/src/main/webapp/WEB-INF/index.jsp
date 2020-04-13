<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<h2><c:out value="${error}"/></h2>
    <form method="POST" action="/code">
    <label>Code: <input type="text" name="code"></label>
    <button>submit</button>
    
</form>
</body>
</html>