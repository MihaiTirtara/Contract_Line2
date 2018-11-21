package Tier3;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface ITier3 extends Remote
{

	public boolean checkId(String id )throws RemoteException;
	
	public void CreateAccount( String id, String password, String phoneNumber,String fName,String lName ) throws RemoteException;
	
	public boolean checkId_password(String id, String password) throws RemoteException;
	
	public static final String T3_SERVICE_NAME = "rmi://localhost/T3";
}

