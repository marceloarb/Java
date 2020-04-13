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
	<h1>Hello</h1>
	<div class="jumbotron">
		<form method="POST" action="/login">
			<label>Name: <input type="text" name="name"></label>
			<label>Dojo Location: <select name="location"></label>
				  <option value="Berkley">Berkley</option>
				  <option value="Boise">Boise</option>
				  <option value="Chicgao">Chicago</option>
				  <option value="Dallas">Dallas</option>
  				  <option value="Los Angeles">Los Angeles</option>
				  <option value="Seattle">Seattle</option>
				  <option value="Silicon Valley">Silicon Valley</option>
				  </select>
			<label>Favorite Language: <select name="language"></label>
				  <option value="Java">Java</option>
				  <option value="Python">Python</option>
				  <option value="C#/.NET">C#/.NET</option>
				  <option value="MEAN">MEAN</option>
				  </select>
			  <h2>Comment:</h2>
			<h2><input type="textarea" name="comment"></h2>
			<input type="submit" value="submit">
		</form>
	</div>
</body>
</html>