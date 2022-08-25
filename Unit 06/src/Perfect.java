//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   
    public Perfect(){
	   setInt(0);
    }
   
    public void setInt(int i) {
	   number = i;
    }
	
	public boolean isPerfect()
	{
		int i = 1;
		int count = 0;
		
		do{
			if (number%i == 0) {
				count += i;
			}
			i++;
		}while(i < number);
		
		if (count == number) {
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	public String toString() {
		if(isPerfect()) {
			return number + " is perfect.";
		}
		else {
			return number + " is not perfect.";
		}
		
	}	
	
}