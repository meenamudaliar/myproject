package com.mvc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;

public class ChangepassDao {
	 public String authenticatePass(LoginBean loginBean)
     {
         String userName = loginBean.getUserName(); 
         String password = loginBean.getPassword();
         String npassword = loginBean.getNewpass();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String userNameDB = "";
         String passwordDB = "";
         int status=0;
         try
         {
             con = DBConnection.createConnection(); 
             statement = con.createStatement();
             resultSet = statement.executeQuery("select userName,password from admin"); 
 
             while(resultSet.next()) 
             {
              userNameDB = resultSet.getString("userName");
              passwordDB = resultSet.getString("password");
 
               if(userName.equals(userNameDB) && password.equals(passwordDB))
               {
            	   
            	   con = DBConnection.createConnection();  
            	   statement = con.createStatement(); 
            	   status=statement.executeUpdate("update admin set password='"+npassword+"' where userName='"+userName+"'");
                  
               }
             }
         }
             catch(SQLException e)
             {
                e.printStackTrace();
             }
         return "SUCCESS";  
         }
 


}
