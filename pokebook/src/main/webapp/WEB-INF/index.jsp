<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pokebook</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1>pokebook</h1>
	<table class="tbl1">
		<thead>
			<tr>
				<th>Expense</th>
				<th>Vendor</th>
				<th>Amount</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<c:forEach var="expense" items="${expenses}">
					<tr>
						<td> <a href="/oneExp/${expense.id}"><c:out value="${expense.name}"></c:out></a> </td>
						<td> <c:out value="${expense.vendor}"></c:out> </td>
						<td> <c:out value="${expense.price}"></c:out> </td>
						<td> 
							<a href="/edit/${expense.id}">edit</a> 
							<form action="/deleteExpense/${ expense.id }" method="post">
   								<input type="hidden" name="_method" value="delete">
    							<input type="submit" value="Delete">
							</form> 
						</td>
					</tr>
				</c:forEach>
			</tr>
		</tbody>
	</table>
	<br>
	<h1>Add Expense</h1>
	<form:form action="/newExpense" method="post" modelAttribute="expense">
	    <p>
	        <form:label path="name">Name</form:label>
	        <form:errors path="name"/>
	        <form:input path="name"/>
	    </p>
	    <p>
	        <form:label path="vendor">Vendor</form:label>
	        <form:errors path="vendor"/>
	        <form:input path="vendor"/>
	    </p>
	    <p>
	        <form:label path="description">Description</form:label>
	        <form:errors path="description"/>
	        <form:textarea path="description"/>
	    </p>
	    <p>
	        <form:label path="price">price</form:label>
	        <form:errors path="price"/>     
	        <form:input type="number" min="0" path="price"/>
	    </p>    
	    <input type="submit" value="Submit"/>
	</form:form>    
</body>
</html>