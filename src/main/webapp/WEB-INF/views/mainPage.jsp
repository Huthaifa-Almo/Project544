<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <a href="food/addFood">Add Food</a>
    <a href="table/addTable">Add Table</a>
    <a href="staff/addStaff">Add Staff</a>
    <a href="order/addOrder">Add order</a>
    <a href="${pageContext.servletContext.contextPath}/booking/addBooking">add booking</a>
    <a href="${pageContext.servletContext.contextPath}/booking/bookings">Bookings list</a>
</body>
</html>
