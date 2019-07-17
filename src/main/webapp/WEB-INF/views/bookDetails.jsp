<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add booking</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <%@ include file="mainPage.jsp" %>
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
</body>
</html>