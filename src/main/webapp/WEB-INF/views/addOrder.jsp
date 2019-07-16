<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Food</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/bootstrap.min.css"/>">
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script>
        function func() {
            var me=document.getElementById("selection");
            var selectedDishId =parseInt(me.options[me.selectedIndex].value);

            ${selectedFood.add(foods.get(3))}

            alert(selectedDishId)
        }
    </script>

</head>
<body>
<div class="container">
    <h1>Foods Available in the Resturent</h1>
<form:form modelAttribute="order">
    <table class="table">
        <thead>
        <tr>
            <th scope="col">Name</th>
            <th scope="col">Price</th>
            <th scope="col">Origin</th>
            <th scope="col">Type</th>
            <th scope="col">Selection</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="food" items="${foods}">
            <tr>
                <td>${food.name}</td>
                <td>${food.price}</td>
                <td>${food.origin}</td>
                <td>${food.type}</td>
                <td><input type="checkbox" name="${food.foodId}"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
   <input type="submit" value="submit">
</form:form>
</div>
</body>
</html>
