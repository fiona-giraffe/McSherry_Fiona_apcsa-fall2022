//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printWord(String word, int times)
	{
		String output = "";
		int i = times;
		while(i > 0) {
			output += word + "\n";
			i--;
		}
		return output;
	}
}