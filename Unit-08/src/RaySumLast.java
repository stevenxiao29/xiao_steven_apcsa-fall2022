//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public int go(int[] ray)
	{
		int last = ray[ray.length-1];
		int total = 0;
	
		for (int i = 0 ; i<ray.length; i++) {
			if (ray[i]>last) {
				total += ray[i];
			}
		}
		
		return total;
	}
}