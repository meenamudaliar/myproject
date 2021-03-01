package com.mvc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc.bean.LoginBean;
import com.mvc.dao.ChangepassDao;
import com.mvc.dao.LoginDao;

/**
 * Servlet implementation class ChangepassServlet
 */
@WebServlet("/ChangepassServlet")
public class ChangepassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangepassServlet() {
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
		
		String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String npass = request.getParameter("newpas");
        LoginBean loginBean = new LoginBean(); 
        loginBean.setUserName(userName); 
         loginBean.setPassword(password);
         loginBean.setNewpass(npass);
        ChangepassDao changeDao = new ChangepassDao(); 
        String userValidate =changeDao.authenticatePass(loginBean); 
        if(userValidate.equals("SUCCESS"))
         {
           
             request.getRequestDispatcher("/Login.jsp").forward(request, response);
             out.println("password changed successfully"); 
         }
         else
         {
             request.setAttribute("errMessage", userValidate); 
             request.getRequestDispatcher("/Login.jsp").forward(request, response);
         }
    
	}

}
