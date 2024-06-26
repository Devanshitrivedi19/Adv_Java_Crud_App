<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test2 jsp</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<h1>Hello I am test2 JSP</h1>
	No1=<%=request.getParameter("no1") %><br>
	No2=<%=request.getParameter("no2") %>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>