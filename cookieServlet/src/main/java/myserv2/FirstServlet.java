package myserv2;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
           
            String n = request.getParameter("userName");
            out.print("Welcome " + n);
            
            Cookie ck=new Cookie("uname",n);
            response.addCookie(ck);
            out.print("<form method='post' action='servlet2' >");
            out.print("<input type='submit' value='go'>");
            out.print("</form>");
            out.close();
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}