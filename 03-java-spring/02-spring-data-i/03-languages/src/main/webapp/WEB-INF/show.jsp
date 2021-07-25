<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href="/">Dashboard</a>

<p><c:out value="${thislang.name}"/></p>
<p><c:out value="${thislang.creator}"/></p>
<p><c:out value="${thislang.currentVersion}"/></p>

<p><a href="/edit/${thislang.id}">Edit</a>
<form method="POST" action="/delete/${thislang.id}">
<input type="hidden" name="_method" value="delete">
<button>Delete Language</button>
</form>
</body>
</html>