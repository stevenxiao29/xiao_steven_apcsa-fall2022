//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String[] args )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String inputOne = keyboard.next();
		
		out.print("Enter another word :: ");
		String inputTwo = keyboard.next();
		
		StringEquality test = new StringEquality(inputOne, inputTwo);
	//	if (test.checkEquality() == true) {
			System.out.println(test);
		}
	}