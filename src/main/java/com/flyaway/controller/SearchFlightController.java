package com.flyaway.controller;

import com.flyaway.entity.Flights;
import com.flyaway.entity.Places;
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

@WebServlet("/SearchFlightController")
public class SearchFlightController extends HttpServlet {

    public SearchFlightController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        String source = request.getParameter("source");
        String destination = request.getParameter("destination");

        Places places = new Places();
        places.setDestination(destination);
        places.setSource(source);

        FlightsService fs = new FlightsService();
        List<Flights> listOfFlights = fs.listPlaces(places);
        if(!listOfFlights.isEmpty()){
            request.setAttribute("listOfFlights", listOfFlights);
        }else{
            request.setAttribute("flightsListEmpty", listOfFlights);
        }
        RequestDispatcher rd = request.getRequestDispatcher("searchFlight.jsp");
        rd.include(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
        doGet(request, response);
    }
}
