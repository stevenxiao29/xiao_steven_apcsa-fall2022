//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countEvenDigits(int num)
	{
		if (num == 0)
			return 0;
		
		else if (num % 2 == 0)
			return countEvenDigits(num/10) + 1;

		else 
			return countEvenDigits(num/10);
		
	}
}