package com.mvc.controller;

import java.io.IOException;  
import java.io.PrintWriter;  
import java.util.List;  
  
import javax.servlet.ServletException;  
import javax.servlet.annotation.WebServlet;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.bean.StudentBean;
import com.mvc.dao.StudentDao;  
@WebServlet("/ViewServlet")  
public class ViewStudentServlet extends HttpServlet {  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
               throws ServletException, IOException { 
    	
    PrintWriter out=response.getWriter();
        response.setContentType("text/html"); 
        String cs=request.getParameter("cl");
        List<StudentBean> list=StudentDao.getStudentByclass(cs);  
        
        out.print("<table border='1' width='100%'");  
        out.print("<tr><th>Id</th><th>Name</th></tr>");  
        for(StudentBean studentBean:list){  
         out.print("<tr><td>"+studentBean.getSid()+"</td><td>"+studentBean.getSname()+"</td></tr>");  
        }  
        out.print("</table>");  
          
        out.close(); 
    }

}  