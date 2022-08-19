//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double x1d = x1;
		double x2d = x2;
		double y1d = y1;
		double y2d = y2;

		double m = (y2d-y1d)/(x2d-x1d);
		return m;
	}

}