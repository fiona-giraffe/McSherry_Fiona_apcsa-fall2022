//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	Scanner keyboard = new Scanner(in);
	
	private String word;

	public StringOddOrEven()
	{
		word = "";
	}

	public StringOddOrEven(String s)
	{
		word = s;
	}

	public void setString(String s)
	{
		System.out.print("Enter a word :: ");
		s = keyboard.next();
		
		word = s;
	}

 	public boolean isEven()
 	{
 		if (word.length() % 2 == 0) {
 			return true;
 		}
 		else {
 			return false;
 		}
	}

 	public String toString()
 	{
 		String output="";
 		if (isEven() == true) {
 			output = word + " is even.";
 		}
 		else {
 			output = word + " is odd.";
 		}
 		return output;
	}
}