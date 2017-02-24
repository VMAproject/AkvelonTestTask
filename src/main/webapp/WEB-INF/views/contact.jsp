<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Contact Base</title>
    <link rel="stylesheet" type="text/css" href="resources/main.css"/>
    <link rel="stylesheet" type="text/css" href="resources/datagrid.css"/>
    <script src="/resources/ajax.js" language="Javascript" type="application/javascript"></script>
    <script language="Javascript" type="application/javascript">
        <!--
        function deleteRows() {
            document.Form1.action = "/delete";
            document.Form1.submit();             // Submit the page
        }

        function edit() {
            if (document.querySelectorAll('input[type="checkbox"]:checked').length <= 1) {
                document.Form1.action = "/edit";
                document.Form1.submit();             // Submit the page
            } else {
                alert("Please select just one row to be edited");
            }
        }

        function getTable() {
            microAjax("datagrid", function (msg) {
                //msg is the HTML received from server
                document.getElementById('datagrid').innerHTML = msg;
            });
        }
        window.onload = function () {
            getTable();
        };
        -->



    </script>
    <noscript>You need Javascript enabled for this to work</noscript>
</head>
<body>
<h2>Contact Base</h2>
<form name="Form1" method="POST">
    <div id="datagrid"></div>
    <input type="button" onclick="deleteRows()" value="Delete">
    <input type="button" onclick="edit()" value="Edit">
    <input type="button" onclick="getTable()" value="Refresh">
</form>
</body>
</html>