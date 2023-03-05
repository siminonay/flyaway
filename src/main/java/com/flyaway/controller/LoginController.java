package com.flyaway.controller;

import com.flyaway.entity.Users;
import com.flyaway.service.UsersService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
        rd.include(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        Users users = new Users();
        users.setName(name);
        users.setPassword(password);

        UsersService us = new UsersService();
        Boolean result = us.checkUser(users);

        if (result) {
            //user found
            RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
            rd.include(request, response);
        } else {
            //user not found
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.include(request, response);
            pw.println("<div style=\"width: 400px;margin-left: auto;margin-right: auto;color: white;background-color: red;text-align: center;padding-top: 10px;padding-bottom: 10px;\">User Not Found</div>");
        }

    }
}
