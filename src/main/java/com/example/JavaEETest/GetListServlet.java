package com.example.JavaEETest;

import com.example.JavaEETest.db.Users;
import com.example.JavaEETest.logic.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Principal;

@WebServlet(name = "GetListServlet", value = "/GetListServlet")
public class GetListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        PrintWriter pw = response.getWriter();
        String s1 = "<html><head>\n" +
                "<title>Get List</title>\n" +
                "</head><body>\n";
        String s2 =
                "</body></html>";
        pw.println(s1);
        Users users = Users.getUsers();
        for (User u: users.getU()) {
            pw.println("<h1>"+u.getUsername()+" : "+u.getPassword()+"</h1>");
        }
        pw.println(s2);
    }
}
