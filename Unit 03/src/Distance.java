//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	Scanner keyboard = new Scanner(System.in);
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
		int xOne = 0;
		int yOne = 0;
		int xTwo = 0;
		int yTwo = 0;			
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		out.print("Enter X1 :: ");
		xOne = keyboard.nextInt();
		
		out.print("Enter Y1 :: ");
		yOne = keyboard.nextInt();
		
		out.print("Enter X2 :: ");
		xTwo = keyboard.nextInt();
		
		out.print("Enter Y2 :: ");
		yTwo = keyboard.nextInt();
	}

	public void calcDistance()
	{
		distance = (double) Math.sqrt((yTwo - yOne) * (yTwo - yOne) + (xTwo - xOne) * (xTwo - xOne));
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		out.printf("distance == %.3f\n",distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}

}