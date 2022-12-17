package hib.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee o1=new Employee(3,"rajan","mumbai",12000);
		Employee o2=new Employee();
		o2.setId(4);
		o2.setName("karan");
		o2.setAddress("pune");
		o2.setSalary(15000);

        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fact=cfg.buildSessionFactory();
        
        Session sess=fact.openSession();
        Transaction tx= sess.beginTransaction();
        
        sess.save(o1);
        sess.save(o2);
        tx.commit();
        sess.close();

	}

}
