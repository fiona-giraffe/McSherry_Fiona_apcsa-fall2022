//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds
		if(spot < pups.length) {
			pups[spot] = new Dog(age, name);
		}
	}

	public String getNameOfOldest()
	{
		String oldest = pups[0].getName();
		for(int i=1; i < pups.length; i++) {
			if(pups[i].getAge() > pups[i-1].getAge()) {
				oldest = pups[i].getName();
			}
		}
		return oldest;
	}

	public String getNameOfYoungest()
	{
		String youngest = pups[0].getName();
		for(int i=1; i < pups.length; i++) {
			if(pups[i].getAge() < pups[i-1].getAge()) {
				youngest = pups[i].getName();
			}
		}
		return youngest;
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}