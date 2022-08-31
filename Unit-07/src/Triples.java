//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;
   private int max;
   
//   Use nested loops to generate all of the Pythagorean triples from 1 up to a provided number.   
//   For three numbers to be a triple, they have to satisfy several requirements.  
//   
//   First, the three numbers in the triple must satisfy the a2 + b2 == c2.  
//   Second, if a is odd, b must be even and if a is even, then b must be odd, and c must be odd for either a / b combination.   
//   Lastly, the greatest common factor of a, b, and, c must be no greater than 1.   

   //for loop to generate num 1	
   //nested for to generate second 
	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		max = num;

	}

	
	public void setNum(int num)
	{

			
	}
	
	public int pythag() {
		
		int tester =0 ;
		for (int i = 0; i<max; i++) {
			
			for (int j = 0 ; j<max; j++) {
				tester = i^2 + j^2;
				if (tester.floor()==tester) {}
				
				
			}
			
		}
		
		return 12;
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		
		
		
//		if (a > b && a > c) {
//			
//			max = a;
//			
//		}else if (b > a && b > c) {
//			
//			max = b;
//			
//		}else {
//			max = c;
//		}
//		
//		
//		for (int i = 0; i<=max; i++) {
//			
//			if (a % i==0) {
//				
//				int gcf = i;	
//				
//			}
			
			
			
	//	}


		return 1;
	}

	public String toString()
	{
		String output="";



		return output+"\n";
	}
}