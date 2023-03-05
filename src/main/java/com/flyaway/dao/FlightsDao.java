package com.flyaway.dao;


import com.flyaway.entity.Flights;
import com.flyaway.resource.DbResource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class FlightsDao {

    public List<Flights> findAllFlights() {

        SessionFactory sf = DbResource.getSessionFactory();
        Session session = sf.openSession();
        String userQuery = "from Flights";
        Query query = session.createQuery(userQuery);

        List<Flights> listOfFlights = query.getResultList();
        return listOfFlights;
    }
}