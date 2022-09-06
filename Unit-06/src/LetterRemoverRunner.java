//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		
		LetterRemover test = new LetterRemover("I am Sam I am" ,'a');
		System.out.println(test);
		//add test cases		
		
		LetterRemover test2 = new LetterRemover("ssssssssxssssesssssesss" ,'s');
		System.out.println(test2);
		
		LetterRemover test3 = new LetterRemover("qwertyqwertyqwerty" ,'a');
		System.out.println(test3);
		
		LetterRemover test4 = new LetterRemover("abababababa" ,'b');
		System.out.println(test4);
		
		LetterRemover test5 = new LetterRemover("abaababababa" ,'x');
		System.out.println(test5);
		
	
									
	}
}
