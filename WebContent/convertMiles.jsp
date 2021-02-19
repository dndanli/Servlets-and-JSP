<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Miles to Kilometers</title>
</head>
<body>

    <h1>MPH to KPH Converter</h1>
    <form action="getMphToKphServlet" method="post">
        Enter the Miles per hour you would like to convert to Kilometer per hour
        <input type="text" name="userMph" size="10">
        <input type = "submit" value = "Convert to KPH" />
    </form>
    
</body>
</html>