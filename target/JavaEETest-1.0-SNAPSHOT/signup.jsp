<%--
  Created by IntelliJ IDEA.
  User: Аяулым
  Date: 3/15/2021
  Time: 1:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="head.jsp"  %>
    <title>Registration</title>
</head>
<body>
    <%@ include file="header.jsp"  %>
    <div class="container mt-2">
        <h3>Registration</h3>
        <form action="signup" method="post">
            <div class="form-group">
                <label>Username:</label>
                <input type="uname" class="form-control">
            </div>
            <div class="form-group">
                <label>Password:</label>
                <input type="pwd" class="form-control">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <hr/>
        <p>
            <b>How to sign up as an Artist?</b>
            <br/>
            You should contact to us to consider yourself as Artist. Please email us mail@mail.com
        </p>
    </div>
</body>
</html>
