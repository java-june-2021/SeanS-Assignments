<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Category Details</title>
</head>
<body>
<h1><c:out value="${category.name}"/></h1>
<hr>
<h2>Products</h2>
<ul>
<c:forEach items="${category.products}" var="prod">
<li>${prod.name} | ${prod.description} | ${prod.price}
</c:forEach>
</ul>

<form method="POST" action="/addProdToCat/${category.id}">
<select name="prod">
<c:forEach items="${notInCat}" var="prod">
<option value="${prod.id}">${prod.name}</option>
</c:forEach>
</select>
<button>Add Product</button>
</form>

</body>
</html>