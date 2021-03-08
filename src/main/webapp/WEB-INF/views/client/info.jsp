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
<form:form method="POST" action="/client/edit" modelAttribute="client">
    <form:input path="id"                   value="${client.id}"               type="hidden"/><br/>

    <form:input path="name"                 value="${client.name}"              /><br/>
    <form:input path="telephoneNumber"      value="${client.telephoneNumber}"   /><br/>
    <form:input path="email"                value="${client.email}"             /><br/>
    <form:input path="passportNumber"       value="${client.passportNumber}"    /><br/>
    <input type="submit" value="Сохранить"/>
</form:form>
<form:form method="POST" action="/client/info/${client.id}/remove">
    <input type="submit" value="удалить"/>
</form:form>
<a href="/">На главную</a>
</body>
</html>