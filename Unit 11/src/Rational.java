//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num;
	private int den;
	//write two constructors
	public Rational() {
		setRational(1, 1);
	}
	
	public Rational(int num1, int den1) {
		setNumerator(num1);
		setDenominator(den1);
		setRational(num1, den1);
	}

	//write a setRational method
	public void setRational(int num1, int den1) {
		num = num1;
		den = den1;
	}
 
	//write  a set method for numerator and denominator
	public void setNumerator(int num1) {
		num = num1;
	}
	
	public void setDenominator(int den1) {
		den = den1;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		int newNum1 = num * other.getDenominator() + den * other.getNumerator();
		int newDen1 = den * other.getDenominator();
		
		setRational(newNum1, newDen1);

		reduce();
	}

	private void reduce()
	{
		if(num != 0) {
			int gcd1 = gcd(num, den);
			
			num = num/gcd1;
			den = den/gcd1;
		}


	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for(int i = 1; i <= numOne && i <= numTwo; i++) {
			if(numOne % i == 0 && numTwo % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational obj = new Rational(num, den);
		return obj;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator() {
		return num;
	}
	
	public int getDenominator() {
		return den;
	}
	
	public boolean equals( Rational obj)
	{
		this.reduce();
		obj.reduce();
		
		if(this.getDenominator() == obj.getDenominator() && this.getNumerator() == obj.getNumerator()) {
			return true;
		}

		return false;
	}

	public int compareTo(Rational other)
	{
		if((double)num/den > (double)other.getNumerator()/other.getDenominator()) {
			return 1;
		}
		if((double)num/den == (double)other.getNumerator()/other.getDenominator()) {
			return 0;
		}

		return -1;
	}

	
	//write  toString() method
	public String toString() {
		return num + "/" + den;
	}
	
}