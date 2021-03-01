package com.mvc.dao;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mvc.bean.LoginBean;
import com.mvc.util.DBConnection;
 
public class LoginDao {
     public String authenticateUser(LoginBean loginBean)
     {
         String userName = loginBean.getUserName(); 
         String password = loginBean.getPassword();
 
         Connection con = null;
         Statement statement = null;
         ResultSet resultSet = null;
 
         String userNameDB = "";
         String passwordDB = "";
 
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
                  return "SUCCESS"; 
               }
             }
         }
             catch(SQLException e)
             {
                e.printStackTrace();
             }
             return "Invalid user credentials"; 
         }
     public static int save(LoginBean loginBean)
     {
    	int status=0;
    	
    	String userName = loginBean.getUserName();
        String password = loginBean.getPassword();
        String useremail = loginBean.getEmail(); 
        String usercity = loginBean.getCity();
        Double phone=loginBean.getPhno();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            con = DBConnection.createConnection(); 
            statement = con.createStatement(); 
            status = statement.executeUpdate("insert into admin(userName,password,email,city,phone)values('"+userName+"','"+password+"','"+useremail+"','"+usercity+"','"+phone+"')"); 
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    	 
     }




