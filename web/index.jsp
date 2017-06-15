<%--

  Login page

--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Call Rec</title>
    <link rel="stylesheet" type="text/css" href="./CSS/style.css">
</head>
<body>
<div class="login">
    <h1>Login</h1>
    <form action="./CallRec" method="post">
        <input type="text" name="login" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">Login</button>
    </form>
</div>

<h3>${requestScope.msg}</h3>
</body>
</html>
