<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*" %>

<%

    // Declare variables
   int number1 = 0;
    int number2 = 0;
    int sum = 0;
    
    // Get parameters from request
    String num1Param = request.getParameter("number1");
    String num2Param = request.getParameter("number2");

    // Check if parameters are not null and parse integers
    if (num1Param != null && num2Param != null) {
        number1 = Integer.parseInt(num1Param);
        number2 = Integer.parseInt(num2Param);
        sum = number1 + number2;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Add Two Numbers</title>
</head>
<body>
    <h1>Add Two Numbers using JSP</h1>
    <form method="get" action="add.jsp">
        <label for="number1">Number 1:</label>
        <input type="text" name="number1" id="number1" required>
        <br>
        <label for="number2">Number 2:</label>
        <input type="text" name="number2" id="number2" required>
        <br>
        <input type="submit" value="Add">
    </form>

    <%
        // Use expression to display the sum
        if (num1Param != null && num2Param != null) {
    %>
        <h2>Result:</h2>
        <p>The sum of <%= number1 %> and <%= number2 %> is <%= sum %>.</p>
    <%
        }
    %>
</body>
</html>