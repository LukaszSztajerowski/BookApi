<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Lista Książek</title>
</head>
<body>
<a href="<c:url value="/books/add"/>">Dodaj</a>
<table>
    <thead>
    <th>isbn</th>
    <th>Tytuł</th>
    <th>Autor</th>
    <th>Edycja</th>
    <th>Usuń</th>
    <th>Pokaż książkę</th>

    </thead>
    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td><c:out value="${book.isbn}"/></td>
            <td><c:out value="${book.title}"/></td>
            <td><c:out value="${book.author}"/></td>
            <td><a href="<c:out value="/admin/books/edit/${book.id}"/>">Edytuj</a></td>
            <td><a href="<c:out value="/admin/books/delete/${book.id}"/>">Usuń</a></td>
            <td><a href="<c:out value="/admin/books/show/${book.id}"/>">Pokaż</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>

