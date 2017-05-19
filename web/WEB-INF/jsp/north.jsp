<%--
  Created by IntelliJ IDEA.
  User: 万洪基
  Date: 2016/12/26
  Time: 10:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<div style="text-align: center;font-family: 微软雅黑;font-size: 25px;" >班级管理系统
    <c:if test="${user != null}">
        <span style="color: #6bff1f;display:block; width: 300px; float:right; text-align:right;font-family: 微软雅黑;font-size: 16px;">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;当前用户：&nbsp;&nbsp;&nbsp;&nbsp;${user}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a style="text-decoration: none;color: #6bff1f" href="#" onclick="logout()">登出</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        </span>
    </c:if>
</div>
</body>
</html>
