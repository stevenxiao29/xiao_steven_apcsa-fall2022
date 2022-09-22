//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOddToEven
{
	 //ArrayList<Integer> nums;
	
	public static int go( List<Integer> nums )
	{
		
		int oddLoc = -1;
		int evenLoc = -1;
		
//		boolean oddExist = false;
//		boolean evenExist = false;
//				
		for (int i = 0; i<nums.size();i++) {
			if (nums.get(i)%2==1) {
				oddLoc = i;
				//oddExist = true;
				break;
			}
		}
		
		if(oddLoc != -1) {
			for (int i = oddLoc; i <nums.size() ; i++) {
				if (nums.get(i)%2==0) {
					evenLoc = i;
				//	evenExist = true;
					//break;
				}
			}
		}
		
		//System.out.println(oddLoc);
		if (oddLoc == -1 || evenLoc == -1) {
			return -1;
		}else {
			return  evenLoc - oddLoc;
		}
	}
}