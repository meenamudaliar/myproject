package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvc.bean.StudentBean;
import com.mvc.dao.StudentDao;  

/**
 * Servlet implementation class ReportServlet
 */
@WebServlet("/ReportServlet")
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();  
        out.println("<a href='Home.jsp'>Add student</a>");  
        out.println("<h1>Student List</h1>");  
          
        List<StudentBean> list=StudentDao.getAllStudents();  
          
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th><th>Subject</th><th>Teacher</th><th>Class</th><th>Edit</th><th>Delete</th></tr>");  
        for(StudentBean studentBean:list){  
         out.print("<tr><td>"+studentBean.getSid()+"</td><td>"+studentBean.getSname()+"</td><td>"+studentBean.getSsubject()+"</td><td>"+studentBean.getSteacher()+"</td><td>"+studentBean.getSclass()+"</td><td><a href='EditServlet?id="+studentBean.getSid()+"'>edit</a></td><td><a href='DeleteServlet?id="+studentBean.getSid()+"'>delete</a></td></tr>");  
        }  
        out.print("</table>");  
          
        out.close();  

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
