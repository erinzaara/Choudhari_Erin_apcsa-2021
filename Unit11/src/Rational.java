//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;

	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int numer, int denom) {
		setRational(numer, denom);
	}


	public void setRational(int numer, int denom)
	{
		setNumerator(numer);
		setDenominator(denom);
	}
	
	public void setNumerator(int numer)
	{
		numerator = numer;
	}

	public void setDenominator(int denom)
	{
		denominator = denom;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = numerator * other.getDenominator() + other.getNumerator() * denominator;
		denominator = denominator * other.getDenominator();
		
		reduce();
	}

	private void reduce()
	{
		int divisor = gcd(numerator, denominator);
		numerator = (int) numerator/divisor;
		denominator = (int) denominator/divisor;

	}

	private int gcd(int numOne, int numTwo)
	{
		int div = 0;
		
		for(int i = 1; i <= numOne && i <= numTwo; i++)
        {
            if(numOne%i==0 && numTwo%i==0)
                div = i;
        }
		
		return div;
	}

	public Object clone ()
	{
		Rational clone = new Rational(getNumerator(), getDenominator());
		return clone;
	}


	//ACCESSORS
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{
		if (obj instanceof Rational)
		{
			reduce();
			((Rational) obj).reduce();
			
			if (((Rational) obj).getNumerator() == numerator && ((Rational) obj).getDenominator() == denominator)
				return true;
		}
	
		return false;
	}

	public int compareTo(Rational other)
	{
		reduce();
		other.reduce();
		
		if (numerator == other.getNumerator() && denominator == other.getDenominator()) {
			return 0;
		}
		else {
			if ((double)other.getNumerator() / other.getDenominator() < (double)numerator/denominator) {
				return 1;
			}
		}
			
		return -1;
	}

	public String toString()
	{
		return numerator + "/" + denominator;
	}

	
	
}