//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if(num <= 10) {
			if(num%2 == 0) {
				return 1;
			}
			return 0;
		}
		else {
			if((num%10)%2 == 0) {
				return 1 + countOddDigits(num/10);
			}
			return 0 + countOddDigits(num/10);
		}
		}
	}
