package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student o1=new Student(1, "raj", "mumbai");
        Student o2=new Student(2, "karan", "navi-mumbai");
        Student o3=new Student(3, "ram", "mumbai");
        Student o4=new Student(4, "om", "pune");

        
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        
        Session sess=fact.openSession();
        Transaction tx= sess.beginTransaction();
        
        sess.save(o1);
        sess.save(o2);
        sess.save(o3);
        sess.save(o4);
        tx.commit();
        sess.close();

        
    }
}
