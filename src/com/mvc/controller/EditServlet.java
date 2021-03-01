package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.StudentBean;
import com.mvc.dao.StudentDao;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();  
        out.println("<h1>Update Student</h1>");  
        String sid=request.getParameter("id");  
        int id=Integer.parseInt(sid);  
         
        StudentBean studentBean=StudentDao.getStudentById(id);  
          
        out.print("<form action='EditServlet2' method='post'>");  
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='id' value='"+studentBean.getSid()+"'/></td></tr>");  
        out.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+studentBean.getSname()+"'/></td></tr>");  
       
        out.print("<tr><td>Subject:</td><td>");  
        out.print("<select name='subject' style='width:150px'>");  
        out.print("<option>English</option>");  
        out.print("<option>Mathematics</option>");  
        out.print("<option>Tamil</option>");  
        out.print("<option>Science</option>");
        out.print("<option>SocialScience</option>");
        out.print("</select>");
        out.print("<tr><td>Teacher:</td><td>");  
        out.print("<select name='teacher' style='width:150px'>");  
        out.print("<option>Ananya</option>");  
        out.print("<option>Nithyashree</option>");  
        out.print("<option>Akshaya</option>");  
        out.print("<option>Harini</option>"); 
        out.print("<option>Kosigan</option>"); 
        out.print("<option>Aayansh</option>"); 
        out.print("<option>Mahika</option>"); 
        out.print("<option>Tanishka</option>"); 
        out.print("<option>Druv</option>"); 
        out.print("<option>Ahana</option>"); 
        out.print("</select>");  
        out.print("<tr><td>Class:</td><td>");  
        out.print("<select name='class' style='width:150px'>");  
        out.print("<option>I</option>");  
        out.print("<option>II</option>");  
        out.print("<option>III</option>");  
        out.print("<option>IV</option>");
        out.print("<option>V</option>");  
        out.print("<option>VI</option>"); 
        out.print("<option>VII</option>");
        out.print("<option>VIII</option>");
        out.print("<option>IX</option>");
        out.print("<option>X</option>");
        out.print("</select>");  
        out.print("</td></tr>");  
        out.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        out.print("</table>");  
        out.print("</form>");  
          
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
