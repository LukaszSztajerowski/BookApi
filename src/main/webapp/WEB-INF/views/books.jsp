<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>formularz</title>
</head>
<body>
<form method="post" action="/books">
id
    <input name="id" type="number">
    isbn:
    <input name="isbn" type="text">
    title:
    <input name="title" type="text">
    author:
    <input name="author" type="text">
    publisher:
    <input name="publisher" type="text">
    type:
    <input name="type" type="text">
    <button type="submit">Dodaj</button>
</form>
</body>
</html>
