//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality("hello", "goodbye");
		out.println(test.toString());
		
		//add test cases
		
		test.setWords("one", "two");
		out.println(test.toString());
		
		test.setWords("three", "four");
		out.println(test.toString());
		
		test.setWords("TCEA", "UIL");
		out.println(test.toString());
		
		test.setWords("State", "Champions");
		out.println(test.toString());
		
		test.setWords("ABC", "ABC");
		out.println(test.toString());
		
		test.setWords("ABC", "CBA");
		out.println(test.toString());
		
		test.setWords("Same", "Same");	
		out.println(test.toString());
		
	}
}