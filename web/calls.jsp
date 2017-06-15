<%--

  View for table calls

--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calls</title>
</head>
<body>

<%
    String value = (String) session.getAttribute("login");
%>

Session: <font color="green"><%=value%></font>

<br/>
<br/>
<br/>

<table border="1">
    <tr>
        <th>Дата и время</th>
        <th>Источник</th>
        <th>Назначение</th>
        <th>Длительность</th>
        <th>Запись</th>
    </tr>
    <c:forEach var="call" items="${requestScope.calls}">
        <tr>
            <td>${call.callDate}</td>
            <td>${call.src}</td>
            <td>${call.dst}</td>
            <td>${call.billsec}</td>
            <td><a href="./CallFile?path=${call.recordingfile}" onclick="window.open(this.href, 'mywin','left=40,top=40,width=310,height=15,toolbar=0,resizable=1'); return false;">Файл</a></td>
        </tr>
    </c:forEach>

<h3><a href="./logout.jsp?logout=true">Logout</a></h3>

</table>
</body>
</html>
