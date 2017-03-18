/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.socialtime.dao;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.socialtime.model.Event;
import com.socialtime.model.Users;
import com.socialtime.util.SocialTimeSessionFactory;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class UserDao {

    public static List<Users> read() {
        List<Users> users = null;
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Users");
        users = (List<Users>) query.list();
        session.close();
        for (Users u : users) {
            System.out.println(u.getEmail());
        }
        return users;
    }

    public static boolean addUser(Users user) {
        
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        try {
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            session.close();
            return false;
        }
        session.close();
        return true;
    }

    public static void update(Users u) {
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        Users user = (Users) session.load(Users.class, u.getEmail());
        user.setEmail(u.getEmail());
        user.setLocation(u.getLocation());
        user.setName(u.getName());
        user.setPassword(u.getPassword());
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(String email) {
        Users u = findByEmail(email);
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(u);
        session.getTransaction().commit();
        session.close();
    }

    public static Users findByEmail(String email) {
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        Users user = (Users) session.load(Users.class, email);
        session.close();
        return user;
    }

    public static List<Users> readSignificant(String email) {
        List<Users> users = null;
        Session session = SocialTimeSessionFactory.getSessionFactory().openSession();
        Query query = session.createQuery("FROM Users where email="+email);
        users = (List<Users>) query.list();
        session.close();
        for (Users u : users) {
            System.out.println(u.getEmail());
        }
        return users;
    }

}
