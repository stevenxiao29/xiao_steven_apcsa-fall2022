import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int denom = 0;
	private int numer = 0;
	//write two constructors
	
	public Rational()
	{
		int denom = 1;
		int numer = 1;

	}
	public Rational(int a, int b)
	{
		int numer = a;
		int denom = b;
	}

	//write a setRational method
	
	public void setRational(int a, int b)
	{
		int numer = a;
		int denom = b;
	}
	//write  a set method for numerator and denominator
	
	public int getNum()
	{
		return numer;
	}
	public int getDenom()
	{
		return denom;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numer = (numer * other.getDenom() + other.getNum()*denom);
		denom = denom * other.getDenom();
	

		reduce();
	}

	private void reduce()
	{
		temp = gcd(numer, denom);
		numer /= temp;
		denom /= temp;

	}

	private int gcd(int numOne, int numTwo)
	{
		
		int gcd = 1;
		
		for (int i = 0; i<numOne; i++)
		{
			
			for(int j = 0; j<numTwo; j++)
			{
				(if numOne % i == 0 && numTwo % j == 0 && j==i){
					gcd = i;
				}
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{

		
		return false;
	}

	public int compareTo(Rational other)
	{

		
		return -1;
	}



	
	//write  toString() method
	
	
}
