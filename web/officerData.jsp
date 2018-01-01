<%-- 
    Document   : officerData
    Created on : 28 Dec, 2017, 11:39:55 AM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Officer Data</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        <% String fname = request.getParameter("firstname"); 
           String lname = request.getParameter("lastname");
           String email = request.getParameter("email");
           String pword = request.getParameter("pword");
           String contact = request.getParameter("contact");
        %>
        
        <%
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Data?user=root&password=");
             Statement st = con.createStatement();
             st.executeUpdate("insert into officer values('"+fname+"','"+lname+"','"+email+"','"+pword+"','"+contact+"')");
             con.close();
            }
            catch(Exception e)
            {
             System.out.println(e.getMessage());   
            }            
         %>
         <%
           out.println("<h2>");
           out.println("<br />Name: "+fname+" "+lname);
           out.println("<br />Email: "+email);
           out.println("<br />Contact: "+contact);
           out.println("</h2>");
         %>
         <%@include file="officerLogin.html" %>
    </body>
</html>
