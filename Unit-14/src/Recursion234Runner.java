//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
	//	System.out.println(RecursionFunOne.countOddDigits(4532));
//		3
//		31332
//		134523
//		3113
//		13331	
//		777337777

		
		System.out.println(RecursionFunThree.luckyThrees(3));
		
		System.out.println(RecursionFunThree.luckyThrees(31332));

		System.out.println(RecursionFunThree.luckyThrees(134523));

		System.out.println(RecursionFunThree.luckyThrees(3113));

		System.out.println(RecursionFunThree.luckyThrees(13331));

		System.out.println(RecursionFunThree.luckyThrees(777337777));

		//add more test cases

//		4532
//		11145322
//		224532714		
//		2468	
//		13579	

		
		System.out.println();
		System.out.println(RecursionFunOne.countEvenDigits(4532));
		System.out.println(RecursionFunOne.countEvenDigits(11145322));
		System.out.println(RecursionFunOne.countEvenDigits(224532714));
		System.out.println(RecursionFunOne.countEvenDigits(2468));
		System.out.println(RecursionFunOne.countEvenDigits(13579));


	}
}