//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   char first = a.charAt(0);
	   char last = a.charAt(a.length() -1);
	   if (first == 'a' ||first == 'e' ||first == 'i' ||first == 'o' ||first == 'u' ||first == 'A' ||first == 'E' ||first == 'I' ||first == 'O' ||first == 'U' ||last == 'a' ||last == 'e' ||last == 'i' ||last == 'o' ||last == 'u' ||last == 'A' ||last == 'E' ||last == 'I' ||last == 'O' ||last == 'U') {
		   return "yes";
	   }
	   else {
		   return "no";
	   }
	}
}