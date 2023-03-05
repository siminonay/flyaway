package com.flyaway.controller;

import com.flyaway.entity.Flights;
import com.flyaway.service.FlightsService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/FlightsListController")
public class FlightsListController extends HttpServlet {

    public FlightsListController() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        FlightsService fs = new FlightsService();
        List<Flights> listOfFlights = fs.findAllFlights();
        request.setAttribute("listOfFlights", listOfFlights);
        RequestDispatcher rd = request.getRequestDispatcher("flightList.jsp");
        rd.include(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        doGet(request, response);
    }
}
