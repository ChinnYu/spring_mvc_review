<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/11/7
  Time: 下午 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="user/saveOrUpdate" method="post">
        <input type="hidden" name="_method" value="PUT">
        <input type="hidden" value="1" name="id">
        username:<input type="text" name="username">
        password:<input type="text" name="password">
        <input type="submit" value="修改">
    </form>
</body>
</html>
