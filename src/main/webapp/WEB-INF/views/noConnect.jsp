<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Here goes nothing</title>
    <link rel="stylesheet" type="text/css" href="resources/main.css"/>
    <style>
        .inset {
            border-style: inset;
            border-color: gainsboro;
            border-radius: 25px;
            border-width: 4px;
            padding: 25px 25px;
        }
    </style>
</head>
<body>
<div class="inset">
    <h2 class="error">500 Error - no Database connection</h2>
    Something went wrong with database on server... Sorry.
    <br>

    <form>
        <input Type="button" value="Back" onClick="history.go(-1);return true;">
        <input type="button" value="Main" onclick="window.location='/index'">
    </form>
</div>
</body>
</html>
