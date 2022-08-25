//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		Perfect test = new Perfect();
		
		test.setInt(496);
		test.isPerfect();
		out.println(test);
		
		test.setInt(45);
		test.isPerfect();
		out.println(test);
		
		test.setInt(6);
		test.isPerfect();
		out.println(test);
		
		test.setInt(14);
		test.isPerfect();
		out.println(test);
		
		test.setInt(8128);
		test.isPerfect();
		out.println(test);
		
		test.setInt(1245);
		test.isPerfect();
		out.println(test);
		
		test.setInt(33);
		test.isPerfect();
		out.println(test);
		
		test.setInt(28);
		test.isPerfect();
		out.println(test);
		
		test.setInt(27);
		test.isPerfect();
		out.println(test);
		
		test.setInt(33550336);
		test.isPerfect();
		out.println(test);
		//add test cases
																
	}
}