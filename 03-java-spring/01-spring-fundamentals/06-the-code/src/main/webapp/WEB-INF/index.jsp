<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Secret Code</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>

<h1>What is the Code?</h1>

<p class="error">${errorMessage}</p>

<form method="POST" action="/code">

<label>What is the Code?</label>
<input type="text" name="code">
<button>Try Code</button>
	
</form>

</body>
</html>