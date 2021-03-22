<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Department</h1>
<sf:form method="post" modelAttribute="dept">
ID: <sf:input path="id"/><br><br>
Name: <sf:input path="name"/><br><br>
Location: <sf:input path="location"/><br><br>
<input type="submit" value="Add_Department">
</sf:form>
<h3>${message}</h3>
</body>
</html>