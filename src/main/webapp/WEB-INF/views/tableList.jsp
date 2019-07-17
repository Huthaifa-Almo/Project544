<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Food List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Cars currently in the shop</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <%@ include file="mainPage.jsp" %>
<div class="container">
    <h1>Foods Available in the Resturent</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Number of Seat</th>
            <th scope="col">Type</th>
            <th scope="col">Location</th>
            <th scope="col">Available</th>
            <th scope="col">Operation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="table" items="${tables}">
            <tr>
                <td>${table.numOfSeat}</td>
                <td>${table.type}</td>
                <td>${table.location}</td>
                <td>${table.available}</td>
                <td><a href="tables/${table.tableId}">edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addTable"> Add new Table</a>
</div>
</body>
</html>
