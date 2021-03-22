<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Department List</h1>
<ul>
<c:forEach var="depts" items="${depts}">
	<li>${depts.id}, ${depts.name}, ${depts.location}</li>
</c:forEach>
</ul>
</body>
</html>