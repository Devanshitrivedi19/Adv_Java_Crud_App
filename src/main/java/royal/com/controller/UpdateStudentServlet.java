package royal.com.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int rno=Integer.parseInt(request.getParameter("rno"));
		String name=request.getParameter("name");
		String std=request.getParameter("std");
		int marks=Integer.parseInt(request.getParameter("marks"));
		String hobbies[]=request.getParameterValues("hobbies");
		
		StudentBean sbean=new StudentBean(rno,name,std,marks,hobbies);
		
		StudentDao dao=new StudentDao();
		int rowsAffected=dao.updateStudent(sbean);
		RequestDispatcher rd=null;
		if (rowsAffected > 0) {
		    rd=request.getRequestDispatcher("ListStudentServlet");
		}else {
			rd=request.getRequestDispatcher("EditStudentServlet");
		}
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
