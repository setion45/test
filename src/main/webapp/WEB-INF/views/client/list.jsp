<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="ru">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Клиенты</title>
</head>
<body>
<div>
    <table>
        <caption><h2>Список клиентов</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${clients}" var="client">
                <tr onclick="document.location='/client/info/${client.id}'">
                    <td><c:out value="${client.id}"/></td>
                    <td><c:out value="${client.name}"/></td>
                    <td><c:out value="${client.email}"/></td>
                </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>