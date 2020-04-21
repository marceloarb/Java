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
	<table class="table table-dark" >
    <thead>
        <tr>
            <th scope="col">Category</th>
            
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><c:out value="${category.name}"/> </td>
           
        </tr>
    </tbody>
</table>
	<c:forEach items="${category.products}" var="product">
		<c:out value="${product.name }"></c:out>
	</c:forEach>
	<form action="/category/${category.id}" method="POST">
		<div class="form-group">
		    <label for="exampleFormControlSelect1">Product</label>
		    <select  name="product" class="form-control" id="exampleFormControlSelect1">
		    	<c:forEach items="${ product }" var="product">
		      <option value="${product.id}"  > <c:out value="${ product.name }"/> </option>
		      </c:forEach>
		    </select>
		    <input class="btn btn-primary mb-2" type="submit" value="Submit">
		  </div>
	</form> 
	
	
</body>
</html>