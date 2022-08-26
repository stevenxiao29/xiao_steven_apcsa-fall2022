//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int total;
	//add constructors
   public Perfect() {
	   
	   
   }
	//add a set method
   
   public void setNumber(int a) {
	   
	   number = a;
	   
   }

	public boolean isPerfect()
	{
		
		total = 0;
		
		for(int i = 1; i < number; i++) {
			
			if (number % i == 0) {
				
				total = total + i;
				
			}
		}
		
		if (number == total) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
		
	}

	//add a toString	
	
	public String toString() {
		
		if (isPerfect()==true) {
			return number + " is perfect";
		}else {
			return number + " is not perfect";

		}
		
	}
	
}