
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s= new Student(103,"ram",4.44);
		
		Transaction t = session.beginTransaction();
		
		session.save(s);
		t.commit();
		
		session.close();

		System.out.println("Data inserted");

		
		

		
		
	}

}
