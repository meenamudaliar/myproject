<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<script> 
function validate()
{ 
     var username = document.form.username.value; 
     var password = document.form.password.value;
 
     if (username==null || username=="")
     { 
     alert("Username cannot be blank"); 
     return false; 
     }
     else if(password==null || password=="")
     { 
     alert("Password cannot be blank"); 
     return false; 
     } 
}
</script> 

</head>
<body>
<div style="text-align:center"><h1>ADMIN REGISTRATION</h1> </div>
<form name="form" action="AdminServlet" method="post" onsubmit="return validate()">
        <!-- Do not use table to format fields. As a good practice use CSS -->
        <table align="center">
         <tr>
         <td>Username</td>
         <td><input type="text" name="username" /></td>
         </tr>
         <tr>
         <td>Password</td>
         <td><input type="password" name="password" /></td>
         </tr>
         <tr>
         <td>Email</td>
         <td><input type="text" name="email" /></td>
         </tr>
         <tr>
         <td>Phone no</td>
         <td><input type="text" name="phone" /></td>
         </tr>
         <tr>
         <td>city</td>
         <td><input type="text" name="city" /></td>
         </tr>
          <tr>
         <td></td>
         <td><input type="submit" value="Save"></input><input
         type="reset" value="Cancel"></input></td>
         </tr>
    

</body>
</html>