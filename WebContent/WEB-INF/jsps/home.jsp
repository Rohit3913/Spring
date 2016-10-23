<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:query var="rs" dataSource="jdbc/Spring">
select Name,CountryCode bar from city
</sql:query>
	<%-- <table>
		<thead>
			<tr>
				<td>NAME</td>
				<td>Country</td>
			</tr>
		</thead>
		<c:forEach var="row" items="${rs.rows}">
			<tr>
				<td>${row.Name}</td>
				<td>${row.CountryCode}</td>
			</tr>
		</c:forEach>
	</table> --%>
	<table border="2px">
		<c:forEach var="emp" items="${empList }">
			<tr>
				<td>${emp.name}</td>
				<td>${emp.countryCode}</td>
				<td>${emp.population}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>