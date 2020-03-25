<%--
  Created by IntelliJ IDEA.
  User: NGOCTAN
  Date: 3/24/2020
  Time: 8:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World</h1>
<input type="text" name="txt1" value="">
Bien JSTL:<c:set var="bien" value="9" scope="page"/>
In ra JSTL <c:out value="${bien}"/>
Xoa JSTL: <c:remove var="${bien}"/>
in ra lan 2:<c:out value="${bien}"/>

</body>
</html>
