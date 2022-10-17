//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		if(s.length() == rhs){
			if((int) word.charAt(0) < (int) rhs.charAt(0)) {
				return 1;
			}
			else if((int) word.charAt(0) > (int) rhs.charAt(0)) {
				return -1;
			}
			else if(word.equals(rhs)) {
				return 0;
			}
		}
		else if(word.length() > rhs.length()) {
			return 1;
		}
		else if(word.length() < rhs.length()) {
			return -1;
		}
	}

	public String toString()
	{
		String output = "";
		if(compareTo())
		return output;
	}
}