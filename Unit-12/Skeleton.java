
import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	int size = 0;
	String nm = "";
	
	//add a constructor

	public Skeleton(){
		size = 0;
		nm = "";
		
	}
	
	public Skeleton(String a, int b){
		size = b;
		nm = a;
	}
	//add code to implement the Monster interface

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
	
	//add a toString
	public String toString() {
		
		return  nm + " " +  size;
		
	}

}
