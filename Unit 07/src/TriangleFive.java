//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		letter = '0';
		amount = 0;
	}

	public TriangleFive(char c, int amt)
	{
		setLetter('A');
		setAmount(0);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char L = letter;
		int x = amount;
		int z = amount;
		
		for(int i = amount; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				
				while(x > 0) {
					output += "" + L;
					x = x-1;
				}
				z = z - 1;
				x = z;
				
				if(L == 'Z')
					L = 'A';
				else
					L = (char) (L + 1);
				
				output += " ";
			}
		x = amount;
		z = amount;
		L = letter;
		output += "\n";
		}
		return output;
	}
}