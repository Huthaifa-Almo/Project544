<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Food List</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/login.css"/>">
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
    <link rel="stylesheet" href="<c:url value="/resources/styles.css"/>">
</head>
<body>
<%@ include file="header.jsp" %>
<div style="position:absolute;top:70px;left:950px;">
    <img  width="100" style="
              border-radius: 50%;
              border: 5px solid white;
              background-color: snow;
              position: relative;
              top: -68px;
              left: 70px" src="<c:url value="/resources/user.png"/>">
    <span style="
    top: -45px;
    position: relative;
    right: 14px;">${sessionScope.user.username}</span>
</div>

<div style="position: relative;
    height: 70%;
    top: 78px;
    margin: auto;
    width: 75%;
    box-shadow: 10px 10px 5px grey;
    padding: 10px;
    background-color: whitesmoke;">

    <!-- add your forms here -->
<div class="container">
    <h1>Foods Available in the Resturent</h1>
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Origin</th>
            <th scope="col">Type</th>
            <th scope="col">Operation</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="food" items="${foods}">
            <tr>
                <td>${food.name}</td>
                <td>${food.price}</td>
                <td>${food.origin}</td>
                <td>${food.type}</td>
                <td><a href="foods/${food.foodId}">edit</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="addFood"> Add new Dish</a>
</div>
</div>
</body>
</html>
