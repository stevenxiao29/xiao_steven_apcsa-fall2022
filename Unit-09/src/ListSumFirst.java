//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	int[] nums;
	int size = -1;
	
	public static int go(List<Integer> ray)
	{
		return 0;
	
		
	}
	public ListSumFirst() {
		nums = new int[0];
	}
	
	public ListSumFirst(int[] a)
	{
		nums = a;
		size = a.length;
	}
	
	public String toString()
	{
		
		if (size == 0)
			return -1 +"";
		
		int first = nums[0];
		int out = 0;
		
		for (int i = 0; i<size ; i++)
		{
			if (nums[i] >  first) {
				out += nums[i];
			}
		}
		
		if (out == 0) {
			return "-1";
		}
		
		return out + ""	;
	}
}