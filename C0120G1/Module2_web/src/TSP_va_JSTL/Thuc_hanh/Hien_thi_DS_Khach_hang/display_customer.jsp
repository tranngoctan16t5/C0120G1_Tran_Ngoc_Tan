<%--
  Created by IntelliJ IDEA.
  User: NGOCTAN
  Date: 3/30/2020
  Time: 8:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="customer.css">
</head>
<body>
<div class="container">
    <table cellpadding="10px" cellspacing="0">
        <h2>Danh sách khách hàng</h2>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Hình ảnh</th>
        </tr>
<%--        <c:forEach items="${listcustomer}" var="customer">--%>
<%--            <tr>--%>
<%--                <td>${customer.name}</td>--%>
<%--                <td>${customer.hireDate}</td>--%>
<%--                <td>${customer.address}</td>--%>
<%--                <td><img src="${customer.image}" alt=""></td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
    </table>
</div>

</body>
</html>
