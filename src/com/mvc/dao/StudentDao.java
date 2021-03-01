package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mvc.bean.LoginBean;
import com.mvc.bean.StudentBean;
import com.mvc.util.DBConnection;

public class StudentDao {
	 	 public static int save(StudentBean studentBean)
     {
    	int status=0;
    	
    	int sid = studentBean.getSid(); 
        String sname = studentBean.getSname();
        String sub = studentBean. getSsubject(); 
        String staf = studentBean.getSteacher();
        String clss=studentBean.getSclass();
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try
        {
            con = DBConnection.createConnection(); 
            statement = con.createStatement(); 
            status = statement.executeUpdate("insert into student(stuid,stuname,subject,teacher,class)values('"+sid+"','"+sname+"','"+sub+"','"+staf+"','"+clss+"')"); 
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    	 
	 public static List<StudentBean> getAllStudents(){  
	        List<StudentBean> list=new ArrayList<StudentBean>();  
	        Connection con = null;
	         Statement statement = null;
	         ResultSet resultSet = null;
	 
	        try{  
	             con=DBConnection.createConnection();  
	             statement=con.createStatement();  
	             resultSet = statement.executeQuery("select * from student"); 
	            while(resultSet.next()){  
	                StudentBean studentBean=new StudentBean();  
	                studentBean.setSid(resultSet.getInt(1));  
	                studentBean.setSname(resultSet.getString(2));  
	                studentBean.setSsubject(resultSet.getString(3));  
	                studentBean.setSteacher(resultSet.getString(4));  
	                studentBean.setSclass(resultSet.getString(5));  
	                list.add(studentBean);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    }  
	 public static int update(StudentBean studentBean){  
	        int status=0; 
	        Connection con = null;
	        try{  
	        	con=DBConnection.createConnection();   
	            PreparedStatement ps=con.prepareStatement("update student set stuname=?,subject=?,teacher=?,class=? where stuid=?");  
	           
	            ps.setString(1,studentBean.getSname());  
	            ps.setString(2,studentBean.getSsubject());  
	            ps.setString(3,studentBean.getSteacher());  
	            ps.setString(4,studentBean.getSclass());  
	            ps.setInt(5,studentBean.getSid());  
	            
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	 public static int delete(int id){  
	        int status=0; 
	        Connection con = null;
	        try{  
	        	con=DBConnection.createConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from student where stuid=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	 public static StudentBean getStudentById(int id){  
	        StudentBean studentBean=new StudentBean();  
	        Connection con = null;
	        try{  
	        	con=DBConnection.createConnection(); 
	            PreparedStatement ps=con.prepareStatement("select * from student where stuidid=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                studentBean.setSid(rs.getInt(1));  
	                studentBean.setSname(rs.getString(2));  
	                studentBean.setSsubject(rs.getString(3));  
	                studentBean.setSteacher(rs.getString(4));  
	                studentBean.setSclass(rs.getString(5));  
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return studentBean;  
	    }  
	 public static List<StudentBean> getStudentByclass(String cls){  
	        StudentBean studentBean=new StudentBean();  
	        List<StudentBean> list=new ArrayList<StudentBean>(); 
	        Connection con = null;
	        try{  
	        	con=DBConnection.createConnection(); 
	            PreparedStatement ps=con.prepareStatement("select stuid,stuname from student where class=?");  
	            ps.setString(1,cls);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                studentBean.setSid(rs.getInt(1));  
	                studentBean.setSname(rs.getString(2));  
	                list.add(studentBean);
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return list;  
	    }  
	   

}