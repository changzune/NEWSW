<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	int[]iArr = {10,20,30};
	out.println(iArr);
%>

<%@ include file ="include01.jsp" %>


<%
int i = 10;
String str = "ABCDEF";
%>

<%
out.println("i=" + i + "<br/>");
out.println("str=" + str + "<br/>");
%>


i=<%=i %><br/>
str=<%=str %>


</body>
</html>