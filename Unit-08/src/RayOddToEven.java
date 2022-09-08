//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddLoc = 0;
		int evenLoc = 0;
		
		boolean oddExist = false;
		boolean evenExist = false;
		
		int out = 0;
		
		
		for (int i = 0; i<ray.length;i++) {
			if (ray[i]%2==1) {
				oddLoc = i;
				oddExist = true;
				break;
			}
		}
		
		if(oddExist == true) {
			for (int i = oddLoc; i <ray.length ; i++) {
				if (ray[i]%2==0) {
					evenLoc = i;
					evenExist = true;
					break;
				}
			}
		}
		
		
		if (oddExist == false || evenExist == false) {
			return -1;
		}else {
			return  evenLoc - oddLoc;
		}

		
	}
}