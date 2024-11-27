<%@ page import="com.generation.freelancerweb.model.entities.Freelancer" %><%--
  Created by IntelliJ IDEA.
  User: rubin
  Date: 27/11/2024
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Freelancer f = (Freelancer) request.getAttribute("freelancer");
    boolean modifica = (boolean) request.getAttribute("modifica");

%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% if(!modifica){ %>
        <h1><%=f.getName()%> <%=f.getSurname()%></h1>
        <h2>Età: <%=f.getAge()%> </h2>
        <h2>P_iva: <%=f.getP_iva()%> </h2>
        <h2>Numero Contratti: <%=f.getContracts().size()%></h2>


        <form action="udFreelancer" method="POST">
            <input type="hidden" name="id" value="<%=f.getId()%>" />
            <input type="hidden" name="cmd" value="delete" />
             <input type="submit" value="CANCELLA" />
        </form>
        <a href="dettaglioFreelancer?id=<%=f.getId()%>&modifica=true">MODIFICA</a>
    <%}else{%>
        <form action="udFreelancer" method="POST">
            <input type="hidden" name="id" value="<%=f.getId()%>" />
            <input type="hidden" name="cmd" value="update" />
            <input type="text" name="name" value="<%=f.getName()%>" /><br/><br/>
            <input type="text" name="surname" value="<%=f.getSurname()%>" /><br/><br/>
            <input type="text" name="p_iva" value="<%=f.getP_iva()%>"/><br/><br/>
            <input type="number" name="age" value="<%=f.getAge()%>" /><br/><br/>
            <input type="submit" value="SALVA MODIFICA" />
        </form>

        <a href="dettaglioFreelancer?id=<%=f.getId()%>">Annulla Modifica</a>

    <%}%>

    <a href="mostraTuttiFreelancer">torna a tutti</a>
</body>
</html>
