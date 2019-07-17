<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Bookings List</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/login.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/styles.css"/>">
</head>
<body>
<%@ include file="header.jsp" %>
<div style="position:absolute;top:70px;left:950px;">
    <img  width="100" style="
              border-radius: 50%;
              border: 5px solid white;
              background-color: snow;
              position: relative;
              top: -68px;
              left: 70px" src="<c:url value="/resources/user.png"/>">
    <span style="
    top: -45px;
    position: relative;
    right: 14px;">${sessionScope.user.username}</span>
</div>

<div style="position: relative;
    height: 70%;
    top: 78px;
    margin: auto;
    width: 75%;
    box-shadow: 10px 10px 5px grey;
    padding: 10px;
    background-color: whitesmoke;">

    <!-- add your forms here -->
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
</div>
</body>
</html>
