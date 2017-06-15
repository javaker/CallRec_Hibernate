package ru.demetra.callrec.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Get Hibernate SessionFactory
 *
 * Singleton pattern
 *
 * @author Vyacheslav Y.
 * @version 1.0
 *
 */


public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }catch (Throwable e){
            throw new ExceptionInInitializerError(e);
        }
    }

    private HibernateUtil() {
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
