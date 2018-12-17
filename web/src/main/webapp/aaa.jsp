<%--
  Created by IntelliJ IDEA.
  User: Asuser
  Date: 2018/12/15
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>进来了</h4>
<c:forEach items="${list}" var="user">
    ${user.id}
</c:forEach>
</body>
</html>
