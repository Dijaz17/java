<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dojos and Ninjas</title>
</head>
<body>
	<h1>All Dojos</h1>
	<ul>
		<c:forEach var="dojo" items="${dojos}">
			<li> <a href="/dojo/${dojo.id}"> <c:out value="${dojo.name}"></c:out> </a> </li>
		</c:forEach>
	</ul>
	<a href="/createDojo">Create a New Dojo!</a><br>
	<a href="/createNinja">Create a New Ninja!</a>
</body>
</html>