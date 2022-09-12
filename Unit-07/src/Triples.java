import static java.lang.System.*;

public class Triples
{
   private int number;

   
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
		number = 0;
	}

	public Triples(int num)
	{
		setNum( num);
	}

	
	public void setNum(int num)
	{
		number = num;
				
	}
	
	public String findTriples() {
		
		String trip = "";
		
		for (int i = 1; i<= number ; i ++) {
			for(int j = i+1; j<=number ; j++) {
				for (int k = j+1; k<=number; k++) {
					if((i*i) + (j*j) == (k*k)) {
						if((i%2==0 && j%2==1 )||(i%2==1 && j%2==0)) {
						//	System.out.println(i + " " + j + " " + k);
							if(greatestCommonFactor(i, j, k) == 1) {
								trip += i + " " + j + " " + k + " \n";
							}
						}
					}
				}
			}
		}
		
		return trip;
		
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int min = 0;
		int gcf =1 ;
		
		
		if (a < b && a < c) {
			
			min = a;
			
		}else if (b < a && b < c) {
			
			min = b;
			
		}else {
			min = c;
		}
		
		
		for (int i = 1; i<=min; i++) {
			
			if (a % i==0 && b % i==0 && c % i==0) {
				
				 gcf = i;	
				
			}
			
			
			
		}


		return gcf;
	}

	
	public String toString()
	{
		return findTriples();



	}
}
