//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	

	private String name;
	private int howBig;
	//add a constructor
	
	public Skeleton() {
		name = "";
		howBig = 0;
	}
	
	public Skeleton(String n, int size) {
		name = n;
		howBig = size;
	}
	//add code to implement the Monster interface
	
	public String getName() {
		return name;
	}
	
	public int getHowBig() {
		return howBig;
	}
	
	public boolean isBigger(Monster other) {
		return this.howBig > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other) {
		return howBig < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other) {
		return name.equals(other.getName());
	}
	//add a toString
	
	public String toString() {
		String output = this.getName() + " " + this.getHowBig();
		return output;
	}
}