<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Restaurants</title>
</head>
<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Dishes</th>
        </tr>
        <c:forEach items="${restaurants}" var="rest">
            <tr>
                <td>${rest.name}</td>
                <td>
                    <table>
                        <tr>
                            <th>Dish name</th>
                            <th>Price</th>
                        </tr>
                        <c:forEach items="${rest.lunchMenu}" var="dish">
                            <tr>
                                <td>${dish.name}</td>
                                <td>${dish.price}</td>
                            </tr>
                        </c:forEach>
                    </table>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
