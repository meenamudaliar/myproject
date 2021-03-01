<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
     else if(newpas.equals(confirmpas))
     { 
          return true; 
     } 
}
</script> 


</head>
<body>
<div style="text-align:center"><h1>change password</h1> </div>
    <br>
    <form name="form" action="ChangepassServlet" method="post" onsubmit="return validate()">
        
        <table align="center">
        <tr>
         <td>User Name</td>
         <td><input type="text" name="username" /></td>
         </tr>
         <tr>
         <td>Old Password</td>
         <td><input type="password" name="password" /></td>
         </tr>
         <tr>
         <td>New Password</td>
         <td><input type="password" name="newpas" /></td>
         </tr>
         <tr>
         <td>Confirm Password</td>
         <td><input type="password" name="confirmpas" /></td>
         </tr>
         <tr> 
         <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
         : request.getAttribute("errMessage")%></span></td>
         </tr>
         <tr>
         <td></td>
         <td><input type="submit" value="Change"></input><input
         type="reset" value="Reset"></input></td>
         </tr>
         <tr>
       </tr>
       </table>
       </form>
</body>
</html>