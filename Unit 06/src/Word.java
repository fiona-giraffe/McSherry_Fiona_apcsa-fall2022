//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		word = "";
	}

	public Word(String s)
	{
		setString("");
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String back="";
		int i = word.length()-1;
		while (i>=0)
		{
			back += word.charAt(i);
			i--;
		}
		
		return back;
	}

 	public String toString()
 	{
 		word = getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
 		return word;
 		
	}
}