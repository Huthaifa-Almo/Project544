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
    <script type="text/javascript">
        function findDay()
        {
            var eID = document.getElementById("dropdown-menu");
            var dayVal = eID.options[eID.selectedIndex].value;
            var daytxt = eID.options[eID.selectedIndex].text;
            alert("Selected Item  " +  daytxt + ", Value " + dayVal);
        }
    </script>
</head>
<body>
<div class="container">
    <form:form modelAttribute="order" >
        <table>
            <tr>
                <td>Select food from the menu to Add to the order:</td>

            </tr>
            <tr>
                <td><form:select path="foodList" id="dropdown-menu">
                    <form:option value = "NONE" label = "Select"/>
                    <form:options items = "${foods}" />
                </form:select>
                </td>
            </tr>

        </table>
        <li>
            <a>

            </a>
        </li>
        <input type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
