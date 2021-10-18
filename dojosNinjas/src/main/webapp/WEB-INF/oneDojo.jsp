<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${dojo.name}"></c:out></title>
</head>
<body>
	<h1> <c:out value="${dojo.name}"></c:out> Location Ninjas </h1>
	<ul>
		<c:forEach var="ninja" items="${dojo.ninjas}">
			<li>
				<c:out value="${ninja.firstName}"></c:out>
				 <c:out value="${ninja.lastName}"></c:out>,
				  <c:out value="${ninja.age}"></c:out> years old
			</li>
		</c:forEach>
	</ul>
	<a href="/">Home</a>
</body>
</html>