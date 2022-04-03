<%--
  Created by IntelliJ IDEA.
  User: jawad
  Date: 3/23/2022
  Time: 12:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tee-Shirt requests</title>
</head>
<body>
<h1>Which tee-shirts would you like to buy?</h1>
<form method="post" action="task3Servlet">
    <select name="tee-choice-1">
        <option value="None" selected>No choice for first option</option>
        <option value="GoruParty">Goru Party Tee-shirt</option>
        <option value="Farewell">Farewell Tee-shirt</option>
        <option value="Picnic">Picnic Tee-shirt</option>
        <option value="Iutian">IUTIAN Tee-shirt</option>
    </select>
    <br>
    <select name="tee-choice-2">
        <option value="None" selected>No choice for second option</option>
        <option value="GoruParty">Goru Party Tee-shirt</option>
        <option value="Farewell">Farewell Tee-shirt</option>
        <option value="Picnic">Picnic Tee-shirt</option>
        <option value="Iutian">IUTIAN Tee-shirt</option>
    </select>
    <br>
    <select name="tee-choice-3">
        <option value="None" selected>No choice for third option</option>
        <option value="GoruParty">Goru Party Tee-shirt</option>
        <option value="Farewell">Farewell Tee-shirt</option>
        <option value="Picnic">Picnic Tee-shirt</option>
        <option value="Iutian">IUTIAN Tee-shirt</option>
    </select>
    <br>
    <input type="submit" value="Place Request">
</form>
</body>
</html>
