package hib.com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		Configuration cfg = new Configuration();
		cfg.configure("config.xml");
		SessionFactory fact = cfg.buildSessionFactory();
		System.out.println(fact);

		Student std = new Student();
		std.setId(3);
		std.setName("om");
		std.setCity("navi-mumbai");
		System.out.println(std);

		Address add = new Address();
		add.setStreet("ghat");
		add.setCity("mum");

		Session sess = fact.openSession();

		Transaction tx = sess.beginTransaction();
		sess.save(std);
		sess.save(add);
		tx.commit();

		sess.close();
	}
}
