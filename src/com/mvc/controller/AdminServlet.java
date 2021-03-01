package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.dao.LoginDao;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();  
        
        String name=request.getParameter("username");  
        String password=request.getParameter("password");  
        String email=request.getParameter("email");  
        String city=request.getParameter("city");
        Double phone =Double.parseDouble(request.getParameter("phone"));
          
        LoginBean l=new LoginBean();  
        l.setUserName(name);  
        l.setPassword(password);  
        l.setEmail(email);  
        l.setCity(city);  
        l.setPhno(phone); 
        int status=LoginDao.save(l);  
        if(status>0){  
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("Login.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  

		doGet(request, response);
	}

}
