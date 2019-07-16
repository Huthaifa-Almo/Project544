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
<div class="container">
    <h1>Staff Currently Employee the Resturent</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Staff Name</th>
            <th scope="col">Staff Type</th>
            <th scope="col">Operation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="staff" items="${staffs}">
            <tr>
                <td>${staff.staffName}</td>
                <td>${staff.staffType}</td>
                <td><a href="staffs/${staff.staffId}">edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addStaff"> Add new Staff</a>
</div>
</body>
</html>
