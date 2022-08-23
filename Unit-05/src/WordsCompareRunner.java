//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	    Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a word :: ");
		String inputOne = keyboard.next();
		
		out.print("Enter another word :: ");
		String inputTwo = keyboard.next();
		
		WordsCompare test = new WordsCompare(inputOne, inputTwo);
		
		System.out.println(test);

	}
}