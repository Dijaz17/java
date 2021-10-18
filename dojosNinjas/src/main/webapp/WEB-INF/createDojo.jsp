<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Dojo</title>
</head>
<body>
	<h1>Add New Dojo</h1>
	<form:form action="/newDojo" method="post" modelAttribute="dojo">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>  
	    <input type="submit" value="Submit"/>
	</form:form>
	<a href="/">Home</a>
</body>
</html>