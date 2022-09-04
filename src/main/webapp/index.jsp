<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        input, select {
            position: absolute;
            left: 150px;
        }
    </style>
</head>
<body>

<h1>Simple Calculator</h1>
<fieldset>
    <legend>Calculator</legend>
    <form action="calculation" method="post">

        First operand: <input name="first" type="number"><br><br>

        Operator:
        <select name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select><br><br>

        Second operand: <input name="second" type="number"><br><br>

        <input style="position: static" type="submit">

    </form>
</fieldset>

</body>
</html>