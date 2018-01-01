<%-- 
    Document   : Redirect
    Created on : 1 Jan, 2018, 11:27:39 AM
    Author     : YRR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page</title>
    </head>
    <body>
        <%@page import="java.sql.*" %>
        <% String fname = request.getParameter("firstname"); 
           String lname = request.getParameter("lastname");
           String email = request.getParameter("email");
           String pword = request.getParameter("pword");
           String contact = request.getParameter("contact");
           int age = Integer.parseInt(request.getParameter("age"));
           String address = request.getParameter("address");
        %>
        
        <%
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Data?user=root&password=");
             Statement st = con.createStatement();
             st.executeUpdate("update player set firstname='"+fname+"',lastname='"+lname+"',email='"+email+"',password='"+pword+"',contact='"+contact+"',age="+age+",address='"+address+"' where email='"+email+"'");
             out.println("Updated!!!");
             con.close();
            }
            catch(Exception e)
            {
             System.out.println(e.getMessage());   
            }            
         %>
    </body>
</html>
