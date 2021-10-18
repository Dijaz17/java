<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Expense</title>
</head>
<body>
	<h1>Edit</h1>
	<form:form action="/editExpense/${ expense.id }" method="post" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
	    <p>
	        <form:label path="name" value="${expense.name}">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="vendor" value="${expense.vendor}">Vendor</form:label>
	        <form:errors path="vendor"/>
	        <form:input path="vendor"/>
	    </p>
	    <p>
	        <form:label path="description" value="${expense.description}">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="price" value="${expense.price}">price</form:label>
	        <form:errors path="price"/>     
	        <form:input type="number" min="0" path="price"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>
	<a href="/">Go back</a>
</body>
</html>