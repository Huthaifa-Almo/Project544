<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food Details</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
</head>
<body>
    <div class="container">
        <form:errors cssStyle="font-style: italic; color: #005cbf" path="food.*"/>
        <form:form modelAttribute="food" action="../foods/${food.foodId}" method="post">
            <form:hidden path="foodId"/>
            <table>
                <tr>
                    <td>Name:</td>
                    <td><form:input path="name"/></td>
                </tr>
                <tr>
                    <td>Price:</td>
                    <td><form:input path="price"/></td>
                </tr>
                <tr>
                    <td>Origin:</td>
                    <td><form:input path="origin"/></td>
                </tr>
                <tr>
                    <td>Type:</td>
                    <td><form:input path="type"/></td>
                </tr>
            </table>
            <input type="submit" value="update"/>
        </form:form>

        <form action="delete?foodId=${food.foodId}" method="post">
            <button type="submit">Delete</button>
        </form>
</div>
</body>
</html>
