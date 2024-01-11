<%--
  Created by IntelliJ IDEA.
  User: khalv
  Date: 10.01.2024
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Challenge Page</title>
</head>
<body>
<h1>Add new User</h1>
<form action="/challengePage" method="post">
    FirstName : <input type="text" name="name"><br>
    Age : <input type="number" name="age"><br>
    Email : <input type="text" name="email"><br>
    <input type="submit" value="Add">
</form>


</body>
</html>
