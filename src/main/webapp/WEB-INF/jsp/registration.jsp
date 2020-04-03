<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Registration</title>
    <style>
        .error {
            color: red;
        }

        .error-block {
            color: black;
            background-color: red;
            border: 3px solid indianred;
            padding: 8px;
            margin: 16px;
        }
    </style>
</head>
<body>
<h1><spring:message code="registration"/></h1>
<form:form modelAttribute="registration">
    <form:errors path="*" cssClass="error-block" element="div"/>
    <table>
        <tr>
            <td><spring:message code="name"/>:</td>
            <td><form:input path="name"/></td>
            <td><form:errors path="name" cssClass="error"/></td>
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
