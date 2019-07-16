<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add booking</title>
</head>
<body>
    <div class="container">
        <form:form modelAttribute="booking" action="bookings/addBooking" method="post">

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
                <<tr>
                    <td>tables:</td>
                    <td>
                        <form:select  path="reservedTables">
                            <form:options  items="${tables}" />
                        </form:select></td>
                </tr>

            </table>
            <input type="submit" value="Add"/>
        </form:form>
    </div>
</body>
</html>