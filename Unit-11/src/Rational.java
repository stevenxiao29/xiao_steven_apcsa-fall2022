import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int denom = 0;
	private int numer = 0;
	//write two constructors
	
	public Rational()
	{
		denom = 1;
		numer = 1;

	}
	public Rational(int a, int b)
	{
		numer = a;
		denom = b;
	}

	//write a setRational method
	
	public void setRational(int a, int b)
	{
		numer = a;
		denom = b;
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
		int temp = gcd(numer, denom);
		numer /= temp;
		denom /= temp;

	}

	private int gcd(int numOne, int numTwo)
	{
		
		int gcd = 1;
		
		for (int i = 1; i<numOne+1; i++)
		{
			
			for(int j = 1; j<numTwo+1; j++)
			{
				if(numOne % i == 0 && numTwo % j == 0 && j==i){
					gcd = i;
				}
			}
		}
		return gcd;
	}

	public Object clone ()
	{
		Rational farty = new Rational(numer, denom);
		return farty;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{
		Rational fart = (Rational)  obj;
		
		if (fart.getNum()*denom == numer * fart.getDenom())
			return true;

		
		return false;
	}

	public int compareTo(Rational other)
	{

		if (this.equals(other)) {
			return 0;
		}
		
		if(other.getNum()*denom < numer * other.getDenom())
			return 1;
		return -1;
		
	}



	
	//write  toString() method
	public String toString () {
		return numer + "/" + denom;
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 4511d3a1d24576184576767fe1983b06d417ec5e
