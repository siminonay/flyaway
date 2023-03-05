package com.flyaway.dao;


import com.flyaway.entity.Flights;
import com.flyaway.entity.Places;
import com.flyaway.resource.DbResource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.ArrayList;
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

    public List<Flights> searchFlight(Places places) {
            SessionFactory sf = DbResource.getSessionFactory();
            Session session = sf.openSession();
            String q1 = "from Places where destination = '" + places.getDestination() + "' or source = '" + places.getSource() + "'";
            Query query = session.createQuery(q1);
            if(query.getResultList().isEmpty()){
               List<Flights> ls = new ArrayList<>();
               return ls;
            }
            Places rl = (Places) query.getResultList().get(query.getFirstResult());
            int placeId = rl.getpId();
            String q2 = "from Flights where places.pId = '" + placeId + "'";
            Query query2 = session.createQuery(q2);

            List<Flights> listOfPlaces = query2.getResultList();
            return listOfPlaces;
        }
}