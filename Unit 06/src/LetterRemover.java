//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		setRemover("", '0');
		//call set
	}

	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int i = cleaned.indexOf(lookFor);
		while (i > -1) {
			
			cleaned = cleaned.substring(0, i) + cleaned.substring(i + 1);
			i = cleaned.indexOf(lookFor);
		}
		
		return cleaned;
	}
	
	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}