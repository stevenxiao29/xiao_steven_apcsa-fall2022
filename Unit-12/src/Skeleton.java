//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	int size = 0;
	String nm = "";
	
	public Skeleton(){
		size = 0;
		nm = "";
		
	}
	
	public Skeleton(String a, int b){
		size = 0;
		nm = "";
	}
	
	public int getHowBig() {
		return size;
	}
	
	public String getName() {
		return nm;
	}
	
	public boolean isBigger(Monster other) {
		if (other.getHowBig()>size) 
			return true;
		
		else 
			return false;
		
	}	
	public boolean isSmaller(Monster other) {
		if (other.getHowBig()<size) 
			return true;
		
		else 
			return false;
	}
	public boolean namesTheSame(Monster other) {
		if (other.getName().equals(nm)) 
			return true;
		else 
			return false;
	}
	
	//add a constructor
	public String toString() {
		
		String out = "";
		
		if (isBigger(null) == true)
			out += "Monster 1 is smaller than Monster 2";
		else if (isSmaller(null) == true)
			out += "Monster 1 is smaller than Monster 2";
		else 
			out +="Monster 1 is the same size as Monster 2";
		
		out += "\n";
		
		
		if (namesTheSame()= true)
			out += "Monster one does have the same name as Monster two.";
		else 
			out += "Monster one does not have the same name as Monster two.";
		
		return out;
			
			
		
	}
	//add code to implement the Monster interface

	//add a toString
}