//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		

		//ask for name and size
		out.print("Enter 1st monster's name : ");
		String name1 = keyboard.nextLine();

		out.print("Enter 1st monster's size : ");
		String size1 = keyboard.nextLine();
		
		out.print("Enter 2nd monster's name : ");
		String name2 = keyboard.nextLine();
		
		out.print("Enter 2nd monster's size : ");
		String size2 = keyboard.nextLine();
		
	


		//instantiate monster one		
		Skeleton m1 = new Skeleton(name1, Integer.parseInt(size1));
		//instantiate monster two		
		Skeleton m2 = new Skeleton(name2, Integer.parseInt(size2));

		System.out.println("Monster 1 – " + m1);
		System.out.println("Monster 2 – " + m2);

		
//		Monster one is smaller than Monster two.
//		Monster one does not have the same name as Monster two.

		if (m1.isBigger(m2) == true)
			System.out.println("Monster one is greater than Monster two.");
		else if (m1.isSmaller(m2) == true)
			System.out.println("Monster one is smaller than Monster two.");
		else 
			System.out.println("Monster 1 is the same size as Monster 2");		
		
		if (m1.namesTheSame(m2)== true)
			System.out.println("Monster one does have the same name as Monster two.");
		else 
			System.out.println("Monster does have the same name as Monster two.");
	}
}