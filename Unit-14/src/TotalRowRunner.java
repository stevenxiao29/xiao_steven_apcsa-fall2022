//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		
		int[][] test = new int[][]{{1,2,3},{5,5,5,5}};
		int[][] testB = new int[][]{{1,2,3},{5},{1},{2,2}};
		int[][] testC= new int[][]{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};

		TotalRow test1 = new TotalRow();
		System.out.println(test1.getRowTotals(test));		
		System.out.println(test1.getRowTotals(testB));		
		System.out.println(test1.getRowTotals(testC));		

	}
}



