//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class StringEquality
{
	Scanner keyboard = new Scanner(System.in);
	private String wordOne, wordTwo;
	private boolean bool;

	public StringEquality()
	{
		String wordOne = "";
		String wordTwo = "";
	}

	public StringEquality(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkEquality( )
	{
		if (wordOne.equals(wordTwo)) {
			return true;
		}
		else {
			return false;
		}
	}

	public String toString()
	{
		if (checkEquality() == false) {
			return wordOne + " does not have the same letters as " + wordTwo + "\n";
		}
		else {
			return wordOne + " has the same letters as " + wordTwo + "\n";
		}
	}
}