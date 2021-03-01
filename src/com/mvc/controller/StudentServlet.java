package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.bean.StudentBean;
import com.mvc.dao.LoginDao;
import com.mvc.dao.StudentDao;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();  
        
        int id=Integer.parseInt(request.getParameter("stid"));  
        String name=request.getParameter("sname");  
        String subject=request.getParameter("sub");  
        String teach=request.getParameter("staff");
        String clas =request.getParameter("cls");
          
        StudentBean s=new StudentBean();  
        s.setSid(id);  
        s.setSname(name);  
        s.setSsubject(subject);  
        s.setSteacher(teach);  
        s.setSclass(clas); 
        int status=StudentDao.save(s);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("Home.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  

		
	}

	}


