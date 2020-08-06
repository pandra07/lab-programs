<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${msg} welcome</h1>
Trainee found: 
<p>ID: ${trainee.tId }
<p>Name: ${trainee.tName}
<p>Dept ${trainee.dept }

<form action="index.jsp">
 <input type="submit" value="home">
 </form>
</body>
</html>