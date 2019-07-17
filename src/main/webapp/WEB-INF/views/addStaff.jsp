<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Staff</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <%@ include file="mainPage.jsp" %>
<div class="container">
    <form:errors cssStyle="font-style: italic; color: #005cbf" path="staff.*"/>
    <form:form modelAttribute="staff">
        <table>
            <tr>
                <td>Name:</td>
                <td><form:input path="staffName"/></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><form:select path="staffType">
                    <form:option value="Chef"/>
                    <form:option value="Waiter"/>
                    </form:select>
                </td>
            </tr>

        </table>
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
