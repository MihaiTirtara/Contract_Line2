import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Citizen;

public class Test 
{
	public static void main(String[] args)
	
	{
	
	Citizen citizen1 = new Citizen("356L120789","Semir", "Gerkhan");
	Citizen citizen2 = new Citizen("223X110486","Dieter" ,"Bonrath");
	Citizen citizen3 = new Citizen("423T091177","Tom","Kranich");
	Citizen citizen4 = new Citizen("326D101281","Horst", "Herzberger");
	
	SessionFactory sessionFactory = new Configuration().configure("hibernate_citizen.cfg.xml").buildSessionFactory();
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(citizen1);
	session.save(citizen2);
	session.save(citizen3);
	session.save(citizen4);
	session.getTransaction().commit();
	
	}	


}

