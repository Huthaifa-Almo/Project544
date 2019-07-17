<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <a href="${pageContext.servletContext.contextPath}/food/addFood">Add Food</a>
    <a href="${pageContext.servletContext.contextPath}/table/addTable">Add Table</a>
    <a href="${pageContext.servletContext.contextPath}/staff/addStaff">Add Staff</a>
    <a href="${pageContext.servletContext.contextPath}/order/addOrder">Add order</a>
    <sec:authorize access="hasRole('ADMIN')">
    <a href="${pageContext.servletContext.contextPath}/booking/addBooking">add booking</a>
    <a href="${pageContext.servletContext.contextPath}/booking/bookings">Bookings list</a>
    </sec:authorize>
    <a href="${pageContext.servletContext.contextPath}/food/foods">foods list</a>
    <a href="${pageContext.servletContext.contextPath}/table/tables">tables list</a>
    <a href="${pageContext.servletContext.contextPath}/staff/staffs">staff list</a>

    <a href="logout">Logout</a>
</body>
</html>
