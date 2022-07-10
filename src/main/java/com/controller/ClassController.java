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
import com.bean.Subject;
import com.dao.SubjectDao;
import com.service.ClassService;

/**
 * Servlet implementation class ClassController
 */
public class ClassController extends HttpServlet {SubjectDao sd = new SubjectDao();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClassController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
	   
		PrintWriter pw = response.getWriter();
		ClassService cs = new ClassService();
		List<Class> listOfClass = cs.getAllClassess();
		request.setAttribute("obj", listOfClass);
		RequestDispatcher rd = request.getRequestDispatcher("displayClasses.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//doGet(request, response);
		 response.setContentType("text/html");
		    PrintWriter pw = response.getWriter();
		    
		    String classname = request.getParameter("classname");
		    int subjectid = Integer.parseInt(request.getParameter("subjectid"));
		   
		    System.out.println("class name"+ classname);
		    System.out.println("subject ID"+ subjectid);
		    Subject s = sd.findSubjectById(subjectid);
		
		    Class c = new Class();
	
		    c.setClassname(classname);
		    c.setSubject(s);
		    
		    ClassService cs = new ClassService();
		    String result = cs.addClass(c);
		    pw.println(result);
		    RequestDispatcher rd = request.getRequestDispatcher("addNewClass.jsp");
		    rd.include(request, response);
	}

}
