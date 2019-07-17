<%--
  Created by IntelliJ IDEA.
  User: mot_a
  Date: 7/13/2019
  Time: 3:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" href="<c:url value="/resources/login.css"/>">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/styles.css"/>">
<style>
    body {
        background-image:url("<c:url value="/resources/background.jpg"/>");
        background-repeat:no-repeat;
        background-size:100% 100%;
        font-family: "HelveticaNeue-Light", "Helvetica Neue Light", "Helvetica Neue", Helvetica, Arial, "Lucida Grande", sans-serif;
        font-weight:300;
        text-align: left;
        text-decoration: none;
        height: 500px;
    }
</style>
<div id='cssmenu'>
    <ul>
        <li> <a href="">Home</a></li>
        <li> <a href="${pageContext.servletContext.contextPath}/food/addFood">Add Food</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/table/addTable">Add Table</a></li>
        <li> <a href="${pageContext.servletContext.contextPath}/staff/addStaff">Add Staff</a></li>
        <li><a href="${pageContext.servletContext.contextPath}/order/addOrder">Add order</a></li>
        <sec:authorize access="hasRole('ADMIN')">
        <li> <a href="${pageContext.servletContext.contextPath}/booking/addBooking">add booking</a></li>
        </sec:authorize>

        <div style="position:absolute;top:70px;left:1130px;">
            <a class="button" style="vertical-align:middle;position: relative;
    top: -68px;" href="logout"><span>Logout</span></a>
        </div>
    </ul>


</div>
