//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(0.0, 0.0, 0.0, 0.0);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		return Math.max(one, Math.max(two, Math.max(three, four)));
	}

	public String toString()
	{
		String output;
		output = one + " " + two + " " + three + " " + four + "\n";
		return output + "biggest = " + getBiggest() + "\n";
	}
}