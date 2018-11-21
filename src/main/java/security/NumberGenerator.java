package security;

import java.security.SecureRandom;
import java.util.Random;

public class NumberGenerator 
{
	 static final private String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	    final private Random rng = new SecureRandom();    

	    char randomChar(){
	        return ALPHABET.charAt(rng.nextInt(ALPHABET.length()));
	    }

	    public  StringBuilder  RandomSequence()
	    {
	    	int length = 5;
	    	
	        StringBuilder sb = new StringBuilder();
	        while(length > 0){
	            length--;
	            sb.append(randomChar());
	        }
	        return sb;
	    }
	}
