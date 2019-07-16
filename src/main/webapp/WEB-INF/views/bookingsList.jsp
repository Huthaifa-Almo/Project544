<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bookings List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <%@ include file="mainPage.jsp" %>
<div class="container">
    <h1>Available Bookings</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Booking number</th>
            <th scope="col">Date</th>
            <th scope="col">Start Date</th>
            <th scope="col">End Date</th>
            <th scope="col">Customer Name</th>
            <th scope="col">Phone number</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="book" items="${bookings}">
            <tr>
                <td><c:out value="${book.bookingId}"/></td>
                <td><c:out value="${book.date}"/></td>
                <td><c:out value="${book.startTime}"/></td>
                <td><c:out value="${book.endTime}"/></td>
                <td><c:out value="${book.customerName}"/></td>
                <td><c:out value="${book.phoneNumber}"/></td>
                <td><a href="bookings/${book.bookingId}">edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addBooking">add booking</a>
</div>
</body>
</html>
