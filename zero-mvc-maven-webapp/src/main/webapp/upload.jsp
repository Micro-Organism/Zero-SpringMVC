<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload page</title>
</head>
<body>
<form action="/hello/upload.do" method="post" enctype="multipart/form-data">
    文件上传：<input type="file" name="file"><input type="submit" value="上传">
</form>
</body>
</html>
