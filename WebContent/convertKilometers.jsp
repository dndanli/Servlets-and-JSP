<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kilometers to Miles</title>
</head>
<body>

	<h1>KPH to MPH Converter</h1>
    <form action="getKphToMphServlet" method="post">
        Enter the Kilometer per hour you would like to convert to Miles per hour
        <input type="text" name="userKph" size="10">
        <input type = "submit" value = "Convert to MPH" />
    </form>

</body>
</html>