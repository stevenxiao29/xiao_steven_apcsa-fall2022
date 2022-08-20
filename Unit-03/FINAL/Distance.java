//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
		
	}

	public void calcDistance()
	{
		distance = sqrt((xOne-xTwo)*(xOne-xTwo) + (yOne-yTwo)*(yOne-yTwo));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
		//System.out.print("distance == ");
		//System.out.printf("%.3f\n", distance);
		System.out.print("distance == "+ String.format("%.3f\n", distance));

	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}