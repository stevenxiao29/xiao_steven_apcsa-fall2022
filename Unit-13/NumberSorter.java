
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		
		while(number>0)
		{
			number /= 10;
			count++;
		}
		
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int len = getNumDigits(number);
		int[] arr = new int[len];
		
		for (int i = 0; i<len; i++) {
			arr[len-1-i] = number%10;
			number /= 10;
		}
		
		for (int i=1; i< arr.length; ++i)
		   {
		      int val = arr[i];
		      int j=i;
		      while(j>0&&val<arr[j-1]){         
		         arr[j]=arr[j-1];
		         j--;
		      }
		      arr[j]=val;
		   }

		
		return arr;
	}
}
