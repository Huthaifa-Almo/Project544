<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Osama
  Date: 7/15/2019
  Time: 3:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Staff</title>
</head>
<body>

Adding Staff Form:<br/>

<form action="${pageContext.servletContext.contextPath}/staff/addStaff" method="post">

    Name: <input name="staffName">
    Staff type: <select name="staffType">
                    <option value="Select type">Select type</option>
                    <option name="Waiter" value="0">Waiter</option>
                    <option name="Chef" value="1">Chef</option>
                </select>

    <input type="submit" value="Add"/>
</form>
</body>
</html>
