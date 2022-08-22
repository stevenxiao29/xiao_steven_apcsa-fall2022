//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		
		Scanner keyboard = new Scanner(in);

		out.print("Enter x1 :: ");
		int x1 = keyboard.nextInt();

		out.print("Enter y1 :: ");
		int y1 = keyboard.nextInt();
		
		out.print("Enter x2 :: ");
		int x2 = keyboard.nextInt();

		out.print("Enter y2 :: ");
		int y2 = keyboard.nextInt();
		
		
		//add test cases	
		
		Distance test = new Distance(x1,y1,x2,y2);
		test.calcDistance();
		test.print();
		
		
//		Distance test2 = new Distance();
//		test2.setCoordinates(x1, y1, x2, y2);
//		test2.calcDistance();
//		test2.print();
		
		
		/*
1 1 2 1
1 1 -2 2
1 1 0 0 
 
 
 Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
distance == 1.000


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
distance == 3.162


Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
distance == 1.414

*/
	}
}