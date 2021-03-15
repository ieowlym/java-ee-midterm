package com.example.JavaEETest;

import com.example.JavaEETest.db.Users;
import com.example.JavaEETest.logic.Fan;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SignUpServlet", value = "/signup")
public class SignUpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String funame = request.getParameter("uname");
        String fpwd = request.getParameter("pwd");
        Fan f = new Fan(funame,fpwd);
        Users users = Users.getUsers();
        users.addUser(f);
        request.getRequestDispatcher("signin.jsp").forward(request,response);
    }
}
