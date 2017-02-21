<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<table>
    <caption>Contacts</caption>
    <tr>
        <th width="2%">&nbsp;</th>
        <th width="20%">Name</th>
        <th width="20%">Email</th>
        <th width="18%">Telephone</th>
        <th width="25%">Creation time</th>
    </tr>
    <c:if test="${!empty contactList}">
        <c:forEach items="${contactList}" var="contact" varStatus="status">
            <tr <c:if test="${status.index%2 == 1}">class="alt"</c:if>>
                <td align="center">
                    <input type="checkbox" name="checkboxGroup"  value="<c:out value="${contact.id}"/>"/>
                </td>
                <td>${contact.firstname} ${contact.lastname}</td>
                <td>${contact.email}</td>
                <td>${contact.telephone}</td>
                <td><fmt:formatDate value="${contact.creationDate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>
