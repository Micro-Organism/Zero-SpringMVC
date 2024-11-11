<%@ page pageEncoding="utf-8" %>
<html>
<head>
    <meta charset="utf-8">
</head>
<body>
<%--get请求--%>
<form action="/hello/get.do" method="get">
    <input type="submit" value="get请求">
</form>
<br>
<%--post请求--%>
<form action="/hello/post.do" method="post">
    <input type="submit" value="post请求">
</form>
<br>
<%--put请求--%>
<form action="/hello/put.do" method="post">
    <input type="hidden" name="_method" value="put">
    <input type="submit" value="put请求">
</form>
<br>
<%--delete请求--%>
<form action="/hello/delete.do" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="delete请求">
</form>
<br>
<%--params请求--%>
<form action="/hello/params.do" method="post">
    <p>名称：<input type="text" name="username"></p>
    <p>年龄：<input type="text" name="age"></p>
    <input type="submit" value="params请求">
</form>
<br>
<%--consumes请求--%>
<script src="https://cdn.bootcdn.net/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<button id="btn">consumes/produces请求</button>
<script>
    $(function () {
        $("#btn").click(function () {
            // $.ajax({
            //     url: "/hello/consumes.do",
            //     type: "post",
            //     headers: {
            //         "Content-Type": "application/json"
            //     }
            // });
            //
            // $.ajax({
            //     url: "/hello/produces.do",
            //     type: "post",
            //     headers: {
            //         "Accept": "application/json"
            //     }
            // });
            // let user = {
            //     name: "zhangsan",
            //     age: 18
            // }
            // $.ajax({
            //     url: "/hello/getParam3.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(user)
            // });

            // let arr = ["zhangsan", "lisi"]
            // $.ajax({
            //     url: "/hello/getParam4.do",
            //     type: "post",
            //     data: {
            //         array: arr
            //     }
            // });

            // let arr = ["zhangsan", "lisi"]
            // $.ajax({
            //     url: "/hello/getParam4.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(arr)
            // });

            // let arr = ["zhangsan", "lisi"]
            // $.ajax({
            //     url: "/hello/getParam5.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(arr)
            // });

            // let map = {
            //     "key1": "value1",
            //     "key2": "value2",
            //     "key3": "value3"
            // }
            // $.ajax({
            //     url: "/hello/getParam5.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(map)
            // });

            // let map = {
            //     "key1": "value1",
            //     "key2": "value2",
            //     "key3": "value3"
            // }
            // $.ajax({
            //     url: "/hello/getParam5.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: {
            //         map: JSON.stringify(map)
            //     }
            // })

            // let arr = ["zhangsan", "lisi"];
            // $.ajax({
            //     url: "/hello/getParam4.do",
            //     type: "get",
            //     data: {
            //         array: arr
            //     }
            // });

            // let list = ["zhangsan", "lisi"];
            // $.ajax({
            //     url: "/hello/getParam5.do",
            //     type: "post",
            //     data: {
            //         list: list
            //     }
            // });

            // let set = ["zhangsan", "lisi"];
            // $.ajax({
            //     url: "/hello/getParam6.do",
            //     type: "post",
            //     data: {
            //         set: set
            //     }
            // });

            // let set = ["zhangsan", "lisi"];
            // $.ajax({
            //     url: "/hello/getParam6.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(set)
            // });
            // let map = {
            //     "name1": "zhangsan",
            //     "name2": "lisi"
            // };
            // $.ajax({
            //     url: "/hello/getParam7.do",
            //     type: "post",
            //     contentType: "application/json",
            //     data: JSON.stringify(map)
            // });
        });
    });
</script>
<br>
</body>
</html>
