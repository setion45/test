<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="ru">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP List Users Records</title>
</head>
<body>
<form:form method="POST" action="/client/add" modelAttribute="client" >
    <form:input path="name"            type="text"     value="${client.name}"              /><br/>
    <form:input path="telephoneNumber" type="text"     value="${client.telephoneNumber}"   /><br/>
    <form:input path="email"           type="text"     value="${client.email}"             /><br/>
    <form:input path="passportNumber"  type="text"     value="${client.passportNumber}"    /><br/>
    <input type="submit" value="Сохранить"/>
</form:form>
<a href="/">На главную</a>
</body>
</html>
