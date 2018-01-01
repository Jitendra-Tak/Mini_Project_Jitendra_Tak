<%-- 
    Document   : ShowDetails
    Created on : 1 Jan, 2018, 8:56:16 AM
    Author     : YRR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Show Details</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        <%
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Data?user=root&password=");
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("select * from player");   
             out.println("<h2 align='center'>Player's Details</h2>");
             out.println("<b> First Name || Last Name || Email || Age || Contact || Address");
             while(rs.next())
             {
              out.println("<br />"+rs.getString("firstname")+" || "+rs.getString("lastname")+" || "+rs.getString("email")+" || "+rs.getInt("age")+" || "+rs.getString("contact")+" || "+rs.getString("address"));
             }
             con.close();
            }
            catch(Exception e)
            {
             System.out.println(e.getMessage());   
            }            
         %>
    </body>
</html>
