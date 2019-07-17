<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Food List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <%@ include file="mainPage.jsp" %>
<div class="container">
    <h1>Foods Available in the Resturent</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Origin</th>
            <th scope="col">Type</th>
            <th scope="col">Operation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="food" items="${foods}">
            <tr>
                <td>${food.name}</td>
                <td>${food.price}</td>
                <td>${food.origin}</td>
                <td>${food.type}</td>
                <td><a href="foods/${food.foodId}">edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addFood"> Add new Dish</a>
</div>
</body>
</html>
