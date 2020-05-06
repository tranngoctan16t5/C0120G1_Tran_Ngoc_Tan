<%--
  Created by IntelliJ IDEA.
  User: NGOCTAN
  Date: 3/28/2020
  Time: 8:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Thực hiện phép chia</h1>
<form action="">
    So 1:<input type="text" name="txtSo1" value="${param.txtSo1}"/><br>
    So 2:<input type="text" name="txtSo2" value="${param.txtSo2}"/><br>
    <c:catch var="ex" >
    <c:if test="${not empty param.txtSo1 and not empty param.txtSo2}">
        <c:set var="ketqua" value="${param.txtSo1/param.txtSo2}"/>
        <c:out value="${ketqua}"/>
    </c:if>
    </c:catch>
    <input type="submit" name="btnSubmit" value="Chia"><br>
    <c:if test="${not empty ex}">
        Loi:<c:out value="${ex}"/>
    </c:if>
</form>
</body>
</html>
