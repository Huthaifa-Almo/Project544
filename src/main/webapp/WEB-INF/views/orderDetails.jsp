<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Table Details</title>
</head>
<body>
    <%@ include file="mainPage.jsp" %>
    <div class="container">
        <form:form modelAttribute="order" action="../orders/${order.orderId}" method="post">
            <form:hidden path="orderId"/>
            <table>
                <tr>
                    <td>Number Of Seat:</td>
                    <td><form:input path="numOfSeat"/></td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td><form:input path="type"/></td>
                </tr>
                <tr>
                    <td>Location:</td>
                    <td><form:input path="location"/></td>
                </tr>
            </table>
            <input type="submit" value="update"/>
        </form:form>

        <form action="delete?tableId=${table.tableId}" method="post">
            <button type="submit">Delete</button>
        </form>
</div>
</body>
</html>
