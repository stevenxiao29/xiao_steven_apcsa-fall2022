import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sorry = new Toy("sorry");
		System.out.println(sorry);
		
		Toy joe= new Toy("gi joe");
		joe.setCount(5);
		System.out.println(joe);
	}
}
