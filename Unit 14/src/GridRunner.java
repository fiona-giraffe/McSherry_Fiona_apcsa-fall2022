//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String[] vals = {"a", "b", "c", "7", "9", "x", "2"};
		Grid x = new Grid(20, 20, vals);
		System.out.println(x);
		System.out.println("--debugging code to help see if the algorithm is working-- \n");
		System.out.println(x.Debugging(vals));
		System.out.println(x.findMax(vals) + " occurs the most.");
	}
}