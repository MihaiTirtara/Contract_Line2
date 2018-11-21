package Tier2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ITier2 extends Remote
{
	public void Register(String id, String password,String phoneNumber,String fName,String lName) throws RemoteException;
	public boolean FirstAuth(String id,String password) throws RemoteException; // First method for authentication
	public boolean SecondAuth(String id, String number) throws RemoteException ;// Send sms to the person  with the code for the second authentication and check if the number introduced is the same as the one sent
	
	public static final String T2_SERVICE_NAME = "rmi://localhost/T2";

}
