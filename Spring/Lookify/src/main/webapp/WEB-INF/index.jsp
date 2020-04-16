<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<body>
	<h1>Hello</h1>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/newsong">Add New <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Top Songs</a>
      </li>
      
    </ul>
    <form action="/search" method="POST" class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" name="artist" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
 </nav>
  
  <h1>All Songs</h1>
  
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