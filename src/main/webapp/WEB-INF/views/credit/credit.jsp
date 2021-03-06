<%--
  Created by IntelliJ IDEA.
  User: grifo
  Date: 01.03.2021
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Список кредитов</title>
</head>
<body>
<div>
    <table>
        <caption><h2>Список кредитов</h2></caption>
        <tr>
            <th>ID</th>
            <th>Кредитный лимит</th>
            <th>Процентная ставка</th>
        </tr>
        <c:forEach items="${credits}" var="credit">
            <tr onclick="document.location='/client/info/${credit.id}'">
                <td><c:out value="${credit.id}"/></td>
                <td><c:out value="${credit.limit}"/></td>
                <td><c:out value="${credit.interestRate}"/> %</td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
