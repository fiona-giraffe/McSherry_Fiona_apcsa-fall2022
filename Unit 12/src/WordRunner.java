//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("/Users/seang/Documents/apcsa-2022/McSherry_Fiona_apcsa-fall2022/Unit 12/src/words.dat"));

		int size = file.nextInt();
	
		String[] output = new String[size];
		for(int i=0; i<size; i++) {
			String s = file.nextLine();
			output[i] = new String(s);
		}
	
		for(int j=0; j < output.length; j++) {
			for(int i=0; i<output.length; i++) {
				Word test = new Word(output[i]);
				Word test2 = new Word(output[j]);
				if(test.compareTo(test2) >= 1) {
					String z = output[i];
					output[i] = output[j];
					output[j] = z;
				}	
			}	
		}		
		
		for(int i=0; i < output.length; i++) {
			Word test3 = new Word(output[i]);
			System.out.println(test3);
		}	
	}
}