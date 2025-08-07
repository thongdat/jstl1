<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h1>Simple Calculator</h1>

<form method="get" action="calculate">
    First operand:
    <input type="number" name="first" value="${first}"><br>

    Operator:
    <select name="operator">
        <option value="+" ${operator == '+' ? 'selected' : ''}>+</option>
        <option value="-" ${operator == '-' ? 'selected' : ''}>-</option>
        <option value="*" ${operator == '*' ? 'selected' : ''}>*</option>
        <option value="/" ${operator == '/' ? 'selected' : ''}>/</option>
    </select><br>

    Second operand:
    <input type="number" name="second" value="${second}"><br><br>

    <input type="submit" value="Calculate">
</form>

<c:if test="${not empty result}">
    <h2>Result: ${first} ${operator} ${second} = ${result}</h2>
</c:if>

</body>
</html>
