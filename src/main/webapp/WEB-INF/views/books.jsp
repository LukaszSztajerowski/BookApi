<%--
  Created by IntelliJ IDEA.
  User: AORUS
  Date: 26.08.2021
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formularz</title>
</head>
<body>
<form method="post" action="/books/add">
    <input name="id" type="number">
    <input name="isbn" type="text">
    <input name="title" type="text">
    <input name="author" type="text">
    <input name="publisher" type="text">
    <input name="type" type="text">
    <button type="submit">Dodaj</button>
</form>
</body>
</html>
