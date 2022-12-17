package one.to.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory fact = cfg.buildSessionFactory();
		
		Student s=new Student();

		s.setName("raj");
		s.setAge(25);
		s.setName("mohit");
		s.setAge(24);
		s.setName("arjun");
		s.setAge(23);

		
		Address a=new Address();
//		a.setAddressId(1001);
		a.setAddressName("mumbai");
		a.setAddressName("pune");
		a.setAddressName("navi-mumbai");
//		a.setStudentId(101);
		s.setAddressName(a);
		
		Session sess = fact.openSession();

		Transaction tx = sess.beginTransaction();
		sess.save(s);
		sess.save(a);
		tx.commit();

		sess.close();

	}

}
