<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Oto Twoja książka</title>
</head>
<body>
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
    <tr>
    <td>${book.isbn}</td>
    <td>${book.title}</td>
    <td>${book.author}></td>

</tbody>
</table>
</body>
</html>
