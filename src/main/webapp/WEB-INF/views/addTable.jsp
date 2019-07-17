<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Food</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
<div class="container">
    <form:errors cssStyle="font-style: italic; color: #005cbf" path="table.*"/>
    <form:form modelAttribute="table">
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
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
