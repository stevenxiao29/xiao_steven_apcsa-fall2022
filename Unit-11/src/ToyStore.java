import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>() ; 
	}

	public void loadToys( String toys )
	{
        String[] strSplit = toys.split(" "); 
        
  		for (int i = 0 ; i<strSplit.length; i++)
  		{
  			
  			Toy t = new Toy(strSplit[i]);
  			
  			//if existing toyList does not have t in it then add
  			//other, set new toy count ++
  			
  			toyList.add(t);
  		}

	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy t = new Toy(nm);
  		return t;
  	}
  
  	public Toy getMostFrequentToy()
  	{
  		int count = 0;
  		int newCount = 0;
  		int finalIndex = -1;
  		
  		for (int i = 0 ; i<toyList.size(); i++)
  		{
  			for (int j = 0 ; j<toyList.size(); j++) {
  				if (toyList.get(i)==toyList.get(j))
  					newCount++;
  			}
  			if (newCount > count) {
  				finalIndex = i;
  				count = newCount;
  			}
  			
  		}
  		
  		return toyList.get(finalIndex);
  		
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
		String out = "";
		
		for (int i = 0; i<toyList.size(); i++)
		{
			out += toyList.get(i).getName() + " " + toyList.get(i).getCount() + ", ";
		}
		
	   return "[" + out + "]" + "\n" + "max = " + getMostFrequentToy();
	}
}
