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

@WebServlet("/UsersController")
public class UsersController extends HttpServlet {

    public UsersController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
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
        String result = us.storeUsers(users);

        pw.println(result);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.include(request, response);
        doGet(request, response);

    }
}
