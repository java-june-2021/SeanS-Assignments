<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Time Template</title>
<link rel="stylesheet" href="css/style.css">
<script scr="js/main.js"></script>
</head>
<body>
<script>timeAlert()</script>
<p class="green"><fmt:formatDate pattern="h:mm a" value="${datetime}"/></p>
</body>
</html>