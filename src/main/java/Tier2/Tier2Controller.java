package Tier2;



import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import static Tier3.ITier3.T3_SERVICE_NAME;

import Tier3.ITier3;


public class Tier2Controller
extends UnicastRemoteObject
implements ITier2
{
private ITier3 tier3;


public Tier2Controller()
	throws RemoteException
{
	try {
		Naming.rebind( T2_SERVICE_NAME, this );
		
		tier3 = (ITier3) Naming.lookup( T3_SERVICE_NAME );
	} catch( Exception ex ) {
		ex.printStackTrace();
		System.exit( 1 );
	}
}


public void Register(String id, String password, String phoneNumber, String fName, String lName)
		throws RemoteException
{
	
	String hash_pass = Security.HashFunction(password);
	
	tier3.CreateAccount(id, hash_pass, phoneNumber, fName, lName);
	
}


public boolean FirstAuth(String id, String password) throws RemoteException 
{
	return tier3.checkId_password(id, password);
	
}



}
