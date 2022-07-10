package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Class;
import com.bean.Teacher;
import com.dao.ClassDao;
import com.service.TeacherService;

/**
 * Servlet implementation class TeacherController
 */
public class TeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    response.setContentType("text/html");
	    PrintWriter pw = response.getWriter();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String teachername = request.getParameter("teachername");
		int classid = Integer.parseInt(request.getParameter("classid"));
		
		Teacher tt = new Teacher();
		tt.setTeachername(teachername);
		
		List<Class> listOfClasses = new ArrayList<Class>();
		Class cc = new Class();
		cc.setClassid(classid); //take in classid parameter
		
		listOfClasses.add(cc); //add it to your class list
		tt.setListOfClasses(listOfClasses); // set it in teacher's list of class
		
		TeacherService ts = new TeacherService();
		String res = ts.storeTeacher(tt);
		pw.println(res);
		RequestDispatcher rd = request.getRequestDispatcher("addTeacher.jsp");
		rd.include(request, response);
		
	}

}
