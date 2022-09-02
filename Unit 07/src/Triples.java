//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
		number = 0;
	}

	public Triples(int num)
	{
		setNum(0);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int factor;
		for(int i=1; i <= Math.min(a, Math.min(b, c)); i++) {
			if(a%i==0 && b%i==0 && c%i==00) {
				factor = i;
				if (Math.max(factor, max)==factor) {
					max = factor;
				}
			}
		}

		return max;
	}
	
	private boolean oddOrEven(int a, int b, int c) {
		if(a%2==0 && b%2!=0 && c%2!=0) {
			return true;
		}
		else if(a%2!=0 && b%2==0 && c%2!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private boolean theorem(int a, int b, int c) {
		if(Math.pow((double) a, 2)+ Math.pow((double) b, 2)==Math.pow((double) c, 2)) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString()
	{
		String output="";
		for(int a=0; a<=number; a++) {
			for(int b=0; b<=number; b++) {
				for(int c=0; c<=number; c++) {
					if(greatestCommonFactor(a, b, c)==1 && oddOrEven(a, b, c) && theorem(a, b, c) && a<b && b<c && a<c) {
						output = output + "\n" + a + " " + b + " " + c;
					}
				}
			}
		}
		return output+"\n";
	}
}