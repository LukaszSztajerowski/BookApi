<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edycja ksiązki</title>
</head>
<body>
<form:form method="post" modelAttribute="book" action="/books/edit/${id}">
    Edytuj książkę:
    <form:
    isbn:       <form:input path="isbn"/>
    <form:errors path="isbn"/><br/>
    tytuł:      <form:input path="title"/>
    <form:errors path="title"/><br/>
    autor:      <form:input path="author"/>
    <form:errors path="author"/><br/>
    wydawnictwo: <form:input path="publisher"/>
    <form:errors path="publisher"/><br/>
    kategoria:  <form:input path="type"/>
    <form:errors path="type"/><br/>
    <input type="submit" value="Edytuj Książkę">
</form:form>
</body>
</html>
