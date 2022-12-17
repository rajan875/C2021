<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h1>home controller</h1>

<% 
String name=(String)request.getAttribute("name");
Integer age=(Integer)request.getAttribute("age");

%>

<h1>my name is <%=name %> age is <%=age %></h1>
</body>
</html>