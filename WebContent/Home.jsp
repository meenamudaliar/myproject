<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home Page</title>
</head>
<body>
 <center><h2>Student Registration</h2></center>
 
 Welcome <%=request.getAttribute("userName") %> <br><br>
 <form name="form" action="StudentServlet" method="post" onsubmit="return validate()">
        
        <table align="center">
        <tr>
         <td>Student ID</td>
         <td><input type="text" name="stid" /></td>
         </tr>
         <tr>
         <td>Student Name</td>
         <td><input type="text" name="sname" /></td>
         </tr>
         <tr>
         <td>subjects</td>
         <td><select name="sub">
         <option value=English>English</option>
         <option value=Mathematics>Mathematics</option>
         <option value=Tamil>tamil</option>
         <option value=Science>Science</option>
         <option value=SocialScience>Social science</option>
         <option value=computerScience>Computer science</option>
         </select></td>
         </tr>
          <tr>
         <td>Teacher</td>
         <td><select name="staff">
         <option value=Ananya>Ananya</option>
         <option value=Harini>Harini</option>
         <option value=Nithyashree>Nithyashree</option>
         <option value=Kosigan>Kosigan</option>
         <option value=Akshaya>Akshaya</option>
         <option value=Aayansh>Aayansh</option>
         <option value=Mahika>Mahika</option>
         <option value=Tanishka>Tanishka</option>
         <option value=Druv>Druv</option>
         <option value=Ahana>Ahana</option>
                  
         </select></td>
         </tr>
         
          <tr>
         <td>Class</td>
         <td><select name="cls">
         <option value=I>I</option>
         <option value=II>II</option>
         <option value=III>III</option>
         <option value=IV>IV</option>
         <option value=V>V</option>
         <option value=VI>VI</option>
         <option value=VII>VII</option>
         <option value=VIII>VIII</option>
         <option value=IX>IX</option>
         <option value=X>X</option>
                  
         </select></td>
         </tr>
        
                  <tr>
         <td></td>
         <td><input type="submit" value="Register"></input><input
         type="reset" value="Reset"></input></td>
         </tr>
         <tr>
 <a href="StudentList.jsp">Student List</a></div><br><br>
  <a href="ReportServlet">Class Report</a></div><br><br>
 <a href="LogoutServlet">Logout</a></div>
</body>
</html>