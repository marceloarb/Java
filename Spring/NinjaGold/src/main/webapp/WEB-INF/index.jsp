<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello</h1>
	<div class="jumbotron">
        <div >
            <h2>Your Gold: <c:out value="${gold}"/></h2>
        </div>
   	</div>
	<div class="jumbotron">
            <form class="form" style="display='inline-block'" action="/process" method="POST">
                <h2>Farm</h2>
                <h3>(earns 10-20 golds)</h3>
                <input type="hidden" name="building" value="farm">
                <button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
            <form action="/process" style="display='inline-block'" method="POST">
                <h2>Cave</h2>
                <h3>(earns 5-10 golds)</h3>
                <input type="hidden" name="building" value="cave">
                <button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
            <form action="/process" method="POST">
                <h2 >House</h2>
                <h3>(earns 2-5 golds)</h3>
                <input type="hidden" name="building" value="house">
				<button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
            <form action="/process" method="POST">
                <h2>Casino</h2>
                <h3 >(earns/takes 0-50 golds)</h3>
                <input type="hidden" name="building" value="casino">
                <button type="submit" class="btn btn-warning">Find Gold!</button>
            </form>
        </div>
</body>
</html>