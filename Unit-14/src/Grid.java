//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid  = new String[cols][rows];
		
		for (String[] row : grid) {
			for (String s : row) {
				s = vals[(int)Math.random()*vals.length + 1];
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		return "nothing yet";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
	}

	//display the grid
	public String toString()
	{
		String matrix = "Matrix values: \n";
    	
    	for( String[] row : grid )
    	{
    	   for( String num : row )
    	   {
    		   matrix += num;
    	   }
    	   matrix += "\n";
    	}		
    	return matrix;
	}
}