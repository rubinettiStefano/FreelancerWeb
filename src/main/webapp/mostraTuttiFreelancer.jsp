<%@ page import="com.generation.freelancerweb.model.entities.Freelancer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Freelancer> freelancers =
            (List<Freelancer>) request.getAttribute("freelancersAttr");
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Lista di Freelancer</h1>
    <%
        for(Freelancer f : freelancers)
        {
    %>
        <h2>
            <img src="https://picsum.photos/35" />
            <%=f.getName()%> <%=f.getSurname()%> <%=f.getAge()%> anni
        </h2>

    <%  } %>
<br/>
<br/>
    <a href="index.jsp">Home</a>
</body>
</html>
