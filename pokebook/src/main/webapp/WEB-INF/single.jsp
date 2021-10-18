<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Single Expense</title>
</head>
<body>
	<h1>Expense Details</h1>
	<p><b>Expense Name:</b> <c:out value="${expense.name}"></c:out></p>
	<p><b>Vendor:</b> <c:out value="${expense.vendor}"></c:out></p>
	<p><b>Description:</b> <c:out value="${expense.description}"></c:out></p>
	<p><b>Price:</b> $<c:out value="${expense.price}"></c:out></p><br>
	<a href="/">Home</a>
</body>
</html>