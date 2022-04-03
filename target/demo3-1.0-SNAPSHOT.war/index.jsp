<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<h1>Task 1
</h1>
<br/>
<form method="post" action="hello-servlet">
    ID: <input type="text" name="id-field">
    <input type="submit" value="Submit">
</form>

<a href="hello-servlet">Hello Servlet</a>
<br/>
<h1>task 2</h1>
<form method="post" action="task2Servlet">
    <input type="number" name="id1" >
    <input type="number" name="id2" >
    <input type="submit" value="Submit">
</form>
<a href="task2Servlet">Task 2</a>


</br>
<h1>Task 3</h1>
<a href="requests.jsp"> Go To Shop</a></body>
</html>