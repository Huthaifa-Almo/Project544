<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Osama
  Date: 7/15/2019
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Staff List</title>
</head>
<body>


    <h1>Just for test</h1>
    <c:forEach var="staff" items="${staffList}">
        name : ${staff.staffName}
    </c:forEach>
    <br/>
    <br/>
    <h1><a href="${pageContext.servletContext.contextPath}/staff/addStaff">add new staff</a></h1>
</body>
</html>
