import static java.lang.System.*;

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
<<<<<<< Updated upstream
		name = "";
		count = 0;
=======
		name = "toy";
		count = 1;
>>>>>>> Stashed changes
	}

	public Toy( String nm )
	{
<<<<<<< Updated upstream
		setName(  nm );
		setCount(1);
=======
		setName(nm);
		count =1;
>>>>>>> Stashed changes
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}
}
