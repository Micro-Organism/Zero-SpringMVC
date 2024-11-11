<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title></title>
</head>
<body>
<form action="/hello/submit.do" method="post">
    <p>
        名称：<input type="text" name="name">
    </p>
    <p>
        年龄：<input type="number" name="age">
    </p>
    <p>
        生日：<input type="text" name="birthday" value="2020-02-02 10:10:10">
    </p>
    <p>
        <input type="submit" value="提交">
    </p>
</form>
</body>
</html>