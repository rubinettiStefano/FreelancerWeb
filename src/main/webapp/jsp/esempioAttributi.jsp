<%--
  Created by IntelliJ IDEA.
  User: rubin
  Date: 26/11/2024
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% boolean darkTheme = (boolean) request.getAttribute("temaScuro"); %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="../css/grafica.css" />
</head>
<body>
    <%if(!darkTheme){%>
        <h1>Ciao Mondo bellissimo con tema chiaro</h1>
    <%}else{ %>
        <h1 style="color: white; background-color: indigo">Ciao Mondo bellissimo con tema scuro</h1>
    <%}%>
</body>
</html>
