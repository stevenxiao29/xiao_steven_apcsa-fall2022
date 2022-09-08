//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{		
		//int[] a = 	{-99,1,2,3,4,5,6,7,8,9,10,5};
		
		RaySumLast test = new RaySumLast();
		System.out.println(	test.go(new int[]{-99,1,2,3,4,5,6,7,8,9,10,5}) + "\n");
		
		RaySumLast test2 = new RaySumLast();
		System.out.println(	test2.go(new int[]{10,9,8,7,6,5,4,3,2,1,-99}) + "\n");

		RaySumLast test3 = new RaySumLast();
		System.out.println(	test3.go(new int[]{10,20,30,40,50,-11818,40,30,20,10}) + "\n");

		RaySumLast test4 = new RaySumLast();
		System.out.println(	test4.go(new int[]{32767}) + "\n");

		RaySumLast test5 = new RaySumLast();
		System.out.println(	test5.go(new int[]{255,255}) + "\n");

		RaySumLast test6 = new RaySumLast();
		System.out.println(	test6.go(new int[]{9,10,-88,100,-555,2}) + "\n");

		RaySumLast test7 = new RaySumLast();
		System.out.println(	test7.go(new int[]{10,10,10,11,456}) + "\n");

		RaySumLast test8 = new RaySumLast();
		System.out.println(	test8.go(new int[]{-111,1,2,3,9,11,20,1}) + "\n");

		RaySumLast test9 = new RaySumLast();
		System.out.println(	test9.go(new int[]{9,8,7,6,5,4,3,2,0,-2,6}) + "\n");

		RaySumLast test10 = new RaySumLast();
		System.out.println(	test10.go(new int[]{12,15,18,21,23,1000}) + "\n");

		RaySumLast test11 = new RaySumLast();
		System.out.println(	test11.go(new int[]{250,19,17,15,13,11,10,9,6,3,2,1,0}) + "\n");

		RaySumLast test12 = new RaySumLast();
		System.out.println(	test12.go(new int[]{9,10,-8,10000,-5000,-3000}) + "\n");

		
	}
}