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
  			boolean flag = true;
  			Toy t = new Toy(strSplit[i]);
  				
  				if(toyList.size()!=0)
  				{
	  				for (int j = 0 ; j<toyList.size(); j++) {
	  					if (toyList.get(j).getName().equals(strSplit[i])) {
	  						toyList.get(j).setCount(toyList.get(j).getCount()+1);
	  						flag = false;
	  						break;
	  						
	  					}
	  					
	  				}
  				}
	  				if (flag != false)
	  				{
	  					toyList.add(t);
	  				}
  			
  			//if existing toyList does not have t in it then add
  			//other, set new toy count ++
  			
  			
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
  		int finalIndex = 0;
  		
  		for (int i = 0 ; i<toyList.size(); i++)
  		{
  	
  			if (toyList.get(i).getCount() > count) {
  				finalIndex = i;
  				count = toyList.get(i).getCount();  			}
  			
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
