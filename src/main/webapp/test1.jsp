<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<%
		int no1=100;
		int no2=200;
	%>
	<jsp:forward page="test2.jsp">
	
		<jsp:param value="<%=no1 %>" name="no1"/>
		<jsp:param value="<%=no2 %>" name="no2"/>
	</jsp:forward>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>