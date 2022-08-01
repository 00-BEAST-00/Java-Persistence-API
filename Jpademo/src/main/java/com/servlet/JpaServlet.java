package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jpa.Student;
import com.persistances.StudentDaoImplement;


@WebServlet("/JpaServlet")
public class JpaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	StudentDaoImplement daoimp = new StudentDaoImplement();
    public JpaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String name = request.getParameter("name");
		String dob = request.getParameter("dob");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Student student = new Student();
		student.setStuname(name);
		student.setStudob(dob);
		student.setStuemail(email);
		student.setStupassword(password);
		daoimp.insertStudent(student);
		response.getWriter().append("successfull done");
		RequestDispatcher rd = request.getRequestDispatcher("Successpage.jsp");
		rd.include(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
