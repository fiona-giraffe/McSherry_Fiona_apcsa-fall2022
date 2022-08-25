//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char ch, ch2;
		for(int i=0; i < str.length(); i++) {
			ch = str.charAt(i);
			ch2 = str.charAt(i++);
			if(ch == ch2){
				count++;
			}
		}
		return count;
	}
}