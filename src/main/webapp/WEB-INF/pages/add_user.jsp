<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>添加用户</title>
</head>
<body>
<%--<form action="/result", method="POST">
    姓名:<input type="text" name="name"/><br/>
    年龄:<input type="text" name="age"/><br/>
    <input type="submit" name="提交">

</form>--%>
<form:form action="result" method="post" modelAttribute="user">
    姓名:<form:input path="name" />
    年龄:<form:input path="age" />
    <input type="submit">
</form:form>
</body>
</html>