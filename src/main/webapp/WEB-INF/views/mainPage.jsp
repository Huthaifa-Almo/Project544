<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home Page</title>
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
</head >
<body style="background-image: image-set(url("<c:url value="/resources/background.jpg"/>"))">
<%@ include file="header.jsp" %>
<div style="position:absolute;top:70px;left:950px;">
    <img  width="100" style="
              border-radius: 50%;
              border: 5px solid white;
              background-color: snow;
              position: relative;
              top: -68px;
              left: 70px" src="<c:url value="/resources/user.png"/>">

</div>
<div  style="
    margin: auto;
    text-align: center;
    padding-top: 15px;
    ">

    <a href="${pageContext.servletContext.contextPath}/food/addFood" title="Add Food"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/addFood.png"/>"></a>
    <a href="${pageContext.servletContext.contextPath}/table/addTable" title="Add Table"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/bookTable.png"/>"></a>
    <a href="${pageContext.servletContext.contextPath}/staff/addStaff" title="Add Staff"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/addservice.png"/>"></a> <br>
    <a href="${pageContext.servletContext.contextPath}/order/addOrder" title="Add order"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/addOrder.jpg"/>"></a>
    <a href="${pageContext.servletContext.contextPath}/booking/addBooking" title="add booking"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/addBooking.jpg"/>"></a>
    <a href="${pageContext.servletContext.contextPath}/booking/bookings" title="Bookings list"><img class="button" height="200" width="200" style="border-radius: 50%;border: 5px solid #607D8B;background-color: snow;margin: 40px;" src="<c:url value="/resources/ViewBooking.png"/>"></a>
</div>
</body>
</html>
