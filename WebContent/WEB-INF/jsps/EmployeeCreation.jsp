<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/submit" method="post">

EMP NAME :- <input type="text" name="empName">
EMP COUNTRY :- <input type="text" name="empCountry">
EMP COUNTRY :-<input type="text" name="empProfession">
<button onclick="submit" title="Submit"></button>
</form>
</body>
</html>