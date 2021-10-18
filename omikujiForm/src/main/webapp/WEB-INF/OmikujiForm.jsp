<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-uWxY/CJNBR+1zjPWmfnSnVxwRheevXITnMqoEIeG1LJrdI0GlVs/9cVSyPYXdcSF" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<div class="bigCont">
	<h1>Send an Omikuji!</h1>
	<form action="/process" method="post">
		<div class="mb-3">
			<label class="form-label" for="years">Enter a number of years between 5 and 25:</label><br>
			<input type="number" min="5" max="25" name="years">
		</div>
		<div class="mb-3">
			<label class="form-label" for="city">Enter the name of any city:</label><br>
			<input type="text" name="city">
		</div>
		<div class="mb-3">
			<label class="form-label" for="roommate">Enter the name of any real person:</label><br>
			<input type="text" name="roommate">
		</div>
		<div class="mb-3">
			<label class="form-label" for="profession">Enter any professional hobby or endeavor:</label><br>
			<input type="text" name="profession">
		</div>
		<div class="mb-3">
			<label class="form-label" for="livingThing">Enter any type of living thing:</label><br>
			<input type="text" name="livingThing">
		</div>
		<div class="mb-3">
			<label class="form-label" for="niceThing">Say something nice to someone:</label><br>
			<input type="text" name="niceThing">
		</div>
		<div class="mb-3">
			<p>Send and show a friend!</p>
			<input type="submit" value="Send Omikuji" class="btn btn-info">
		</div>
	</form>
	</div>
</body>
</html>