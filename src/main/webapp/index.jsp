<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <link href="css/style.css" rel="stylesheet" type="text/css">
    <title>intro</title>

</head>

<body>
<h2>Hello World!</h2>

<h3>
    <c:out value="${message}"/>
</h3>
<div class="container">
    <div>
        <a class="button button1" href="/view/create/createMenu.html">Создать новые записи</a>
    </div>
</div>
<form method="post" action="/hello">
    <h3>Type your message here</h3>
    <input type="text" name="inputMessage"><br>
    <input type="submit" value="Print message">
</form>
</body>
</html>
