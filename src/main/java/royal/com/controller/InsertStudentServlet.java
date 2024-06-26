package royal.com.controller;

import java.io.IOException;

import com.royal.bean.StudentBean;
import com.royal.dao.StudentDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class InsertStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String name=request.getParameter("name");
		String std=request.getParameter("std");
		String marks=(request.getParameter("marks"));
		String hobbies[]=request.getParameterValues("hobbies");
		
		boolean flag=false;
		StudentBean sbean=new StudentBean();
		
		if((name!=null) && (name.trim().length()>0))
		{
			request.setAttribute("name", name);
			sbean.setName(name);
		}else {
			flag=true;
			request.setAttribute("errName","<font color='red'>Please enter valid Name</font>");
		}
		if((std!=null) && (std.trim().length()>0))
		{
			request.setAttribute("std", std);
			sbean.setStd(std);
		}else {
			flag=true;
			request.setAttribute("errStd","<font color='red'>Please enter valid std</font>");
		}
		if((marks!=null) && (marks.trim().length()>0))
		{
			request.setAttribute("marks", marks);
			sbean.setMarks(Integer.parseInt(marks));
		}else {
			flag=true;
			request.setAttribute("errMarks","<font color='red'>Please enter valid marks</font>");
		}
		
		RequestDispatcher rd=null;
		if(flag)
		{
			System.out.println("if flag: "+flag);
			rd=request.getRequestDispatcher("insertstudent.jsp");
		}
		else
		{
			StudentDao dao=new StudentDao();
			int rowsAffected=dao.insertStudent(sbean);
			if(rowsAffected>0)
			{
				rd=request.getRequestDispatcher("ListStudentServlet");	
			}else {
				rd=request.getRequestDispatcher("insertstudent.jsp");
			}
		}
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
