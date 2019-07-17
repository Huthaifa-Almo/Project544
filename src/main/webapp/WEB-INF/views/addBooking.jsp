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
       <c:if test="${msg == 'yes'}">errors: ${errors}</c:if>
            <form action="bookings/addBooking" method="post">
                <table>
                    <tr>
                        <td>new date:</td>
                        <td><input type="text" name="date" value="${booking.date}"/></td>
                    </tr>
                    <tr>
                        <td>startTime:</td>
                        <td><input type="text" name="startTime" value="${booking.startTime}"/></td>
                    </tr>
                    <tr>
                        <td>endTime:</td>
                        <td><input type="text" name="endTime" value="${booking.endTime}"/></td>
                    </tr>
                    <tr>
                        <td>customerName:</td>
                        <td><input type="text" name="customerName" value="${booking.customerName}"/></td>
                    </tr>
                    <tr>
                        <td>phoneNumber:</td>
                        <td><input type="text" name="phoneNumber" value="${booking.phoneNumber}"/></td>
                    </tr>

                    <tr>
                        <td>tables:</td>
                        <td>
                            <select name="tablesIds" multiple="true">
                                <c:forEach var="table" items="${tables}">
                                    <option value="${table.tableId}" label="${table.location}"/>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                </table>
                <input type="submit" value="Add"/>
            </form>
    </div>
</body>
</html>