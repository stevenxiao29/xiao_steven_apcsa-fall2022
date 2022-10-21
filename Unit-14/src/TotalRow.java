//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	
    	ArrayList<Integer> out = new ArrayList<Integer>();
    	
    	int temp = 0;
    	
    	for (int[] rows : m) {
    		for (int num : rows) {
    			temp += num;
    		}
    		out.add(temp);
    		temp = 0;
    	}
    	
		return out;
    }
}
