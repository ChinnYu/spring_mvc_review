<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/11/7
  Time: 上午 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="lib/js/jquery-3.3.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn1").click(function () {
                $.post(
                    "getById",
                    {id:"666"},
                    function (data) {
                        $("#msg1").html(data.username+"->"+data.password+"->"+data.card.cardNo);
                });
            });
            $("#btn2").click(function () {
                $.post(
                    "list",
                    function (data) {
                        var lis = "";
                        for (var i=0;i<data.length;i++){
                            lis += "<li>" + data[i].username+"</li>";
                        }
                        $("#msg2").html(lis);
                    });
            });
        });
    </script>
</head>
<body>
    <input type="button" value="獲取對象消息" id="btn1"/>
    <div id="msg1"></div>

    <input type="button" value="獲取對象消息" id="btn2"/>
    <ul id="msg2"></ul>
</body>
</html>
