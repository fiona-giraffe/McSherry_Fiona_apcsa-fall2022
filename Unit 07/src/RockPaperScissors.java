//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		playChoice = "";
		compChoice = "";
	}

	public RockPaperScissors(String player)
	{
		setPlayers("");
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		int comp = (int) (Math.random()*3);
		switch(comp)
		{
			case 0: compChoice = "R"; break;
		
			case 1: compChoice = "P"; break;
		
			case 2: compChoice = "S"; break;
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if(playChoice.equals(compChoice))
			winner = "!Draw Game!";

		else if(compChoice == "R")
		{
			if(playChoice == "P")
				winner = "!Player wins <<Paper covers Rock>>!";
			else if(playChoice == "S")
				winner = "!Computer winds <<Rock breaks Scissors>>!";
		}
		else if(compChoice == "P")
		{
			if(playChoice == "R")
				winner = "!Computer wins <<Paper covers Rock>>!";
			else if(playChoice == "S")
				winner = "!Player wins <<Scissors cuts Paper>>!";
		}
		else if(compChoice == "S")
		{
			if(playChoice == "R")
				winner = "!Player wins <<Rock breaks Scissors>>!";
			else if(playChoice == "P")
				winner = "!Computer wins <<Scissors cuts Paper>>!";
		}
		
		return winner;
	}

	public String toString()
	{
		String output="player had " + playChoice + "\n" + "computer had " + compChoice + "\n";
		output = output + determineWinner();
		output = output + "\n" + "Do you want to play again?";
			
		return output;
	}
}