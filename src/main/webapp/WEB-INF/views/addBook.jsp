<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Book</title>
</head>
<body>

<form:form method="post" modelAttribute="book" action="/books/add">
Dodaj książkę:

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
<input type="submit" value="Dodaj Książkę">
</form:form>

</body>
</html>
