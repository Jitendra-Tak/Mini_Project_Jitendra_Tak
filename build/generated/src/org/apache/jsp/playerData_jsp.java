package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class playerData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/index.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Player Data</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
 String fname = request.getParameter("firstname"); 
           String lname = request.getParameter("lastname");
           String email = request.getParameter("email");
           String pword = request.getParameter("pword");
           String contact = request.getParameter("contact");
           int age = Integer.parseInt(request.getParameter("age"));
           String address = request.getParameter("address");
        
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Data","root","root");
             Statement st = con.createStatement();
             st.executeUpdate("insert into player values('"+fname+"','"+lname+"','"+email+"','"+pword+"','"+contact+"','"+age+"','"+address+"')");
             con.close();
            }
            catch(Exception e)
            {
             System.out.println(e.getMessage());   
            }            
         
      out.write("\n");
      out.write("         ");

           out.println("<h2>");
           out.println("<br />Name: "+fname+" "+lname);
           out.println("<br />Email: "+email);
           out.println("<br />Contact: "+contact);
           out.println("<br />Age: "+age);
           out.println("<br />Address: "+address);
           out.println("</h2>");
         
      out.write("\n");
      out.write("         \n");
      out.write("         ");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Player Login Portal</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <h2 align=\"center\">Player Login Portal</h2>\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <form name=\"f1\" method=\"get\" action=\"playerLoginCheck.jsp\">\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                E-Mail:\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                                <input type=\"text\" name=\"email\" value=\"\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                               Password:\n");
      out.write("                            </td>\n");
      out.write("                            <td>\n");
      out.write("                               <input type=\"password\" name=\"pword\" value=\"\"/>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" id=\"sub1\" value=\"Login\" /></td>   \n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("                <div>\n");
      out.write("                    <a href=\"playerRegister.html\"><button name=\"b1\">Player Registration</button></a>\n");
      out.write("                    <a href=\"officerLogin.html\"><button>Officer Login</button></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
