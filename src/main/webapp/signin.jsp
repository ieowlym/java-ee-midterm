<%--
  Created by IntelliJ IDEA.
  User: Аяулым
  Date: 3/15/2021
  Time: 1:49 AM
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
    <h3>Log In</h3>
    <form action="signin">
        <div class="form-group">
            <label for="uname">Username:</label>
            <input type="uname" class="form-control" id="uname">
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="pwd" class="form-control" id="pwd">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
