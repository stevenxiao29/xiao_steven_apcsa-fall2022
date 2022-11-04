//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	static int [] finalArray; 
	 static int size = 0;
	
	public NumberShifter(int a)
	{
		size = a;
		finalArray = new int[a];
		makeLucky7Array();
	}
	
	public static void makeLucky7Array()
	{
		
		for (int i = 0; i<size ; i++)
		{
			finalArray[i] = (int)(Math.random()*10 + 1);
		}
		
		
	}
	public static void shiftEm(int[] array)
	{
		int tempIndex = 0;
		
		for (int i = 0; i<finalArray.length; i++)
		{
			if (finalArray[i]==7)
			{
				finalArray[i] = finalArray[tempIndex];
				finalArray[tempIndex] = 7;
				tempIndex++;
			}
		}
	}
	
	public String toString()
	{
		
		String out = "[";
		
		for (int i = 0; i<size; i++)
		{
			out += finalArray[i] + ", ";
		}
		
		out += "]\n[";
	
		shiftEm(finalArray);

		
		for (int i = 0; i<size; i++)
		{
			out += finalArray[i] + ", ";
		}
		
		return out +"]";
	}
}
