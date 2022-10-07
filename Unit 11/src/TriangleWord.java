//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printTriangle(String word)
	{
		String output = "";
		for(int i = 1; i <= word.length(); i++) {
			int k = i;
			while( k > 0) {
				output += word.substring(0, i);
				k--;
			}
			output += "\n";
		}
		return output; 
	}
}