<%-- 
    Document   : officerLoginCheck
    Created on : 28 Dec, 2017, 12:46:49 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Officer Login Check</title>
    </head>
    <body>
          <%@page import="java.sql.*" %>
          <%! boolean flag; %>
          <%
             String email = request.getParameter("email");
             String pword = request.getParameter("pword");
          %>
          
          <%
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Data?user=root&password=");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select email,password from officer");   
             
             while(rs.next())
             {
              if(rs.getString("email").equals(email) && rs.getString("password").equals(pword))
              {
                flag=true;
                break;  
              }
             }
             con.close();
            }
            catch(Exception e)
            {
             System.out.println(e.getMessage());   
            }            
         %>
         <%
           out.println("<h2 align='center'>");
           if(flag==true)   
           {
             out.println(" Officer Logged In");
             flag = false;
             response.sendRedirect("officerLookDetails.html");
           }
           else
           {
             out.println("No Access Allowed!!!");  
           }
           out.println("</h2>");
         %>
    </body>
</html>
