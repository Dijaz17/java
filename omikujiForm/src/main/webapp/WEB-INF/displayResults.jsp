<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<h1 class="omiTtl"> Here's Your Omikuji!</h1>
	<div class="omiRes">
		<h2>In <c:out value="${years}"></c:out> years you will live in <c:out value="${city}"></c:out> with <c:out value="${roommate}"></c:out> as your roommate, <c:out value="${profession}"></c:out> for a living. The next time you see a <c:out value="${livingThing}"></c:out>, you will have good luck. Also, <c:out value="${niceThing}"></c:out>. </h2>
	</div>
	<div class="homeLink"><a href="/">Go Back</a></div>
</body>
</html>