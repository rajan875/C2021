//hibernate project 
package hib.com;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Hibernate" );
        
        Configuration cfg= new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        System.out.println(factory.isOpen());
        
    }
}
