<%@page import="com.royal.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Students List</title>
</head>
<body>
	<%@include file="header.jsp" %>
    <table border="1">
        <tr>
            <td>Rno</td>
            <td>Name</td>
            <td>Std</td>
            <td>Marks</td>
            <td>Hobbies</td>
            <td>Actions</td>
        </tr>
        <%
            ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
            for (int i = 0; i < list.size(); i++) {
                StudentBean s = list.get(i);
        %>
            <tr>
                <td><%= s.getRno() %></td>
                <td><%= s.getName() %></td>
                <td><%= s.getStd() %></td>
                <td><%= s.getMarks() %></td>
                <td>
                    <% 
                        String[] hobbies = s.getHobbies();
                        if (hobbies != null && hobbies.length > 0) {
                            for (int j = 0; j < hobbies.length; j++) {
                                out.print(hobbies[j]);
                                if (j < hobbies.length - 1) {
                                    out.print(", "); 
                                }
                            }
                        }
                    %>
                </td>
                <td>
                    <a href="EditStudentServlet?rno=<%= s.getRno()%> ">Edit</a> | 
                    <a href="DeleteStudentServlet?rno=<%= s.getRno() %>">DELETE</a>
                </td>
            </tr>
        <% } %>
        
    </table>
    <%@include file="Footer.jsp" %>
</body>
</html>
