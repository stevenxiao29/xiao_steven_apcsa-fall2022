//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static String count( int val  )
    {
    	
    	int count = 0;
    	
    	for (int[] row : m) {
    		for (int num : row) {
    			if (num == val)
    				count ++;
    		}
    	}
    	
    	//add code
		return "The " + val + " count is: " + count;
    }
    
    public String toString()
    {
    	String matrix = "Matrix values: \n";
    	
    	for( int[] row : m )
    	{
    	   for( int num : row )
    	   {
    		   matrix += num;
    	   }
    	   matrix += "\n";
    	}

    	
    	return matrix + "\n" ;
    }
    
}
