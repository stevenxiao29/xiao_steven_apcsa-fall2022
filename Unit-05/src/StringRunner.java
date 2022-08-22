//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("	 Enter a word :: ");
		String str = keyboard.next();
		
		StringOddOrEven test = new StringOddOrEven(str);
		if (test.isEven() == true) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}