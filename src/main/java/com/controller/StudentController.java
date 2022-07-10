package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Student;
import com.service.StudentService;

/**
 * Servlet implementation class StudentController
 */
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    PrintWriter pw = response.getWriter();
	    StudentService ss = new StudentService();
	    
	    List<Student> listOfStudents = ss.getAllStudents();
	    request.setAttribute("obj", listOfStudents); //store list of students here
	    RequestDispatcher rd = request.getRequestDispatcher("displayStudents.jsp");
	    rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String studentname = request.getParameter("studentname");
		int age = Integer.parseInt(request.getParameter("age"));
		int classid = Integer.parseInt(request.getParameter("classid"));
		
		Student std = new Student();
		std.setStudentname(studentname);
		std.setAge(age);
		std.setStdclassid(classid);
		
		StudentService ss = new StudentService();
		String result = ss.storeStudentDetails(std);
		pw.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("addStudent.jsp");
		rd.include(request, response);
	}

}
