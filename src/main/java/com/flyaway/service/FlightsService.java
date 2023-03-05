package com.flyaway.service;

import com.flyaway.dao.FlightsDao;
import com.flyaway.entity.Flights;
import com.flyaway.entity.Places;

import java.util.List;

public class FlightsService {
    FlightsDao fd  = new FlightsDao();
    public List<Flights> findAllFlights() {
        return fd.findAllFlights();
    }

    public List<Flights> listPlaces(Places places) {
        return fd.searchFlight(places);
    }
}
