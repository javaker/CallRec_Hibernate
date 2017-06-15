<%--

  Logout page

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logout</title>
</head>
<body>
Good Bye
</body>
</html>

<%
    System.out.println(session.getId());
    session.invalidate();
    response.sendRedirect("./index.jsp");
%>