<%@ page import="com.yanzi.db.entities.UsersEntity" %>
<%@ page import="java.util.List" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>users</title>
</head>
<body>
<ol>
    <% for(UsersEntity e : (List<UsersEntity>)request.getAttribute("users")){%>
    <li>名字,<%out.print(e.getName());%> 年龄, <%out.print(e.getAge());%></li>
    <%}%>
</ol>
<a href="/adduser">添加用户</a>
</body>
</html>