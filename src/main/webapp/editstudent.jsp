<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='UpdateStudentServlet'>

	<table>
	
	<%
	StudentBean s= (StudentBean)request.getAttribute("OldStudentRecord");
	
	%>
	<tr>
	<td>Rno:</td>	
	<td><input type='text' value=<%= s.getRno()%> name='rno'/></td>	
	</tr>
	<tr>
	<td>Name:</td>
	<td><input type='text' value=<%= s.getName()%> name='name'/></td>
	</tr>
	<tr>
	<td>Std:</td>
	<td><input type='text' value="<%=s.getStd() %>" name='std'/></td>
	</tr>
	<tr>
	<td>Marks:</td>
	<td><input type='text' value="<%=s.getMarks() %>" name='marks'/></td>
	</tr>
	<tr></tr>
	<tr>
	<td>Hobbies:</td>
	<td><input type='checkbox' name='hobbies' value='Reading'/>Reading</td>
	<td><input type='checkbox' name='hobbies' value='Travelling'/>Travelling</td>
	<td><input type='checkbox' name='hobbies' value='Blogging'/>Blogging</td>
	<td><input type='checkbox' name='hobbies' value='Hiking'/>Hiking</td>
	</tr>
		<tr>
		<td></td>
		<td><input type='submit'/></td>
		</tr>
		</table>
		</form>

</body>
</html>