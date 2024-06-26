<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration</title>
</head>
<body>
	<%@include file="header.jsp" %>
	<form action="InsertStudentServlet">
	
	<table>
		<tr>
		<td>Name:</td>
		<td><input type="text" name="name" value=${name}>${errName}</td>		
		</tr>
		<tr>
		<td>Std:</td>
		<td><input type="text" name="std" value=${std}>${errStd}</td>	
		</tr>
		<tr>
		<td>Marks:</td>
		<td><input type="text" name="marks" value=${marks}>${errMarks}</td>	
		</tr>
		<tr></tr>
		<tr>
		<td>Hobbies:</td>
		<td><input type="checkbox" name="hobbies" value="Reading"/>Reading</td>	
		<td><input type="checkbox" name="hobbies" value="Travelling"/>Travelling</td>	
		<td><input type="checkbox" name="hobbies" value="Blogging"/>Blogging</td>
		<td><input type="checkbox" name="hobbies" value="Hiking"/>Hiking</td>		
		</tr>
		<tr>
		<td></td>
		<td><input type="submit"/></td>	
		</tr>
	</table>
	
	</form>
</body>
</html>