<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>

	<p>${userKphToMph.getUserInputKph()} Kilometers equals to <br> </p>
	<p>${userKphToMph.getMiles()} Miles <br> </p>
	<a href = "index.jsp">Convert a different Unit</a>
	
</body>
</html>