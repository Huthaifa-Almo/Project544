<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Add booking</title>
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
        <form:errors path="booking.*"/>
        <form:form modelAttribute="booking" method="post">
            <table>
                <tr>
                    <td>date:</td>
                    <td><form:input path="date"/></td>
                </tr>
                <tr>
                    <td>startTime:</td>
                    <td><form:input path="startTime"/></td>
                </tr>
                <tr>
                    <td>endTime:</td>
                    <td><form:input path="endTime"/></td>
                </tr>
                <tr>
                    <td>customerName:</td>
                    <td><form:input path="customerName"/></td>
                </tr>
                <tr>
                    <td>phoneNumber:</td>
                    <td><form:input path="phoneNumber"/></td>
                </tr>

                <tr>
                    <td>tables:</td>
                    <td>
                        <form:select path="tablesIds" items="${tables}" itemValue="tableId" itemLabel="location"/>
                    </td>
                </tr>
            </table>
            <input type="submit" value="Update"/>
        </form:form>
        <%--<form action="delete?bookingId=${booking.bookingId}" method="post">
            <button type="submit">Delete</button>
        </form>--%>
    </div>
</div>
</body>
</html>