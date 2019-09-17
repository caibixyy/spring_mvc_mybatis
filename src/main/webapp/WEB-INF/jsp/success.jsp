
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>访问成功</h1>
<hr>
<table>
    <th>账户</th>
    <th>密码</th>
    <c:forEach items="${model}" var="user">
        <tr>
            <td>${user.user_account}</td>
            <td> ${user.user_password}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
