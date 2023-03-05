package com.flyaway.service;

import com.flyaway.dao.FlightsDao;
import com.flyaway.entity.Flights;
import java.util.List;

public class FlightsService {
    FlightsDao fd  = new FlightsDao();
    public List<Flights> findAllFlights() {
        return fd.findAllFlights();
    }
}
