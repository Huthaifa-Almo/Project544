<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Food Details</title>
</head>
<body>
    <div class="container">
        <form:form modelAttribute="staff" action="../staffs/${staff.staffId}" method="post">
            <form:hidden path="staffId"/>
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
            <input type="submit" value="update"/>
        </form:form>

        <form action="delete?staffId=${staff.staffId}" method="post">
            <button type="submit">Delete</button>
        </form>
</div>
</body>
</html>
