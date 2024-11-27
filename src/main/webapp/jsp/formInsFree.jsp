<%--
  Created by IntelliJ IDEA.
  User: rubin
  Date: 25/11/2024
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form </title>
</head>
<body>
<h1>Form Inserimento Freelancer</h1>
  <form action="formInsFree"  method="POST">
    <input type="text" name="name" placeholder="Nome" /><br/><br/>
    <input type="text" name="surname" placeholder="Cognome" /><br/><br/>
    <input type="text" name="p_iva" placeholder="Partita Iva" /><br/><br/>
    <input type="number" name="age" placeholder="Eta" /><br/><br/>
    <input type="submit" value="Inserisci Freelancer" />
  </form>
<br/>
<br/>
<a href="index.jsp">Home</a>
</body>
</html>
