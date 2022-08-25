//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		LetterRemover test = new LetterRemover();
		
		test.setRemover("I am Sam I am", 'a');
		out.println(test);
		out.println(test.removeLetters());
		out.println();
		
		test.setRemover("ssssssssxssssesssssesss", 's');
		out.println(test);
		out.println(test.removeLetters());
		out.println();
		
		test.setRemover("qwertyqwertyqwerty", 'a');
		out.println(test);
		out.println(test.removeLetters());
		out.println();
		
		test.setRemover("abababababa", 'b');
		out.println(test);
		out.println(test.removeLetters());
		out.println();
		
		test.setRemover("abaababababa", 'x');
		out.println(test);
		out.println(test.removeLetters());
		out.println();
		
		//add test cases		
											
	}
}