package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Class;
import com.bean.Student;
import com.bean.Subject;
import com.service.ClassService;
import com.service.StudentService;

/**
 * Servlet implementation class ReportController
 */
public class ReportController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportController() {
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
	    ClassService cs = new ClassService();
	    StudentService ss =  new StudentService();
	    
	    //obj1 - name classes
	    List<Class> allList = cs.getAllClassess();
	    request.setAttribute("obj1", allList);
	    RequestDispatcher rd = request.getRequestDispatcher("viewClassReport.jsp");
	    rd.forward(request, response);
	    
	    //obj2 - display subject
	    List<Student> stdList =  ss.getAllStudents();
	    request.setAttribute("obj2", stdList);
	    RequestDispatcher rd2 = request.getRequestDispatcher("viewClassReport.jsp");
	    rd2.forward(request, response);
	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
