<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/login.do" method="post">
    <p>
        <spring:message code="i18n.username"/>
        <input type="text" name="username">
    </p>
    <p>
        <spring:message code="i18n.password"/>
        <input type="text" name="password">
    </p>
</form>
<p>
    <a href="/hello/loginPage.do?lang=zh_CN">切换为中文</a>
    <a href="/hello/loginPage.do?lang=en_US">切换为英文</a>
</p>
</body>
</html>