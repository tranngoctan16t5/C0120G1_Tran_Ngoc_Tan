<%--
  Created by IntelliJ IDEA.
  User: NGOCTAN
  Date: 3/20/2020
  Time: 6:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<head>
    <title>Dictionary</title>

</head>
<body>
<h2>Viet Nam dictionary</h2>
<form action="/translate" method="post">
    <input type="text" name="txtSearch" placeholder="Enter your word:">
    <input type="submit" id="submit" value="Search">
</form>
</body>
</html>
