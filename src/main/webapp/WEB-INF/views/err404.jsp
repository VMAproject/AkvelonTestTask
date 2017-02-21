<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Here goes nothing</title>
    <link rel="stylesheet" type="text/css" href="resources/main.css"/>
</head>
<body>
<h2 class="error">404 Error - page don't exist</h2>
There are nothing here.
<br>

<form>
    <input Type="button" value="Back" onClick="history.go(-1);return true;">
    <input type="button" value="Main" onclick="window.location='/index'">
</form>
</body>
</html>
