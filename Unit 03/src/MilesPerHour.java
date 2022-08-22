//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	Scanner keyboard = new Scanner(System.in);
	private int distance, hours, minutes, newmph;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void setNums(int dist, int hrs, int mins)
	{
		out.print("Enter the distance :: ");
		dist = keyboard.nextInt();
		
		out.print("Enter the hours :: ");
		hrs = keyboard.nextInt();
		
		out.print("Enter the minutes :: ");
		mins = keyboard.nextInt();
	}

	public void calcMPH()
	{
		double temp = (double) hours;
		temp += (double) minutes/60;
		mph = distance/temp;
		newmph = (int) Math.round(mph);
	}

	public void print()
	{
		out.printf(distance + " miles in " + hours + " hours and " + minutes + " minutes = " + newmph + " MPH.");
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}