<%--
  Created by IntelliJ IDEA.
  User: NGOCTAN
  Date: 3/30/2020
  Time: 7:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- Khai báo sử dụng JSTL Core Tags -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Departments and Employees</h2>

<!-- Dùng for để duyệt trên các phòng ban (departments) -->
<c:forEach items="${listdept}" var="dept">
    <h3>${dept.deptName}</h3>
    <ul>
        <!-- Dùng for để duyệt trên các nhân viên
                    thuộc phòng ban hiện tại -->
        <c:forEach items="${dept.employees}" var="emp">
            <li>
                    ${emp.empName} - (${emp.job})
            </li>
        </c:forEach>
    </ul>

</c:forEach>

</body>
</html>
