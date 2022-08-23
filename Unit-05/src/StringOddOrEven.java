//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
	private int strLen;
	private String output;
	
	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		word = s;
		strLen = s.length();
		
	}

	public void setString(String s)
	{
	}

 	public boolean isEven()
 	{
 		//System.out.println(strLen);
 		if (strLen % 2 == 0) {
 			return true;

 		}
 		else
 		{
 			return false;
 
 			
 		}
 		
	}

 	public String toString()
 	{
 		if (isEven() == true) {
				
				return word + " is even" ;
			}else {
				
				return word + " is odd" ;
	
			}
	}
}