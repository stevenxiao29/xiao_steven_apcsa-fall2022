//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		double c = 0;
		if (a>b) {
			c = a-b;
		}
		else if (b>a) {
			c = b-a;
		}
		else if (a==b) {
			c= a*b;
		}
		
		
		
		return Math.floor(c*1000)/1000;
	}
}
