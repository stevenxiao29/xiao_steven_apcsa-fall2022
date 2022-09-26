//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{	
		
		int oldIndex = 0;
		int oldAge = 0;
		
		for (int i = 0; i<pups.length; i++)
		{
			if (pups[i].getAge() > oldAge) {
				oldAge = pups[i].getAge();
				oldIndex = i;
			}
			
		}
		
		return pups[oldIndex].getName();
	}

	public String getNameOfYoungest()
	{
		int youngIndex = 0;
		int youngAge = pups[0].getAge();
		
		for (int i = 0; i<pups.length; i++)
		{
			if (pups[i].getAge() < youngAge) {
				youngAge = pups[i].getAge();
				youngIndex = i;
			}
			
		}
		
		return pups[youngIndex].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}