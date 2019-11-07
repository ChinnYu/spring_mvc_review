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
    <form action="upload" method="post" enctype="multipart/form-data">
        <label for=""><input type="file" name="file"/></label>
        <label for=""><input type="text" name="desc"/></label>
        <button>上傳</button>
    </form>

</body>
</html>
