//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("Enter 1st Monster's name : ");
		String n = keyboard.next();
		System.out.println("Enter 1st Monster's size : ");
		int s = keyboard.nextInt();
		//instantiate monster one
		Monster Monster1 = new Skeleton(n, s);
		//ask for name and size
		System.out.println("Enter 2nd Monster's name : ");
		String n1 = keyboard.next();
		System.out.println("Enter 2nd Monster's size : ");
		int s1 = keyboard.nextInt();
		//instantiate monster two
		Monster Monster2 = new Skeleton(n1, s1);
		
		System.out.println("Monster 1 - " + Monster1);
		System.out.println("Monster 2 - " + Monster2);
		System.out.println();
		
		String output = "Monster one is ";
		if(Monster1.isSmaller(Monster2)) {
			output += "smaller than Monster two.";
		}
		else if(Monster1.isBigger(Monster2)) {
			output += "bigger than Monster two.";
		}
		output += "\n";
		
		if(Monster1.namesTheSame(Monster2)) {
			output += "Monster one has the same name as Monster two.";
		}
		else {
			output += "Monster one does not have the same name as Monster two.";
		}
		
		System.out.println(output);
		
	}
}