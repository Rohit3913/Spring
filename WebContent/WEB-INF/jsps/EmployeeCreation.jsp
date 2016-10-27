<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.error {
   color: red;
}

h1 {
    color: maroon;
    margin-left: 40px;
} 
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="${pageContext.request.contextPath}/submit" method="post" commandName="employee">

EMP NAME :- <sf:input type="text" name="empName" path="empName"/><sf:errors path="empName" class="error"></sf:errors><br>
EMP COUNTRY :- <sf:input type="text" name="empCountry" path="empCountry"/><br>
<sf:errors path="empProfession" class="error"></sf:errors><br>
EMP Profession :-<sf:input type="text" name="empProfession" path="empProfession"/><br>
<button onclick="submit" value="Submit"></button>
</sf:form>
</body>
</html>