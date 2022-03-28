
package com.Registration;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class myRegistration extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        out.println("<h2>Welcome to Our Registration page</h2>");
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String cond = req.getParameter("condition");
        
        if (cond != null) {
            out.println("<h3>Name : "+ name + "</h3>");
            out.println("<h3>Password : "+ password + "</h3>");
            out.println("<h3>Email : "+ email + "</h3>");
            out.println("<h3>Gender : "+ gender + "</h3>");
            out.println("<h3>Course Choice : "+ course + "</h3>");
        }else{
            out.println("<h2>Sorry You not accept Terms and Condition</h2>");
        }
        
    }
    
}
