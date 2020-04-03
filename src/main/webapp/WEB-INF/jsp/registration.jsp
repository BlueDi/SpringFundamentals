<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1><spring:message code="registration"/></h1>
<form:form modelAttribute="registration">
    <table>
        <tr>
            <td><spring:message code="name"/>:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <spring:message code="save.registration" var="inputText"/>
                <input type="submit" value="${inputText}"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
