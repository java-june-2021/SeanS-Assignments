<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
<h1>Submitted Info</h1>
<p>Name: <c:out value="${result.name}"/></p>
<p>Location: <c:out value="${result.location}"/></p>
<p>Language: <c:out value="${result.language}"/></p>
<p>Comment: <c:out value="${result.comment}"/></p>
</body>
</html>