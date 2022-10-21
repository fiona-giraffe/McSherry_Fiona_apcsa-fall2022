//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		int index = toys.indexOf(" ");
		String last = "";
		
		while(index > -1) {
			String toy1 = toys.substring(0, index);
			if(getThatToy(toy1) != null){
				int num = getThatToy(toy1).getCount() + 1;
				getThatToy(toy1).setCount(num);
			}
			else {
				Toy toy2 = new Toy(toy1);
				toy2.setCount(1);
				toyList.add(toy2);
			}
			toys = toys.substring(index + 1);
			index = toys.indexOf(" ");
			last = toy1;
		}
		if(getThatToy(last) != null) {
			int num = getThatToy(last).getCount() + 1;
			getThatToy(last).setCount(num);
		}
		else {
			Toy toy2 = new Toy(last);
			toy2.setCount(1);
			toyList.add(toy2);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for(int i = 0; i < toyList.size(); i++) {
  			if(toyList.get(i).getName().equals(nm)) {
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		this.sortToysByCount();
  		return toyList.get(toyList.size() - 1).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for(int i = 0; i < toyList.size()-1; i++) {
  			if(toyList.get(i).getCount()<toyList.get(i+1).getCount()) {
  				toyList.set(i+1, toyList.set(i,  toyList.get(i+1)));
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString() + "\n" + "max == " + getMostFrequentToy();
	}
}