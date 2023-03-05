package com.flyaway.dao;


import com.flyaway.entity.Users;
import com.flyaway.resource.DbResource;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class UsersDao {

    public int storeUsers(Users users) {
        SessionFactory sf = DbResource.getSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.getTransaction();
        tran.begin();
        session.save(users);
        tran.commit();
        return 1;
    }

    public List<Users> getUser(Users user) {
        SessionFactory sf = DbResource.getSessionFactory();
        Session session = sf.openSession();
        String userQuery = "from Users where name = '" + user.getName() + "' and password = '" + user.getPassword() + "'";
        Query query = session.createQuery(userQuery);

        List<Users> listOfUsers = query.getResultList();
        return listOfUsers;
    }

    public void changePassword(Users user) {
        SessionFactory sf = DbResource.getSessionFactory();
        Session session = sf.openSession();
        Transaction tx = null;
        tx = session.beginTransaction();
        String userQuery = "update Users set password = '" + user.getPassword() + "' where name = '" + user.getName() + "'";
        Query query = session.createQuery(userQuery);
        query.executeUpdate();
        tx.commit();
    }

}