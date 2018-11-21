package Tier2;

import Tier3.Tier3Controller;

public class Tier2 
{
	public static void main( String[] args )
	{
		try {
			Tier2Controller controller = new Tier2Controller();
			
			System.out.println( "Tier2 ready" );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	

}
