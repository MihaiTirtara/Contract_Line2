package Tier3;


public class Tier3 
{

	public static void main( String[] args )
	{
		try {
			Tier3Controller controller = new Tier3Controller();
			
			System.out.println( "Tier3 ready" );
		} catch( Exception ex ) {
			ex.printStackTrace();
		}
	}
	
	
}
