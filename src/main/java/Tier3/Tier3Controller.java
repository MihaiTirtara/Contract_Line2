package Tier3;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.Account;
import model.Citizen;


public class Tier3Controller extends UnicastRemoteObject implements ITier3  
{
	public Tier3Controller()
		throws RemoteException
	{
		try {
			Naming.rebind( T3_SERVICE_NAME, this );
System.out.println("Database is on");
		} catch( Exception ex ) {
			ex.printStackTrace();
			System.exit( 1 );
		}
	}

	public boolean checkId(String id) throws RemoteException {
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
		session.close();
		
		session = sessionFactory.openSession();
		session.beginTransaction();
		
		Citizen citizen = session.get(Citizen.class, id);
		
		if(citizen==null)
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}

	public void CreateAccount(String id, String password, String phoneNumber, String fName, String lName)
			throws RemoteException 
	{
		if (this.checkId(id)==true)
		{
			SessionFactory sessionFactory = new Configuration().configure("hibernate_system.cfg.xml").buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			Account account = new Account(id,password,phoneNumber,fName,lName);
			session.save(account);
			session.getTransaction().commit();
			session.close();
			
			
		}
		
		else
		{
			System.out.println("Id is invalid");
		}
	}

	public boolean checkId_password(String id, String password) throws RemoteException 
	{
	
		SessionFactory sessionFactory = new Configuration().configure("hibernate_system.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Account account = session.get(Account.class,id);
		
		if(account.getPassword()==password)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}


