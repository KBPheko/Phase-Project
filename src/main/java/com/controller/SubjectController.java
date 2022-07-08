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
import com.service.SubjectService;

/**
 * Servlet implementation class SubjectController
 */
public class SubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubjectController() {
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
		SubjectService ss = new SubjectService();
		List<Subject> subList  = ss.getAllSubjects();
		request.setAttribute("obj", subList);    
		RequestDispatcher rd = request.getRequestDispatcher("displaySubs.jsp");
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
		
		int subjectid = Integer.parseInt(request.getParameter("subjectid"));
		String subjectname = request.getParameter("subjectname");
		Class cl = new Class();
		
		Subject ss = new Subject();
		ss.setSubjectid(subjectid);
		ss.setSubjectname(subjectname);
		//ss.setCl(subclassid);
		
		SubjectService subServe = new SubjectService();
		
		String result = subServe.storeSubject(ss);
		pw.println(result);
		RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
		rd.include(request, response);
		
	}

}
