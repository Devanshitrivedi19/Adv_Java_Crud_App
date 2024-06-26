<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Objects</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<%
		String lang1=config.getInitParameter("lang1");
		out.print("<b>lang1 : </b>"+lang1+"</br>");
		
		String lang2=application.getInitParameter("lang2");
		out.print("<b>lang2 : </b>"+lang2);
	%>
	<%@include file="Footer.jsp" %>
</body>
</html>