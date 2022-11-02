//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = (int)(Math.random()*10) + 1;
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		for(int i = 0; i < array.length; i++) {
			int min = i;
			for(int j = i+1; j<array.length; j++) {
				if(array[j] == 7)
					min = j;
			}
			if(min != i) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
	}
}