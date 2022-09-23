import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{	
		ListDown test = new ListDown();
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(-99);
		n.add(1);
		n.add(2);
		n.add(3);
		n.add(4);
		n.add(5);
		n.add(6);
		n.add(7);
		n.add(8);
		n.add(9);
		n.add(10);
		n.add(12345);
		System.out.println(test.go(n));
		
		int[] a = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test.go(a));
		
		int[] b = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test.go(b));
		
		int[] c = {32767};
		System.out.println(test.go(c));
		
		int[] d = {255,255};
		System.out.println(test.go(d));
		
		int[] e = {9,10,-88,100,-555,1000};
		System.out.println(test.go(e));
		
		int[] f = {10,10,10,11,456};
		System.out.println(test.go(f));
		
		int[] g = {-111,1,2,3,9,11,20,30};
		System.out.println(test.go(g));
		
		int[] h = {9,8,7,6,5,4,3,2,0,-2,-989};
		System.out.println(test.go(h));
		
		int[] i = {12,15,18,21,23,1000};
		System.out.println(test.go(i));
		
		int[] j = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		System.out.println(test.go(j));
		
		int[] k = {9,10,-8,10000,-5000,1000};
		System.out.println(test.go(k));
	}
}