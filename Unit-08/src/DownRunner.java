//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		
		RayDown test = new RayDown();
		System.out.println(test.go(new int[] {-99,1,2,3,4,5,6,7,8,9,10,12345}));
		
		RayDown test2 = new RayDown();
		System.out.println(test2.go(new int[] {10,9,8,7,6,5,4,3,2,1,-99}));
		
		RayDown test3 = new RayDown();
		System.out.println(test3.go(new int[] {10,20,30,40,50,-11818,40,30,20,10}));
		
		RayDown test4 = new RayDown();
		System.out.println(test4.go(new int[] {32767}));
		
		RayDown test5 = new RayDown();
		System.out.println(test5.go(new int[] {255,255}));
		
		RayDown test6 = new RayDown();
		System.out.println(test6.go(new int[] {9,10,-88,100,-555,1000}));
		
		RayDown test7= new RayDown();
		System.out.println(test7.go(new int[] {10,10,10,11,456}));
		
		RayDown test8 = new RayDown();
		System.out.println(test8.go(new int[] {-111,1,2,3,9,11,20,30}));
		
		RayDown test9 = new RayDown();
		System.out.println(test9.go(new int[] {9,8,7,6,5,4,3,2,0,-2,-989}));
		
		RayDown test10 = new RayDown();
		System.out.println(test10.go(new int[] {12,15,18,21,23,1000}));
		
		RayDown test11 = new RayDown();
		System.out.println(test11.go(new int[] {250,19,17,15,13,11,10,9,6,3,2,1,-455}));
		
		RayDown test12 = new RayDown();
		System.out.println(test12.go(new int[] {9,10,-8,10000,-5000,1000}));
		
		
		
		
		
	}
}