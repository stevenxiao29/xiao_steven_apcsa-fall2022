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
		
		for (int i = 0 ; i<cols ; i++) {
			for (int j = 0; j<rows ; j++) {
				grid[i][j] = vals[(int)(Math.random()*vals.length)];
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int maxCount = 0;
		int maxIndex = -1;
		
		String out = "";		
		
		for (int i = 0; i< vals.length ; i++)
		{
			out += vals[i] +  " count is " + countVals(vals[i]) + "\n";
		}
		
		for (int i = 0; i< vals.length ; i++)
		{
			if (countVals(vals[i]) > maxCount) {
				maxCount = countVals(vals[i]);
				maxIndex = i;
			}

		}
		
		out += vals[maxIndex] + " occurs the most";
		
		return out;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		
		for( String[] row : grid )
    	{
    	   for( String num : row )
    	   {
    		   if (num.equals(val))
    			   count ++;
    	   }
    	}	
		
		return count;
	}

	//display the grid
	public String toString()
	{
		String matrix = "Matrix values: \n\n";
    	
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