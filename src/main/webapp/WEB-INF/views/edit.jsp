<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Edit contact</title>
    <link rel="stylesheet" type="text/css" href="resources/main.css"/>
    <script src="/resources/edit.js" language="Javascript" type="application/javascript"></script>
</head>
<body>
<h2>Contact change form</h2>

<form:form name="Form1" method="post" modelAttribute="contact" onsubmit="return checkFormOk()">
    <form:hidden path="id"/>
    <form:hidden path="rating"/>
    <table>
        <tr>
            <td>First Name</td>
            <td><form:input path="firstname" onchange="checkFirstName()" required="true"/></td>
            <td><img id="firstnameImg" src=""></td>
        </tr>
        <tr>
            <td>Last Name</td>
            <td><form:input path="lastname" onchange="checkLastName()" required="true"/></td>
            <td><img id="lastnameImg" src=""></td>

        </tr>
        <tr>
            <td>Email</td>
            <td><form:input path="email" onchange="checkEmail()" required="true"/></td>
            <td><img id="emailImg" src=""></td>

        </tr>
        <tr>
            <td>Telephone</td>
            <td><form:input path="telephone" onchange="checkTelephone()" required="true"/></td>
            <td><img id="telephoneImg" src=""></td>
        </tr>
        <tr>
            <td colspan="3"><a id="message" class="error"></a></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="button" onclick="window.location='/index'" value="Cancel">
                <c:choose>
                    <c:when test="${add}">
                        <input type="submit" value="Add contact" onclick="add()"/>
                    </c:when>
                    <c:otherwise>
                        <input type="submit" value="Save contact" onclick="update()"/>
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
